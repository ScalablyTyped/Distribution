package typings
package restLib.restMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsePromise
  extends whenLib.WhenNs.Promise[Response] {
  def entity(): whenLib.WhenNs.Promise[_] = js.native
  def header(headerName: java.lang.String): whenLib.WhenNs.Promise[_] = js.native
  def headers(): whenLib.WhenNs.Promise[Headers] = js.native
  def status(): whenLib.WhenNs.Promise[scala.Double] = js.native
}

