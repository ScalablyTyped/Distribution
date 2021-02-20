package typings.proxyLists

import typings.proxyLists.mod.AnonymityLevel
import typings.proxyLists.mod.IPType
import typings.proxyLists.mod.Protocol
import typings.proxyLists.proxyListsStrings.loose
import typings.proxyLists.proxyListsStrings.strict
import typings.request.mod.CoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<proxy-lists.proxy-lists.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
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
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymityLevels(value: js.Array[AnonymityLevel]): Self = StObject.set(x, "anonymityLevels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnonymityLevelsUndefined: Self = StObject.set(x, "anonymityLevels", js.undefined)
      
      @scala.inline
      def setAnonymityLevelsVarargs(value: AnonymityLevel*): Self = StObject.set(x, "anonymityLevels", js.Array(value :_*))
      
      @scala.inline
      def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountriesBlackList(value: js.Array[String]): Self = StObject.set(x, "countriesBlackList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountriesBlackListUndefined: Self = StObject.set(x, "countriesBlackList", js.undefined)
      
      @scala.inline
      def setCountriesBlackListVarargs(value: String*): Self = StObject.set(x, "countriesBlackList", js.Array(value :_*))
      
      @scala.inline
      def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      @scala.inline
      def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value :_*))
      
      @scala.inline
      def setDefaultRequestOptions(value: CoreOptions): Self = StObject.set(x, "defaultRequestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRequestOptionsUndefined: Self = StObject.set(x, "defaultRequestOptions", js.undefined)
      
      @scala.inline
      def setFilterMode(value: strict | loose): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
      
      @scala.inline
      def setIpTypes(value: js.Array[IPType]): Self = StObject.set(x, "ipTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpTypesUndefined: Self = StObject.set(x, "ipTypes", js.undefined)
      
      @scala.inline
      def setIpTypesVarargs(value: IPType*): Self = StObject.set(x, "ipTypes", js.Array(value :_*))
      
      @scala.inline
      def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      @scala.inline
      def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
      
      @scala.inline
      def setSeries(value: Boolean): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      @scala.inline
      def setSourcesBlackList(value: js.Array[String]): Self = StObject.set(x, "sourcesBlackList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesBlackListUndefined: Self = StObject.set(x, "sourcesBlackList", js.undefined)
      
      @scala.inline
      def setSourcesBlackListVarargs(value: String*): Self = StObject.set(x, "sourcesBlackList", js.Array(value :_*))
      
      @scala.inline
      def setSourcesWhiteList(value: js.Array[String]): Self = StObject.set(x, "sourcesWhiteList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesWhiteListUndefined: Self = StObject.set(x, "sourcesWhiteList", js.undefined)
      
      @scala.inline
      def setSourcesWhiteListVarargs(value: String*): Self = StObject.set(x, "sourcesWhiteList", js.Array(value :_*))
    }
  }
}
