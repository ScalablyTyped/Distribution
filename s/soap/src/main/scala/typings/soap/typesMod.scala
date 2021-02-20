package typings.soap

import org.scalablytyped.runtime.StringDictionary
import typings.request.mod.CoreOptions
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequiredUriUrl
import typings.soap.anon.Namespace
import typings.soap.anon.Namespaces
import typings.soap.anon.Subcode
import typings.soap.anon.Text
import typings.soap.httpMod.HttpClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type IHeaders = StringDictionary[js.Any]
  
  @js.native
  trait IOneWayOptions extends StObject {
    
    var emptyBody: js.UndefOr[Boolean] = js.native
    
    var responseCode: js.UndefOr[Double] = js.native
  }
  object IOneWayOptions {
    
    @scala.inline
    def apply(): IOneWayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOneWayOptions]
    }
    
    @scala.inline
    implicit class IOneWayOptionsMutableBuilder[Self <: IOneWayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmptyBody(value: Boolean): Self = StObject.set(x, "emptyBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyBodyUndefined: Self = StObject.set(x, "emptyBody", js.undefined)
      
      @scala.inline
      def setResponseCode(value: Double): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
    }
  }
  
  @js.native
  trait IOptions extends IWsdlBaseOptions {
    
    var customDeserializer: js.UndefOr[js.Any] = js.native
    
    /** don't cache WSDL files, request them every time. */
    var disableCache: js.UndefOr[Boolean] = js.native
    
    /** override the SOAP service's host specified in the .wsdl file. */
    var endpoint: js.UndefOr[String] = js.native
    
    /** set specific key instead of <pre><soap:Body></soap:Body></pre>. */
    var envelopeKey: js.UndefOr[String] = js.native
    
    /** provide your own http client that implements request(rurl, data, callback, exheaders, exoptions) */
    var httpClient: js.UndefOr[HttpClient] = js.native
    
    /** if your wsdl operations contains names with Async suffix, you will need to override the default promise suffix to a custom one, default: Async. */
    var overridePromiseSuffix: js.UndefOr[String] = js.native
    
    /** override the request module. */
    var request: js.UndefOr[RequestAPI[Request, CoreOptions, RequiredUriUrl]] = js.native
    
    var returnSaxStream: js.UndefOr[Boolean] = js.native
    
    var stream: js.UndefOr[Boolean] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomDeserializer(value: js.Any): Self = StObject.set(x, "customDeserializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDeserializerUndefined: Self = StObject.set(x, "customDeserializer", js.undefined)
      
      @scala.inline
      def setDisableCache(value: Boolean): Self = StObject.set(x, "disableCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCacheUndefined: Self = StObject.set(x, "disableCache", js.undefined)
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setEnvelopeKey(value: String): Self = StObject.set(x, "envelopeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvelopeKeyUndefined: Self = StObject.set(x, "envelopeKey", js.undefined)
      
      @scala.inline
      def setHttpClient(value: HttpClient): Self = StObject.set(x, "httpClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpClientUndefined: Self = StObject.set(x, "httpClient", js.undefined)
      
      @scala.inline
      def setOverridePromiseSuffix(value: String): Self = StObject.set(x, "overridePromiseSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridePromiseSuffixUndefined: Self = StObject.set(x, "overridePromiseSuffix", js.undefined)
      
      @scala.inline
      def setRequest(value: RequestAPI[Request, CoreOptions, RequiredUriUrl]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setReturnSaxStream(value: Boolean): Self = StObject.set(x, "returnSaxStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnSaxStreamUndefined: Self = StObject.set(x, "returnSaxStream", js.undefined)
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  @js.native
  trait ISecurity extends StObject {
    
    var addHeaders: js.UndefOr[js.Function1[/* headers */ IHeaders, Unit]] = js.native
    
    var addOptions: js.UndefOr[js.Function1[/* options */ js.Any, Unit]] = js.native
    
    var postProcess: js.UndefOr[js.Function2[/* xml */ js.Any, /* envelopeKey */ js.Any, String]] = js.native
    
    var toXML: js.UndefOr[js.Function0[String]] = js.native
  }
  object ISecurity {
    
    @scala.inline
    def apply(): ISecurity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISecurity]
    }
    
    @scala.inline
    implicit class ISecurityMutableBuilder[Self <: ISecurity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddHeaders(value: /* headers */ IHeaders => Unit): Self = StObject.set(x, "addHeaders", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddHeadersUndefined: Self = StObject.set(x, "addHeaders", js.undefined)
      
      @scala.inline
      def setAddOptions(value: /* options */ js.Any => Unit): Self = StObject.set(x, "addOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddOptionsUndefined: Self = StObject.set(x, "addOptions", js.undefined)
      
      @scala.inline
      def setPostProcess(value: (/* xml */ js.Any, /* envelopeKey */ js.Any) => String): Self = StObject.set(x, "postProcess", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
      
      @scala.inline
      def setToXML(value: () => String): Self = StObject.set(x, "toXML", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToXMLUndefined: Self = StObject.set(x, "toXML", js.undefined)
    }
  }
  
  @js.native
  trait IServerOptions extends IWsdlBaseOptions {
    
    var callback: js.UndefOr[js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]] = js.native
    
    /** A boolean for controlling chunked transfer encoding in response. Some client (such as Windows 10's MDM enrollment SOAP client) is sensitive to transfer-encoding mode and can't accept chunked response. This option let user disable chunked transfer encoding for such a client. Default to true for backward compatibility. */
    var enableChunkedEncoding: js.UndefOr[Boolean] = js.native
    
    var oneWay: js.UndefOr[IOneWayOptions] = js.native
    
    var path: String = js.native
    
    var services: IServices = js.native
    
    /** suppress the full stack trace for error messages. */
    var suppressStack: js.UndefOr[Boolean] = js.native
    
    var uri: js.UndefOr[String] = js.native
    
    var xml: js.UndefOr[String] = js.native
  }
  object IServerOptions {
    
    @scala.inline
    def apply(path: String, services: IServices): IServerOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
      __obj.asInstanceOf[IServerOptions]
    }
    
    @scala.inline
    implicit class IServerOptionsMutableBuilder[Self <: IServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (/* err */ js.Any, /* res */ js.Any) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setEnableChunkedEncoding(value: Boolean): Self = StObject.set(x, "enableChunkedEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableChunkedEncodingUndefined: Self = StObject.set(x, "enableChunkedEncoding", js.undefined)
      
      @scala.inline
      def setOneWay(value: IOneWayOptions): Self = StObject.set(x, "oneWay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneWayUndefined: Self = StObject.set(x, "oneWay", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServices(value: IServices): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressStack(value: Boolean): Self = StObject.set(x, "suppressStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressStackUndefined: Self = StObject.set(x, "suppressStack", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      @scala.inline
      def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
    }
  }
  
  type IService = StringDictionary[IServicePort]
  
  type IServicePort = StringDictionary[ISoapServiceMethod]
  
  type IServices = StringDictionary[IService]
  
  /* Rewritten from type alias, can be one of: 
    - typings.soap.typesMod.ISoapFault11
    - typings.soap.typesMod.ISoapFault12
  */
  trait ISoapFault extends StObject
  object ISoapFault {
    
    @scala.inline
    def ISoapFault11(faultcode: Double | String, faultstring: String): typings.soap.typesMod.ISoapFault11 = {
      val __obj = js.Dynamic.literal(faultcode = faultcode.asInstanceOf[js.Any], faultstring = faultstring.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.soap.typesMod.ISoapFault11]
    }
    
    @scala.inline
    def ISoapFault12(Code: Subcode, Reason: Text): typings.soap.typesMod.ISoapFault12 = {
      val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.soap.typesMod.ISoapFault12]
    }
  }
  
  @js.native
  trait ISoapFault11 extends ISoapFault {
    
    var detail: js.UndefOr[String] = js.native
    
    var faultcode: Double | String = js.native
    
    var faultstring: String = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
  }
  object ISoapFault11 {
    
    @scala.inline
    def apply(faultcode: Double | String, faultstring: String): ISoapFault11 = {
      val __obj = js.Dynamic.literal(faultcode = faultcode.asInstanceOf[js.Any], faultstring = faultstring.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISoapFault11]
    }
    
    @scala.inline
    implicit class ISoapFault11MutableBuilder[Self <: ISoapFault11] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setFaultcode(value: Double | String): Self = StObject.set(x, "faultcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaultstring(value: String): Self = StObject.set(x, "faultstring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  @js.native
  trait ISoapFault12 extends ISoapFault {
    
    var Code: Subcode = js.native
    
    var Reason: Text = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
  }
  object ISoapFault12 {
    
    @scala.inline
    def apply(Code: Subcode, Reason: Text): ISoapFault12 = {
      val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISoapFault12]
    }
    
    @scala.inline
    implicit class ISoapFault12MutableBuilder[Self <: ISoapFault12] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Subcode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: Text): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  @js.native
  trait ISoapFaultError extends StObject {
    
    var Fault: ISoapFault = js.native
  }
  object ISoapFaultError {
    
    @scala.inline
    def apply(Fault: ISoapFault): ISoapFaultError = {
      val __obj = js.Dynamic.literal(Fault = Fault.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISoapFaultError]
    }
    
    @scala.inline
    implicit class ISoapFaultErrorMutableBuilder[Self <: ISoapFaultError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFault(value: ISoapFault): Self = StObject.set(x, "Fault", value.asInstanceOf[js.Any])
    }
  }
  
  type ISoapMethod = SoapMethod
  
  type ISoapServiceMethod = js.Function4[
    /* args */ js.Any, 
    /* callback */ js.UndefOr[js.Function1[/* data */ js.Any, Unit]], 
    /* headers */ js.UndefOr[js.Any], 
    /* req */ js.UndefOr[js.Any], 
    js.Any
  ]
  
  @js.native
  trait IWsdlBaseOptions extends StObject {
    
    var attributesKey: js.UndefOr[String] = js.native
    
    /** escape special XML characters in SOAP message (e.g. &, >, < etc), default: true. */
    var escapeXML: js.UndefOr[Boolean] = js.native
    
    /** set proper headers for SOAP v1.2. */
    var forceSoap12Headers: js.UndefOr[Boolean] = js.native
    
    var handleNilAsNull: js.UndefOr[Boolean] = js.native
    
    var ignoreBaseNameSpaces: js.UndefOr[Boolean] = js.native
    
    var ignoredNamespaces: js.UndefOr[Boolean | js.Array[String] | Namespaces] = js.native
    
    /** provides support for nonstandard array semantics. If true, JSON arrays of the form {list: [{elem: 1}, {elem: 2}]} are marshalled into xml as <list><elem>1</elem></list> <list><elem>2</elem></list>. If false, marshalls into <list> <elem>1</elem> <elem>2</elem> </list>. Default: true. */
    var namespaceArrayElements: js.UndefOr[Boolean] = js.native
    
    /** if your wsdl operations contains names with non identifier characters ([^a-z$_0-9]), replace them with _. Note: if using this option, clients using wsdls with two operations like soap:method and soap-method will be overwritten. Then, use bracket notation instead (client['soap:method']()). */
    var normalizeNames: js.UndefOr[Boolean] = js.native
    
    var overrideRootElement: js.UndefOr[Namespace] = js.native
    
    /** to preserve leading and trailing whitespace characters in text and cdata. */
    var preserveWhitespace: js.UndefOr[Boolean] = js.native
    
    /** return an Invalid XML SOAP fault on a bad request, default: false. */
    var returnFault: js.UndefOr[Boolean] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
    
    var useEmptyTag: js.UndefOr[Boolean] = js.native
    
    var valueKey: js.UndefOr[String] = js.native
    
    /** custom HTTP headers to be sent on WSDL requests. */
    var wsdl_headers: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /** custom options for the request module on WSDL requests. */
    var wsdl_options: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var xmlKey: js.UndefOr[String] = js.native
  }
  object IWsdlBaseOptions {
    
    @scala.inline
    def apply(): IWsdlBaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWsdlBaseOptions]
    }
    
    @scala.inline
    implicit class IWsdlBaseOptionsMutableBuilder[Self <: IWsdlBaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributesKey(value: String): Self = StObject.set(x, "attributesKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesKeyUndefined: Self = StObject.set(x, "attributesKey", js.undefined)
      
      @scala.inline
      def setEscapeXML(value: Boolean): Self = StObject.set(x, "escapeXML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeXMLUndefined: Self = StObject.set(x, "escapeXML", js.undefined)
      
      @scala.inline
      def setForceSoap12Headers(value: Boolean): Self = StObject.set(x, "forceSoap12Headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceSoap12HeadersUndefined: Self = StObject.set(x, "forceSoap12Headers", js.undefined)
      
      @scala.inline
      def setHandleNilAsNull(value: Boolean): Self = StObject.set(x, "handleNilAsNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleNilAsNullUndefined: Self = StObject.set(x, "handleNilAsNull", js.undefined)
      
      @scala.inline
      def setIgnoreBaseNameSpaces(value: Boolean): Self = StObject.set(x, "ignoreBaseNameSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreBaseNameSpacesUndefined: Self = StObject.set(x, "ignoreBaseNameSpaces", js.undefined)
      
      @scala.inline
      def setIgnoredNamespaces(value: Boolean | js.Array[String] | Namespaces): Self = StObject.set(x, "ignoredNamespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredNamespacesUndefined: Self = StObject.set(x, "ignoredNamespaces", js.undefined)
      
      @scala.inline
      def setIgnoredNamespacesVarargs(value: String*): Self = StObject.set(x, "ignoredNamespaces", js.Array(value :_*))
      
      @scala.inline
      def setNamespaceArrayElements(value: Boolean): Self = StObject.set(x, "namespaceArrayElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceArrayElementsUndefined: Self = StObject.set(x, "namespaceArrayElements", js.undefined)
      
      @scala.inline
      def setNormalizeNames(value: Boolean): Self = StObject.set(x, "normalizeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeNamesUndefined: Self = StObject.set(x, "normalizeNames", js.undefined)
      
      @scala.inline
      def setOverrideRootElement(value: Namespace): Self = StObject.set(x, "overrideRootElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideRootElementUndefined: Self = StObject.set(x, "overrideRootElement", js.undefined)
      
      @scala.inline
      def setPreserveWhitespace(value: Boolean): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
      
      @scala.inline
      def setReturnFault(value: Boolean): Self = StObject.set(x, "returnFault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnFaultUndefined: Self = StObject.set(x, "returnFault", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setUseEmptyTag(value: Boolean): Self = StObject.set(x, "useEmptyTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseEmptyTagUndefined: Self = StObject.set(x, "useEmptyTag", js.undefined)
      
      @scala.inline
      def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
      
      @scala.inline
      def setWsdl_headers(value: StringDictionary[js.Any]): Self = StObject.set(x, "wsdl_headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsdl_headersUndefined: Self = StObject.set(x, "wsdl_headers", js.undefined)
      
      @scala.inline
      def setWsdl_options(value: StringDictionary[js.Any]): Self = StObject.set(x, "wsdl_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsdl_optionsUndefined: Self = StObject.set(x, "wsdl_options", js.undefined)
      
      @scala.inline
      def setXmlKey(value: String): Self = StObject.set(x, "xmlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlKeyUndefined: Self = StObject.set(x, "xmlKey", js.undefined)
    }
  }
  
  @js.native
  trait IXmlAttribute extends StObject {
    
    var name: String = js.native
    
    var value: String = js.native
  }
  object IXmlAttribute {
    
    @scala.inline
    def apply(name: String, value: String): IXmlAttribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlAttribute]
    }
    
    @scala.inline
    implicit class IXmlAttributeMutableBuilder[Self <: IXmlAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Option = IOptions
  
  type Security = ISecurity
  
  type SoapMethod = js.Function4[
    /* args */ js.Any, 
    /* callback */ js.Function5[
      /* err */ js.Any, 
      /* result */ js.Any, 
      /* rawResponse */ js.Any, 
      /* soapHeader */ js.Any, 
      /* rawRequest */ js.Any, 
      Unit
    ], 
    /* options */ js.UndefOr[js.Any], 
    /* extraHeaders */ js.UndefOr[js.Any], 
    Unit
  ]
  
  type SoapMethodAsync = js.Function3[
    /* args */ js.Any, 
    /* options */ js.UndefOr[js.Any], 
    /* extraHeaders */ js.UndefOr[js.Any], 
    js.Promise[js.Tuple4[js.Any, js.Any, js.Any, js.Any]]
  ]
}
