package typings.primereact

import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait SplitButtonProps extends StObject {
    
    var appendTo: js.UndefOr[HTMLElement] = js.undefined
    
    var buttonTemplate: js.UndefOr[js.Any] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var menuClassName: js.UndefOr[String] = js.undefined
    
    var menuStyle: js.UndefOr[js.Object] = js.undefined
    
    var model: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tabIndex: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[js.Any] = js.undefined
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  }
  object SplitButtonProps {
    
    inline def apply(): SplitButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitButtonProps]
    }
    
    extension [Self <: SplitButtonProps](x: Self) {
      
      inline def setAppendTo(value: HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setButtonTemplate(value: js.Any): Self = StObject.set(x, "buttonTemplate", value.asInstanceOf[js.Any])
      
      inline def setButtonTemplateUndefined: Self = StObject.set(x, "buttonTemplate", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMenuClassName(value: String): Self = StObject.set(x, "menuClassName", value.asInstanceOf[js.Any])
      
      inline def setMenuClassNameUndefined: Self = StObject.set(x, "menuClassName", js.undefined)
      
      inline def setMenuStyle(value: js.Object): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
      
      inline def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
      
      inline def setModel(value: js.Array[js.Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setModelVarargs(value: js.Any*): Self = StObject.set(x, "model", js.Array(value :_*))
      
      inline def setOnClick(value: /* event */ Event => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
