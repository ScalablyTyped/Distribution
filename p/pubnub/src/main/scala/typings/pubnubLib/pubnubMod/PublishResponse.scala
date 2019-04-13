package typings
package pubnubLib.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishResponse extends js.Object {
  var timetoken: scala.Double
}

object PublishResponse {
  @scala.inline
  def apply(timetoken: scala.Double): PublishResponse = {
    val __obj = js.Dynamic.literal(timetoken = timetoken)
  
    __obj.asInstanceOf[PublishResponse]
  }
}

