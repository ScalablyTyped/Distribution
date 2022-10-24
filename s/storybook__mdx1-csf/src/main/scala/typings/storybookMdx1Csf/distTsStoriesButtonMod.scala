package typings.storybookMdx1Csf

import typings.react.mod.global.JSX.Element
import typings.storybookMdx1Csf.storybookMdx1CsfStrings.large
import typings.storybookMdx1Csf.storybookMdx1CsfStrings.medium
import typings.storybookMdx1Csf.storybookMdx1CsfStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTsStoriesButtonMod {
  
  @JSImport("@storybook/mdx1-csf/dist/ts/stories/Button", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Button(param0: ButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Button")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ButtonProps extends StObject {
    
    /**
      * What background color to use
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Button contents
      */
    var label: String
    
    /**
      * Optional click handler
      */
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Is this the principal call to action on the page?
      */
    var primary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How large should the button be?
      */
    var size: js.UndefOr[small | medium | large] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(label: String): ButtonProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonProps]
    }
    
    extension [Self <: ButtonProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
