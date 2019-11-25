package typings.atStorybookAddonDashKnobs.distComponentsTypesNumberMod

import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Component
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

