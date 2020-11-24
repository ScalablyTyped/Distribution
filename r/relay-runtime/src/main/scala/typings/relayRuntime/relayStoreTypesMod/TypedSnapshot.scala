package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedSnapshot[TData] extends js.Object {
  
  val data: TData = js.native
  
  val isMissingData: Boolean = js.native
  
  val seenRecords: RecordMap = js.native
  
  val selector: SingularReaderSelector = js.native
}
object TypedSnapshot {
  
  @scala.inline
  def apply[TData](data: TData, isMissingData: Boolean, seenRecords: RecordMap, selector: SingularReaderSelector): TypedSnapshot[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isMissingData = isMissingData.asInstanceOf[js.Any], seenRecords = seenRecords.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedSnapshot[TData]]
  }
  
  @scala.inline
  implicit class TypedSnapshotOps[Self <: TypedSnapshot[_], TData] (val x: Self with TypedSnapshot[TData]) extends AnyVal {
    
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
    def setData(value: TData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMissingData(value: Boolean): Self = this.set("isMissingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeenRecords(value: RecordMap): Self = this.set("seenRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: SingularReaderSelector): Self = this.set("selector", value.asInstanceOf[js.Any])
  }
}
