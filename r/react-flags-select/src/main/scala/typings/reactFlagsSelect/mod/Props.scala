package typings.reactFlagsSelect.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var alignOptions: js.UndefOr[String] = js.native
  
  var blackList: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var countries: js.UndefOr[js.Array[String]] = js.native
  
  var customLabels: js.UndefOr[StringDictionary[String]] = js.native
  
  var defaultCountry: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var onSelect: js.UndefOr[js.Function1[/* countryCode */ String, Unit]] = js.native
  
  var optionsSize: js.UndefOr[Double] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var searchable: js.UndefOr[Boolean] = js.native
  
  var selectedSize: js.UndefOr[Double] = js.native
  
  var showOptionLabel: js.UndefOr[Boolean] = js.native
  
  var showSelectedLabel: js.UndefOr[Boolean] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignOptions(value: String): Self = this.set("alignOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignOptions: Self = this.set("alignOptions", js.undefined)
    
    @scala.inline
    def setBlackList(value: Boolean): Self = this.set("blackList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlackList: Self = this.set("blackList", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCountriesVarargs(value: String*): Self = this.set("countries", js.Array(value :_*))
    
    @scala.inline
    def setCountries(value: js.Array[String]): Self = this.set("countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountries: Self = this.set("countries", js.undefined)
    
    @scala.inline
    def setCustomLabels(value: StringDictionary[String]): Self = this.set("customLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLabels: Self = this.set("customLabels", js.undefined)
    
    @scala.inline
    def setDefaultCountry(value: String): Self = this.set("defaultCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCountry: Self = this.set("defaultCountry", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* countryCode */ String => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOptionsSize(value: Double): Self = this.set("optionsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionsSize: Self = this.set("optionsSize", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchable: Self = this.set("searchable", js.undefined)
    
    @scala.inline
    def setSelectedSize(value: Double): Self = this.set("selectedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedSize: Self = this.set("selectedSize", js.undefined)
    
    @scala.inline
    def setShowOptionLabel(value: Boolean): Self = this.set("showOptionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOptionLabel: Self = this.set("showOptionLabel", js.undefined)
    
    @scala.inline
    def setShowSelectedLabel(value: Boolean): Self = this.set("showSelectedLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSelectedLabel: Self = this.set("showSelectedLabel", js.undefined)
  }
}
