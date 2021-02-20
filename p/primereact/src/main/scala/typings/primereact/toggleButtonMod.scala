package typings.primereact

import typings.primereact.anon.TargetNameType
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonMod {
  
  @JSImport("primereact/components/togglebutton/ToggleButton", "ToggleButton")
  @js.native
  class ToggleButton protected ()
    extends Component[ToggleButtonProps, js.Any, js.Any] {
    def this(props: ToggleButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ToggleButtonProps, context: js.Any) = this()
  }
  
  @js.native
  trait ToggleButtonProps extends StObject {
    
    var ariaLabelledBy: js.UndefOr[String] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var iconPos: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var offIcon: js.UndefOr[String] = js.native
    
    var offLabel: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ TargetNameType, Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var onIcon: js.UndefOr[String] = js.native
    
    var onLabel: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var tooltip: js.UndefOr[js.Any] = js.native
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
  }
  object ToggleButtonProps {
    
    @scala.inline
    def apply(): ToggleButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleButtonProps]
    }
    
    @scala.inline
    implicit class ToggleButtonPropsMutableBuilder[Self <: ToggleButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIconPos(value: String): Self = StObject.set(x, "iconPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPosUndefined: Self = StObject.set(x, "iconPos", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOffIcon(value: String): Self = StObject.set(x, "offIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffIconUndefined: Self = StObject.set(x, "offIcon", js.undefined)
      
      @scala.inline
      def setOffLabel(value: String): Self = StObject.set(x, "offLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffLabelUndefined: Self = StObject.set(x, "offLabel", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* event */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ TargetNameType => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* event */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnIcon(value: String): Self = StObject.set(x, "onIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnIconUndefined: Self = StObject.set(x, "onIcon", js.undefined)
      
      @scala.inline
      def setOnLabel(value: String): Self = StObject.set(x, "onLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLabelUndefined: Self = StObject.set(x, "onLabel", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
