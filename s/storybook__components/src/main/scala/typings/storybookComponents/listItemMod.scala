package typings.storybookComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod extends Shortcut {
  
  @JSImport("@storybook/components/dist/tooltip/ListItem", JSImport.Default)
  @js.native
  val default: FunctionComponent[ListItemProps] = js.native
  
  trait CenterTextProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object CenterTextProps {
    
    @scala.inline
    def apply(): CenterTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CenterTextProps]
    }
    
    @scala.inline
    implicit class CenterTextPropsMutableBuilder[Self <: CenterTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  trait ItemProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object ItemProps {
    
    @scala.inline
    def apply(): ItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemProps]
    }
    
    @scala.inline
    implicit class ItemPropsMutableBuilder[Self <: ItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  trait LeftProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
  }
  object LeftProps {
    
    @scala.inline
    def apply(): LeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LeftProps]
    }
    
    @scala.inline
    implicit class LeftPropsMutableBuilder[Self <: LeftProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  type LinkWrapperType = FunctionComponent[js.Object]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.ComponentProps<@emotion/styled-base.@emotion/styled-base.StyledComponent<react.react.DetailedHTMLProps<react.react.AnchorHTMLAttributes<std.HTMLAnchorElement>, std.HTMLAnchorElement>, @storybook/components.@storybook/components/dist/tooltip/ListItem.ItemProps, @storybook/theming.@storybook/theming/dist/types.Theme>>, 'href' | 'title'> ]: react.react.ComponentProps<@emotion/styled-base.@emotion/styled-base.StyledComponent<react.react.DetailedHTMLProps<react.react.AnchorHTMLAttributes<std.HTMLAnchorElement>, std.HTMLAnchorElement>, @storybook/components.@storybook/components/dist/tooltip/ListItem.ItemProps, @storybook/theming.@storybook/theming/dist/types.Theme>>[P]} */ trait ListItemProps extends StObject {
    
    var LinkWrapper: js.UndefOr[LinkWrapperType] = js.undefined
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var center: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var left: js.UndefOr[ReactNode] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var right: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object ListItemProps {
    
    @scala.inline
    def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    @scala.inline
    implicit class ListItemPropsMutableBuilder[Self <: ListItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setCenter(value: ReactNode): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setLeft(value: ReactNode): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setLinkWrapper(value: LinkWrapperType): Self = StObject.set(x, "LinkWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkWrapperUndefined: Self = StObject.set(x, "LinkWrapper", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setRight(value: ReactNode): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait RightProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
  }
  object RightProps {
    
    @scala.inline
    def apply(): RightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightProps]
    }
    
    @scala.inline
    implicit class RightPropsMutableBuilder[Self <: RightProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  trait TitleProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
  }
  object TitleProps {
    
    @scala.inline
    def apply(): TitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleProps]
    }
    
    @scala.inline
    implicit class TitlePropsMutableBuilder[Self <: TitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    }
  }
  
  type _To = FunctionComponent[ListItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `listItemMod.foo` */
  override def _to: FunctionComponent[ListItemProps] = default
}
