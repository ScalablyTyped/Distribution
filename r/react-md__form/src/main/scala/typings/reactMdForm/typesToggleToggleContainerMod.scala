package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesToggleToggleContainerMod {
  
  @JSImport("@react-md/form/types/toggle/ToggleContainer", "ToggleContainer")
  @js.native
  val ToggleContainer: ForwardRefExoticComponent[ToggleContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait ToggleContainerProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if the input toggle should be rendered as `inline-flex` instead of
      * `flex`.
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the label should be stacked above/below the input toggle instead
      * of being rendered on the same line.
      */
    var stacked: js.UndefOr[Boolean] = js.undefined
  }
  object ToggleContainerProps {
    
    inline def apply(): ToggleContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToggleContainerProps] (val x: Self) extends AnyVal {
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    }
  }
}
