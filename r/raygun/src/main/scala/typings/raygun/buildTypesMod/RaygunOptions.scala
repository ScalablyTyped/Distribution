package typings.raygun.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaygunOptions extends StObject {
  
  var apiKey: String
  
  var batch: js.UndefOr[Boolean] = js.undefined
  
  var batchFrequency: js.UndefOr[Double] = js.undefined
  
  var filters: js.UndefOr[js.Array[String]] = js.undefined
  
  var groupingKey: js.UndefOr[Hook[String]] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var innerErrorFieldName: js.UndefOr[String] = js.undefined
  
  var isOffline: js.UndefOr[Boolean] = js.undefined
  
  var offlineStorage: js.UndefOr[IOfflineStorage] = js.undefined
  
  var offlineStorageOptions: js.UndefOr[OfflineStorageOptions] = js.undefined
  
  var onBeforeSend: js.UndefOr[Hook[Message]] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var reportColumnNumbers: js.UndefOr[Boolean] = js.undefined
  
  var reportUncaughtExceptions: js.UndefOr[Boolean] = js.undefined
  
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  
  var useHumanStringForObject: js.UndefOr[Boolean] = js.undefined
  
  var useSSL: js.UndefOr[Boolean] = js.undefined
}
object RaygunOptions {
  
  inline def apply(apiKey: String): RaygunOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RaygunOptions] (val x: Self) extends AnyVal {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchFrequency(value: Double): Self = StObject.set(x, "batchFrequency", value.asInstanceOf[js.Any])
    
    inline def setBatchFrequencyUndefined: Self = StObject.set(x, "batchFrequency", js.undefined)
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setGroupingKey(
      value: (/* message */ Message, /* exception */ js.Error | String, /* customData */ CustomData, /* request */ js.UndefOr[RequestParams], /* tags */ js.UndefOr[js.Array[Tag]]) => String
    ): Self = StObject.set(x, "groupingKey", js.Any.fromFunction5(value))
    
    inline def setGroupingKeyUndefined: Self = StObject.set(x, "groupingKey", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setInnerErrorFieldName(value: String): Self = StObject.set(x, "innerErrorFieldName", value.asInstanceOf[js.Any])
    
    inline def setInnerErrorFieldNameUndefined: Self = StObject.set(x, "innerErrorFieldName", js.undefined)
    
    inline def setIsOffline(value: Boolean): Self = StObject.set(x, "isOffline", value.asInstanceOf[js.Any])
    
    inline def setIsOfflineUndefined: Self = StObject.set(x, "isOffline", js.undefined)
    
    inline def setOfflineStorage(value: IOfflineStorage): Self = StObject.set(x, "offlineStorage", value.asInstanceOf[js.Any])
    
    inline def setOfflineStorageOptions(value: OfflineStorageOptions): Self = StObject.set(x, "offlineStorageOptions", value.asInstanceOf[js.Any])
    
    inline def setOfflineStorageOptionsUndefined: Self = StObject.set(x, "offlineStorageOptions", js.undefined)
    
    inline def setOfflineStorageUndefined: Self = StObject.set(x, "offlineStorage", js.undefined)
    
    inline def setOnBeforeSend(
      value: (/* message */ Message, /* exception */ js.Error | String, /* customData */ CustomData, /* request */ js.UndefOr[RequestParams], /* tags */ js.UndefOr[js.Array[Tag]]) => Message
    ): Self = StObject.set(x, "onBeforeSend", js.Any.fromFunction5(value))
    
    inline def setOnBeforeSendUndefined: Self = StObject.set(x, "onBeforeSend", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setReportColumnNumbers(value: Boolean): Self = StObject.set(x, "reportColumnNumbers", value.asInstanceOf[js.Any])
    
    inline def setReportColumnNumbersUndefined: Self = StObject.set(x, "reportColumnNumbers", js.undefined)
    
    inline def setReportUncaughtExceptions(value: Boolean): Self = StObject.set(x, "reportUncaughtExceptions", value.asInstanceOf[js.Any])
    
    inline def setReportUncaughtExceptionsUndefined: Self = StObject.set(x, "reportUncaughtExceptions", js.undefined)
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUseHumanStringForObject(value: Boolean): Self = StObject.set(x, "useHumanStringForObject", value.asInstanceOf[js.Any])
    
    inline def setUseHumanStringForObjectUndefined: Self = StObject.set(x, "useHumanStringForObject", js.undefined)
    
    inline def setUseSSL(value: Boolean): Self = StObject.set(x, "useSSL", value.asInstanceOf[js.Any])
    
    inline def setUseSSLUndefined: Self = StObject.set(x, "useSSL", js.undefined)
  }
}
