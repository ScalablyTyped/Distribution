package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedSnapshot[TData] extends StObject {
  
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
  
  @scala.inline
  implicit class TypedSnapshotMutableBuilder[Self <: TypedSnapshot[?], TData] (val x: Self & TypedSnapshot[TData]) extends AnyVal {
    
    @scala.inline
    def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMissingData(value: Boolean): Self = StObject.set(x, "isMissingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeenRecords(value: RecordMap): Self = StObject.set(x, "seenRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: SingularReaderSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
