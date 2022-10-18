package typings.puppeteerCore

import typings.puppeteerCore.libEsmPuppeteerCommonConnectionTransportMod.ConnectionTransport
import typings.puppeteerCore.libEsmPuppeteerCommonEventEmitterMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerCommonBidiConnectionMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/bidi/Connection", "Connection")
  @js.native
  open class Connection protected () extends EventEmitter {
    def this(transport: ConnectionTransport) = this()
    def this(transport: ConnectionTransport, delay: Double) = this()
    
    def closed: Boolean = js.native
    
    def dispose(): Unit = js.native
    
    /**
      * @internal
      */
    /* protected */ def onMessage(message: String): js.Promise[Unit] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def send(method: String, params: js.Object): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/bidi/Connection.CommandResponse['result'] */ js.Any
      ] = js.native
  }
  
  trait CommandResponse extends StObject {
    
    var id: Double
    
    var result: js.Object
  }
  object CommandResponse {
    
    inline def apply(id: Double, result: js.Object): CommandResponse = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandResponse]
    }
    
    extension [Self <: CommandResponse](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setResult(value: js.Object): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
