package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputToggleIconMod {
  
  @JSImport("@react-md/form/types/toggle/InputToggleIcon", "InputToggleIcon")
  @js.native
  val InputToggleIcon: ForwardRefExoticComponent[InputToggleIconProps & RefAttributes[HTMLSpanElement]] = js.native
  
  trait InputToggleIconProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    /**
      * Boolean if the icon should gain the checked state.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the icon should use circle styles. This should normally be
      * enabled for radio input types.
      */
    var circle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the disabled styles should be applied.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if using the indeterminate checkbox state.
      */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if using an overlay for the different icon states.
      */
    var overlay: js.UndefOr[Boolean] = js.undefined
  }
  object InputToggleIconProps {
    
    inline def apply(): InputToggleIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputToggleIconProps]
    }
    
    extension [Self <: InputToggleIconProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    }
  }
}
