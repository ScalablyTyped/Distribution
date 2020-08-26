package typings.reactMdForm

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/form/types/toggle/useChecked", JSImport.Namespace)
@js.native
object useCheckedMod extends js.Object {
  def default(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def default(defaultChecked: js.Function0[Boolean], onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def default(defaultChecked: Boolean): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def default(defaultChecked: Boolean, onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  type ChangeEventHandler = typings.react.mod.ChangeEventHandler[HTMLInputElement]
  type SetChecked = Dispatch[SetStateAction[Boolean]]
}

