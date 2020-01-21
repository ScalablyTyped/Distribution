package typings.relayRuntime.relayStoreTypesMod

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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isMissingData = isMissingData.asInstanceOf[js.Any], seenRecords = seenRecords.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypedSnapshot[TData]]
  }
}

