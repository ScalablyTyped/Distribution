package typings.stompit

import typings.node.streamMod.Duplex
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOutgoingFrameStreamMod {
  
  @JSImport("stompit/lib/OutgoingFrameStream", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with OutgoingFrameStream {
    def this(destination: Duplex) = this()
  }
  
  @js.native
  trait OutgoingFrameStream extends StObject {
    
    def finish(): Unit = js.native
    
    def frame(command: String): Writable = js.native
    def frame(command: String, headers: Any): Writable = js.native
    def frame(command: String, headers: Any, streamOptions: WritableOptions): Writable = js.native
    def frame(command: String, headers: Unit, streamOptions: WritableOptions): Writable = js.native
    
    def hasFinished(): Boolean = js.native
    
    def heartbeat(): Unit = js.native
    
    def setVersion(versionId: String): Boolean = js.native
  }
}
