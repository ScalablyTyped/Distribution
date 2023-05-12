package typings.rcComponentTrigger

import org.scalablytyped.runtime.Shortcut
import typings.rcComponentTrigger.mod.TriggerProps
import typings.rcComponentTrigger.mod.TriggerRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMockMod extends Shortcut {
  
  @JSImport("@rc-component/trigger/es/mock", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TriggerProps & RefAttributes[TriggerRef]] = js.native
  
  type _To = ForwardRefExoticComponent[TriggerProps & RefAttributes[TriggerRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esMockMod.foo` */
  override def _to: ForwardRefExoticComponent[TriggerProps & RefAttributes[TriggerRef]] = default
}
