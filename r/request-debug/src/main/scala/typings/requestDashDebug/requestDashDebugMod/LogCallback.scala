package typings.requestDashDebug.requestDashDebugMod

import typings.request.requestMod.CoreOptions
import typings.request.requestMod.Request
import typings.request.requestMod.RequestAPI
import typings.request.requestMod.RequiredUriUrl
import typings.requestDashDebug.requestDashDebugStrings.auth
import typings.requestDashDebug.requestDashDebugStrings.redirect
import typings.requestDashDebug.requestDashDebugStrings.request
import typings.requestDashDebug.requestDashDebugStrings.response
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

