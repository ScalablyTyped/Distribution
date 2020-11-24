package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayRecordStateMod.RecordState
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutableRecordSource extends RecordSource {
  
  def clear(): Unit = js.native
  
  def delete(dataID: DataID): Unit = js.native
  
  def remove(dataID: DataID): Unit = js.native
  
  def set(dataID: DataID, record: Record): Unit = js.native
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
  
  @scala.inline
  implicit class MutableRecordSourceOps[Self <: MutableRecordSource] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: DataID => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: DataID => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (DataID, Record) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
