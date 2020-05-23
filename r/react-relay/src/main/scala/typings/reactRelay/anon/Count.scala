package typings.reactRelay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: Double
  var cursor: js.UndefOr[String | Null] = js.undefined
}

object Count {
  @scala.inline
  def apply(count: Double, cursor: js.UndefOr[Null | String] = js.undefined): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (!js.isUndefined(cursor)) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

