package typings.atStorybookAddonDashKnobs.distComponentsTypesColorMod

import typings.react.reactMod.Component
import typings.reactDashColor.reactDashColorMod.ColorResult
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorType
  extends Component[ColorTypeProps, ColorTypeState, js.Any] {
  var popover: HTMLDivElement = js.native
  @JSName("componentDidMount")
  def componentDidMount_MColorType(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MColorType(): Unit = js.native
  def handleChange(color: ColorResult): Unit = js.native
  def handleClick(): Unit = js.native
  def handleWindowMouseDown(e: MouseEvent): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MColorType(nextProps: ColorTypeProps, nextState: ColorTypeState): Boolean = js.native
}

