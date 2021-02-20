package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayRecordStateMod.RecordState
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordSource extends StObject {
  
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
  implicit class RecordSourceMutableBuilder[Self <: RecordSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: DataID => js.UndefOr[Record | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRecordIDs(value: () => js.Array[DataID]): Self = StObject.set(x, "getRecordIDs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStatus(value: DataID => RecordState): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: DataID => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSON(value: () => StringDictionary[Record]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
