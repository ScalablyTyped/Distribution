package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libStoreRelayRecordStateMod.RecordState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutableRecordSource extends RecordSource {
  def clear(): Unit
  def delete(dataID: String): Unit
  def remove(dataID: String): Unit
  def set(dataID: String, record: Record): Unit
}

object MutableRecordSource {
  @scala.inline
  def apply(
    clear: () => Unit,
    delete: String => Unit,
    get: String => Record,
    getRecordIDs: () => js.Array[String],
    getStatus: String => RecordState,
    has: String => Boolean,
    remove: String => Unit,
    set: (String, Record) => Unit,
    size: () => Double,
    toJSON: () => StringDictionary[Record]
  ): MutableRecordSource = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRecordIDs = js.Any.fromFunction0(getRecordIDs), getStatus = js.Any.fromFunction1(getStatus), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[MutableRecordSource]
  }
}

