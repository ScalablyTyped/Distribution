package typings.rcTreeSelect

import typings.rcSelect.generatorMod.FilterFunc
import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.LegacyDataNode
import typings.rcTreeSelect.interfaceMod.SimpleModeConfig
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FilterOption extends StObject {
    
    var filterOption: Boolean | FilterFunc[LegacyDataNode]
    
    var optionFilterProp: String
  }
  object FilterOption {
    
    @scala.inline
    def apply(filterOption: Boolean | FilterFunc[LegacyDataNode], optionFilterProp: String): FilterOption = {
      val __obj = js.Dynamic.literal(filterOption = filterOption.asInstanceOf[js.Any], optionFilterProp = optionFilterProp.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterOption]
    }
    
    @scala.inline
    implicit class FilterOptionMutableBuilder[Self <: FilterOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterOption(value: Boolean | FilterFunc[LegacyDataNode]): Self = StObject.set(x, "filterOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterOptionFunction2(value: (/* inputValue */ String, /* option */ js.UndefOr[LegacyDataNode]) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptionFilterProp(value: String): Self = StObject.set(x, "optionFilterProp", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetLabelProp extends StObject {
    
    def getLabelProp(node: DataNode): ReactNode
    
    var simpleMode: Boolean | SimpleModeConfig
  }
  object GetLabelProp {
    
    @scala.inline
    def apply(getLabelProp: DataNode => ReactNode, simpleMode: Boolean | SimpleModeConfig): GetLabelProp = {
      val __obj = js.Dynamic.literal(getLabelProp = js.Any.fromFunction1(getLabelProp), simpleMode = simpleMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLabelProp]
    }
    
    @scala.inline
    implicit class GetLabelPropMutableBuilder[Self <: GetLabelProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLabelProp(value: DataNode => ReactNode): Self = StObject.set(x, "getLabelProp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSimpleMode(value: Boolean | SimpleModeConfig): Self = StObject.set(x, "simpleMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Selected extends StObject {
    
    var selected: Boolean
  }
  object Selected {
    
    @scala.inline
    def apply(selected: Boolean): Selected = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selected]
    }
    
    @scala.inline
    implicit class SelectedMutableBuilder[Self <: Selected] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
