package typings.reactPopperTooltip

import typings.react.mod.ComponentType
import typings.reactPopperTooltip.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactPopperTooltipComponents extends reactPopperTooltipProps {
  @scala.inline
  def ReactPopperTooltip: ComponentType[ReactPopperTooltipProps] = js.constructorOf[default].asInstanceOf[ComponentType[ReactPopperTooltipProps]]
  @scala.inline
  def Tooltip: ComponentType[TooltipProps] = js.constructorOf[typings.reactPopperTooltip.tooltipMod.default].asInstanceOf[ComponentType[TooltipProps]]
  @scala.inline
  def TooltipTrigger: ComponentType[TooltipTriggerProps] = js.constructorOf[typings.reactPopperTooltip.tooltipTriggerMod.default].asInstanceOf[ComponentType[TooltipTriggerProps]]
}

