package typings.setErrorMessage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("set-error-message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ErrorArg](error: ErrorArg, newMessage: String): NormalizeError[ErrorArg] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(error.asInstanceOf[js.Any], newMessage.asInstanceOf[js.Any])).asInstanceOf[NormalizeError[ErrorArg]]
  inline def default[ErrorArg](error: ErrorArg, newMessage: String, currentMessage: String): NormalizeError[ErrorArg] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(error.asInstanceOf[js.Any], newMessage.asInstanceOf[js.Any], currentMessage.asInstanceOf[js.Any])).asInstanceOf[NormalizeError[ErrorArg]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ErrorArg extends std.Error ? ErrorArg : std.Error
    }}}
    */
  type NormalizeError[ErrorArg] = ErrorArg
}
