package typings.rcTooltip

import org.scalablytyped.runtime.Shortcut
import typings.rcTooltip.tooltipMod.TooltipProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-tooltip", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TooltipProps & RefAttributes[js.Any]] = js.native
  
  type _To = ForwardRefExoticComponent[TooltipProps & RefAttributes[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[TooltipProps & RefAttributes[js.Any]] = default
}
