package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotLegacy extends js.Object {
  var canTakeSnapshot: Boolean
}

object SnapshotLegacy {
  @scala.inline
  def apply(canTakeSnapshot: Boolean): SnapshotLegacy = {
    val __obj = js.Dynamic.literal(canTakeSnapshot = canTakeSnapshot)
  
    __obj.asInstanceOf[SnapshotLegacy]
  }
}

