package typings.pulumiCloud

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.pulumiCloud.serviceMod.Endpoint
import typings.pulumiPulumi.outputMod.Output_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("@pulumi/cloud/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait API extends StObject {
    
    /**
      * Routes all HTTP methods on the given path to the provided handler(s).
      * @param path The path to handle requests on.
      * @param handlers One or more handlers to apply to requests.
      */
    def all(path: String, handlers: RouteHandler*): Unit = js.native
    
    /**
      * Attach a custom domain to this API.
      *
      * Provide a domain name you own, along with SSL certificates from a
      * certificate authority (e.g. LetsEncrypt).
      *
      * Must be called prior to [publish]ing the API.
      *
      * _Note_: It is strongly encouraged to store certificates in config
      * variables and not in source code.
      */
    def attachCustomDomain(domain: Domain): Unit = js.native
    
    /**
      * Routes DELETE requests on the given path to the provided handler(s).
      * @param path The path to handle requests on.
      * @param handlers One or more handlers to apply to requests.
      */
    def delete(path: String, handlers: RouteHandler*): Unit = js.native
    
    /**
      * Routes GET requests on the given path to the provided handler(s).
      * @param path The path to handle requests on.
      * @param handlers One or more handlers to apply to requests.
      */
    def get(path: String, handlers: RouteHandler*): Unit = js.native
    
    /**
      * Routes OPTIONS requests on the given path to the provided handler(s).
      * @param path The path to handle requests on.
      * @param handlers One or more handlers to apply to requests.
      */
    def options(path: String, handlers: RouteHandler*): Unit = js.native
    
    /**
      * Routes POST requests on the given path to the provided handler(s).
      * @param path The path to handle requests on.
      * @param handlers One or more handlers to apply to requests.
      */
    def post(path: String, handlers: RouteHandler*): Unit = js.native
    
    /**
      * proxy forwards an HTTP request to a target URL or Endpoint.
      *
      * @param path The route path at which to serve the file.
      * @param target The target URL or Endpoint to proxy to. If a string is provided, it must be an Internet reachable
      *               URL.  If an Endpoint is provided, it can be any endpoint exposed by the stack, including endpoints
      *               which are not exposed directly to the Internet.
      */
    def proxy(path: String, target: String): Unit = js.native
    def proxy(path: String, target: Output_[Endpoint]): Unit = js.native
    
    /**
      * Publishes an API to be internet accessible.
      *
      * This should be called after describing desired routes and domains.
      * Throws an error if called multiple times on the same endpoint.
      *
      * @returns An HttpDeployment object representing the live API.
      */
    def publish(): HttpDeployment = js.native
    
    /**
      * Routes PUT requests on the given path to the provided handler(s).
      * @param path The path to handle requests on.
      * @param handlers One or more handlers to apply to requests.
      */
    def put(path: String, handlers: RouteHandler*): Unit = js.native
    
    /**
      * Routes any requests with given HTTP method on the given path to the
      * provided handler(s).
      * @param method The HTTP method to handle.
      * @param path The path to handle requests on.
      * @param handlers One or more handlers to apply to requests.
      */
    def route(method: String, path: String, handlers: RouteHandler*): Unit = js.native
    
    /**
      * static serves a file or directory from within the source folder at the requested path.
      *
      * @param path The route path at which to serve the file.
      * @param localPath The local path.  If not absolute, it is considered relative to the Pulumi
      *                  program folder.
      * @param options Optional options that can be provided to customize the serving behavior.
      */
    def static(path: String, localPath: String): Unit = js.native
    def static(path: String, localPath: String, options: ServeStaticOptions): Unit = js.native
  }
  @JSImport("@pulumi/cloud/api", "API")
  @js.native
  def API: APIConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud/api", "API")
  @js.native
  class APICls protected ()
    extends StObject
       with API {
    def this(apiName: String) = this()
  }
  
  inline def API_=(x: APIConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("API")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud/api", "HttpEndpoint")
  @js.native
  def HttpEndpoint: APIConstructor = js.native
  type HttpEndpoint = API
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud/api", "HttpEndpoint")
  @js.native
  class HttpEndpointCls protected ()
    extends StObject
       with API {
    def this(apiName: String) = this()
  }
  
  inline def HttpEndpoint_=(x: APIConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpEndpoint")(x.asInstanceOf[js.Any])
  
  @js.native
  trait APIConstructor
    extends StObject
       with Instantiable1[/* apiName */ String, API]
  
  trait Domain extends StObject {
    
    /**
      * An SSL/TLS certficicate issued for this domain (`cert.pem`).
      */
    var certificateBody: String
    
    /**
      * The certificate chain for the SSL/TLS certificate provided for this
      * domain (`chain.pem`).
      */
    var certificateChain: String
    
    /**
      * An SSL/TLS private key issued for thie domain (`privkey.pem`).
      */
    var certificatePrivateKey: String
    
    /**
      * The domain name to associate with the API.
      */
    var domainName: String
  }
  object Domain {
    
    inline def apply(
      certificateBody: String,
      certificateChain: String,
      certificatePrivateKey: String,
      domainName: String
    ): Domain = {
      val __obj = js.Dynamic.literal(certificateBody = certificateBody.asInstanceOf[js.Any], certificateChain = certificateChain.asInstanceOf[js.Any], certificatePrivateKey = certificatePrivateKey.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    extension [Self <: Domain](x: Self) {
      
      inline def setCertificateBody(value: String): Self = StObject.set(x, "certificateBody", value.asInstanceOf[js.Any])
      
      inline def setCertificateChain(value: String): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
      
      inline def setCertificatePrivateKey(value: String): Self = StObject.set(x, "certificatePrivateKey", value.asInstanceOf[js.Any])
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpDeployment extends StObject {
    
    /**
      * An optional list of custom domain names, each corresponding to a
      * previous call to attachCustomDomain on the API.  Each name
      * should be mapped using a DNS A record.
      */
    var customDomainNames: js.Array[Output_[String]]
    
    /**
      * The URL at which the HttpDeployment is available to the Internet.
      */
    var url: Output_[String]
  }
  object HttpDeployment {
    
    inline def apply(customDomainNames: js.Array[Output_[String]], url: Output_[String]): HttpDeployment = {
      val __obj = js.Dynamic.literal(customDomainNames = customDomainNames.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpDeployment]
    }
    
    extension [Self <: HttpDeployment](x: Self) {
      
      inline def setCustomDomainNames(value: js.Array[Output_[String]]): Self = StObject.set(x, "customDomainNames", value.asInstanceOf[js.Any])
      
      inline def setCustomDomainNamesVarargs(value: Output_[String]*): Self = StObject.set(x, "customDomainNames", js.Array(value :_*))
      
      inline def setUrl(value: Output_[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    /**
      * The base url on which this http request was served.
      */
    var baseUrl: String
    
    /**
      * The body of the HTTP request.
      */
    var body: Buffer
    
    /**
      * The headers of the HTTP request.
      */
    var headers: StringDictionary[String | js.Array[String]]
    
    /**
      * The hostname of the request.
      */
    var hostname: String
    
    /**
      * The method of the HTTP request.
      */
    var method: String
    
    /**
      * The path parameters of the HTTP request. Each `{param}` in the matched
      * route is available as a property of this oject.
      */
    var params: StringDictionary[String]
    
    /**
      * The raw path from the HTTP request.
      */
    var path: String
    
    /**
      * The protocol of the request (e.g. HTTP/HTTPS).
      */
    var protocol: String
    
    /**
      * The query parameters parsed from the query string of the request URL.
      */
    var query: StringDictionary[String | js.Array[String]]
    
    /**
      * The headers of the HTTP request.
      */
    var rawHeaders: js.Array[String]
  }
  object Request {
    
    inline def apply(
      baseUrl: String,
      body: Buffer,
      headers: StringDictionary[String | js.Array[String]],
      hostname: String,
      method: String,
      params: StringDictionary[String],
      path: String,
      protocol: String,
      query: StringDictionary[String | js.Array[String]],
      rawHeaders: js.Array[String]
    ): Request = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], rawHeaders = rawHeaders.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRawHeaders(value: js.Array[String]): Self = StObject.set(x, "rawHeaders", value.asInstanceOf[js.Any])
      
      inline def setRawHeadersVarargs(value: String*): Self = StObject.set(x, "rawHeaders", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    /**
      * Sends the HTTP response, optionally including data to write to the HTTP
      * response body.
      */
    def end(): Unit = js.native
    def end(data: String): Unit = js.native
    def end(data: String, encoding: String): Unit = js.native
    def end(data: Unit, encoding: String): Unit = js.native
    def end(data: Buffer): Unit = js.native
    def end(data: Buffer, encoding: String): Unit = js.native
    
    /**
      * Gets the Headers for the Response
      */
    def getHeader(name: String): String = js.native
    
    /**
      * JSON serializes an object, writes it to the HTTP response body, and sends
      * the HTTP response.
      */
    def json(obj: js.Any): Unit = js.native
    
    /**
      * Object containing local variables scoped to a single request. Useful for
      * exposing request-level information such as user settings.
      */
    var locals: js.Any = js.native
    
    def redirect(status: Double, url: String): Unit = js.native
    /**
      * Mark the response to redirect the client to the provided URL with
      * the optional status code, defaulting to 302.
      */
    def redirect(url: String): Unit = js.native
    
    /**
      * Sets a header on the HTTP response and returns the `Response` for
      * chaining operations.
      */
    def setHeader(name: String, value: String): Response = js.native
    
    /**
      * Sets the HTTP response status code and returns a `Response` for chaining
      * operations.
      */
    def status(code: Double): Response = js.native
    
    /**
      * Writes a string to the HTTP response body and returns the `Response` for
      * chaining operations.
      */
    def write(data: String): Response = js.native
    def write(data: String, encoding: String): Response = js.native
    def write(data: Buffer): Response = js.native
    def write(data: Buffer, encoding: String): Response = js.native
  }
  
  type RouteHandler = js.Function3[/* req */ Request, /* res */ Response, /* next */ js.Function0[Unit], Unit]
  
  trait ServeStaticOptions extends StObject {
    
    /**
      * The `content-type` to serve the file as.  Only valid when localPath points to a file.  If
      * localPath points to a directory, the content types for all files will be inferred.
      */
    var contentType: js.UndefOr[String] = js.undefined
    
    /**
      * By default API.static will also serve 'index.html' in response to a request on a
      * directory. To disable this set false or to supply a new index pass a string.
      */
    var index: js.UndefOr[Boolean | String] = js.undefined
  }
  object ServeStaticOptions {
    
    inline def apply(): ServeStaticOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServeStaticOptions]
    }
    
    extension [Self <: ServeStaticOptions](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setIndex(value: Boolean | String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
}
