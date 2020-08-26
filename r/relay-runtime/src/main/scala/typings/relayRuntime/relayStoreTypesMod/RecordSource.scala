package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayRecordStateMod.RecordState
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordSource extends js.Object {
  def get(dataID: DataID): js.UndefOr[Record | Null] = js.native
  def getRecordIDs(): js.Array[DataID] = js.native
  def getStatus(dataID: DataID): RecordState = js.native
  def has(dataID: DataID): Boolean = js.native
  def size(): Double = js.native
  def toJSON(): StringDictionary[Record] = js.native
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
  @scala.inline
  implicit class RecordSourceOps[Self <: RecordSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: DataID => js.UndefOr[Record | Null]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRecordIDs(value: () => js.Array[DataID]): Self = this.set("getRecordIDs", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStatus(value: DataID => RecordState): Self = this.set("getStatus", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: DataID => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
    @scala.inline
    def setToJSON(value: () => StringDictionary[Record]): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

