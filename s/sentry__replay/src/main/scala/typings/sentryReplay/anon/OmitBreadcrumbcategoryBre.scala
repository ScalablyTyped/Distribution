package typings.sentryReplay.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@sentry/types.@sentry/types.Breadcrumb, 'category'> & @sentry/replay.@sentry/replay/types/coreHandlers/handleScope.BreadcrumbWithCategory */
trait OmitBreadcrumbcategoryBre extends StObject {
  
  var category: String
  
  var data: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var event_id: js.UndefOr[String] = js.undefined
  
  var level: js.UndefOr[Severity | SeverityLevel] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object OmitBreadcrumbcategoryBre {
  
  inline def apply(category: String): OmitBreadcrumbcategoryBre = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitBreadcrumbcategoryBre]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitBreadcrumbcategoryBre] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
    
    inline def setEvent_idUndefined: Self = StObject.set(x, "event_id", js.undefined)
    
    inline def setLevel(value: Severity | SeverityLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
