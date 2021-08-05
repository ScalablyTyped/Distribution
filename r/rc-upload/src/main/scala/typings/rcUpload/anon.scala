package typings.rcUpload

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abort extends StObject {
    
    def abort(): Unit
  }
  object Abort {
    
    inline def apply(abort: () => Unit): Abort = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
      __obj.asInstanceOf[Abort]
    }
    
    extension [Self <: Abort](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined rc-upload.rc-upload/es/interface.RcFile & {  webkitRelativePath :string | undefined} */
  @js.native
  trait RcFilewebkitRelativePaths extends StObject {
    
    def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    
    val lastModified: Double = js.native
    
    val name: String = js.native
    
    val size: Double = js.native
    
    def slice(): Blob = js.native
    def slice(start: Double): Blob = js.native
    def slice(start: Double, end: Double): Blob = js.native
    def slice(start: Double, end: Double, contentType: String): Blob = js.native
    def slice(start: Double, end: Unit, contentType: String): Blob = js.native
    def slice(start: Unit, end: Double): Blob = js.native
    def slice(start: Unit, end: Double, contentType: String): Blob = js.native
    def slice(start: Unit, end: Unit, contentType: String): Blob = js.native
    
    def stream(): ReadableStream[js.Any] = js.native
    
    def text(): js.Promise[String] = js.native
    
    val `type`: String = js.native
    
    var uid: String = js.native
    
    var webkitRelativePath: js.UndefOr[String] = js.native
  }
  
  trait Uid extends StObject {
    
    var uid: String
  }
  object Uid {
    
    inline def apply(uid: String): Uid = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uid]
    }
    
    extension [Self <: Uid](x: Self) {
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
