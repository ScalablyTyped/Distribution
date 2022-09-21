package typings.proxyLists

import typings.proxyLists.mod.AnonymityLevel
import typings.proxyLists.mod.IPType
import typings.proxyLists.mod.Protocol
import typings.proxyLists.proxyListsStrings.loose
import typings.proxyLists.proxyListsStrings.strict
import typings.request.mod.CoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<proxy-lists.proxy-lists.Options> */
  trait PartialOptions extends StObject {
    
    var anonymityLevels: js.UndefOr[js.Array[AnonymityLevel]] = js.undefined
    
    var countries: js.UndefOr[js.Array[String]] = js.undefined
    
    var countriesBlackList: js.UndefOr[js.Array[String]] = js.undefined
    
    var defaultRequestOptions: js.UndefOr[CoreOptions] = js.undefined
    
    var filterMode: js.UndefOr[strict | loose] = js.undefined
    
    var ipTypes: js.UndefOr[js.Array[IPType]] = js.undefined
    
    var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
    
    var series: js.UndefOr[Boolean] = js.undefined
    
    var sourcesBlackList: js.UndefOr[js.Array[String]] = js.undefined
    
    var sourcesWhiteList: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setAnonymityLevels(value: js.Array[AnonymityLevel]): Self = StObject.set(x, "anonymityLevels", value.asInstanceOf[js.Any])
      
      inline def setAnonymityLevelsUndefined: Self = StObject.set(x, "anonymityLevels", js.undefined)
      
      inline def setAnonymityLevelsVarargs(value: AnonymityLevel*): Self = StObject.set(x, "anonymityLevels", js.Array(value*))
      
      inline def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesBlackList(value: js.Array[String]): Self = StObject.set(x, "countriesBlackList", value.asInstanceOf[js.Any])
      
      inline def setCountriesBlackListUndefined: Self = StObject.set(x, "countriesBlackList", js.undefined)
      
      inline def setCountriesBlackListVarargs(value: String*): Self = StObject.set(x, "countriesBlackList", js.Array(value*))
      
      inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      inline def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value*))
      
      inline def setDefaultRequestOptions(value: CoreOptions): Self = StObject.set(x, "defaultRequestOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultRequestOptionsUndefined: Self = StObject.set(x, "defaultRequestOptions", js.undefined)
      
      inline def setFilterMode(value: strict | loose): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
      inline def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
      
      inline def setIpTypes(value: js.Array[IPType]): Self = StObject.set(x, "ipTypes", value.asInstanceOf[js.Any])
      
      inline def setIpTypesUndefined: Self = StObject.set(x, "ipTypes", js.undefined)
      
      inline def setIpTypesVarargs(value: IPType*): Self = StObject.set(x, "ipTypes", js.Array(value*))
      
      inline def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setSeries(value: Boolean): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setSourcesBlackList(value: js.Array[String]): Self = StObject.set(x, "sourcesBlackList", value.asInstanceOf[js.Any])
      
      inline def setSourcesBlackListUndefined: Self = StObject.set(x, "sourcesBlackList", js.undefined)
      
      inline def setSourcesBlackListVarargs(value: String*): Self = StObject.set(x, "sourcesBlackList", js.Array(value*))
      
      inline def setSourcesWhiteList(value: js.Array[String]): Self = StObject.set(x, "sourcesWhiteList", value.asInstanceOf[js.Any])
      
      inline def setSourcesWhiteListUndefined: Self = StObject.set(x, "sourcesWhiteList", js.undefined)
      
      inline def setSourcesWhiteListVarargs(value: String*): Self = StObject.set(x, "sourcesWhiteList", js.Array(value*))
    }
  }
}
