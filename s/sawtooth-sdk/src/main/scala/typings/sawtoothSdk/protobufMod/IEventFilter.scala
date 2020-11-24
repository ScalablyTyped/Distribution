package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.EventFilter.FilterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventFilter extends js.Object {
  
  /** EventFilter filterType */
  var filterType: js.UndefOr[FilterType | Null] = js.native
  
  /** EventFilter key */
  var key: js.UndefOr[String | Null] = js.native
  
  /** EventFilter matchString */
  var matchString: js.UndefOr[String | Null] = js.native
}
object IEventFilter {
  
  @scala.inline
  def apply(): IEventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventFilter]
  }
  
  @scala.inline
  implicit class IEventFilterOps[Self <: IEventFilter] (val x: Self) extends AnyVal {
    
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
    def setFilterType(value: FilterType): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    
    @scala.inline
    def setFilterTypeNull: Self = this.set("filterType", null)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setMatchString(value: String): Self = this.set("matchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchString: Self = this.set("matchString", js.undefined)
    
    @scala.inline
    def setMatchStringNull: Self = this.set("matchString", null)
  }
}
