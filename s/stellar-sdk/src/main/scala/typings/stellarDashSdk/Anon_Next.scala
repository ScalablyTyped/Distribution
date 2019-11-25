package typings.stellarDashSdk

import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ResponseLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  var next: ResponseLink
  var prev: ResponseLink
  var self: ResponseLink
}

object Anon_Next {
  @scala.inline
  def apply(next: ResponseLink, prev: ResponseLink, self: ResponseLink): Anon_Next = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Next]
  }
}

