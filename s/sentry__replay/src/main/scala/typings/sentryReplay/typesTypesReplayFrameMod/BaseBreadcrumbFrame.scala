package typings.sentryReplay.typesTypesReplayFrameMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseBreadcrumbFrame
  extends StObject
     with BreadcrumbFrame {
  
  var category: String
  
  var data: js.UndefOr[Record[String, Any]] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var timestamp: Double
  
  /**
    * For compatibility reasons
    */
  var `type`: String
}
object BaseBreadcrumbFrame {
  
  inline def apply(category: String, timestamp: Double, `type`: String): BaseBreadcrumbFrame = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBreadcrumbFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseBreadcrumbFrame] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
