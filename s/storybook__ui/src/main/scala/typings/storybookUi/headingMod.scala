package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.ComponentProps
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.PickDetailedHTMLPropsHTML
import typings.storybookUi.menuMod.MenuList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Heading", "Heading")
  @js.native
  val Heading: FunctionComponent[
    HeadingProps with (ComponentProps[
      StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        PickDetailedHTMLPropsHTML, 
        Theme
      ]
    ])
  ] = js.native
  
  @js.native
  trait HeadingProps extends StObject {
    
    var menu: MenuList = js.native
    
    var menuHighlighted: js.UndefOr[Boolean] = js.native
  }
  object HeadingProps {
    
    @scala.inline
    def apply(menu: MenuList): HeadingProps = {
      val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadingProps]
    }
    
    @scala.inline
    implicit class HeadingPropsMutableBuilder[Self <: HeadingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMenu(value: MenuList): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHighlighted(value: Boolean): Self = StObject.set(x, "menuHighlighted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHighlightedUndefined: Self = StObject.set(x, "menuHighlighted", js.undefined)
    }
  }
}
