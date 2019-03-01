package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishResponse extends js.Object {
  var timetoken: scala.Double
}

object PublishResponse {
  @scala.inline
  def apply(timetoken: scala.Double): PublishResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("timetoken")(timetoken)
    __obj.asInstanceOf[PublishResponse]
  }
}

