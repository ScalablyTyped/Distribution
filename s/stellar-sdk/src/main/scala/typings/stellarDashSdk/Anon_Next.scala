package typings.stellarDashSdk

import typings.stellarDashSdk.stellarDashSdkMod.Horizon.ResponseLink
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
    val __obj = js.Dynamic.literal(next = next, prev = prev, self = self)
  
    __obj.asInstanceOf[Anon_Next]
  }
}

