package typings.reactMdCard

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardContentMod {
  
  @JSImport("@react-md/card/types/CardContent", "CardContent")
  @js.native
  val CardContent: ForwardRefExoticComponent[CardContentProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait CardContentProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if the extra `padding-bottom` that gets applied when the
      * `CardContent` is the last component within the `Card`. If the
      * `disablePadding` prop is enabled, this prop will be ignored and the extra
      * padding will not be applied.
      */
    var disableExtraPadding: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the padding should be removed from the content. This is really
      * only useful if your child elements have their own padding.
      */
    var disablePadding: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if any `<p>` tags that appear as children of this component should
      * no longer have their `margin-top` and `margin-bottom` removed. The default
      * behavior is to remove all `margin-top` and remove the `margin-bottom` if
      * the `<p>` is the last child.
      */
    var disableParagraphMargin: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the current secondary text color should be disabled from the
      * content.
      */
    var disableSecondaryColor: js.UndefOr[Boolean] = js.native
  }
  object CardContentProps {
    
    @scala.inline
    def apply(): CardContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardContentProps]
    }
    
    @scala.inline
    implicit class CardContentPropsMutableBuilder[Self <: CardContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableExtraPadding(value: Boolean): Self = StObject.set(x, "disableExtraPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableExtraPaddingUndefined: Self = StObject.set(x, "disableExtraPadding", js.undefined)
      
      @scala.inline
      def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
      
      @scala.inline
      def setDisableParagraphMargin(value: Boolean): Self = StObject.set(x, "disableParagraphMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableParagraphMarginUndefined: Self = StObject.set(x, "disableParagraphMargin", js.undefined)
      
      @scala.inline
      def setDisableSecondaryColor(value: Boolean): Self = StObject.set(x, "disableSecondaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSecondaryColorUndefined: Self = StObject.set(x, "disableSecondaryColor", js.undefined)
    }
  }
}
