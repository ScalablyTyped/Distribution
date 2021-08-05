package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ComponentProps
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonButtonMod {
  
  @JSImport("@storybook/components/dist/Button/Button", "Button")
  @js.native
  val Button: FunctionComponent[
    ComponentProps[
      StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        ButtonProps, 
        Theme
      ]
    ]
  ] = js.native
  
  trait ButtonProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var containsIcon: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var gray: js.UndefOr[Boolean] = js.undefined
    
    var inForm: js.UndefOr[Boolean] = js.undefined
    
    var isLink: js.UndefOr[Boolean] = js.undefined
    
    var outline: js.UndefOr[Boolean] = js.undefined
    
    var primary: js.UndefOr[Boolean] = js.undefined
    
    var secondary: js.UndefOr[Boolean] = js.undefined
    
    var small: js.UndefOr[Boolean] = js.undefined
    
    var tertiary: js.UndefOr[Boolean] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    extension [Self <: ButtonProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainsIcon(value: Boolean): Self = StObject.set(x, "containsIcon", value.asInstanceOf[js.Any])
      
      inline def setContainsIconUndefined: Self = StObject.set(x, "containsIcon", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setGray(value: Boolean): Self = StObject.set(x, "gray", value.asInstanceOf[js.Any])
      
      inline def setGrayUndefined: Self = StObject.set(x, "gray", js.undefined)
      
      inline def setInForm(value: Boolean): Self = StObject.set(x, "inForm", value.asInstanceOf[js.Any])
      
      inline def setInFormUndefined: Self = StObject.set(x, "inForm", js.undefined)
      
      inline def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
      
      inline def setIsLinkUndefined: Self = StObject.set(x, "isLink", js.undefined)
      
      inline def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      inline def setTertiary(value: Boolean): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
      
      inline def setTertiaryUndefined: Self = StObject.set(x, "tertiary", js.undefined)
    }
  }
}
