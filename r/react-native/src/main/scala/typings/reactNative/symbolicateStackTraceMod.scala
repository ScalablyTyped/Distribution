package typings.reactNative

import typings.reactNative.parseErrorStackMod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolicateStackTraceMod {
  
  @JSImport("react-native/Libraries/Core/Devtools/symbolicateStackTrace", JSImport.Default)
  @js.native
  def default(stack: js.Array[StackFrame]): js.Promise[js.Array[StackFrame]] = js.native
}
