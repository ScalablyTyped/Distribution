package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayRecordStateMod.RecordState
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutableRecordSource extends RecordSource {
  def clear(): Unit
  def delete(dataID: DataID): Unit
  def remove(dataID: DataID): Unit
  def set(dataID: DataID, record: Record): Unit
}

object MutableRecordSource {
  @scala.inline
  def apply(
    clear: () => Unit,
    delete: DataID => Unit,
    get: DataID => js.UndefOr[Record | Null],
    getRecordIDs: () => js.Array[DataID],
    getStatus: DataID => RecordState,
    has: DataID => Boolean,
    remove: DataID => Unit,
    set: (DataID, Record) => Unit,
    size: () => Double,
    toJSON: () => StringDictionary[Record]
  ): MutableRecordSource = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRecordIDs = js.Any.fromFunction0(getRecordIDs), getStatus = js.Any.fromFunction1(getStatus), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MutableRecordSource]
  }
}

