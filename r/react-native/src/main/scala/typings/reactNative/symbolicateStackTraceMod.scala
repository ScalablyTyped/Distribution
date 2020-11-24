package typings.reactNative

import typings.reactNative.parseErrorStackMod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native/Libraries/Core/Devtools/symbolicateStackTrace", JSImport.Namespace)
@js.native
object symbolicateStackTraceMod extends js.Object {
  
  def default(stack: js.Array[StackFrame]): js.Promise[js.Array[StackFrame]] = js.native
}
