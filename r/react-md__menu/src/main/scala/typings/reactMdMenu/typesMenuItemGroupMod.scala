package typings.reactMdMenu

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdList.typesListMod.ListElement
import typings.reactMdMenu.anon.Children
import typings.reactMdMenu.anon.OmitListPropsrole
import typings.reactMdUtils.typesTypesMod.LabelRequiredForA11y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuItemGroupMod {
  
  @JSImport("@react-md/menu/types/MenuItemGroup", "MenuItemGroup")
  @js.native
  val MenuItemGroup: ForwardRefExoticComponent[MenuItemGroupProps & RefAttributes[ListElement]] = js.native
  
  type MenuItemGroupProps = LabelRequiredForA11y[OmitListPropsrole] & Children
}
