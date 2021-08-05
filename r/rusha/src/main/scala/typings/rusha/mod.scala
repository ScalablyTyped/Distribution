package typings.rusha

import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import typings.rusha.rushaStrings.hex
import typings.std.AddEventListenerOptions
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.MessageEvent
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rusha", JSImport.Namespace)
  @js.native
  val ^ : Rusha = js.native
  
  @js.native
  trait Hash extends StObject {
    
    def digest(encoding: Unit): ArrayBuffer = js.native
    @JSName("digest")
    def digest_hex(encoding: hex): String = js.native
    
    def update(value: String): Hash = js.native
    def update(value: js.Array[Double]): Hash = js.native
    def update(value: Buffer): Hash = js.native
    def update(value: ArrayBuffer): Hash = js.native
  }
  
  trait Rusha extends StObject {
    
    def createHash(): Hash
    
    def createWorker(): RushaWorker
    
    def disableWorkerBehaviour(): Unit
  }
  object Rusha {
    
    inline def apply(createHash: () => Hash, createWorker: () => RushaWorker, disableWorkerBehaviour: () => Unit): Rusha = {
      val __obj = js.Dynamic.literal(createHash = js.Any.fromFunction0(createHash), createWorker = js.Any.fromFunction0(createWorker), disableWorkerBehaviour = js.Any.fromFunction0(disableWorkerBehaviour))
      __obj.asInstanceOf[Rusha]
    }
    
    extension [Self <: Rusha](x: Self) {
      
      inline def setCreateHash(value: () => Hash): Self = StObject.set(x, "createHash", js.Any.fromFunction0(value))
      
      inline def setCreateWorker(value: () => RushaWorker): Self = StObject.set(x, "createWorker", js.Any.fromFunction0(value))
      
      inline def setDisableWorkerBehaviour(value: () => Unit): Self = StObject.set(x, "disableWorkerBehaviour", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait RushaWorker
    extends StObject
       with Worker {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    @JSName("onmessage")
    var onmessage_RushaWorker: (js.ThisFunction1[/* this */ this.type, /* res */ MessageEvent[RushaWorkerResponse], Unit]) | Null = js.native
    
    def postMessage(req: RushaWorkerRequest): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  trait RushaWorkerRequest extends StObject {
    
    var data: String | js.Array[Double] | ArrayBuffer | Buffer | Blob
    
    var id: String
  }
  object RushaWorkerRequest {
    
    inline def apply(data: String | js.Array[Double] | ArrayBuffer | Buffer | Blob, id: String): RushaWorkerRequest = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RushaWorkerRequest]
    }
    
    extension [Self <: RushaWorkerRequest](x: Self) {
      
      inline def setData(value: String | js.Array[Double] | ArrayBuffer | Buffer | Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait RushaWorkerResponse extends StObject {
    
    var hash: String
    
    var id: String
  }
  object RushaWorkerResponse {
    
    inline def apply(hash: String, id: String): RushaWorkerResponse = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RushaWorkerResponse]
    }
    
    extension [Self <: RushaWorkerResponse](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Rusha
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Rusha = ^
}
