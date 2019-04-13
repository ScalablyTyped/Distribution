package typings
package reactDashPopperDashTooltipLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipProps extends js.Object {
  var arrowProps: reactDashPopperLib.reactDashPopperMod.PopperArrowProps = js.native
  var closeOnOutOfBoundaries: scala.Boolean = js.native
  @JSName("innerRef")
  var innerRef_Original: reactDashPopperLib.RefHandler = js.native
  var outOfBoundaries: scala.Boolean | scala.Null = js.native
  var placement: popperDotJsLib.popperDotJsMod.PopperNs.Placement = js.native
  var style: reactLib.reactMod.CSSProperties = js.native
  var trigger: reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.none | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.click | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.`right-click` | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.hover = js.native
  def addParentOutsideClickHandler(): scala.Unit = js.native
  def addParentOutsideRightClickHandler(): scala.Unit = js.native
  def clearScheduled(): scala.Unit = js.native
  def hideTooltip(): scala.Unit = js.native
  def innerRef(): scala.Unit = js.native
  def innerRef(ref: stdLib.HTMLElement): scala.Unit = js.native
  def parentOutsideClickHandler(arg: stdLib.Event): scala.Unit = js.native
  def parentOutsideRightClickHandler(arg: stdLib.Event): scala.Unit = js.native
  def removeParentOutsideClickHandler(): scala.Unit = js.native
  def removeParentOutsideRightClickHandler(): scala.Unit = js.native
  def scheduleUpdate(): scala.Unit = js.native
  def tooltip(arg: ITooltipArg): reactLib.reactMod.ReactNode = js.native
}

