package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedSnapshot[TData] extends js.Object {
  val data: TData
  val isMissingData: Boolean
  val seenRecords: RecordMap
  val selector: SingularReaderSelector
}

object TypedSnapshot {
  @scala.inline
  def apply[TData](data: TData, isMissingData: Boolean, seenRecords: RecordMap, selector: SingularReaderSelector): TypedSnapshot[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isMissingData = isMissingData, seenRecords = seenRecords, selector = selector)
  
    __obj.asInstanceOf[TypedSnapshot[TData]]
  }
}

