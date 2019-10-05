package typings.reactDashPopperDashTooltip.distTypesMod

import typings.popperDotJs.popperDotJsMod.Popper.Placement
import typings.reactDashPopper.reactDashPopperMod.RefHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipArg extends js.Object {
  var arrowRef: RefHandler = js.native
  var placement: Placement = js.native
  var tooltipRef: RefHandler = js.native
  def getArrowProps(): GetArrowPropsArg = js.native
  def getArrowProps(arg: GetArrowPropsArg): GetArrowPropsArg = js.native
  def getTooltipProps(): GetTooltipPropsArg = js.native
  def getTooltipProps(arg: GetTooltipPropsArg): GetTooltipPropsArg = js.native
}

