package typings.stellarSdk

import typings.stellarSdk.horizonApiMod.Horizon.ResponseLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext extends js.Object {
  var next: ResponseLink
  var prev: ResponseLink
  var self: ResponseLink
}

object AnonNext {
  @scala.inline
  def apply(next: ResponseLink, prev: ResponseLink, self: ResponseLink): AnonNext = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNext]
  }
}

