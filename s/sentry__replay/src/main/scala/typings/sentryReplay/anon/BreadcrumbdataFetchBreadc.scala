package typings.sentryReplay.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @sentry/types.@sentry/types.Breadcrumb & {  data :@sentry/types.@sentry/types.FetchBreadcrumbData} */
trait BreadcrumbdataFetchBreadc extends StObject {
  
  var category: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var event_id: js.UndefOr[String] = js.undefined
  
  var level: js.UndefOr[Severity | SeverityLevel] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object BreadcrumbdataFetchBreadc {
  
  inline def apply(): BreadcrumbdataFetchBreadc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbdataFetchBreadc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreadcrumbdataFetchBreadc] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
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
