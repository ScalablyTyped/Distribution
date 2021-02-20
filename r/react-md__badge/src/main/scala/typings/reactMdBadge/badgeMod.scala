package typings.reactMdBadge

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod {
  
  @JSImport("@react-md/badge/types/Badge", "Badge")
  @js.native
  val Badge: ForwardRefExoticComponent[BadgeProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @js.native
  trait BadgeProps extends HTMLAttributes[HTMLSpanElement] {
    
    /**
      * Boolean if the badge should still display if the children is set to `0`, or
      * `null`.  The default behavior is to render null for these cases since it
      * isn't extremely helpful to display an "empty" badge.
      */
    var disableNullOnZero: js.UndefOr[Boolean] = js.native
    
    /**
      * The id for the badge. This is required for a11y since the element that the
      * badge is fixed to should include this id in the `aria-describedby` list.
      */
    @JSName("id")
    var id_BadgeProps: String = js.native
    
    /**
      * The theme to use for the badge.
      */
    var theme: js.UndefOr[BadgeTheme] = js.native
  }
  object BadgeProps {
    
    @scala.inline
    def apply(id: String): BadgeProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeProps]
    }
    
    @scala.inline
    implicit class BadgePropsMutableBuilder[Self <: BadgeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableNullOnZero(value: Boolean): Self = StObject.set(x, "disableNullOnZero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableNullOnZeroUndefined: Self = StObject.set(x, "disableNullOnZero", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: BadgeTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdBadge.reactMdBadgeStrings.primary
    - typings.reactMdBadge.reactMdBadgeStrings.secondary
    - typings.reactMdBadge.reactMdBadgeStrings.default
    - typings.reactMdBadge.reactMdBadgeStrings.clear
  */
  trait BadgeTheme extends StObject
  object BadgeTheme {
    
    @scala.inline
    def default: typings.reactMdBadge.reactMdBadgeStrings.default = "default".asInstanceOf[typings.reactMdBadge.reactMdBadgeStrings.default]
    
    @scala.inline
    def clear: typings.reactMdBadge.reactMdBadgeStrings.clear = "clear".asInstanceOf[typings.reactMdBadge.reactMdBadgeStrings.clear]
    
    @scala.inline
    def primary: typings.reactMdBadge.reactMdBadgeStrings.primary = "primary".asInstanceOf[typings.reactMdBadge.reactMdBadgeStrings.primary]
    
    @scala.inline
    def secondary: typings.reactMdBadge.reactMdBadgeStrings.secondary = "secondary".asInstanceOf[typings.reactMdBadge.reactMdBadgeStrings.secondary]
  }
}
