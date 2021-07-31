package typings.primereact

import typings.primereact.anon.Target
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triStateCheckboxMod {
  
  @JSImport("primereact/components/tristatecheckbox/TriStateCheckbox", "TriStateCheckbox")
  @js.native
  class TriStateCheckbox protected ()
    extends Component[TriStateCheckboxProps, js.Any, js.Any] {
    def this(props: TriStateCheckboxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TriStateCheckboxProps, context: js.Any) = this()
  }
  
  trait TriStateCheckboxProps extends StObject {
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputId: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tooltip: js.UndefOr[js.Any] = js.undefined
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
    
    var value: js.UndefOr[Boolean | Null] = js.undefined
  }
  object TriStateCheckboxProps {
    
    @scala.inline
    def apply(): TriStateCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriStateCheckboxProps]
    }
    
    @scala.inline
    implicit class TriStateCheckboxPropsMutableBuilder[Self <: TriStateCheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ Target => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
