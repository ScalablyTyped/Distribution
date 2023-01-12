package typings.reactSelectCountryList

import org.scalablytyped.runtime.StringDictionary
import typings.reactSelectCountryList.mod.ReactSelectCountries.Countries
import typings.reactSelectCountryList.mod.ReactSelectCountries.CountryData
import typings.reactSelectCountryList.mod.ReactSelectCountries.LabelValueMap
import typings.reactSelectCountryList.mod.ReactSelectCountries.NativeCountries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): CountryList = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[CountryList]
  
  @JSImport("react-select-country-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CountryList extends StObject {
    
    var data: js.Array[CountryData]
    
    def getData(): js.Array[CountryData]
    
    def getLabel(value: String): String
    
    def getLabelList(): LabelValueMap
    
    def getLabels(): js.Array[String]
    
    def getValue(label: String): String
    
    def getValueList(): LabelValueMap
    
    def getValues(): js.Array[String]
    
    var labelMap: LabelValueMap
    
    def native(): NativeCountries
    
    def setEmpty(label: String): Countries
    
    def setLabel(value: String, label: String): Countries
    
    var valueMap: LabelValueMap
  }
  object CountryList {
    
    inline def apply(
      data: js.Array[CountryData],
      getData: () => js.Array[CountryData],
      getLabel: String => String,
      getLabelList: () => LabelValueMap,
      getLabels: () => js.Array[String],
      getValue: String => String,
      getValueList: () => LabelValueMap,
      getValues: () => js.Array[String],
      labelMap: LabelValueMap,
      native: () => NativeCountries,
      setEmpty: String => Countries,
      setLabel: (String, String) => Countries,
      valueMap: LabelValueMap
    ): CountryList = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getData = js.Any.fromFunction0(getData), getLabel = js.Any.fromFunction1(getLabel), getLabelList = js.Any.fromFunction0(getLabelList), getLabels = js.Any.fromFunction0(getLabels), getValue = js.Any.fromFunction1(getValue), getValueList = js.Any.fromFunction0(getValueList), getValues = js.Any.fromFunction0(getValues), labelMap = labelMap.asInstanceOf[js.Any], native = js.Any.fromFunction0(native), setEmpty = js.Any.fromFunction1(setEmpty), setLabel = js.Any.fromFunction2(setLabel), valueMap = valueMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CountryList] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[CountryData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: CountryData*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setGetData(value: () => js.Array[CountryData]): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      inline def setGetLabel(value: String => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
      
      inline def setGetLabelList(value: () => LabelValueMap): Self = StObject.set(x, "getLabelList", js.Any.fromFunction0(value))
      
      inline def setGetLabels(value: () => js.Array[String]): Self = StObject.set(x, "getLabels", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: String => String): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setGetValueList(value: () => LabelValueMap): Self = StObject.set(x, "getValueList", js.Any.fromFunction0(value))
      
      inline def setGetValues(value: () => js.Array[String]): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
      
      inline def setLabelMap(value: LabelValueMap): Self = StObject.set(x, "labelMap", value.asInstanceOf[js.Any])
      
      inline def setNative(value: () => NativeCountries): Self = StObject.set(x, "native", js.Any.fromFunction0(value))
      
      inline def setSetEmpty(value: String => Countries): Self = StObject.set(x, "setEmpty", js.Any.fromFunction1(value))
      
      inline def setSetLabel(value: (String, String) => Countries): Self = StObject.set(x, "setLabel", js.Any.fromFunction2(value))
      
      inline def setValueMap(value: LabelValueMap): Self = StObject.set(x, "valueMap", value.asInstanceOf[js.Any])
    }
  }
  
  object ReactSelectCountries {
    
    trait Countries extends StObject {
      
      var data: js.Array[CountryData]
      
      var labelMap: LabelValueMap
      
      var valueMap: LabelValueMap
    }
    object Countries {
      
      inline def apply(data: js.Array[CountryData], labelMap: LabelValueMap, valueMap: LabelValueMap): Countries = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], labelMap = labelMap.asInstanceOf[js.Any], valueMap = valueMap.asInstanceOf[js.Any])
        __obj.asInstanceOf[Countries]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Countries] (val x: Self) extends AnyVal {
        
        inline def setData(value: js.Array[CountryData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataVarargs(value: CountryData*): Self = StObject.set(x, "data", js.Array(value*))
        
        inline def setLabelMap(value: LabelValueMap): Self = StObject.set(x, "labelMap", value.asInstanceOf[js.Any])
        
        inline def setValueMap(value: LabelValueMap): Self = StObject.set(x, "valueMap", value.asInstanceOf[js.Any])
      }
    }
    
    trait CountryData extends StObject {
      
      var label: String
      
      var value: String
    }
    object CountryData {
      
      inline def apply(label: String, value: String): CountryData = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[CountryData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CountryData] (val x: Self) extends AnyVal {
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    type LabelValueMap = StringDictionary[String]
    
    trait NativeCountries
      extends StObject
         with Countries {
      
      var nativeData: js.Array[CountryData]
    }
    object NativeCountries {
      
      inline def apply(
        data: js.Array[CountryData],
        labelMap: LabelValueMap,
        nativeData: js.Array[CountryData],
        valueMap: LabelValueMap
      ): NativeCountries = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], labelMap = labelMap.asInstanceOf[js.Any], nativeData = nativeData.asInstanceOf[js.Any], valueMap = valueMap.asInstanceOf[js.Any])
        __obj.asInstanceOf[NativeCountries]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NativeCountries] (val x: Self) extends AnyVal {
        
        inline def setNativeData(value: js.Array[CountryData]): Self = StObject.set(x, "nativeData", value.asInstanceOf[js.Any])
        
        inline def setNativeDataVarargs(value: CountryData*): Self = StObject.set(x, "nativeData", js.Array(value*))
      }
    }
  }
}
