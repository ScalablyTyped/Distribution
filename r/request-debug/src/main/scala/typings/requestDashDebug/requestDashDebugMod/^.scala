package typings.requestDashDebug.requestDashDebugMod

import typings.request.requestMod.CoreOptions
import typings.request.requestMod.Request
import typings.request.requestMod.RequestAPI
import typings.request.requestMod.RequiredUriUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("request-debug", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val log: LogCallback[Request, CoreOptions, RequiredUriUrl] = js.native
  def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](request: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](
    request: RequestAPI[TRequest, TOptions, TUriUrlOptions],
    cb: LogCallback[TRequest, TOptions, TUriUrlOptions]
  ): Unit = js.native
}

