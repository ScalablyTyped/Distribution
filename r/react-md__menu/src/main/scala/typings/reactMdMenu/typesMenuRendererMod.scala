package typings.reactMdMenu

import typings.react.mod.ReactElement
import typings.reactMdMenu.anon.MenuRef
import typings.reactMdMenu.typesTypesMod.BaseMenuRendererProps
import typings.reactMdMenu.typesTypesMod.MenuListProps
import typings.reactMdMenu.typesTypesMod.MenuTransitionProps
import typings.reactMdMenu.typesTypesMod.ProvidedMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuRendererMod {
  
  @JSImport("@react-md/menu/types/MenuRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuRenderer(param0: MenuRendererProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuRenderer")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  type MenuRendererProps = ProvidedMenuProps & BaseMenuRendererProps & MenuListProps & MenuTransitionProps & MenuRef
}
