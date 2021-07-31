package typings.reactNativeShare.mod

import typings.reactNativeShare.reactNativeShareStrings.text
import typings.reactNativeShare.reactNativeShareStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityItem extends StObject {
  
  var content: String
  
  var `type`: text | url
}
object ActivityItem {
  
  @scala.inline
  def apply(content: String, `type`: text | url): ActivityItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityItem]
  }
  
  @scala.inline
  implicit class ActivityItemMutableBuilder[Self <: ActivityItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: text | url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
