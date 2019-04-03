package typings
package reactDashRequestLib.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderProps[T] extends FetchResponse[T] {
  @JSName("doFetch")
  var doFetch_Original: DoFetch[T] = js.native
  var fetching: scala.Boolean = js.native
  var requestName: java.lang.String = js.native
  def doFetch(): js.Promise[FetchResponse[T]] = js.native
  def doFetch(options: DoFetchOptions): js.Promise[FetchResponse[T]] = js.native
}

