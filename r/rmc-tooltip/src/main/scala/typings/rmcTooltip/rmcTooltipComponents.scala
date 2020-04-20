package typings.rmcTooltip

import typings.react.mod.ComponentType
import typings.rmcTooltip.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rmcTooltipComponents extends rmcTooltipProps {
  @scala.inline
  def Lib: ComponentType[LibProps] = js.constructorOf[default].asInstanceOf[ComponentType[LibProps]]
  @scala.inline
  def Tooltip: ComponentType[TooltipProps] = js.constructorOf[typings.rmcTooltip.tooltipMod.default].asInstanceOf[ComponentType[TooltipProps]]
}

