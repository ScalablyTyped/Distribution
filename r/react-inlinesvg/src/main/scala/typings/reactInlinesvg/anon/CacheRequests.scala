package typings.reactInlinesvg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheRequests extends js.Object {
  var cacheRequests: Boolean
  var uniquifyIDs: Boolean
}

object CacheRequests {
  @scala.inline
  def apply(cacheRequests: Boolean, uniquifyIDs: Boolean): CacheRequests = {
    val __obj = js.Dynamic.literal(cacheRequests = cacheRequests.asInstanceOf[js.Any], uniquifyIDs = uniquifyIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheRequests]
  }
}

