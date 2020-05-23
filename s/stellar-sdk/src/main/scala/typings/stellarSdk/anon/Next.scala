package typings.stellarSdk.anon

import typings.stellarSdk.horizonApiMod.Horizon.ResponseLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Next extends js.Object {
  var next: ResponseLink
  var prev: ResponseLink
  var self: ResponseLink
}

object Next {
  @scala.inline
  def apply(next: ResponseLink, prev: ResponseLink, self: ResponseLink): Next = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
}

