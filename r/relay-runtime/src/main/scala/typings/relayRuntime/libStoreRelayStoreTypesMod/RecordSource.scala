package typings.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.libStoreRelayRecordStateMod.RecordState
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordSource extends StObject {
  
  // eslint-disable-next-line no-unnecessary-generics
  def get[T /* <: js.Object */](dataID: DataID): js.UndefOr[Record[T] | Null]
  
  def getRecordIDs(): js.Array[DataID]
  
  def getStatus(dataID: DataID): RecordState
  
  def has(dataID: DataID): Boolean
  
  def size(): Double
  
  def toJSON(): StringDictionary[Record[js.Object]]
}
object RecordSource {
  
  inline def apply(
    get: DataID => js.UndefOr[Record[Any] | Null],
    getRecordIDs: () => js.Array[DataID],
    getStatus: DataID => RecordState,
    has: DataID => Boolean,
    size: () => Double,
    toJSON: () => StringDictionary[Record[js.Object]]
  ): RecordSource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getRecordIDs = js.Any.fromFunction0(getRecordIDs), getStatus = js.Any.fromFunction1(getStatus), has = js.Any.fromFunction1(has), size = js.Any.fromFunction0(size), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[RecordSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordSource] (val x: Self) extends AnyVal {
    
    inline def setGet(value: DataID => js.UndefOr[Record[Any] | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetRecordIDs(value: () => js.Array[DataID]): Self = StObject.set(x, "getRecordIDs", js.Any.fromFunction0(value))
    
    inline def setGetStatus(value: DataID => RecordState): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
    
    inline def setHas(value: DataID => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    
    inline def setToJSON(value: () => StringDictionary[Record[js.Object]]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
