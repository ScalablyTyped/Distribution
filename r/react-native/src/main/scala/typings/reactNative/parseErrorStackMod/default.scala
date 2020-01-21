package typings.reactNative.parseErrorStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native/Libraries/Core/Devtools/parseErrorStack", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(error: ExtendedError): js.Array[StackFrame] = js.native
}

