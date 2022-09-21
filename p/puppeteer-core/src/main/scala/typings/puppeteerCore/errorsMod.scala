package typings.puppeteerCore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Errors", "CustomError")
  @js.native
  open class CustomError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Errors", "ProtocolError")
  @js.native
  open class ProtocolError () extends CustomError {
    def this(message: String) = this()
    
    var code: js.UndefOr[Double] = js.native
    
    var originalMessage: String = js.native
  }
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Errors", "TimeoutError")
  @js.native
  open class TimeoutError () extends CustomError {
    def this(message: String) = this()
  }
  
  object errors extends Shortcut {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Errors", "errors")
    @js.native
    val ^ : PuppeteerErrors = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Errors", "errors.ProtocolError")
    @js.native
    open class ProtocolErrorCls () extends ProtocolError
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Errors", "errors.TimeoutError")
    @js.native
    open class TimeoutErrorCls () extends TimeoutError
    
    type _To = PuppeteerErrors
    
    /* This means you don't have to write `^`, but can instead just say `errors.foo` */
    override def _to: PuppeteerErrors = ^
  }
  
  trait PuppeteerErrors extends StObject {
    
    var ProtocolError: Instantiable0[typings.puppeteerCore.errorsMod.ProtocolError]
    
    var TimeoutError: Instantiable0[typings.puppeteerCore.errorsMod.TimeoutError]
  }
  object PuppeteerErrors {
    
    inline def apply(ProtocolError: Instantiable0[ProtocolError], TimeoutError: Instantiable0[TimeoutError]): PuppeteerErrors = {
      val __obj = js.Dynamic.literal(ProtocolError = ProtocolError.asInstanceOf[js.Any], TimeoutError = TimeoutError.asInstanceOf[js.Any])
      __obj.asInstanceOf[PuppeteerErrors]
    }
    
    extension [Self <: PuppeteerErrors](x: Self) {
      
      inline def setProtocolError(value: Instantiable0[ProtocolError]): Self = StObject.set(x, "ProtocolError", value.asInstanceOf[js.Any])
      
      inline def setTimeoutError(value: Instantiable0[TimeoutError]): Self = StObject.set(x, "TimeoutError", value.asInstanceOf[js.Any])
    }
  }
}
