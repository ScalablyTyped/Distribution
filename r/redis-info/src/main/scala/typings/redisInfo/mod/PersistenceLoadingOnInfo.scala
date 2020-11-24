package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.ON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistenceLoadingOnInfo extends js.Object {
  
  var loading: ON = js.native
  
  var loading_eta_seconds: String = js.native
  
  var loading_loaded_bytes: String = js.native
  
  var loading_loaded_perc: String = js.native
  
  var loading_start_time: String = js.native
  
  var loading_total_bytes: String = js.native
}
object PersistenceLoadingOnInfo {
  
  @scala.inline
  def apply(
    loading: ON,
    loading_eta_seconds: String,
    loading_loaded_bytes: String,
    loading_loaded_perc: String,
    loading_start_time: String,
    loading_total_bytes: String
  ): PersistenceLoadingOnInfo = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], loading_eta_seconds = loading_eta_seconds.asInstanceOf[js.Any], loading_loaded_bytes = loading_loaded_bytes.asInstanceOf[js.Any], loading_loaded_perc = loading_loaded_perc.asInstanceOf[js.Any], loading_start_time = loading_start_time.asInstanceOf[js.Any], loading_total_bytes = loading_total_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceLoadingOnInfo]
  }
  
  @scala.inline
  implicit class PersistenceLoadingOnInfoOps[Self <: PersistenceLoadingOnInfo] (val x: Self) extends AnyVal {
    
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
    def setLoading(value: ON): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading_eta_seconds(value: String): Self = this.set("loading_eta_seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading_loaded_bytes(value: String): Self = this.set("loading_loaded_bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading_loaded_perc(value: String): Self = this.set("loading_loaded_perc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading_start_time(value: String): Self = this.set("loading_start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading_total_bytes(value: String): Self = this.set("loading_total_bytes", value.asInstanceOf[js.Any])
  }
}
