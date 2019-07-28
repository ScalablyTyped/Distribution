package typings.requestDashAsDashCurl

import typings.request.requestMod.CoreOptions
import typings.request.requestMod.Request
import typings.request.requestMod.RequestAPI
import typings.request.requestMod.RequiredUriUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("request-as-curl", JSImport.Namespace)
@js.native
object requestDashAsDashCurlMod extends js.Object {
  def apply(request: RequestAPI[Request, CoreOptions, RequiredUriUrl]): String = js.native
  def apply(request: RequestAPI[Request, CoreOptions, RequiredUriUrl], body: js.Any): String = js.native
  def serialize(request: RequestAPI[Request, CoreOptions, RequiredUriUrl]): String = js.native
}

