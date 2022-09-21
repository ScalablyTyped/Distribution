package typings.reactMdMenu

import typings.react.mod.ReactElement
import typings.reactMdMenu.anon.MenuRef
import typings.reactMdMenu.typesMod.BaseMenuRendererProps
import typings.reactMdMenu.typesMod.MenuListProps
import typings.reactMdMenu.typesMod.MenuTransitionProps
import typings.reactMdMenu.typesMod.ProvidedMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuRendererMod {
  
  @JSImport("@react-md/menu/types/MenuRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuRenderer(
    hasMenuRefMenuPropsMenuStyleMenuClassNameSheetPropsPropSheetHeaderPropSheetFooterSheetStyleSheetClassNameSheetMenuPropsChildrenPropHorizontalPropRenderAsSheetPropSheetPositionPropSheetVerticalSizeOnRequestCloseOnClickOnKeyDownProps: MenuRendererProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuRenderer")(hasMenuRefMenuPropsMenuStyleMenuClassNameSheetPropsPropSheetHeaderPropSheetFooterSheetStyleSheetClassNameSheetMenuPropsChildrenPropHorizontalPropRenderAsSheetPropSheetPositionPropSheetVerticalSizeOnRequestCloseOnClickOnKeyDownProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  type MenuRendererProps = ProvidedMenuProps & BaseMenuRendererProps & MenuListProps & MenuTransitionProps & MenuRef
}
