package typings.primereact

import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitButtonMod {
  
  @JSImport("primereact/components/splitbutton/SplitButton", "SplitButton")
  @js.native
  class SplitButton protected ()
    extends Component[SplitButtonProps, js.Any, js.Any] {
    def this(props: SplitButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SplitButtonProps, context: js.Any) = this()
  }
  
  @js.native
  trait SplitButtonProps extends StObject {
    
    var appendTo: js.UndefOr[HTMLElement] = js.native
    
    var buttonTemplate: js.UndefOr[js.Any] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var menuClassName: js.UndefOr[String] = js.native
    
    var menuStyle: js.UndefOr[js.Object] = js.native
    
    var model: js.UndefOr[js.Array[_]] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var tabIndex: js.UndefOr[String] = js.native
    
    var tooltip: js.UndefOr[js.Any] = js.native
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
  }
  object SplitButtonProps {
    
    @scala.inline
    def apply(): SplitButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitButtonProps]
    }
    
    @scala.inline
    implicit class SplitButtonPropsMutableBuilder[Self <: SplitButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(value: HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setButtonTemplate(value: js.Any): Self = StObject.set(x, "buttonTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTemplateUndefined: Self = StObject.set(x, "buttonTemplate", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMenuClassName(value: String): Self = StObject.set(x, "menuClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuClassNameUndefined: Self = StObject.set(x, "menuClassName", js.undefined)
      
      @scala.inline
      def setMenuStyle(value: js.Object): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
      
      @scala.inline
      def setModel(value: js.Array[_]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setModelVarargs(value: js.Any*): Self = StObject.set(x, "model", js.Array(value :_*))
      
      @scala.inline
      def setOnClick(value: /* event */ Event => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
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
