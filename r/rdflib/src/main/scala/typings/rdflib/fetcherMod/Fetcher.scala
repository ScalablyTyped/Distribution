package typings.rdflib.fetcherMod

import org.scalablytyped.runtime.StringDictionary
import typings.rdflib.anon.TypeofHandler
import typings.rdflib.anon.reqBlankNodeoriginalQuadS
import typings.rdflib.anon.reqBlankNoderesourceQuadS
import typings.rdflib.anon.reqQuadSubjectoriginalQua
import typings.rdflib.rdflibStrings.textSlashturtle
import typings.rdflib.tfTypesMod.BlankNode
import typings.rdflib.tfTypesMod.NamedNode
import typings.rdflib.tfTypesMod.QuadGraph
import typings.rdflib.tfTypesMod.QuadPredicate
import typings.rdflib.tfTypesMod.QuadSubject
import typings.rdflib.typesMod.ContentType
import typings.std.Error
import typings.std.Headers
import typings.std.Record
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fetcher extends CallbackifyInterface {
  @JSName("_fetch")
  var _fetch_Original: Fetch = js.native
  /** Denoting this session */
  var appNode: BlankNode = js.native
  /** fetchCallbacks[uri].push(callback) */
  var fetchCallbacks: FetchCallbacks = js.native
  var fetchQueue: FetchQueue = js.native
  var handlers: js.Array[TypeofHandler] = js.native
  var lookedUp: BooleanMap = js.native
  var mediatypes: MediatypesMap = js.native
  /** Keep track of explicit 404s -> we can overwrite etc */
  var nonexistent: BooleanMap = js.native
  var ns: StringDictionary[js.Function1[/* ln */ String, QuadPredicate]] = js.native
  /** Redirected from *key uri* to *value uri* */
  var redirectedTo: Record[String, String] = js.native
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
  var store: typings.rdflib.storeMod.default = js.native
  var timeout: Double = js.native
  /** List of timeouts associated with a requested URL */
  var timeouts: TimeOutsMap = js.native
  def _fetch(input: RequestInfo): js.Promise[ExtendedResponse] = js.native
  def _fetch(input: RequestInfo, init: RequestInit): js.Promise[ExtendedResponse] = js.native
  def acceptString(): String = js.native
  def addFetchCallback(uri: String, callback: UserCallback): Unit = js.native
  def addHandler(handler: TypeofHandler): Unit = js.native
  /**
    * Records a status message (as a literal node) by appending it to the
    * request's metadata status collection.
    *
    */
  def addStatus(req: BlankNode, statusMessage: String): Unit = js.native
  def addType(rdfType: NamedNode, req: QuadSubject, kb: typings.rdflib.storeMod.default, locURI: String): Unit = js.native
  /**
    * @param _options - DEPRECATED
    */
  def cleanupFetchRequest(originalUri: String, _options: js.Any, timeout: Double): Unit = js.native
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
  def createIfNotExists(doc: typings.rdflib.namedNodeMod.default, contentType: js.UndefOr[scala.Nothing], data: String): js.Promise[ExtendedResponse] = js.native
  @JSName("createIfNotExists")
  def createIfNotExists_textturtle(doc: typings.rdflib.namedNodeMod.default, contentType: textSlashturtle): js.Promise[ExtendedResponse] = js.native
  @JSName("createIfNotExists")
  def createIfNotExists_textturtle(doc: typings.rdflib.namedNodeMod.default, contentType: textSlashturtle, data: String): js.Promise[ExtendedResponse] = js.native
  def defaultFetch(): js.Any = js.native
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
  def getState(docuri: String): js.Any = js.native
  def guessContentType(uri: String): js.UndefOr[ContentType] = js.native
  /**
    * Called when there's a network error in fetch(), or a response
    * with status of 0.
    */
  def handleError(response: ExtendedResponse, docuri: String, options: AutoInitOptions): js.Promise[ExtendedResponse | FetchError] = js.native
  def handleError(response: Error, docuri: String, options: AutoInitOptions): js.Promise[ExtendedResponse | FetchError] = js.native
  /**
    * Handle fetch() response
    */
  def handleResponse(response: ExtendedResponse, docuri: String, options: AutoInitOptions): (js.Promise[FetchError | ExtendedResponse]) | ExtendedResponse = js.native
  def handlerForContentType(contentType: String, response: ExtendedResponse): Handler | Null = js.native
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
  def nowOrWhenFetched(
    uriIn: String,
    p2: js.UndefOr[scala.Nothing],
    userCallback: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def nowOrWhenFetched(uriIn: String, p2: js.UndefOr[scala.Nothing], userCallback: UserCallback): Unit = js.native
  def nowOrWhenFetched(uriIn: String, p2: js.UndefOr[scala.Nothing], userCallback: UserCallback, options: Options): Unit = js.native
  def nowOrWhenFetched(uriIn: String, p2: Options): Unit = js.native
  def nowOrWhenFetched(uriIn: String, p2: Options, userCallback: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def nowOrWhenFetched(uriIn: String, p2: Options, userCallback: UserCallback): Unit = js.native
  def nowOrWhenFetched(uriIn: String, p2: Options, userCallback: UserCallback, options: Options): Unit = js.native
  def nowOrWhenFetched(uriIn: String, p2: UserCallback): Unit = js.native
  def nowOrWhenFetched(uriIn: String, p2: UserCallback, userCallback: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def nowOrWhenFetched(uriIn: String, p2: UserCallback, userCallback: UserCallback): Unit = js.native
  def nowOrWhenFetched(uriIn: String, p2: UserCallback, userCallback: UserCallback, options: Options): Unit = js.native
  def nowOrWhenFetched(uriIn: NamedNode): Unit = js.native
  def nowOrWhenFetched(
    uriIn: NamedNode,
    p2: js.UndefOr[scala.Nothing],
    userCallback: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def nowOrWhenFetched(uriIn: NamedNode, p2: js.UndefOr[scala.Nothing], userCallback: UserCallback): Unit = js.native
  def nowOrWhenFetched(uriIn: NamedNode, p2: js.UndefOr[scala.Nothing], userCallback: UserCallback, options: Options): Unit = js.native
  def nowOrWhenFetched(uriIn: NamedNode, p2: Options): Unit = js.native
  def nowOrWhenFetched(uriIn: NamedNode, p2: Options, userCallback: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def nowOrWhenFetched(uriIn: NamedNode, p2: Options, userCallback: UserCallback): Unit = js.native
  def nowOrWhenFetched(uriIn: NamedNode, p2: Options, userCallback: UserCallback, options: Options): Unit = js.native
  def nowOrWhenFetched(uriIn: NamedNode, p2: UserCallback): Unit = js.native
  def nowOrWhenFetched(uriIn: NamedNode, p2: UserCallback, userCallback: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def nowOrWhenFetched(uriIn: NamedNode, p2: UserCallback, userCallback: UserCallback): Unit = js.native
  def nowOrWhenFetched(uriIn: NamedNode, p2: UserCallback, userCallback: UserCallback, options: Options): Unit = js.native
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
  def refresh(term: NamedNode): Unit = js.native
  def refresh(term: NamedNode, userCallback: UserCallback): Unit = js.native
  def refreshIfExpired(term: NamedNode, userCallback: UserCallback): Unit = js.native
  def retract(term: QuadGraph): Unit = js.native
  def retryNoCredentials(docuri: String, options: js.Any): js.Promise[Result] = js.native
  def saveErrorResponse(response: ExtendedResponse, responseNode: QuadSubject): js.Promise[Unit] = js.native
  def saveRequestMetadata(docuri: String, options: AutoInitOptions): Unit = js.native
  def saveResponseMetadata(response: Response, options: reqBlankNoderesourceQuadS): BlankNode = js.native
  def setRequestTimeout(uri: String, options: reqQuadSubjectoriginalQua): js.Promise[Double | FetchError] = js.native
  def unload(term: NamedNode): Unit = js.native
  def webCopy(here: String, there: String, contentType: js.Any): js.Promise[ExtendedResponse] = js.native
  /**
    * A generic web opeation, at the fetch() level.
    * does not invole the quadstore.
    *
    *  Returns promise of Response
    *  If data is returned, copies it to response.responseText before returning
    */
  def webOperation(method: HTTPMethods, uriIn: String): js.Promise[ExtendedResponse] = js.native
  def webOperation(method: HTTPMethods, uriIn: String, options: Options): js.Promise[ExtendedResponse] = js.native
  def webOperation(method: HTTPMethods, uriIn: NamedNode): js.Promise[ExtendedResponse] = js.native
  def webOperation(method: HTTPMethods, uriIn: NamedNode, options: Options): js.Promise[ExtendedResponse] = js.native
}

