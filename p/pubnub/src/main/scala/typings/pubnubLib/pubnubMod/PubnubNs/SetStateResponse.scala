package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetStateResponse extends js.Object {
  var state: js.Any
}

object SetStateResponse {
  @scala.inline
  def apply(state: js.Any): SetStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[SetStateResponse]
  }
}

