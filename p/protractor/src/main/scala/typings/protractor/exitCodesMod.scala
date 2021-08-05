package typings.protractor

import typings.protractor.loggerMod.Logger
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exitCodesMod {
  
  @JSImport("protractor/built/exitCodes", "BrowserError")
  @js.native
  class BrowserError protected () extends ProtractorError {
    def this(logger: Logger, message: String) = this()
  }
  /* static members */
  object BrowserError {
    
    @JSImport("protractor/built/exitCodes", "BrowserError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("protractor/built/exitCodes", "BrowserError.CODE")
    @js.native
    def CODE: Double = js.native
    inline def CODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("protractor/built/exitCodes", "BrowserError.ERR_MSGS")
    @js.native
    def ERR_MSGS: js.Array[String] = js.native
    inline def ERR_MSGS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_MSGS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("protractor/built/exitCodes", "ConfigError")
  @js.native
  class ConfigError protected () extends ProtractorError {
    def this(logger: Logger, message: String) = this()
    def this(logger: Logger, message: String, error: Error) = this()
  }
  /* static members */
  object ConfigError {
    
    @JSImport("protractor/built/exitCodes", "ConfigError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("protractor/built/exitCodes", "ConfigError.CODE")
    @js.native
    def CODE: Double = js.native
    inline def CODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("protractor/built/exitCodes", "ErrorHandler")
  @js.native
  class ErrorHandler () extends StObject
  /* static members */
  object ErrorHandler {
    
    @JSImport("protractor/built/exitCodes", "ErrorHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isError(errMsgs: js.Array[String], e: Error): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isError")(errMsgs.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def parseError(e: Error): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseError")(e.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("protractor/built/exitCodes", "IError")
  @js.native
  class IError ()
    extends StObject
       with Error {
    
    var code: js.UndefOr[Double] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("protractor/built/exitCodes", "ProtractorError")
  @js.native
  class ProtractorError protected () extends IError {
    def this(logger: Logger, message: String, code: Double) = this()
    def this(logger: Logger, message: String, code: Double, error: Error) = this()
  }
  /* static members */
  object ProtractorError {
    
    @JSImport("protractor/built/exitCodes", "ProtractorError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("protractor/built/exitCodes", "ProtractorError.CODE")
    @js.native
    def CODE: Double = js.native
    inline def CODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("protractor/built/exitCodes", "ProtractorError.ERR_MSGS")
    @js.native
    def ERR_MSGS: js.Array[String] = js.native
    inline def ERR_MSGS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_MSGS")(x.asInstanceOf[js.Any])
    
    @JSImport("protractor/built/exitCodes", "ProtractorError.SUPRESS_EXIT_CODE")
    @js.native
    def SUPRESS_EXIT_CODE: Boolean = js.native
    inline def SUPRESS_EXIT_CODE_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPRESS_EXIT_CODE")(x.asInstanceOf[js.Any])
    
    inline def log(logger: Logger, code: Double, message: String, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(logger.asInstanceOf[js.Any], code.asInstanceOf[js.Any], message.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
