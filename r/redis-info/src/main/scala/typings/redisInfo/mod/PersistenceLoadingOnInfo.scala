package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.ON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistenceLoadingOnInfo extends StObject {
  
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
  implicit class PersistenceLoadingOnInfoMutableBuilder[Self <: PersistenceLoadingOnInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoading(value: ON): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading_eta_seconds(value: String): Self = StObject.set(x, "loading_eta_seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading_loaded_bytes(value: String): Self = StObject.set(x, "loading_loaded_bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading_loaded_perc(value: String): Self = StObject.set(x, "loading_loaded_perc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading_start_time(value: String): Self = StObject.set(x, "loading_start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading_total_bytes(value: String): Self = StObject.set(x, "loading_total_bytes", value.asInstanceOf[js.Any])
  }
}
