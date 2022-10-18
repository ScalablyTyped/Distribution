package typings.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.libStoreRelayRecordStateMod.RecordState
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutableRecordSource
  extends StObject
     with RecordSource {
  
  def clear(): Unit
  
  def delete(dataID: DataID): Unit
  
  def remove(dataID: DataID): Unit
  
  def set(dataID: DataID, record: Record[js.Object]): Unit
}
object MutableRecordSource {
  
  inline def apply(
    clear: () => Unit,
    delete: DataID => Unit,
    get: DataID => js.UndefOr[Record[Any] | Null],
    getRecordIDs: () => js.Array[DataID],
    getStatus: DataID => RecordState,
    has: DataID => Boolean,
    remove: DataID => Unit,
    set: (DataID, Record[js.Object]) => Unit,
    size: () => Double,
    toJSON: () => StringDictionary[Record[js.Object]]
  ): MutableRecordSource = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRecordIDs = js.Any.fromFunction0(getRecordIDs), getStatus = js.Any.fromFunction1(getStatus), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MutableRecordSource]
  }
  
  extension [Self <: MutableRecordSource](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setDelete(value: DataID => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setRemove(value: DataID => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSet(value: (DataID, Record[js.Object]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
