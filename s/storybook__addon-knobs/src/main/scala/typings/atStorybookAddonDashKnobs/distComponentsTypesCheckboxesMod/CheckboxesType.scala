package typings.atStorybookAddonDashKnobs.distComponentsTypesCheckboxesMod

import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxesType
  extends Component[CheckboxesTypeProps, CheckboxesTypeState, js.Any] {
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def renderCheckbox(label: String, value: String): Element = js.native
  def renderCheckboxList(hasOptions: CheckboxesTypeKnob): js.Array[Element] = js.native
}

