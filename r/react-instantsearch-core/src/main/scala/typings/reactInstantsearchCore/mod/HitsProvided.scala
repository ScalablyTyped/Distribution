package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitsProvided[THit] extends js.Object {
  /** the records that matched the search state */
  var hits: js.Array[Hit[THit]]
}

object HitsProvided {
  @scala.inline
  def apply[THit](hits: js.Array[Hit[THit]]): HitsProvided[THit] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitsProvided[THit]]
  }
}

