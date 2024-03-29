package typings.reactMdMenu

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdMenu.anon.ReadonlyMenuConfiguration
import typings.reactMdMenu.typesTypesMod.MenuConfiguration
import typings.reactMdMenu.typesTypesMod.RenderMenuAsSheet
import typings.reactMdSheet.typesSheetMod.SheetPosition
import typings.reactMdSheet.typesSheetMod.SheetVerticalSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuConfigurationProviderMod {
  
  @JSImport("@react-md/menu/types/MenuConfigurationProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<@react-md/menu.@react-md/menu/types/types.MenuConfigurationContext> */
  object DEFAULT_MENU_CONFIGURATION {
    
    @JSImport("@react-md/menu/types/MenuConfigurationProvider", "DEFAULT_MENU_CONFIGURATION.horizontal")
    @js.native
    val horizontal: Boolean = js.native
    
    @JSImport("@react-md/menu/types/MenuConfigurationProvider", "DEFAULT_MENU_CONFIGURATION.renderAsSheet")
    @js.native
    val renderAsSheet: RenderMenuAsSheet = js.native
    
    @JSImport("@react-md/menu/types/MenuConfigurationProvider", "DEFAULT_MENU_CONFIGURATION.sheetFooter")
    @js.native
    val sheetFooter: ReactNode = js.native
    
    @JSImport("@react-md/menu/types/MenuConfigurationProvider", "DEFAULT_MENU_CONFIGURATION.sheetHeader")
    @js.native
    val sheetHeader: ReactNode = js.native
    
    @JSImport("@react-md/menu/types/MenuConfigurationProvider", "DEFAULT_MENU_CONFIGURATION.sheetPosition")
    @js.native
    val sheetPosition: SheetPosition = js.native
    
    @JSImport("@react-md/menu/types/MenuConfigurationProvider", "DEFAULT_MENU_CONFIGURATION.sheetVerticalSize")
    @js.native
    val sheetVerticalSize: SheetVerticalSize = js.native
  }
  
  inline def MenuConfigurationProvider(param0: MenuConfigurationProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuConfigurationProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useMenuConfiguration(): ReadonlyMenuConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuConfiguration")().asInstanceOf[ReadonlyMenuConfiguration]
  inline def useMenuConfiguration(param0: MenuConfiguration): ReadonlyMenuConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuConfiguration")(param0.asInstanceOf[js.Any]).asInstanceOf[ReadonlyMenuConfiguration]
  
  trait MenuConfigurationProviderProps
    extends StObject
       with MenuConfiguration {
    
    var children: ReactNode
  }
  object MenuConfigurationProviderProps {
    
    inline def apply(): MenuConfigurationProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuConfigurationProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuConfigurationProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
