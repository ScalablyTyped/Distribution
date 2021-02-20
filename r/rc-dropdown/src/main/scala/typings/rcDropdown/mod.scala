package typings.rcDropdown

import org.scalablytyped.runtime.Shortcut
import typings.rcDropdown.dropdownMod.DropdownProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-dropdown", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[DropdownProps with RefAttributes[_]] = js.native
  
  type _To = ForwardRefExoticComponent[DropdownProps with RefAttributes[_]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[DropdownProps with RefAttributes[_]] = default
}
