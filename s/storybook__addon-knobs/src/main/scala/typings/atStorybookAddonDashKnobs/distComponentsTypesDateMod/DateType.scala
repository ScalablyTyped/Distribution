package typings.atStorybookAddonDashKnobs.distComponentsTypesDateMod

import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Component
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateType
  extends Component[DateTypeProps, DateTypeState, js.Any] {
  var dateInput: HTMLInputElement = js.native
  var timeInput: HTMLInputElement = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDateType(): Unit = js.native
  def onDateChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def onTimeChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
}

