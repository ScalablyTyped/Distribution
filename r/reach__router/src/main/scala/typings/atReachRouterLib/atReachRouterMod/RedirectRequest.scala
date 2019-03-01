package typings
package atReachRouterLib.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectRequest extends js.Object {
  var uri: java.lang.String
}

object RedirectRequest {
  @scala.inline
  def apply(uri: java.lang.String): RedirectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[RedirectRequest]
  }
}

