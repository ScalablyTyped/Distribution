package typings.reactCalendarTimeline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineKeys extends StObject {
  
  var groupIdKey: String
  
  var groupRightTitleKey: String
  
  var groupTitleKey: String
  
  var itemDivTitleKey: String
  
  var itemGroupKey: String
  
  var itemIdKey: String
  
  var itemTimeEndKey: String
  
  var itemTimeStartKey: String
  
  var itemTitleKey: String
}
object TimelineKeys {
  
  inline def apply(
    groupIdKey: String,
    groupRightTitleKey: String,
    groupTitleKey: String,
    itemDivTitleKey: String,
    itemGroupKey: String,
    itemIdKey: String,
    itemTimeEndKey: String,
    itemTimeStartKey: String,
    itemTitleKey: String
  ): TimelineKeys = {
    val __obj = js.Dynamic.literal(groupIdKey = groupIdKey.asInstanceOf[js.Any], groupRightTitleKey = groupRightTitleKey.asInstanceOf[js.Any], groupTitleKey = groupTitleKey.asInstanceOf[js.Any], itemDivTitleKey = itemDivTitleKey.asInstanceOf[js.Any], itemGroupKey = itemGroupKey.asInstanceOf[js.Any], itemIdKey = itemIdKey.asInstanceOf[js.Any], itemTimeEndKey = itemTimeEndKey.asInstanceOf[js.Any], itemTimeStartKey = itemTimeStartKey.asInstanceOf[js.Any], itemTitleKey = itemTitleKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineKeys] (val x: Self) extends AnyVal {
    
    inline def setGroupIdKey(value: String): Self = StObject.set(x, "groupIdKey", value.asInstanceOf[js.Any])
    
    inline def setGroupRightTitleKey(value: String): Self = StObject.set(x, "groupRightTitleKey", value.asInstanceOf[js.Any])
    
    inline def setGroupTitleKey(value: String): Self = StObject.set(x, "groupTitleKey", value.asInstanceOf[js.Any])
    
    inline def setItemDivTitleKey(value: String): Self = StObject.set(x, "itemDivTitleKey", value.asInstanceOf[js.Any])
    
    inline def setItemGroupKey(value: String): Self = StObject.set(x, "itemGroupKey", value.asInstanceOf[js.Any])
    
    inline def setItemIdKey(value: String): Self = StObject.set(x, "itemIdKey", value.asInstanceOf[js.Any])
    
    inline def setItemTimeEndKey(value: String): Self = StObject.set(x, "itemTimeEndKey", value.asInstanceOf[js.Any])
    
    inline def setItemTimeStartKey(value: String): Self = StObject.set(x, "itemTimeStartKey", value.asInstanceOf[js.Any])
    
    inline def setItemTitleKey(value: String): Self = StObject.set(x, "itemTitleKey", value.asInstanceOf[js.Any])
  }
}
