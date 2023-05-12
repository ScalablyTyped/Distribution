package typings.rcTooltip

import typings.rcTooltip.esPopupMod.ContentProps
import typings.rcTooltip.esTooltipMod.TooltipProps
import typings.rcTooltip.esTooltipMod.TooltipRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-tooltip", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TooltipProps & RefAttributes[TooltipRef]] = js.native
  
  inline def Popup(props: ContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Popup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
