package typings.rdflib

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.rdflib.anon.Q
import typings.rdflib.anon.TypeofHandler
import typings.rdflib.anon.reqBlankNodeoriginalQuadS
import typings.rdflib.anon.reqBlankNoderesourceQuadS
import typings.rdflib.anon.reqQuadSubjectoriginalQua
import typings.rdflib.rdflibStrings.include
import typings.rdflib.rdflibStrings.omit
import typings.rdflib.rdflibStrings.textSlashturtle
import typings.rdflib.tfTypesMod.BlankNode
import typings.rdflib.tfTypesMod.NamedNode
import typings.rdflib.tfTypesMod.QuadGraph
import typings.rdflib.tfTypesMod.QuadPredicate
import typings.rdflib.tfTypesMod.QuadSubject
import typings.rdflib.typesMod.ContentType
import typings.std.AbortSignal
import typings.std.Blob
import typings.std.Document
import typings.std.Error
import typings.std.FormData
import typings.std.Headers
import typings.std.HeadersInit
import typings.std.Record
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.Response
import typings.std.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetcherMod {
  
  @JSImport("rdflib/lib/fetcher", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Fetcher {
    def this(store: typings.rdflib.storeMod.default) = this()
    def this(store: typings.rdflib.storeMod.default, options: Options) = this()
    
    /* CompleteClass */
    var fireCallbacks: js.Function = js.native
  }
  /* static members */
  object default {
    
    @JSImport("rdflib/lib/fetcher", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdflib/lib/fetcher", "default.CONTENT_TYPE_BY_EXT")
    @js.native
    def CONTENT_TYPE_BY_EXT: Record[String, String] = js.native
    inline def CONTENT_TYPE_BY_EXT_=(x: Record[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_TYPE_BY_EXT")(x.asInstanceOf[js.Any])
    
    @JSImport("rdflib/lib/fetcher", "default.HANDLERS")
    @js.native
    def HANDLERS: NumberDictionary[Handler] = js.native
    inline def HANDLERS_=(x: NumberDictionary[Handler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HANDLERS")(x.asInstanceOf[js.Any])
    
    inline def crossSiteProxy(uri: String): js.UndefOr[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("crossSiteProxy")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Any]]
    
    @JSImport("rdflib/lib/fetcher", "default.crossSiteProxyTemplate")
    @js.native
    def crossSiteProxyTemplate: Any = js.native
    inline def crossSiteProxyTemplate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crossSiteProxyTemplate")(x.asInstanceOf[js.Any])
    
    inline def offlineOverride(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("offlineOverride")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def proxyIfNecessary(uri: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyIfNecessary")(uri.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** Decide on credentials using old XXHR api or new fetch()  one
      * @param requestedURI
      * @param options
      */
    inline def setCredentials(requestedURI: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCredentials")(requestedURI.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setCredentials(requestedURI: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCredentials")(requestedURI.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Tests whether the uri's protocol is supported by the Fetcher.
      * @param uri
      */
    inline def unsupportedProtocol(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedProtocol")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /** tell typescript that a 'panes' child may exist on Window */
  object global {
    
    @JSGlobal("solidFetch")
    @js.native
    def solidFetch: js.Function = js.native
    inline def solidFetch_=(x: js.Function): Unit = js.Dynamic.global.updateDynamic("solidFetch")(x.asInstanceOf[js.Any])
    
    @JSGlobal("solidFetcher")
    @js.native
    def solidFetcher: js.Function = js.native
    inline def solidFetcher_=(x: js.Function): Unit = js.Dynamic.global.updateDynamic("solidFetcher")(x.asInstanceOf[js.Any])
    
    trait Window extends StObject {
      
      var panes: js.UndefOr[Any] = js.undefined
      
      var solidFetch: js.UndefOr[Any] = js.undefined
      
      var solidFetcher: js.UndefOr[Any] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setPanes(value: Any): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
        
        inline def setPanesUndefined: Self = StObject.set(x, "panes", js.undefined)
        
        inline def setSolidFetch(value: Any): Self = StObject.set(x, "solidFetch", value.asInstanceOf[js.Any])
        
        inline def setSolidFetchUndefined: Self = StObject.set(x, "solidFetch", js.undefined)
        
        inline def setSolidFetcher(value: Any): Self = StObject.set(x, "solidFetcher", value.asInstanceOf[js.Any])
        
        inline def setSolidFetcherUndefined: Self = StObject.set(x, "solidFetcher", js.undefined)
      }
    }
  }
  
  trait AutoInitOptions
    extends StObject
       with RequestInit {
    
    var actualProxyURI: js.UndefOr[String] = js.undefined
    
    /**
      * Original uri to preserve
      * through proxying etc (`xhr.original`).
      */
    var baseURI: String
    
    @JSName("body")
    var body_AutoInitOptions: js.UndefOr[String] = js.undefined
    
    /** Before we parse new data, clear old, but only on status 200 responses */
    var clearPreviousData: js.UndefOr[Boolean] = js.undefined
    
    /** Provided content type (for writes) */
    var contentType: js.UndefOr[String] = js.undefined
    
    @JSName("credentials")
    var credentials_AutoInitOptions: js.UndefOr[include | omit] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    /** The used Fetch function */
    var fetch: js.UndefOr[Fetch] = js.undefined
    
    /**
      * Load the data even if loaded before.
      * Also sets the `Cache-Control:` header to `no-cache`
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Override the incoming header to
      * force the data to be treated as this content-type (for reads)
      */
    var forceContentType: js.UndefOr[ContentType] = js.undefined
    
    var handlers: js.UndefOr[js.Array[Handler]] = js.undefined
    
    @JSName("headers")
    var headers_AutoInitOptions: HeadersInit
    
    @JSName("method")
    var method_AutoInitOptions: js.UndefOr[HTTPMethods] = js.undefined
    
    /** Prevents the addition of various metadata triples (about the fetch request) to the store*/
    var noMeta: js.UndefOr[Boolean] = js.undefined
    
    var noRDFa: js.UndefOr[Boolean] = js.undefined
    
    /** The serialized resource in the body*/
    var original: NamedNode
    
    /**
      * Whether this request is a retry via
      * a proxy (generally done from an error handler)
      */
    var proxyUsed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Referring term, the resource which
      * referred to this (for tracking bad links).
      * The document in which this link was found.
      */
    var referringTerm: js.UndefOr[NamedNode] = js.undefined
    
    var req: BlankNode
    
    var requestedURI: js.UndefOr[String] = js.undefined
    
    var resource: QuadSubject
    
    var retriedWithNoCredentials: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** flag for XHR/CORS etc */
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object AutoInitOptions {
    
    inline def apply(baseURI: String, headers: HeadersInit, original: NamedNode, req: BlankNode, resource: QuadSubject): AutoInitOptions = {
      val __obj = js.Dynamic.literal(baseURI = baseURI.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoInitOptions]
    }
    
    extension [Self <: AutoInitOptions](x: Self) {
      
      inline def setActualProxyURI(value: String): Self = StObject.set(x, "actualProxyURI", value.asInstanceOf[js.Any])
      
      inline def setActualProxyURIUndefined: Self = StObject.set(x, "actualProxyURI", js.undefined)
      
      inline def setBaseURI(value: String): Self = StObject.set(x, "baseURI", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setClearPreviousData(value: Boolean): Self = StObject.set(x, "clearPreviousData", value.asInstanceOf[js.Any])
      
      inline def setClearPreviousDataUndefined: Self = StObject.set(x, "clearPreviousData", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCredentials(value: include | omit): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFetch(
        value: (/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit]) => js.Promise[ExtendedResponse]
      ): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceContentType(value: ContentType): Self = StObject.set(x, "forceContentType", value.asInstanceOf[js.Any])
      
      inline def setForceContentTypeUndefined: Self = StObject.set(x, "forceContentType", js.undefined)
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setHandlers(value: js.Array[Handler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setHandlersVarargs(value: Handler*): Self = StObject.set(x, "handlers", js.Array(value*))
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setMethod(value: HTTPMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setNoMeta(value: Boolean): Self = StObject.set(x, "noMeta", value.asInstanceOf[js.Any])
      
      inline def setNoMetaUndefined: Self = StObject.set(x, "noMeta", js.undefined)
      
      inline def setNoRDFa(value: Boolean): Self = StObject.set(x, "noRDFa", value.asInstanceOf[js.Any])
      
      inline def setNoRDFaUndefined: Self = StObject.set(x, "noRDFa", js.undefined)
      
      inline def setOriginal(value: NamedNode): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setProxyUsed(value: Boolean): Self = StObject.set(x, "proxyUsed", value.asInstanceOf[js.Any])
      
      inline def setProxyUsedUndefined: Self = StObject.set(x, "proxyUsed", js.undefined)
      
      inline def setReferringTerm(value: NamedNode): Self = StObject.set(x, "referringTerm", value.asInstanceOf[js.Any])
      
      inline def setReferringTermUndefined: Self = StObject.set(x, "referringTerm", js.undefined)
      
      inline def setReq(value: BlankNode): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRequestedURI(value: String): Self = StObject.set(x, "requestedURI", value.asInstanceOf[js.Any])
      
      inline def setRequestedURIUndefined: Self = StObject.set(x, "requestedURI", js.undefined)
      
      inline def setResource(value: QuadSubject): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setRetriedWithNoCredentials(value: Boolean): Self = StObject.set(x, "retriedWithNoCredentials", value.asInstanceOf[js.Any])
      
      inline def setRetriedWithNoCredentialsUndefined: Self = StObject.set(x, "retriedWithNoCredentials", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  type BooleanMap = StringDictionary[Boolean]
  
  trait CallbackifyInterface extends StObject {
    
    var fireCallbacks: js.Function
  }
  object CallbackifyInterface {
    
    inline def apply(fireCallbacks: js.Function): CallbackifyInterface = {
      val __obj = js.Dynamic.literal(fireCallbacks = fireCallbacks.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackifyInterface]
    }
    
    extension [Self <: CallbackifyInterface](x: Self) {
      
      inline def setFireCallbacks(value: js.Function): Self = StObject.set(x, "fireCallbacks", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtendedResponse
    extends StObject
       with Response {
    
    /** Used in UpdateManager.updateDav */
    var error: js.UndefOr[String] = js.undefined
    
    /** Identifier of the reqest */
    var req: js.UndefOr[QuadSubject] = js.undefined
    
    /** String representation of the Body */
    var responseText: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ExtendedResponse {
    
    inline def apply(
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[Blob],
      bodyUsed: Boolean,
      formData: () => js.Promise[FormData],
      headers: Headers,
      json: () => js.Promise[Any],
      ok: Boolean,
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: () => js.Promise[String],
      `type`: ResponseType,
      url: String
    ): ExtendedResponse = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any], body = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedResponse]
    }
    
    extension [Self <: ExtendedResponse](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setReq(value: QuadSubject): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
      
      inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      inline def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /** Differs from normal Fetch, has an extended Response type */
  type Fetch = js.Function2[
    /* input */ RequestInfo, 
    /* init */ js.UndefOr[RequestInit], 
    js.Promise[ExtendedResponse]
  ]
  
  type FetchCallbacks = StringDictionary[js.Array[UserCallback]]
  
  trait FetchError
    extends StObject
       with Error {
    
    var response: js.UndefOr[ExtendedResponse] = js.undefined
    
    var status: js.UndefOr[StatusValues] = js.undefined
    
    var statusText: js.UndefOr[String] = js.undefined
  }
  object FetchError {
    
    inline def apply(message: String, name: String): FetchError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchError]
    }
    
    extension [Self <: FetchError](x: Self) {
      
      inline def setResponse(value: ExtendedResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setStatus(value: StatusValues): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type FetchQueue = StringDictionary[js.Promise[ExtendedResponse]]
  
  @js.native
  trait Fetcher
    extends StObject
       with CallbackifyInterface {
    
    def _fetch(input: RequestInfo): js.Promise[ExtendedResponse] = js.native
    def _fetch(input: RequestInfo, init: RequestInit): js.Promise[ExtendedResponse] = js.native
    @JSName("_fetch")
    var _fetch_Original: Fetch = js.native
    
    def acceptString(): String = js.native
    
    def addFetchCallback(uri: String, callback: UserCallback): Unit = js.native
    
    def addHandler(
      handler: TypeofHandler & (Instantiable2[/* response */ ExtendedResponse, /* dom */ js.UndefOr[Document], Handler])
    ): Unit = js.native
    
    /**
      * Records a status message (as a literal node) by appending it to the
      * request's metadata status collection.
      *
      */
    def addStatus(req: BlankNode, statusMessage: String): Unit = js.native
    
    def addType(rdfType: NamedNode, req: QuadSubject, kb: typings.rdflib.storeMod.default, locURI: String): Unit = js.native
    
    /** Denoting this session */
    var appNode: BlankNode = js.native
    
    /**
      * @param _options - DEPRECATED
      */
    def cleanupFetchRequest(originalUri: String, _options: Any, timeout: Double): Unit = js.native
    
    /**
      * @param parentURI URI of parent container
      * @param folderName - Optional folder name (slug)
      * @param data - Optional folder metadata
      */
    def createContainer(parentURI: String, folderName: String, data: String): js.Promise[Response] = js.native
    
    /** Create an empty resource if it really does not exist
      *  Be absolutely sure something does not exist before creating a new empty file
      * as otherwise existing could  be deleted.
      * @param doc - The resource
      */
    def createIfNotExists(doc: typings.rdflib.namedNodeMod.default): js.Promise[ExtendedResponse] = js.native
    def createIfNotExists(doc: typings.rdflib.namedNodeMod.default, contentType: Unit, data: String): js.Promise[ExtendedResponse] = js.native
    @JSName("createIfNotExists")
    def createIfNotExists_textturtle(doc: typings.rdflib.namedNodeMod.default, contentType: textSlashturtle): js.Promise[ExtendedResponse] = js.native
    @JSName("createIfNotExists")
    def createIfNotExists_textturtle(doc: typings.rdflib.namedNodeMod.default, contentType: textSlashturtle, data: String): js.Promise[ExtendedResponse] = js.native
    
    def delete(uri: String): js.Promise[ExtendedResponse] = js.native
    def delete(uri: String, options: Options): js.Promise[ExtendedResponse] = js.native
    
    def doneFetch(options: reqQuadSubjectoriginalQua, response: ExtendedResponse): Response = js.native
    
    /**
      * Records errors in the system on failure:
      *
      *  - Adds an entry to the request status collection
      *  - Adds an error triple with the fail message to the metadata
      *  - Fires the 'fail' callback
      *  - Rejects with an error result object, which has a response object if any
      */
    def failFetch(options: reqBlankNodeoriginalQuadS, errorMessage: String, statusCode: StatusValues): js.Promise[FetchError] = js.native
    def failFetch(
      options: reqBlankNodeoriginalQuadS,
      errorMessage: String,
      statusCode: StatusValues,
      response: ExtendedResponse
    ): js.Promise[FetchError] = js.native
    
    /** fetchCallbacks[uri].push(callback) */
    var fetchCallbacks: FetchCallbacks = js.native
    
    var fetchQueue: FetchQueue = js.native
    
    /**
      * (The promise chain ends in either a `failFetch()` or a `doneFetch()`)
      *
      * @param docuri {string}
      * @param options {Object}
      *
      * @returns {Promise<Object>} fetch() result or an { error, status } object
      */
    def fetchUri(docuri: String, options: AutoInitOptions): js.Promise[ExtendedResponse | FetchError] = js.native
    
    /**
      * Looks up response header.
      *
      * @returns {Array|undefined} a list of header values found in a stored HTTP
      *   response, or [] if response was found but no header found,
      *   or undefined if no response is available.
      * Looks for { [] link:requestedURI ?uri; link:response [ httph:header-name  ?value ] }
      */
    def getHeader(doc: NamedNode, header: String): js.UndefOr[js.Array[String]] = js.native
    
    def getState(docuri: String): Any = js.native
    
    def guessContentType(uri: String): js.UndefOr[ContentType] = js.native
    
    def handleError(response: js.Error, docuri: String, options: AutoInitOptions): js.Promise[ExtendedResponse | FetchError] = js.native
    /**
      * Called when there's a network error in fetch(), or a response
      * with status of 0.
      */
    def handleError(response: ExtendedResponse, docuri: String, options: AutoInitOptions): js.Promise[ExtendedResponse | FetchError] = js.native
    
    /**
      * Handle fetch() response
      */
    def handleResponse(response: ExtendedResponse, docuri: String, options: AutoInitOptions): (js.Promise[FetchError | ExtendedResponse]) | ExtendedResponse = js.native
    
    def handlerForContentType(contentType: String, response: ExtendedResponse): Handler | Null = js.native
    
    var handlers: js.Array[
        TypeofHandler & (Instantiable2[/* response */ ExtendedResponse, /* dom */ js.UndefOr[Document], Handler])
      ] = js.native
    
    def initFetchOptions(uri: String, options: Options): AutoInitOptions = js.native
    
    def invalidateCache(iri: String): Unit = js.native
    def invalidateCache(iri: NamedNode): Unit = js.native
    
    /**
      * Tests whether a request is being made to a cross-site URI (for purposes
      * of retrying with a proxy)
      */
    def isCrossSite(uri: String): Boolean = js.native
    
    def isPending(docuri: String): Boolean = js.native
    
    def linkData(originalUri: NamedNode, rel: String, uri: String, why: QuadGraph): Unit = js.native
    def linkData(originalUri: NamedNode, rel: String, uri: String, why: QuadGraph, reverse: Boolean): Unit = js.native
    
    def load(uri: String): js.Promise[js.Array[Result] | Result] = js.native
    def load(uri: String, options: Options): js.Promise[js.Array[Result] | Result] = js.native
    def load(uri: js.Array[String | NamedNode]): js.Promise[js.Array[Result] | Result] = js.native
    def load(uri: js.Array[String | NamedNode], options: Options): js.Promise[js.Array[Result] | Result] = js.native
    /**
      * Promise-based load function
      *
      * Loads a web resource or resources into the store.
      *
      * A resource may be given as NamedNode object, or as a plain URI.
      * an array of resources will be given, in which they will be fetched in parallel.
      * By default, the HTTP headers are recorded also, in the same store, in a separate graph.
      * This allows code like editable() for example to test things about the resource.
      *
      * @param uri {Array<RDFlibNamedNode>|Array<string>|RDFlibNamedNode|string}
      *
      * @param [options={}] {Object}
      *
      * @param [options.fetch] {Function}
      *
      * @param [options.referringTerm] {RDFlibNamedNode} Referring term, the resource which
      *   referred to this (for tracking bad links)
      *
      * @param [options.contentType] {string} Provided content type (for writes)
      *
      * @param [options.forceContentType] {string} Override the incoming header to
      *   force the data to be treated as this content-type (for reads)
      *
      * @param [options.force] {boolean} Load the data even if loaded before.
      *   Also sets the `Cache-Control:` header to `no-cache`
      *
      * @param [options.baseURI=docuri] {Node|string} Original uri to preserve
      *   through proxying etc (`xhr.original`).
      *
      * @param [options.proxyUsed] {boolean} Whether this request is a retry via
      *   a proxy (generally done from an error handler)
      *
      * @param [options.withCredentials] {boolean} flag for XHR/CORS etc
      *
      * @param [options.clearPreviousData] {boolean} Before we parse new data,
      *   clear old, but only on status 200 responses
      *
      * @param [options.noMeta] {boolean} Prevents the addition of various metadata
      *   triples (about the fetch request) to the store
      *
      * @param [options.noRDFa] {boolean}
      *
      * @returns {Promise<Result>}
      */
    def load(uri: NamedNode): js.Promise[js.Array[Result] | Result] = js.native
    def load(uri: NamedNode, options: Options): js.Promise[js.Array[Result] | Result] = js.native
    
    /**
      * Looks up something.
      * Looks up all the URIs a things has.
      *
      * @param term - canonical term for the thing whose URI is
      *   to be dereferenced
      * @param rterm - the resource which referred to this
      *   (for tracking bad links)
      */
    def lookUpThing(term: QuadSubject, rterm: QuadSubject): js.Promise[Response] | js.Array[js.Promise[Response]] = js.native
    
    var lookedUp: BooleanMap = js.native
    
    var mediatypes: MediatypesMap = js.native
    
    /** Keep track of explicit 404s -> we can overwrite etc */
    var nonexistent: BooleanMap = js.native
    
    def normalizedContentType(options: AutoInitOptions, headers: Headers): ContentType | String | Null = js.native
    
    /**
      * Note two nodes are now smushed
      * If only one was flagged as looked up, then the new node is looked up again,
      * which will make sure all the URIs are dereferenced
      */
    def nowKnownAs(was: QuadSubject, now: QuadSubject): Unit = js.native
    
    /**
      * Asks for a doc to be loaded if necessary then calls back
      *
      * Calling methods:
      *   nowOrWhenFetched (uri, userCallback)
      *   nowOrWhenFetched (uri, options, userCallback)
      *   nowOrWhenFetched (uri, referringTerm, userCallback, options)  <-- old
      *   nowOrWhenFetched (uri, referringTerm, userCallback) <-- old
      *
      *  Options include:
      *   referringTerm    The document in which this link was found.
      *                    this is valuable when finding the source of bad URIs
      *   force            boolean.  Never mind whether you have tried before,
      *                    load this from scratch.
      *   forceContentType Override the incoming header to force the data to be
      *                    treated as this content-type.
      *
      *  Callback function takes:
      *
      *    ok               True if the fetch worked, and got a 200 response.
      *                     False if any error happened
      *
      *    errmessage       Text error message if not OK.
      *
      *    response         The fetch Response object (was: XHR) if there was was one
      *                     includes response.status as the HTTP status if any.
      */
    def nowOrWhenFetched(uriIn: String): Unit = js.native
    def nowOrWhenFetched(uriIn: String, p2: Unit, userCallback: Unit, options: Options): Unit = js.native
    def nowOrWhenFetched(uriIn: String, p2: Unit, userCallback: UserCallback): Unit = js.native
    def nowOrWhenFetched(uriIn: String, p2: Unit, userCallback: UserCallback, options: Options): Unit = js.native
    def nowOrWhenFetched(uriIn: String, p2: Options): Unit = js.native
    def nowOrWhenFetched(uriIn: String, p2: Options, userCallback: Unit, options: Options): Unit = js.native
    def nowOrWhenFetched(uriIn: String, p2: Options, userCallback: UserCallback): Unit = js.native
    def nowOrWhenFetched(uriIn: String, p2: Options, userCallback: UserCallback, options: Options): Unit = js.native
    def nowOrWhenFetched(uriIn: String, p2: UserCallback): Unit = js.native
    def nowOrWhenFetched(uriIn: String, p2: UserCallback, userCallback: Unit, options: Options): Unit = js.native
    def nowOrWhenFetched(uriIn: String, p2: UserCallback, userCallback: UserCallback): Unit = js.native
    def nowOrWhenFetched(uriIn: String, p2: UserCallback, userCallback: UserCallback, options: Options): Unit = js.native
    def nowOrWhenFetched(uriIn: NamedNode): Unit = js.native
    def nowOrWhenFetched(uriIn: NamedNode, p2: Unit, userCallback: Unit, options: Options): Unit = js.native
    def nowOrWhenFetched(uriIn: NamedNode, p2: Unit, userCallback: UserCallback): Unit = js.native
    def nowOrWhenFetched(uriIn: NamedNode, p2: Unit, userCallback: UserCallback, options: Options): Unit = js.native
    def nowOrWhenFetched(uriIn: NamedNode, p2: Options): Unit = js.native
    def nowOrWhenFetched(uriIn: NamedNode, p2: Options, userCallback: Unit, options: Options): Unit = js.native
    def nowOrWhenFetched(uriIn: NamedNode, p2: Options, userCallback: UserCallback): Unit = js.native
    def nowOrWhenFetched(uriIn: NamedNode, p2: Options, userCallback: UserCallback, options: Options): Unit = js.native
    def nowOrWhenFetched(uriIn: NamedNode, p2: UserCallback): Unit = js.native
    def nowOrWhenFetched(uriIn: NamedNode, p2: UserCallback, userCallback: Unit, options: Options): Unit = js.native
    def nowOrWhenFetched(uriIn: NamedNode, p2: UserCallback, userCallback: UserCallback): Unit = js.native
    def nowOrWhenFetched(uriIn: NamedNode, p2: UserCallback, userCallback: UserCallback, options: Options): Unit = js.native
    
    var ns: StringDictionary[js.Function1[/* ln */ String, QuadPredicate]] = js.native
    
    def objectRefresh(term: NamedNode): Unit = js.native
    
    def parseLinkHeader(linkHeader: String, originalUri: NamedNode, reqNode: QuadGraph): Unit = js.native
    
    def pendingFetchPromise(uri: String, originalUri: String, options: AutoInitOptions): js.Promise[Result] = js.native
    
    def putBack(uri: String): js.Promise[Response] = js.native
    def putBack(uri: String, options: Options): js.Promise[Response] = js.native
    /**
      * Writes back to the web what we have in the store for this uri
      */
    def putBack(uri: NamedNode): js.Promise[Response] = js.native
    def putBack(uri: NamedNode, options: Options): js.Promise[Response] = js.native
    
    /**
      * Sends a new request to the specified uri. (Extracted from `onerrorFactory()`)
      */
    def redirectToProxy(newURI: String, options: AutoInitOptions): js.Promise[ExtendedResponse | FetchError] = js.native
    
    /** Redirected from *key uri* to *value uri* */
    var redirectedTo: Record[String, String] = js.native
    
    def refresh(term: NamedNode): Unit = js.native
    def refresh(term: NamedNode, userCallback: UserCallback): Unit = js.native
    
    def refreshIfExpired(term: NamedNode, userCallback: UserCallback): Unit = js.native
    
    /**
      * this.requested[uri] states:
      * undefined     no record of web access or records reset
      * true          has been requested, fetch in progress
      * 'done'        received, Ok
      * 401           Not logged in
      * 403           HTTP status unauthorized
      * 404           Resource does not exist. Can be created etc.
      * 'redirected'  In attempt to counter CORS problems retried.
      * 'parse_error' Parse error
      * 'unsupported_protocol'  URI is not a protocol Fetcher can deal with
      * other strings mean various other errors.
      */
    var requested: RequestedMap = js.native
    
    def retract(term: QuadGraph): Unit = js.native
    
    def retryNoCredentials(docuri: String, options: Any): js.Promise[Result] = js.native
    
    def saveErrorResponse(response: ExtendedResponse, responseNode: QuadSubject): js.Promise[Unit] = js.native
    
    def saveRequestMetadata(docuri: String, options: AutoInitOptions): Unit = js.native
    
    def saveResponseMetadata(response: Response, options: reqBlankNoderesourceQuadS): BlankNode = js.native
    
    def setRequestTimeout(uri: String, options: reqQuadSubjectoriginalQua): js.Promise[Double | FetchError] = js.native
    
    var store: typings.rdflib.storeMod.default = js.native
    
    var timeout: Double = js.native
    
    /** List of timeouts associated with a requested URL */
    var timeouts: TimeOutsMap = js.native
    
    def unload(term: NamedNode): Unit = js.native
    
    def webCopy(here: String, there: String, contentType: Any): js.Promise[ExtendedResponse] = js.native
    
    /**
      * A generic web operation, at the fetch() level.
      * does not involve the quad store.
      *
      *  Returns promise of Response
      *  If data is returned, copies it to response.responseText before returning
      */
    def webOperation(method: HTTPMethods, uriIn: String): js.Promise[ExtendedResponse] = js.native
    def webOperation(method: HTTPMethods, uriIn: String, options: Options): js.Promise[ExtendedResponse] = js.native
    def webOperation(method: HTTPMethods, uriIn: NamedNode): js.Promise[ExtendedResponse] = js.native
    def webOperation(method: HTTPMethods, uriIn: NamedNode, options: Options): js.Promise[ExtendedResponse] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.rdflibStrings.GET
    - typings.rdflib.rdflibStrings.PUT
    - typings.rdflib.rdflibStrings.POST
    - typings.rdflib.rdflibStrings.PATCH
    - typings.rdflib.rdflibStrings.HEAD
    - typings.rdflib.rdflibStrings.DELETE
    - typings.rdflib.rdflibStrings.CONNECT
    - typings.rdflib.rdflibStrings.TRACE
    - typings.rdflib.rdflibStrings.OPTIONS
  */
  trait HTTPMethods extends StObject
  object HTTPMethods {
    
    inline def CONNECT: typings.rdflib.rdflibStrings.CONNECT = "CONNECT".asInstanceOf[typings.rdflib.rdflibStrings.CONNECT]
    
    inline def DELETE: typings.rdflib.rdflibStrings.DELETE = "DELETE".asInstanceOf[typings.rdflib.rdflibStrings.DELETE]
    
    inline def GET: typings.rdflib.rdflibStrings.GET = "GET".asInstanceOf[typings.rdflib.rdflibStrings.GET]
    
    inline def HEAD: typings.rdflib.rdflibStrings.HEAD = "HEAD".asInstanceOf[typings.rdflib.rdflibStrings.HEAD]
    
    inline def OPTIONS: typings.rdflib.rdflibStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.rdflib.rdflibStrings.OPTIONS]
    
    inline def PATCH: typings.rdflib.rdflibStrings.PATCH = "PATCH".asInstanceOf[typings.rdflib.rdflibStrings.PATCH]
    
    inline def POST: typings.rdflib.rdflibStrings.POST = "POST".asInstanceOf[typings.rdflib.rdflibStrings.POST]
    
    inline def PUT: typings.rdflib.rdflibStrings.PUT = "PUT".asInstanceOf[typings.rdflib.rdflibStrings.PUT]
    
    inline def TRACE: typings.rdflib.rdflibStrings.TRACE = "TRACE".asInstanceOf[typings.rdflib.rdflibStrings.TRACE]
  }
  
  trait Handler extends StObject {
    
    var dom: Document
    
    var response: ExtendedResponse
  }
  object Handler {
    
    inline def apply(dom: Document, response: ExtendedResponse): Handler = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handler]
    }
    
    extension [Self <: Handler](x: Self) {
      
      inline def setDom(value: Document): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: ExtendedResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type MediatypesMap = StringDictionary[Q]
  
  /* Inlined std.Partial<rdflib.rdflib/lib/fetcher.AutoInitOptions> */
  trait Options extends StObject {
    
    var actualProxyURI: js.UndefOr[String] = js.undefined
    
    var baseURI: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    var clearPreviousData: js.UndefOr[Boolean] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var credentials: js.UndefOr[include | omit] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var fetch: js.UndefOr[Fetch] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var forceContentType: js.UndefOr[ContentType] = js.undefined
    
    var handlers: js.UndefOr[js.Array[Handler]] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[HTTPMethods] = js.undefined
    
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    var noMeta: js.UndefOr[Boolean] = js.undefined
    
    var noRDFa: js.UndefOr[Boolean] = js.undefined
    
    var original: js.UndefOr[NamedNode] = js.undefined
    
    var proxyUsed: js.UndefOr[Boolean] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    var referringTerm: js.UndefOr[NamedNode] = js.undefined
    
    var req: js.UndefOr[BlankNode] = js.undefined
    
    var requestedURI: js.UndefOr[String] = js.undefined
    
    var resource: js.UndefOr[QuadSubject] = js.undefined
    
    var retriedWithNoCredentials: js.UndefOr[Boolean] = js.undefined
    
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var window: js.UndefOr[Null] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setActualProxyURI(value: String): Self = StObject.set(x, "actualProxyURI", value.asInstanceOf[js.Any])
      
      inline def setActualProxyURIUndefined: Self = StObject.set(x, "actualProxyURI", js.undefined)
      
      inline def setBaseURI(value: String): Self = StObject.set(x, "baseURI", value.asInstanceOf[js.Any])
      
      inline def setBaseURIUndefined: Self = StObject.set(x, "baseURI", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setClearPreviousData(value: Boolean): Self = StObject.set(x, "clearPreviousData", value.asInstanceOf[js.Any])
      
      inline def setClearPreviousDataUndefined: Self = StObject.set(x, "clearPreviousData", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCredentials(value: include | omit): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFetch(
        value: (/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit]) => js.Promise[ExtendedResponse]
      ): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceContentType(value: ContentType): Self = StObject.set(x, "forceContentType", value.asInstanceOf[js.Any])
      
      inline def setForceContentTypeUndefined: Self = StObject.set(x, "forceContentType", js.undefined)
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setHandlers(value: js.Array[Handler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setHandlersVarargs(value: Handler*): Self = StObject.set(x, "handlers", js.Array(value*))
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: HTTPMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNoMeta(value: Boolean): Self = StObject.set(x, "noMeta", value.asInstanceOf[js.Any])
      
      inline def setNoMetaUndefined: Self = StObject.set(x, "noMeta", js.undefined)
      
      inline def setNoRDFa(value: Boolean): Self = StObject.set(x, "noRDFa", value.asInstanceOf[js.Any])
      
      inline def setNoRDFaUndefined: Self = StObject.set(x, "noRDFa", js.undefined)
      
      inline def setOriginal(value: NamedNode): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
      
      inline def setProxyUsed(value: Boolean): Self = StObject.set(x, "proxyUsed", value.asInstanceOf[js.Any])
      
      inline def setProxyUsedUndefined: Self = StObject.set(x, "proxyUsed", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setReferringTerm(value: NamedNode): Self = StObject.set(x, "referringTerm", value.asInstanceOf[js.Any])
      
      inline def setReferringTermUndefined: Self = StObject.set(x, "referringTerm", js.undefined)
      
      inline def setReq(value: BlankNode): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
      
      inline def setRequestedURI(value: String): Self = StObject.set(x, "requestedURI", value.asInstanceOf[js.Any])
      
      inline def setRequestedURIUndefined: Self = StObject.set(x, "requestedURI", js.undefined)
      
      inline def setResource(value: QuadSubject): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setRetriedWithNoCredentials(value: Boolean): Self = StObject.set(x, "retriedWithNoCredentials", value.asInstanceOf[js.Any])
      
      inline def setRetriedWithNoCredentialsUndefined: Self = StObject.set(x, "retriedWithNoCredentials", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  type RequestedMap = StringDictionary[StatusValues]
  
  type Result = Response
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typings.rdflib.rdflibBooleans.`true`
    - typings.rdflib.rdflibStrings.done
    - typings.rdflib.rdflibNumbers.`401`
    - typings.rdflib.rdflibNumbers.`403`
    - typings.rdflib.rdflibNumbers.`404`
    - typings.rdflib.rdflibStrings.redirected
    - typings.rdflib.rdflibStrings.failed
    - typings.rdflib.rdflibStrings.parse_error
    - typings.rdflib.rdflibStrings.unsupported_protocol
    - typings.rdflib.rdflibStrings.timeout
    - / ** Any other HTTP status code * /
  scala.Double
  */
  type StatusValues = js.UndefOr[_StatusValues | (/** Any other HTTP status code */
  Double)]
  
  type TimeOutsMap = StringDictionary[js.Array[Double]]
  
  type UserCallback = js.Function3[/* ok */ Boolean, /* message */ String, /* response */ js.UndefOr[Any], Unit]
  
  trait _StatusValues extends StObject
}
