package typings.puppeteerCore

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.puppeteerCore.commonConnectionTransportMod.ConnectionTransport
import typings.puppeteerCore.commonHelperMod.PuppeteerEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodePipeTransportMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/node/PipeTransport", "PipeTransport")
  @js.native
  class PipeTransport protected ()
    extends StObject
       with ConnectionTransport {
    def this(pipeWrite: WritableStream, pipeRead: ReadableStream) = this()
    
    def _dispatch(buffer: Buffer): Unit = js.native
    
    var _eventListeners: js.Array[PuppeteerEventListener] = js.native
    
    var _pendingMessage: String = js.native
    
    var _pipeWrite: WritableStream = js.native
    
    /* CompleteClass */
    override def close(): js.Any = js.native
    
    @JSName("onmessage")
    var onmessage_PipeTransport: js.UndefOr[js.Function0[Unit]] = js.native
    
    def send(message: String): Unit = js.native
    /* CompleteClass */
    override def send(string: js.Any): js.Any = js.native
  }
}
