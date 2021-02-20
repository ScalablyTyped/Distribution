package typings.rcEasyui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Align extends StObject {
    
    var align: String = js.native
    
    var frozen: Boolean = js.native
  }
  object Align {
    
    @scala.inline
    def apply(align: String, frozen: Boolean): Align = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], frozen = frozen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align]
    }
    
    @scala.inline
    implicit class AlignMutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AlignString extends StObject {
    
    var align: String = js.native
  }
  object AlignString {
    
    @scala.inline
    def apply(align: String): AlignString = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlignString]
    }
    
    @scala.inline
    implicit class AlignStringMutableBuilder[Self <: AlignString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Buttons extends StObject {
    
    var buttons: js.Array[_] = js.native
    
    var defaultCancel: String = js.native
    
    var defaultOk: String = js.native
  }
  object Buttons {
    
    @scala.inline
    def apply(buttons: js.Array[_], defaultCancel: String, defaultOk: String): Buttons = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], defaultCancel = defaultCancel.asInstanceOf[js.Any], defaultOk = defaultOk.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buttons]
    }
    
    @scala.inline
    implicit class ButtonsMutableBuilder[Self <: Buttons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: js.Array[_]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsVarargs(value: js.Any*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setDefaultCancel(value: String): Self = StObject.set(x, "defaultCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOk(value: String): Self = StObject.set(x, "defaultOk", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Colspan extends StObject {
    
    var colspan: Double = js.native
    
    var defaultFilterOperator: String = js.native
    
    var editable: Boolean = js.native
    
    var expander: Boolean = js.native
    
    var filterOperators: js.Array[_] = js.native
    
    var filterable: Boolean = js.native
    
    var frozen: Boolean = js.native
    
    var order: String = js.native
    
    var rowspan: Double = js.native
    
    var sortable: Boolean = js.native
  }
  object Colspan {
    
    @scala.inline
    def apply(
      colspan: Double,
      defaultFilterOperator: String,
      editable: Boolean,
      expander: Boolean,
      filterOperators: js.Array[_],
      filterable: Boolean,
      frozen: Boolean,
      order: String,
      rowspan: Double,
      sortable: Boolean
    ): Colspan = {
      val __obj = js.Dynamic.literal(colspan = colspan.asInstanceOf[js.Any], defaultFilterOperator = defaultFilterOperator.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], expander = expander.asInstanceOf[js.Any], filterOperators = filterOperators.asInstanceOf[js.Any], filterable = filterable.asInstanceOf[js.Any], frozen = frozen.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], rowspan = rowspan.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colspan]
    }
    
    @scala.inline
    implicit class ColspanMutableBuilder[Self <: Colspan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFilterOperator(value: String): Self = StObject.set(x, "defaultFilterOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpander(value: Boolean): Self = StObject.set(x, "expander", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterOperators(value: js.Array[_]): Self = StObject.set(x, "filterOperators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterOperatorsVarargs(value: js.Any*): Self = StObject.set(x, "filterOperators", js.Array(value :_*))
      
      @scala.inline
      def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowspan(value: Double): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Disabled extends StObject {
    
    var disabled: Boolean = js.native
  }
  object Disabled {
    
    @scala.inline
    def apply(disabled: Boolean): Disabled = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disabled]
    }
    
    @scala.inline
    implicit class DisabledMutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Invalid extends StObject {
    
    var invalid: Boolean = js.native
    
    var validateOnBlur: Boolean = js.native
    
    var validateOnChange: Boolean = js.native
    
    var validateOnCreate: Boolean = js.native
  }
  object Invalid {
    
    @scala.inline
    def apply(invalid: Boolean, validateOnBlur: Boolean, validateOnChange: Boolean, validateOnCreate: Boolean): Invalid = {
      val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validateOnChange = validateOnChange.asInstanceOf[js.Any], validateOnCreate = validateOnCreate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Invalid]
    }
    
    @scala.inline
    implicit class InvalidMutableBuilder[Self <: Invalid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateOnBlur(value: Boolean): Self = StObject.set(x, "validateOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateOnChange(value: Boolean): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateOnCreate(value: Boolean): Self = StObject.set(x, "validateOnCreate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IsMatch extends StObject {
    
    var isMatch: js.Any = js.native
    
    var text: String = js.native
  }
  object IsMatch {
    
    @scala.inline
    def apply(isMatch: js.Any, text: String): IsMatch = {
      val __obj = js.Dynamic.literal(isMatch = isMatch.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsMatch]
    }
    
    @scala.inline
    implicit class IsMatchMutableBuilder[Self <: IsMatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMatch(value: js.Any): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelectionMode extends StObject {
    
    var selectionMode: String = js.native
  }
  object SelectionMode {
    
    @scala.inline
    def apply(selectionMode: String): SelectionMode = {
      val __obj = js.Dynamic.literal(selectionMode = selectionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionMode]
    }
    
    @scala.inline
    implicit class SelectionModeMutableBuilder[Self <: SelectionMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShowValue extends StObject {
    
    var showValue: Boolean = js.native
    
    var value: Double = js.native
  }
  object ShowValue {
    
    @scala.inline
    def apply(showValue: Boolean, value: Double): ShowValue = {
      val __obj = js.Dynamic.literal(showValue = showValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowValue]
    }
    
    @scala.inline
    implicit class ShowValueMutableBuilder[Self <: ShowValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowValue(value: Boolean): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
