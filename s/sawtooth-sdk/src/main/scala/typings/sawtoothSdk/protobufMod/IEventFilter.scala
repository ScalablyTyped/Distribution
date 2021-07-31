package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.EventFilter.FilterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventFilter extends StObject {
  
  /** EventFilter filterType */
  var filterType: js.UndefOr[FilterType | Null] = js.undefined
  
  /** EventFilter key */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /** EventFilter matchString */
  var matchString: js.UndefOr[String | Null] = js.undefined
}
object IEventFilter {
  
  @scala.inline
  def apply(): IEventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventFilter]
  }
  
  @scala.inline
  implicit class IEventFilterMutableBuilder[Self <: IEventFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterType(value: FilterType): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypeNull: Self = StObject.set(x, "filterType", null)
    
    @scala.inline
    def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMatchString(value: String): Self = StObject.set(x, "matchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchStringNull: Self = StObject.set(x, "matchString", null)
    
    @scala.inline
    def setMatchStringUndefined: Self = StObject.set(x, "matchString", js.undefined)
  }
}
