package typings.refreshFetch

import typings.std.Request
import typings.std.RequestInit
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("refresh-fetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def configureRefreshFetch[T](configuration: AnonFetch[T]): T = js.native
  def fetchJSON[ResponseBody](url: String): js.Promise[AnonBody[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: String, options: RequestInit): js.Promise[AnonBody[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: Request): js.Promise[AnonBody[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: Request, options: RequestInit): js.Promise[AnonBody[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: URL): js.Promise[AnonBody[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: URL, options: RequestInit): js.Promise[AnonBody[ResponseBody]] = js.native
}

