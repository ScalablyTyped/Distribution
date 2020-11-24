package typings.reactMdForm

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/form/types/useChoice", JSImport.Namespace)
@js.native
object useChoiceMod extends js.Object {
  
  def useChoice[E /* <: InputElement */](defaultValue: String): js.Tuple3[String, ChangeEventHandler[E], SetValue[String]] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: String, onChange: ChangeEventHandler[E]): js.Tuple3[String, ChangeEventHandler[E], SetValue[String]] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: js.Array[String]): js.Tuple3[js.Array[String], ChangeEventHandler[E], SetValue[js.Array[String]]] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: js.Array[String], onChange: ChangeEventHandler[E]): js.Tuple3[js.Array[String], ChangeEventHandler[E], SetValue[js.Array[String]]] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: Double): js.Tuple3[Double, ChangeEventHandler[E], SetValue[Double]] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: Double, onChange: ChangeEventHandler[E]): js.Tuple3[Double, ChangeEventHandler[E], SetValue[Double]] = js.native
  def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T): js.Tuple3[T, ChangeEventHandler[E], SetValue[T]] = js.native
  def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T, onChange: ChangeEventHandler[E]): js.Tuple3[T, ChangeEventHandler[E], SetValue[T]] = js.native
  
  type ChangeEventHandler[E /* <: InputElement */] = typings.react.mod.ChangeEventHandler[E]
  
  type DefaultValue = String | Double | js.Array[String] | (js.Function0[String | Double | js.Array[String]])
  
  type InputElement = HTMLInputElement | HTMLSelectElement
  
  type SetValue[T /* <: DefaultValue */] = Dispatch[SetStateAction[T]]
}
