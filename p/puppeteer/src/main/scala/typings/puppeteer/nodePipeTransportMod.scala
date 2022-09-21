package typings.puppeteer

import typings.puppeteer.commonConnectionTransportMod.ConnectionTransport
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodePipeTransportMod {
  
  @JSImport("puppeteer/lib/esm/puppeteer/node/PipeTransport", "PipeTransport")
  @js.native
  open class PipeTransport protected ()
    extends StObject
       with ConnectionTransport {
    def this(pipeWrite: WritableStream[Any], pipeRead: ReadableStream[Any]) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def send(message: String): Unit = js.native
  }
}
