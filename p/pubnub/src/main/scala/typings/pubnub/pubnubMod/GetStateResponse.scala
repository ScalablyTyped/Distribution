package typings.pubnub.pubnubMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStateResponse extends js.Object {
  var channels: StringDictionary[js.Any]
}

object GetStateResponse {
  @scala.inline
  def apply(channels: StringDictionary[js.Any]): GetStateResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetStateResponse]
  }
}

