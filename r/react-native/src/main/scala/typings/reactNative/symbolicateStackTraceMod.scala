package typings.reactNative

import typings.reactNative.parseErrorStackMod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolicateStackTraceMod {
  
  @JSImport("react-native/Libraries/Core/Devtools/symbolicateStackTrace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(stack: js.Array[StackFrame]): js.Promise[js.Array[StackFrame]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(stack.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[StackFrame]]]
}
