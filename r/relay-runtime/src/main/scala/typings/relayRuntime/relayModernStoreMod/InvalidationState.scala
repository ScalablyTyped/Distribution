package typings.relayRuntime.relayModernStoreMod

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidationState extends js.Object {
  var dataIDs: js.Array[DataID]
  var invalidations: Map[DataID, js.UndefOr[Double | Null]]
}

object InvalidationState {
  @scala.inline
  def apply(dataIDs: js.Array[DataID], invalidations: Map[DataID, js.UndefOr[Double | Null]]): InvalidationState = {
    val __obj = js.Dynamic.literal(dataIDs = dataIDs.asInstanceOf[js.Any], invalidations = invalidations.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidationState]
  }
}

