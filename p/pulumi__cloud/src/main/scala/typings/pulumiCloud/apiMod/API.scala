package typings.pulumiCloud.apiMod

import org.scalablytyped.runtime.TopLevel
import typings.pulumiCloud.serviceMod.Endpoint
import typings.pulumiPulumi.outputMod.Output_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait API extends js.Object {
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
object API extends TopLevel[APIConstructor]

