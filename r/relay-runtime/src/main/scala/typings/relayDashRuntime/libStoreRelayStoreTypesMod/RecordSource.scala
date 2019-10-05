package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libStoreRelayRecordStateMod.RecordState
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordSource extends js.Object {
  def get(dataID: DataID): js.UndefOr[Record | Null]
  def getRecordIDs(): js.Array[DataID]
  def getStatus(dataID: DataID): RecordState
  def has(dataID: DataID): Boolean
  def size(): Double
  def toJSON(): StringDictionary[Record]
}

object RecordSource {
  @scala.inline
  def apply(
    get: DataID => js.UndefOr[Record | Null],
    getRecordIDs: () => js.Array[DataID],
    getStatus: DataID => RecordState,
    has: DataID => Boolean,
    size: () => Double,
    toJSON: () => StringDictionary[Record]
  ): RecordSource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getRecordIDs = js.Any.fromFunction0(getRecordIDs), getStatus = js.Any.fromFunction1(getStatus), has = js.Any.fromFunction1(has), size = js.Any.fromFunction0(size), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[RecordSource]
  }
}

