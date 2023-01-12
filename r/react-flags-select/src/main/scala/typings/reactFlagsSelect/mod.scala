package typings.reactFlagsSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-flags-select", JSImport.Default)
  @js.native
  open class default () extends ReactFlagsSelect
  
  trait Props extends StObject {
    
    var alignOptions: js.UndefOr[String] = js.undefined
    
    var blackList: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var countries: js.UndefOr[js.Array[String]] = js.undefined
    
    var customLabels: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var defaultCountry: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* countryCode */ String, Unit]] = js.undefined
    
    var optionsSize: js.UndefOr[Double] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var searchable: js.UndefOr[Boolean] = js.undefined
    
    var selectedSize: js.UndefOr[Double] = js.undefined
    
    var showOptionLabel: js.UndefOr[Boolean] = js.undefined
    
    var showSelectedLabel: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAlignOptions(value: String): Self = StObject.set(x, "alignOptions", value.asInstanceOf[js.Any])
      
      inline def setAlignOptionsUndefined: Self = StObject.set(x, "alignOptions", js.undefined)
      
      inline def setBlackList(value: Boolean): Self = StObject.set(x, "blackList", value.asInstanceOf[js.Any])
      
      inline def setBlackListUndefined: Self = StObject.set(x, "blackList", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      inline def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value*))
      
      inline def setCustomLabels(value: StringDictionary[String]): Self = StObject.set(x, "customLabels", value.asInstanceOf[js.Any])
      
      inline def setCustomLabelsUndefined: Self = StObject.set(x, "customLabels", js.undefined)
      
      inline def setDefaultCountry(value: String): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      inline def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnSelect(value: /* countryCode */ String => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptionsSize(value: Double): Self = StObject.set(x, "optionsSize", value.asInstanceOf[js.Any])
      
      inline def setOptionsSizeUndefined: Self = StObject.set(x, "optionsSize", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
      
      inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
      
      inline def setSelectedSize(value: Double): Self = StObject.set(x, "selectedSize", value.asInstanceOf[js.Any])
      
      inline def setSelectedSizeUndefined: Self = StObject.set(x, "selectedSize", js.undefined)
      
      inline def setShowOptionLabel(value: Boolean): Self = StObject.set(x, "showOptionLabel", value.asInstanceOf[js.Any])
      
      inline def setShowOptionLabelUndefined: Self = StObject.set(x, "showOptionLabel", js.undefined)
      
      inline def setShowSelectedLabel(value: Boolean): Self = StObject.set(x, "showSelectedLabel", value.asInstanceOf[js.Any])
      
      inline def setShowSelectedLabelUndefined: Self = StObject.set(x, "showSelectedLabel", js.undefined)
    }
  }
  
  @js.native
  trait ReactFlagsSelect
    extends Component[Props, js.Object, Any] {
    
    def updateSelected(countryCode: String): Unit = js.native
  }
}
