package typings.rcCollapse

import org.scalablytyped.runtime.Shortcut
import typings.rcCollapse.esInterfaceMod.CollapsePanelProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelMod extends Shortcut {
  
  @JSImport("rc-collapse/es/Panel", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CollapsePanelProps & RefAttributes[HTMLDivElement]] = js.native
  
  type _To = ForwardRefExoticComponent[CollapsePanelProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esPanelMod.foo` */
  override def _to: ForwardRefExoticComponent[CollapsePanelProps & RefAttributes[HTMLDivElement]] = default
}
