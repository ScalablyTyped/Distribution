package typings.proxyLists.mod

import typings.proxyLists.proxyListsStrings.loose
import typings.proxyLists.proxyListsStrings.strict
import typings.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var anonymityLevels: js.UndefOr[js.Array[AnonymityLevel]] = js.native
  
  var countries: js.UndefOr[js.Array[String]] = js.native
  
  var countriesBlackList: js.UndefOr[js.Array[String]] = js.native
  
  var defaultRequestOptions: js.UndefOr[CoreOptions] = js.native
  
  var filterMode: js.UndefOr[strict | loose] = js.native
  
  var ipTypes: js.UndefOr[js.Array[IPType]] = js.native
  
  var protocols: js.UndefOr[js.Array[Protocol]] = js.native
  
  var series: js.UndefOr[Boolean] = js.native
  
  var sourcesBlackList: js.UndefOr[js.Array[String]] = js.native
  
  var sourcesWhiteList: js.UndefOr[js.Array[String]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAnonymityLevelsVarargs(value: AnonymityLevel*): Self = this.set("anonymityLevels", js.Array(value :_*))
    
    @scala.inline
    def setAnonymityLevels(value: js.Array[AnonymityLevel]): Self = this.set("anonymityLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnonymityLevels: Self = this.set("anonymityLevels", js.undefined)
    
    @scala.inline
    def setCountriesVarargs(value: String*): Self = this.set("countries", js.Array(value :_*))
    
    @scala.inline
    def setCountries(value: js.Array[String]): Self = this.set("countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountries: Self = this.set("countries", js.undefined)
    
    @scala.inline
    def setCountriesBlackListVarargs(value: String*): Self = this.set("countriesBlackList", js.Array(value :_*))
    
    @scala.inline
    def setCountriesBlackList(value: js.Array[String]): Self = this.set("countriesBlackList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountriesBlackList: Self = this.set("countriesBlackList", js.undefined)
    
    @scala.inline
    def setDefaultRequestOptions(value: CoreOptions): Self = this.set("defaultRequestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRequestOptions: Self = this.set("defaultRequestOptions", js.undefined)
    
    @scala.inline
    def setFilterMode(value: strict | loose): Self = this.set("filterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterMode: Self = this.set("filterMode", js.undefined)
    
    @scala.inline
    def setIpTypesVarargs(value: IPType*): Self = this.set("ipTypes", js.Array(value :_*))
    
    @scala.inline
    def setIpTypes(value: js.Array[IPType]): Self = this.set("ipTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpTypes: Self = this.set("ipTypes", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = this.set("protocols", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: js.Array[Protocol]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    
    @scala.inline
    def setSeries(value: Boolean): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setSourcesBlackListVarargs(value: String*): Self = this.set("sourcesBlackList", js.Array(value :_*))
    
    @scala.inline
    def setSourcesBlackList(value: js.Array[String]): Self = this.set("sourcesBlackList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcesBlackList: Self = this.set("sourcesBlackList", js.undefined)
    
    @scala.inline
    def setSourcesWhiteListVarargs(value: String*): Self = this.set("sourcesWhiteList", js.Array(value :_*))
    
    @scala.inline
    def setSourcesWhiteList(value: js.Array[String]): Self = this.set("sourcesWhiteList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcesWhiteList: Self = this.set("sourcesWhiteList", js.undefined)
  }
}
