package typings.sparqlDashHttpDashClient

import typings.nodeDashFetch.nodeDashFetchMod.RequestInfo
import typings.nodeDashFetch.nodeDashFetchMod.RequestInit
import typings.nodeDashFetch.nodeDashFetchMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoffetch extends js.Object {
  def apply(url: RequestInfo): js.Promise[Response] = js.native
  def apply(url: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  def isRedirect(code: Double): Boolean = js.native
}

