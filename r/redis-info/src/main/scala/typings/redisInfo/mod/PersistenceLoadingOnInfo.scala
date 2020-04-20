package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.ON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceLoadingOnInfo extends js.Object {
  var loading: ON
  var loading_eta_seconds: String
  var loading_loaded_bytes: String
  var loading_loaded_perc: String
  var loading_start_time: String
  var loading_total_bytes: String
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
}

