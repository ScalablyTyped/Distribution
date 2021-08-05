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
    
    inline def apply(filterOption: Boolean | FilterFunc[LegacyDataNode], optionFilterProp: String): FilterOption = {
      val __obj = js.Dynamic.literal(filterOption = filterOption.asInstanceOf[js.Any], optionFilterProp = optionFilterProp.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterOption]
    }
    
    extension [Self <: FilterOption](x: Self) {
      
      inline def setFilterOption(value: Boolean | FilterFunc[LegacyDataNode]): Self = StObject.set(x, "filterOption", value.asInstanceOf[js.Any])
      
      inline def setFilterOptionFunction2(value: (/* inputValue */ String, /* option */ js.UndefOr[LegacyDataNode]) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      inline def setOptionFilterProp(value: String): Self = StObject.set(x, "optionFilterProp", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetLabelProp extends StObject {
    
    def getLabelProp(node: DataNode): ReactNode
    
    var simpleMode: Boolean | SimpleModeConfig
  }
  object GetLabelProp {
    
    inline def apply(getLabelProp: DataNode => ReactNode, simpleMode: Boolean | SimpleModeConfig): GetLabelProp = {
      val __obj = js.Dynamic.literal(getLabelProp = js.Any.fromFunction1(getLabelProp), simpleMode = simpleMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLabelProp]
    }
    
    extension [Self <: GetLabelProp](x: Self) {
      
      inline def setGetLabelProp(value: DataNode => ReactNode): Self = StObject.set(x, "getLabelProp", js.Any.fromFunction1(value))
      
      inline def setSimpleMode(value: Boolean | SimpleModeConfig): Self = StObject.set(x, "simpleMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Selected extends StObject {
    
    var selected: Boolean
  }
  object Selected {
    
    inline def apply(selected: Boolean): Selected = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selected]
    }
    
    extension [Self <: Selected](x: Self) {
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
