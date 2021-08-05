package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ComponentProps
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.storybookComponents.buttonButtonMod.ButtonProps
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.Highlighted
import typings.storybookUi.anon.IsHighlighted
import typings.storybookUi.anon.Menu
import typings.storybookUi.anon.PickPropsWithChildrenClas
import typings.storybookUi.storybookUiStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu", "MenuButton")
  @js.native
  val MenuButton: StyledComponent[PickPropsWithChildrenClas, MenuButtonProps, Theme] = js.native
  
  inline def MenuItemIcon(hasIconImgSrc: ListItemIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItemIcon")(hasIconImgSrc.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu", "SidebarMenu")
  @js.native
  val SidebarMenu: FunctionComponent[IsHighlighted] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu", "SidebarMenuList")
  @js.native
  val SidebarMenuList: FunctionComponent[Menu] = js.native
  
  trait ListItemIconProps extends StObject {
    
    var icon: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/icon/icon.IconsProps>>['icon'] */ js.Any
      ] = js.undefined
    
    var imgSrc: js.UndefOr[String] = js.undefined
  }
  object ListItemIconProps {
    
    inline def apply(): ListItemIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemIconProps]
    }
    
    extension [Self <: ListItemIconProps](x: Self) {
      
      inline def setIcon(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/icon/icon.IconsProps>>['icon'] */ js.Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setImgSrc(value: String): Self = StObject.set(x, "imgSrc", value.asInstanceOf[js.Any])
      
      inline def setImgSrcUndefined: Self = StObject.set(x, "imgSrc", js.undefined)
    }
  }
  
  type MenuButtonProps = (ComponentProps[
    FunctionComponent[
      ComponentProps[
        StyledComponent[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          ButtonProps, 
          Theme
        ]
      ]
    ]
  ]) & ComponentProps[button] & Highlighted
  
  type MenuList = /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/tooltip/TooltipLinkList.TooltipLinkListProps>>['links'] */ js.Any
}
