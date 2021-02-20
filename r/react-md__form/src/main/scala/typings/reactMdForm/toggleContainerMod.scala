package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleContainerMod {
  
  @JSImport("@react-md/form/types/toggle/ToggleContainer", "ToggleContainer")
  @js.native
  val ToggleContainer: ForwardRefExoticComponent[ToggleContainerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait ToggleContainerProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if the input toggle should be rendered as `inline-flex` instead of
      * `flex`.
      */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the label should be stacked above/below the input toggle instead
      * of being rendered on the same line.
      */
    var stacked: js.UndefOr[Boolean] = js.native
  }
  object ToggleContainerProps {
    
    @scala.inline
    def apply(): ToggleContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleContainerProps]
    }
    
    @scala.inline
    implicit class ToggleContainerPropsMutableBuilder[Self <: ToggleContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    }
  }
}
