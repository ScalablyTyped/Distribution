package typings.storybookAddonKnobs.numberMod

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberType
  extends Component[NumberTypeProps, js.Object, js.Any] {
  def handleChange(event: ChangeEvent[HTMLInputElement]): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MNumberType(nextProps: NumberTypeProps): Boolean = js.native
}

