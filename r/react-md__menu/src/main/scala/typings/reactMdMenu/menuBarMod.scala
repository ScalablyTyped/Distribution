package typings.reactMdMenu

import typings.react.mod.ReactElement
import typings.reactMdMenu.menuBarProviderMod.HoverableMenuBar
import typings.reactMdMenu.menuBarWidgetMod.MenuBarWidgetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuBarMod {
  
  @JSImport("@react-md/menu/types/MenuBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuBar(hasHoverTimeoutProps: MenuBarProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuBar")(hasHoverTimeoutProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  type MenuBarProps = MenuBarWidgetProps & HoverableMenuBar
}
