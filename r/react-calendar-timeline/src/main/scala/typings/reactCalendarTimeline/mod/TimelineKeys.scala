package typings.reactCalendarTimeline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineKeys extends StObject {
  
  var groupIdKey: String = js.native
  
  var groupRightTitleKey: String = js.native
  
  var groupTitleKey: String = js.native
  
  var itemDivTitleKey: String = js.native
  
  var itemGroupKey: String = js.native
  
  var itemIdKey: String = js.native
  
  var itemTimeEndKey: String = js.native
  
  var itemTimeStartKey: String = js.native
  
  var itemTitleKey: String = js.native
}
object TimelineKeys {
  
  @scala.inline
  def apply(
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
  implicit class TimelineKeysMutableBuilder[Self <: TimelineKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupIdKey(value: String): Self = StObject.set(x, "groupIdKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupRightTitleKey(value: String): Self = StObject.set(x, "groupRightTitleKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupTitleKey(value: String): Self = StObject.set(x, "groupTitleKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDivTitleKey(value: String): Self = StObject.set(x, "itemDivTitleKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemGroupKey(value: String): Self = StObject.set(x, "itemGroupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdKey(value: String): Self = StObject.set(x, "itemIdKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTimeEndKey(value: String): Self = StObject.set(x, "itemTimeEndKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTimeStartKey(value: String): Self = StObject.set(x, "itemTimeStartKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTitleKey(value: String): Self = StObject.set(x, "itemTitleKey", value.asInstanceOf[js.Any])
  }
}
