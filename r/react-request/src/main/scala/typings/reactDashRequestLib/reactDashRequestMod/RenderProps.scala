package typings
package reactDashRequestLib.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderProps[T] extends js.Object {
  var data: T | scala.Null = js.native
  var error: stdLib.Error | scala.Null = js.native
  var failed: scala.Boolean = js.native
  var fetching: scala.Boolean = js.native
  var requestKey: java.lang.String = js.native
  var requestName: java.lang.String = js.native
  var response: stdLib.Response | scala.Null = js.native
  var url: java.lang.String = js.native
  def doFetch(): js.Promise[scala.Unit] = js.native
  def doFetch(options: FetchRequestProps): js.Promise[scala.Unit] = js.native
}

