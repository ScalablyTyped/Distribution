package typings.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Snapshot extends js.Object {
  var snapshot: js.UndefOr[Boolean] = js.undefined
}

object Anon_Snapshot {
  @scala.inline
  def apply(snapshot: js.UndefOr[Boolean] = js.undefined): Anon_Snapshot = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(snapshot)) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Snapshot]
  }
}

