package typings.rcTabs

import org.scalablytyped.runtime.Shortcut
import typings.rcTabs.tabsMod.TabsProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-tabs", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TabsProps & RefAttributes[HTMLDivElement]] = js.native
  
  type _To = ForwardRefExoticComponent[TabsProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[TabsProps & RefAttributes[HTMLDivElement]] = default
}
