package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationUriActionPayload extends js.Object {
  var uri: java.lang.String
}

object NavigationUriActionPayload {
  @scala.inline
  def apply(uri: java.lang.String): NavigationUriActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[NavigationUriActionPayload]
  }
}

