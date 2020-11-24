package typings.reactPopperTooltip.typesMod

import typings.popperjsCore.enumsMod.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipArg extends js.Object {
  
  var arrowRef: Ref = js.native
  
  def getArrowProps(): GetArrowPropsArg = js.native
  def getArrowProps(arg: GetArrowPropsArg): GetArrowPropsArg = js.native
  
  def getTooltipProps(): GetTooltipPropsArg = js.native
  def getTooltipProps(arg: GetTooltipPropsArg): GetTooltipPropsArg = js.native
  
  var placement: Placement = js.native
  
  var tooltipRef: Ref = js.native
}
