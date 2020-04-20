package typings.reactInlinesvg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheRequests extends js.Object {
  var cacheRequests: Boolean
  var uniquifyIDs: Boolean
}

object AnonCacheRequests {
  @scala.inline
  def apply(cacheRequests: Boolean, uniquifyIDs: Boolean): AnonCacheRequests = {
    val __obj = js.Dynamic.literal(cacheRequests = cacheRequests.asInstanceOf[js.Any], uniquifyIDs = uniquifyIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCacheRequests]
  }
}

