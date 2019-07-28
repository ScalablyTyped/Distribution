package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSnapshot[TReaderNode, TOwner] extends CReaderSelector[TReaderNode] {
  var data: js.UndefOr[SelectorData | Null] = js.undefined
  var isMissingData: Boolean
  var owner: TOwner | Null
  var seenRecords: RecordMap
}

object CSnapshot {
  @scala.inline
  def apply[TReaderNode, TOwner](
    dataID: DataID,
    isMissingData: Boolean,
    node: TReaderNode,
    seenRecords: RecordMap,
    variables: Variables,
    data: SelectorData = null,
    owner: TOwner = null
  ): CSnapshot[TReaderNode, TOwner] = {
    val __obj = js.Dynamic.literal(dataID = dataID, isMissingData = isMissingData, node = node.asInstanceOf[js.Any], seenRecords = seenRecords, variables = variables)
    if (data != null) __obj.updateDynamic("data")(data)
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSnapshot[TReaderNode, TOwner]]
  }
}

