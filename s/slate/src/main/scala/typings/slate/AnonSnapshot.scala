package typings.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSnapshot extends js.Object {
  var snapshot: js.UndefOr[Boolean] = js.undefined
}

object AnonSnapshot {
  @scala.inline
  def apply(snapshot: js.UndefOr[Boolean] = js.undefined): AnonSnapshot = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(snapshot)) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSnapshot]
  }
}

