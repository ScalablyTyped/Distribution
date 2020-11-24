package typings.raygun.typesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaygunOptions extends js.Object {
  
  var apiKey: String = js.native
  
  var batch: js.UndefOr[Boolean] = js.native
  
  var batchFrequency: js.UndefOr[Double] = js.native
  
  var filters: js.UndefOr[js.Array[String]] = js.native
  
  var groupingKey: js.UndefOr[Hook[String]] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var innerErrorFieldName: js.UndefOr[String] = js.native
  
  var isOffline: js.UndefOr[Boolean] = js.native
  
  var offlineStorage: js.UndefOr[IOfflineStorage] = js.native
  
  var offlineStorageOptions: js.UndefOr[OfflineStorageOptions] = js.native
  
  var onBeforeSend: js.UndefOr[Hook[Message]] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var reportColumnNumbers: js.UndefOr[Boolean] = js.native
  
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  
  var useHumanStringForObject: js.UndefOr[Boolean] = js.native
  
  var useSSL: js.UndefOr[Boolean] = js.native
}
object RaygunOptions {
  
  @scala.inline
  def apply(apiKey: String): RaygunOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunOptions]
  }
  
  @scala.inline
  implicit class RaygunOptionsOps[Self <: RaygunOptions] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatch(value: Boolean): Self = this.set("batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    
    @scala.inline
    def setBatchFrequency(value: Double): Self = this.set("batchFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchFrequency: Self = this.set("batchFrequency", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: String*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[String]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setGroupingKey(
      value: (/* message */ Message, /* exception */ Error | String, /* customData */ CustomData, /* request */ js.UndefOr[RequestParams], /* tags */ js.UndefOr[js.Array[Tag]]) => String
    ): Self = this.set("groupingKey", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteGroupingKey: Self = this.set("groupingKey", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setInnerErrorFieldName(value: String): Self = this.set("innerErrorFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerErrorFieldName: Self = this.set("innerErrorFieldName", js.undefined)
    
    @scala.inline
    def setIsOffline(value: Boolean): Self = this.set("isOffline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOffline: Self = this.set("isOffline", js.undefined)
    
    @scala.inline
    def setOfflineStorage(value: IOfflineStorage): Self = this.set("offlineStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfflineStorage: Self = this.set("offlineStorage", js.undefined)
    
    @scala.inline
    def setOfflineStorageOptions(value: OfflineStorageOptions): Self = this.set("offlineStorageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfflineStorageOptions: Self = this.set("offlineStorageOptions", js.undefined)
    
    @scala.inline
    def setOnBeforeSend(
      value: (/* message */ Message, /* exception */ Error | String, /* customData */ CustomData, /* request */ js.UndefOr[RequestParams], /* tags */ js.UndefOr[js.Array[Tag]]) => Message
    ): Self = this.set("onBeforeSend", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnBeforeSend: Self = this.set("onBeforeSend", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setReportColumnNumbers(value: Boolean): Self = this.set("reportColumnNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportColumnNumbers: Self = this.set("reportColumnNumbers", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUseHumanStringForObject(value: Boolean): Self = this.set("useHumanStringForObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHumanStringForObject: Self = this.set("useHumanStringForObject", js.undefined)
    
    @scala.inline
    def setUseSSL(value: Boolean): Self = this.set("useSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSSL: Self = this.set("useSSL", js.undefined)
  }
}
