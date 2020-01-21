package typings.requestDebug.mod

import typings.request.mod.CoreOptions
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequiredUriUrl
import typings.requestDebug.requestDebugStrings.auth
import typings.requestDebug.requestDebugStrings.redirect
import typings.requestDebug.requestDebugStrings.request
import typings.requestDebug.requestDebugStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogCallback[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */] extends js.Object {
  def apply(`type`: LogPhase, data: LogData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: auth, data: RedirectData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: redirect, data: RedirectData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: request, data: RequestData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: response, data: ResponseData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
}

