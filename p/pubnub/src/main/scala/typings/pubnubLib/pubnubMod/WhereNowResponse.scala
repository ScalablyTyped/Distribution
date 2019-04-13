package typings
package pubnubLib.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhereNowResponse extends js.Object {
  var channels: js.Array[java.lang.String]
}

object WhereNowResponse {
  @scala.inline
  def apply(channels: js.Array[java.lang.String]): WhereNowResponse = {
    val __obj = js.Dynamic.literal(channels = channels)
  
    __obj.asInstanceOf[WhereNowResponse]
  }
}

