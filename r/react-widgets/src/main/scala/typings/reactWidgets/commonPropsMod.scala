package typings.reactWidgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonPropsMod {
  
  trait AutoFocus extends StObject {
    
    /**
      * Pass focus to component when it mounts.
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
  }
  object AutoFocus {
    
    inline def apply(): AutoFocus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFocus]
    }
    
    extension [Self <: AutoFocus](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    }
  }
  
  trait ReactWidgetsCommonDropdownProps
    extends StObject
       with ReactWidgetsCommonProps {
    
    /**
      * Show "drop up" not "drop down"
      * @default false
      */
    var dropUp: js.UndefOr[Boolean] = js.undefined
  }
  object ReactWidgetsCommonDropdownProps {
    
    inline def apply(): ReactWidgetsCommonDropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactWidgetsCommonDropdownProps]
    }
    
    extension [Self <: ReactWidgetsCommonDropdownProps](x: Self) {
      
      inline def setDropUp(value: Boolean): Self = StObject.set(x, "dropUp", value.asInstanceOf[js.Any])
      
      inline def setDropUpUndefined: Self = StObject.set(x, "dropUp", js.undefined)
    }
  }
  
  trait ReactWidgetsCommonProps extends StObject {
    
    /**
      * Disable the widget, if an Array of values is passed in only those values will be disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean | js.Array[js.Any]] = js.undefined
    
    /**
      * Used to label and annotate aria- attributes
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Mark whether the SelectList should render right-to-left. This property can also be
      * implicitly passed to the widget through a childContext prop (isRtl) this allows higher
      * level application components to specify the direction.
      * @default false
      */
    var isRtl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Place the widget in a read-only mode, If an Array of values is passed in only those
      * values will be read-only.
      * @default false
      */
    var readOnly: js.UndefOr[Boolean | js.Array[js.Any]] = js.undefined
  }
  object ReactWidgetsCommonProps {
    
    inline def apply(): ReactWidgetsCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactWidgetsCommonProps]
    }
    
    extension [Self <: ReactWidgetsCommonProps](x: Self) {
      
      inline def setDisabled(value: Boolean | js.Array[js.Any]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisabledVarargs(value: js.Any*): Self = StObject.set(x, "disabled", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
      
      inline def setIsRtlUndefined: Self = StObject.set(x, "isRtl", js.undefined)
      
      inline def setReadOnly(value: Boolean | js.Array[js.Any]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setReadOnlyVarargs(value: js.Any*): Self = StObject.set(x, "readOnly", js.Array(value :_*))
    }
  }
}
