package typings.proxyLists

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.proxyLists.anon.PartialOptions
import typings.proxyLists.proxyListsStrings.data
import typings.proxyLists.proxyListsStrings.end
import typings.proxyLists.proxyListsStrings.error
import typings.proxyLists.proxyListsStrings.loose
import typings.proxyLists.proxyListsStrings.strict
import typings.request.mod.CoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("proxy-lists", "GetProxiesEventEmitter")
  @js.native
  class GetProxiesEventEmitter () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* proxies */ js.Array[Proxy], Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
  }
  
  @JSImport("proxy-lists", "addSource")
  @js.native
  def addSource(name: String, source: AddSource_): Unit = js.native
  
  @JSImport("proxy-lists", "getProxies")
  @js.native
  def getProxies(): GetProxiesEventEmitter = js.native
  @JSImport("proxy-lists", "getProxies")
  @js.native
  def getProxies(options: PartialOptions): GetProxiesEventEmitter = js.native
  
  @JSImport("proxy-lists", "getProxiesFromSource")
  @js.native
  def getProxiesFromSource(name: String): GetProxiesEventEmitter = js.native
  @JSImport("proxy-lists", "getProxiesFromSource")
  @js.native
  def getProxiesFromSource(name: String, options: Options): GetProxiesEventEmitter = js.native
  
  @JSImport("proxy-lists", "listSources")
  @js.native
  def listSources(): js.Array[Source] = js.native
  @JSImport("proxy-lists", "listSources")
  @js.native
  def listSources(options: ListSourcesOptions): js.Array[Source] = js.native
  
  @js.native
  trait AddSource_ extends StObject {
    
    def getProxies(options: InternalOptions): GetProxiesEventEmitter = js.native
    
    var homeUrl: String = js.native
  }
  object AddSource_ {
    
    @scala.inline
    def apply(getProxies: InternalOptions => GetProxiesEventEmitter, homeUrl: String): AddSource_ = {
      val __obj = js.Dynamic.literal(getProxies = js.Any.fromFunction1(getProxies), homeUrl = homeUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddSource_]
    }
    
    @scala.inline
    implicit class AddSource_MutableBuilder[Self <: AddSource_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetProxies(value: InternalOptions => GetProxiesEventEmitter): Self = StObject.set(x, "getProxies", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHomeUrl(value: String): Self = StObject.set(x, "homeUrl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.proxyLists.proxyListsStrings.transparent
    - typings.proxyLists.proxyListsStrings.anonymous
    - typings.proxyLists.proxyListsStrings.elite
  */
  trait AnonymityLevel extends StObject
  object AnonymityLevel {
    
    @scala.inline
    def anonymous: typings.proxyLists.proxyListsStrings.anonymous = "anonymous".asInstanceOf[typings.proxyLists.proxyListsStrings.anonymous]
    
    @scala.inline
    def elite: typings.proxyLists.proxyListsStrings.elite = "elite".asInstanceOf[typings.proxyLists.proxyListsStrings.elite]
    
    @scala.inline
    def transparent: typings.proxyLists.proxyListsStrings.transparent = "transparent".asInstanceOf[typings.proxyLists.proxyListsStrings.transparent]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.proxyLists.proxyListsStrings.ipv4
    - typings.proxyLists.proxyListsStrings.ipv6
  */
  trait IPType extends StObject
  object IPType {
    
    @scala.inline
    def ipv4: typings.proxyLists.proxyListsStrings.ipv4 = "ipv4".asInstanceOf[typings.proxyLists.proxyListsStrings.ipv4]
    
    @scala.inline
    def ipv6: typings.proxyLists.proxyListsStrings.ipv6 = "ipv6".asInstanceOf[typings.proxyLists.proxyListsStrings.ipv6]
  }
  
  @js.native
  trait InternalOptions extends Options {
    
    var sample: js.UndefOr[Boolean] = js.native
  }
  object InternalOptions {
    
    @scala.inline
    def apply(): InternalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalOptions]
    }
    
    @scala.inline
    implicit class InternalOptionsMutableBuilder[Self <: InternalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSample(value: Boolean): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
    }
  }
  
  @js.native
  trait ListSourcesOptions extends StObject {
    
    var sourcesBlackList: js.UndefOr[js.Array[String]] = js.native
    
    var sourcesWhiteList: js.UndefOr[js.Array[String]] = js.native
  }
  object ListSourcesOptions {
    
    @scala.inline
    def apply(): ListSourcesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListSourcesOptions]
    }
    
    @scala.inline
    implicit class ListSourcesOptionsMutableBuilder[Self <: ListSourcesOptions] (val x: Self) extends AnyVal {
      
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
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.proxyLists.proxyListsStrings.http
    - typings.proxyLists.proxyListsStrings.https
    - typings.proxyLists.proxyListsStrings.socks5
    - typings.proxyLists.proxyListsStrings.socks4
  */
  trait Protocol extends StObject
  object Protocol {
    
    @scala.inline
    def http: typings.proxyLists.proxyListsStrings.http = "http".asInstanceOf[typings.proxyLists.proxyListsStrings.http]
    
    @scala.inline
    def https: typings.proxyLists.proxyListsStrings.https = "https".asInstanceOf[typings.proxyLists.proxyListsStrings.https]
    
    @scala.inline
    def socks4: typings.proxyLists.proxyListsStrings.socks4 = "socks4".asInstanceOf[typings.proxyLists.proxyListsStrings.socks4]
    
    @scala.inline
    def socks5: typings.proxyLists.proxyListsStrings.socks5 = "socks5".asInstanceOf[typings.proxyLists.proxyListsStrings.socks5]
  }
  
  @js.native
  trait Proxy extends StObject {
    
    var anonymityLevel: js.UndefOr[AnonymityLevel] = js.native
    
    var country: String = js.native
    
    var ipAddress: String = js.native
    
    var port: Double = js.native
    
    var protocols: js.UndefOr[js.Array[Protocol]] = js.native
    
    var source: String = js.native
    
    var tunnel: js.UndefOr[Boolean] = js.native
  }
  object Proxy {
    
    @scala.inline
    def apply(country: String, ipAddress: String, port: Double, source: String): Proxy = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Proxy]
    }
    
    @scala.inline
    implicit class ProxyMutableBuilder[Self <: Proxy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymityLevel(value: AnonymityLevel): Self = StObject.set(x, "anonymityLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnonymityLevelUndefined: Self = StObject.set(x, "anonymityLevel", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      @scala.inline
      def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTunnel(value: Boolean): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    }
  }
  
  @js.native
  trait Source extends StObject {
    
    var homeUrl: String = js.native
    
    var name: String = js.native
  }
  object Source {
    
    @scala.inline
    def apply(homeUrl: String, name: String): Source = {
      val __obj = js.Dynamic.literal(homeUrl = homeUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHomeUrl(value: String): Self = StObject.set(x, "homeUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
