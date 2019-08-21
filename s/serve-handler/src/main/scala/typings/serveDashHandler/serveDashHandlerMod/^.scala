package typings.serveDashHandler.serveDashHandlerMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serve-handler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * This package represents the core of `serve`. It can be plugged into any HTTP
    * server and is responsible for routing requests and handling responses.
    *
    * In order to customize the default behaviour, you can also pass custom routing
    * rules, provide your own methods for interacting with the file system and much
    * more.
    */
  def apply(): js.Promise[Unit] = js.native
  def apply(request: IncomingMessage): js.Promise[Unit] = js.native
  def apply(request: IncomingMessage, response: ServerResponse): js.Promise[Unit] = js.native
  def apply(
    request: IncomingMessage,
    response: ServerResponse,
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Config
  ): js.Promise[Unit] = js.native
  def apply(
    request: IncomingMessage,
    response: ServerResponse,
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Config,
    /**
    * If you want to replace the methods the package is using for interacting
    * with the file system and sending responses, you can pass them as the
    * fourth argument to the function call. These are the methods used by the
    * package (they can all return a `Promise` or be asynchronous).
    *
    * **NOTE:** It's important that – for native methods like
    * `createReadStream` – all arguments are passed on to the native call.
    */
  methods: Methods
  ): js.Promise[Unit] = js.native
}

