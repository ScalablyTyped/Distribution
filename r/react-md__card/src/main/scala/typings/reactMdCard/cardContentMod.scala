package typings.reactMdCard

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardContentMod {
  
  @JSImport("@react-md/card/types/CardContent", "CardContent")
  @js.native
  val CardContent: ForwardRefExoticComponent[CardContentProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait CardContentProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if the extra `padding-bottom` that gets applied when the
      * `CardContent` is the last component within the `Card`. If the
      * `disablePadding` prop is enabled, this prop will be ignored and the extra
      * padding will not be applied.
      */
    var disableExtraPadding: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the padding should be removed from the content. This is really
      * only useful if your child elements have their own padding.
      */
    var disablePadding: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if any `<p>` tags that appear as children of this component should
      * no longer have their `margin-top` and `margin-bottom` removed. The default
      * behavior is to remove all `margin-top` and remove the `margin-bottom` if
      * the `<p>` is the last child.
      */
    var disableParagraphMargin: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the current secondary text color should be disabled from the
      * content.
      */
    var disableSecondaryColor: js.UndefOr[Boolean] = js.undefined
  }
  object CardContentProps {
    
    inline def apply(): CardContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardContentProps]
    }
    
    extension [Self <: CardContentProps](x: Self) {
      
      inline def setDisableExtraPadding(value: Boolean): Self = StObject.set(x, "disableExtraPadding", value.asInstanceOf[js.Any])
      
      inline def setDisableExtraPaddingUndefined: Self = StObject.set(x, "disableExtraPadding", js.undefined)
      
      inline def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
      
      inline def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
      
      inline def setDisableParagraphMargin(value: Boolean): Self = StObject.set(x, "disableParagraphMargin", value.asInstanceOf[js.Any])
      
      inline def setDisableParagraphMarginUndefined: Self = StObject.set(x, "disableParagraphMargin", js.undefined)
      
      inline def setDisableSecondaryColor(value: Boolean): Self = StObject.set(x, "disableSecondaryColor", value.asInstanceOf[js.Any])
      
      inline def setDisableSecondaryColorUndefined: Self = StObject.set(x, "disableSecondaryColor", js.undefined)
    }
  }
}
