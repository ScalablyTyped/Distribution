package typings.reactMdLink

import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipToMainContentMod {
  
  @JSImport("@react-md/link/types/SkipToMainContent", "SkipToMainContent")
  @js.native
  val SkipToMainContent: ForwardRefExoticComponent[SkipToMainContentProps with RefAttributes[HTMLAnchorElement]] = js.native
  
  @js.native
  trait SkipToMainContentProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
    
    /**
      * The id to use for the `<main>` content that should be focused once this
      * link is clicked.
      */
    var mainId: String = js.native
    
    /**
      * Boolean if the skip to main content link should be unstyled so that you can
      * provide your own styles. This is just helpful if you are using this
      * component in a multiple places and don't want to keep overriding the
      * default styles each time.
      *
      * Note: there will still be the "base" link styles, font size, and z-index.
      * The `$rmd-link-skip-styles` and `$rmd-link-skip-active-styles` will not be
      * applied.
      */
    var unstyled: js.UndefOr[Boolean] = js.native
  }
  object SkipToMainContentProps {
    
    @scala.inline
    def apply(mainId: String): SkipToMainContentProps = {
      val __obj = js.Dynamic.literal(mainId = mainId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkipToMainContentProps]
    }
    
    @scala.inline
    implicit class SkipToMainContentPropsMutableBuilder[Self <: SkipToMainContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMainId(value: String): Self = StObject.set(x, "mainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstyled(value: Boolean): Self = StObject.set(x, "unstyled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstyledUndefined: Self = StObject.set(x, "unstyled", js.undefined)
    }
  }
}
