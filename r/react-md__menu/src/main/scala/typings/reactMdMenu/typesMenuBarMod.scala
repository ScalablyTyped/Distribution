package typings.reactMdMenu

import typings.react.mod.ReactElement
import typings.reactMdMenu.typesMenuBarProviderMod.HoverableMenuBar
import typings.reactMdMenu.typesMenuBarWidgetMod.MenuBarWidgetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuBarMod {
  
  @JSImport("@react-md/menu/types/MenuBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuBar(hasHoverTimeoutProps: MenuBarProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuBar")(hasHoverTimeoutProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  type MenuBarProps = MenuBarWidgetProps & HoverableMenuBar
}
