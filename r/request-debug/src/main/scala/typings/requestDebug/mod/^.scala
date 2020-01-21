package typings.requestDebug.mod

import typings.request.mod.CoreOptions
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequiredUriUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("request-debug", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](request: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](
    request: RequestAPI[TRequest, TOptions, TUriUrlOptions],
    cb: LogCallback[TRequest, TOptions, TUriUrlOptions]
  ): Unit = js.native
}

