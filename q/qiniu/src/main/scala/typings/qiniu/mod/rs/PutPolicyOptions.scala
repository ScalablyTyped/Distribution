package typings.qiniu.mod.rs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutPolicyOptions extends js.Object {
  
  var callbackBody: js.UndefOr[String] = js.native
  
  var callbackBodyType: js.UndefOr[String] = js.native
  
  var callbackFetchKey: js.UndefOr[Double] = js.native
  
  var callbackHost: js.UndefOr[String] = js.native
  
  var callbackUrl: js.UndefOr[String] = js.native
  
  var deleteAfterDays: js.UndefOr[Double] = js.native
  
  var detectMime: js.UndefOr[Double] = js.native
  
  var endUser: js.UndefOr[String] = js.native
  
  var expires: js.UndefOr[Double] = js.native
  
  var fileType: js.UndefOr[Double] = js.native
  
  var fsizeLimit: js.UndefOr[Double] = js.native
  
  var fsizeMin: js.UndefOr[Double] = js.native
  
  var insertOnly: js.UndefOr[Double] = js.native
  
  var isPrefixalScope: js.UndefOr[Double] = js.native
  
  var mimeLimit: js.UndefOr[String] = js.native
  
  var persistentNotifyUrl: js.UndefOr[String] = js.native
  
  var persistentOps: js.UndefOr[String] = js.native
  
  var persistentPipeline: js.UndefOr[String] = js.native
  
  var returnBody: js.UndefOr[String] = js.native
  
  var returnUrl: js.UndefOr[String] = js.native
  
  var saveKey: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
}
object PutPolicyOptions {
  
  @scala.inline
  def apply(): PutPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPolicyOptions]
  }
  
  @scala.inline
  implicit class PutPolicyOptionsOps[Self <: PutPolicyOptions] (val x: Self) extends AnyVal {
    
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
    def setCallbackBody(value: String): Self = this.set("callbackBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackBody: Self = this.set("callbackBody", js.undefined)
    
    @scala.inline
    def setCallbackBodyType(value: String): Self = this.set("callbackBodyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackBodyType: Self = this.set("callbackBodyType", js.undefined)
    
    @scala.inline
    def setCallbackFetchKey(value: Double): Self = this.set("callbackFetchKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackFetchKey: Self = this.set("callbackFetchKey", js.undefined)
    
    @scala.inline
    def setCallbackHost(value: String): Self = this.set("callbackHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackHost: Self = this.set("callbackHost", js.undefined)
    
    @scala.inline
    def setCallbackUrl(value: String): Self = this.set("callbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackUrl: Self = this.set("callbackUrl", js.undefined)
    
    @scala.inline
    def setDeleteAfterDays(value: Double): Self = this.set("deleteAfterDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteAfterDays: Self = this.set("deleteAfterDays", js.undefined)
    
    @scala.inline
    def setDetectMime(value: Double): Self = this.set("detectMime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectMime: Self = this.set("detectMime", js.undefined)
    
    @scala.inline
    def setEndUser(value: String): Self = this.set("endUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndUser: Self = this.set("endUser", js.undefined)
    
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setFileType(value: Double): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    
    @scala.inline
    def setFsizeLimit(value: Double): Self = this.set("fsizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsizeLimit: Self = this.set("fsizeLimit", js.undefined)
    
    @scala.inline
    def setFsizeMin(value: Double): Self = this.set("fsizeMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsizeMin: Self = this.set("fsizeMin", js.undefined)
    
    @scala.inline
    def setInsertOnly(value: Double): Self = this.set("insertOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertOnly: Self = this.set("insertOnly", js.undefined)
    
    @scala.inline
    def setIsPrefixalScope(value: Double): Self = this.set("isPrefixalScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrefixalScope: Self = this.set("isPrefixalScope", js.undefined)
    
    @scala.inline
    def setMimeLimit(value: String): Self = this.set("mimeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeLimit: Self = this.set("mimeLimit", js.undefined)
    
    @scala.inline
    def setPersistentNotifyUrl(value: String): Self = this.set("persistentNotifyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistentNotifyUrl: Self = this.set("persistentNotifyUrl", js.undefined)
    
    @scala.inline
    def setPersistentOps(value: String): Self = this.set("persistentOps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistentOps: Self = this.set("persistentOps", js.undefined)
    
    @scala.inline
    def setPersistentPipeline(value: String): Self = this.set("persistentPipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistentPipeline: Self = this.set("persistentPipeline", js.undefined)
    
    @scala.inline
    def setReturnBody(value: String): Self = this.set("returnBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnBody: Self = this.set("returnBody", js.undefined)
    
    @scala.inline
    def setReturnUrl(value: String): Self = this.set("returnUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnUrl: Self = this.set("returnUrl", js.undefined)
    
    @scala.inline
    def setSaveKey(value: String): Self = this.set("saveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveKey: Self = this.set("saveKey", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
