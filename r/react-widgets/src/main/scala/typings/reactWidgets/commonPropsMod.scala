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
    
    @scala.inline
    def apply(): AutoFocus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFocus]
    }
    
    @scala.inline
    implicit class AutoFocusMutableBuilder[Self <: AutoFocus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
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
    
    @scala.inline
    def apply(): ReactWidgetsCommonDropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactWidgetsCommonDropdownProps]
    }
    
    @scala.inline
    implicit class ReactWidgetsCommonDropdownPropsMutableBuilder[Self <: ReactWidgetsCommonDropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropUp(value: Boolean): Self = StObject.set(x, "dropUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropUpUndefined: Self = StObject.set(x, "dropUp", js.undefined)
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
    
    @scala.inline
    def apply(): ReactWidgetsCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactWidgetsCommonProps]
    }
    
    @scala.inline
    implicit class ReactWidgetsCommonPropsMutableBuilder[Self <: ReactWidgetsCommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean | js.Array[js.Any]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDisabledVarargs(value: js.Any*): Self = StObject.set(x, "disabled", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRtlUndefined: Self = StObject.set(x, "isRtl", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean | js.Array[js.Any]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setReadOnlyVarargs(value: js.Any*): Self = StObject.set(x, "readOnly", js.Array(value :_*))
    }
  }
}
