package typings.roads

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreRoadMod {
  
  @JSImport("roads/types/core/road", JSImport.Default)
  @js.native
  /**
    * Road Constructor
    *
    * Creates a new Road object
    */
  open class default ()
    extends StObject
       with Road
  
  type Context = Record[String, Any]
  
  type IncomingHeaders = Record[String, js.UndefOr[String | js.Array[String]]]
  
  type Middleware[MiddlewareContext /* <: Context */] = js.ThisFunction5[
    /* this */ MiddlewareContext, 
    /* method */ String, 
    /* path */ String, 
    /* body */ js.UndefOr[String], 
    /* headers */ js.UndefOr[IncomingHeaders], 
    /* next */ NextCallback, 
    (js.Promise[typings.roads.typesCoreResponseMod.default | String]) | typings.roads.typesCoreResponseMod.default | String
  ]
  
  type NextCallback = js.Function0[js.Promise[typings.roads.typesCoreResponseMod.default | String]]
  
  @js.native
  trait Road extends StObject {
    
    /**
      * Turn an HTTP request into an executable function with a useful request context. Will also incorporate the entire
      * request handler chain
      *
      * @param {Context} context - Request context
      * @param {string} request_method - HTTP request method
      * @param {string} path - HTTP request path
      * @param {string} request_body - HTTP request body
      * @param {object} request_headers - HTTP request headers
      * @returns {NextMiddleware} A function that will start (or continue) the request chain
      */
    /* protected */ def _buildNext(context: Context, request_method: String, path: String): NextCallback = js.native
    /* protected */ def _buildNext(context: Context, request_method: String, path: String, request_body: String): NextCallback = js.native
    /* protected */ def _buildNext(
      context: Context,
      request_method: String,
      path: String,
      request_body: String,
      request_headers: IncomingHeaders
    ): NextCallback = js.native
    /* protected */ def _buildNext(
      context: Context,
      request_method: String,
      path: String,
      request_body: Unit,
      request_headers: IncomingHeaders
    ): NextCallback = js.native
    
    /* protected */ var _request_chain: js.Array[Middleware[Context]] = js.native
    
    /**
      *
      * Execute the resource method associated with the request parameters.
      *
      * This function will execute the *request chain* in the order they were assigned via
      * 	[use](#roadusefunction-fn) and return a Promise that resolves to a [Response](#response)
      *
      * Make sure to catch any errors in the promise!
      *
      * @param {string} method - HTTP request method
      * @param {string} url - HTTP request url
      * @param {string} [body] - HTTP request body
      * @param {object} [headers] - HTTP request headers
      * @returns {Promise} this promise will resolve to a Response object
      */
    def request(method: String, url: String): js.Promise[typings.roads.typesCoreResponseMod.default] = js.native
    def request(method: String, url: String, body: String): js.Promise[typings.roads.typesCoreResponseMod.default] = js.native
    def request(method: String, url: String, body: String, headers: IncomingHeaders): js.Promise[typings.roads.typesCoreResponseMod.default] = js.native
    def request(method: String, url: String, body: Unit, headers: IncomingHeaders): js.Promise[typings.roads.typesCoreResponseMod.default] = js.native
    
    /**
      * The use function can be called one or more times. Each time it is called, the function provided via the `fn` parameter will be added to the end of the *request chain* which is executed when you call `request`.
      *
      *  | name | type                                                                                           | required | description                                                                                                                                                     |
      *  | ---- | ---------------------------------------------------------------------------------------------- | -------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- |
      *  | fn   | Function(method: *string*, url: *string*, body: *string*, headers: *object*, next: *function*) | yes      | This is the function that will be added to the end of the *request chain*. See the [Middleware](#middleware) below for more details on the function parameters. |
      *
      * *Middleware*
      * Each function in the request chain is called middleware. Each middleware function must match the following function signature.
      *
      * **function (method: *string*, url: *string*, body: *string*, headers: *object*, next: *next*): Promise<Response | string>**
      *
      * Parameters
      * | name    | type                         | description                                                                                      |
      * | ------- | ---------------------------- | ------------------------------------------------------------------------------------------------ |
      * | method  | string                       | The request's HTTP method                                                                        |
      * | url     | string                       | The request's URL. The `SimpleRouter` is included to help run different code for different URLs. |
      * | body    | string                       | The request's body (as a string). To parse this check out the `parseBodyMiddleware`              |
      * | headers | object                       | The request's headers. This is an object of strings or arrays of strings.                        |
      * | next    | function(): Promise<Response | String>                                                                                          | The next step of the *request chain*. If there are no more steps in the *request chain* this does nothing. This method will always return a promise, which resolves to a `Response` object, or a string. |
      *
      * Each middleware function must return a promise that resolves to a [Response](#response) object or a string. If you return a string it will be transformed into a response object using the default status code (200) and no headers.
      *
      * *See the readme for more information*
      *
      * @param {Function} fn - A callback (function or async function) that will be executed every time a request is made.
      * @returns {Road} this road object. Useful for chaining use statements.
      */
    def use[ContextType /* <: Context */](fn: Middleware[ContextType]): Road = js.native
  }
}
