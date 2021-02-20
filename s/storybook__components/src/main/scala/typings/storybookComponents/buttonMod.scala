package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.storybookComponents.anon.PickButtonPropscolortrans
import typings.storybookComponents.anon.PickLinkPropscolortransla
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("@storybook/components/dist/bar/button", "IconButton")
  @js.native
  val IconButton: StyledComponent[PickButtonPropscolortrans | PickLinkPropscolortransla, IconButtonProps, Theme] = js.native
  
  @JSImport("@storybook/components/dist/bar/button", "TabButton")
  @js.native
  val TabButton: StyledComponent[PickButtonPropscolortrans | PickLinkPropscolortransla, TabButtonProps, Theme] = js.native
  
  @js.native
  trait ButtonProps
    extends ButtonHTMLAttributes[HTMLButtonElement]
       with ClassAttributes[HTMLButtonElement] {
    
    var href: js.UndefOr[Unit] = js.native
  }
  object ButtonProps {
    
    @scala.inline
    def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: Unit): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    }
  }
  
  @js.native
  trait IconButtonProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
  }
  object IconButtonProps {
    
    @scala.inline
    def apply(): IconButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconButtonProps]
    }
    
    @scala.inline
    implicit class IconButtonPropsMutableBuilder[Self <: IconButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  @js.native
  trait LinkProps
    extends AnchorHTMLAttributes[HTMLAnchorElement]
       with ClassAttributes[HTMLAnchorElement] {
    
    @JSName("href")
    var href_LinkProps: String = js.native
  }
  object LinkProps {
    
    @scala.inline
    def apply(href: String): LinkProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabButtonProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var textColor: js.UndefOr[String] = js.native
  }
  object TabButtonProps {
    
    @scala.inline
    def apply(): TabButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabButtonProps]
    }
    
    @scala.inline
    implicit class TabButtonPropsMutableBuilder[Self <: TabButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    }
  }
}
