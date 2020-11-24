package typings.protractor

import typings.protractor.loggerMod.Logger
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor/built/exitCodes", JSImport.Namespace)
@js.native
object exitCodesMod extends js.Object {
  
  @js.native
  class BrowserError protected () extends ProtractorError {
    def this(logger: Logger, message: String) = this()
  }
  /* static members */
  @js.native
  object BrowserError extends js.Object {
    
    var CODE: Double = js.native
    
    var ERR_MSGS: js.Array[String] = js.native
  }
  
  @js.native
  class ConfigError protected () extends ProtractorError {
    def this(logger: Logger, message: String) = this()
    def this(logger: Logger, message: String, error: Error) = this()
  }
  /* static members */
  @js.native
  object ConfigError extends js.Object {
    
    var CODE: Double = js.native
  }
  
  @js.native
  class ErrorHandler () extends js.Object
  /* static members */
  @js.native
  object ErrorHandler extends js.Object {
    
    def isError(errMsgs: js.Array[String], e: Error): Boolean = js.native
    
    def parseError(e: Error): Double = js.native
  }
  
  @js.native
  class IError () extends Error {
    
    var code: js.UndefOr[Double] = js.native
  }
  
  @js.native
  class ProtractorError protected () extends IError {
    def this(logger: Logger, message: String, code: Double) = this()
    def this(logger: Logger, message: String, code: Double, error: Error) = this()
  }
  /* static members */
  @js.native
  object ProtractorError extends js.Object {
    
    var CODE: Double = js.native
    
    var ERR_MSGS: js.Array[String] = js.native
    
    var SUPRESS_EXIT_CODE: Boolean = js.native
    
    def log(logger: Logger, code: Double, message: String, stack: String): Unit = js.native
  }
}
