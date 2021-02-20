package typings.stompit

import typings.node.streamMod.Duplex
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outgoingFrameStreamMod {
  
  @JSImport("stompit/lib/OutgoingFrameStream", JSImport.Namespace)
  @js.native
  class ^ protected () extends OutgoingFrameStream {
    def this(destination: Duplex) = this()
  }
  
  @js.native
  trait OutgoingFrameStream extends StObject {
    
    def finish(): Unit = js.native
    
    def frame(command: String): Writable = js.native
    def frame(command: String, headers: js.UndefOr[scala.Nothing], streamOptions: WritableOptions): Writable = js.native
    def frame(command: String, headers: js.Any): Writable = js.native
    def frame(command: String, headers: js.Any, streamOptions: WritableOptions): Writable = js.native
    
    def hasFinished(): Boolean = js.native
    
    def heartbeat(): Unit = js.native
    
    def setVersion(versionId: String): Boolean = js.native
  }
}
