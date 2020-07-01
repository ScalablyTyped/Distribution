package typings.serverlessTencentScf.handlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var callbackWaitsForEmptyEventLoop: Boolean
  var environ: String | Null
  var environment: String | Null
  var function_name: String
  var function_version: String
  var memory_limit_in_mb: Double
  var namespace: String
  var request_id: String
  var tencentcloud_appid: String
  var tencentcloud_region: String
  var tencentcloud_uin: String
  var time_limit_in_ms: Double
}

object Context {
  @scala.inline
  def apply(
    callbackWaitsForEmptyEventLoop: Boolean,
    function_name: String,
    function_version: String,
    memory_limit_in_mb: Double,
    namespace: String,
    request_id: String,
    tencentcloud_appid: String,
    tencentcloud_region: String,
    tencentcloud_uin: String,
    time_limit_in_ms: Double,
    environ: String = null,
    environment: String = null
  ): Context = {
    val __obj = js.Dynamic.literal(callbackWaitsForEmptyEventLoop = callbackWaitsForEmptyEventLoop.asInstanceOf[js.Any], function_name = function_name.asInstanceOf[js.Any], function_version = function_version.asInstanceOf[js.Any], memory_limit_in_mb = memory_limit_in_mb.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], tencentcloud_appid = tencentcloud_appid.asInstanceOf[js.Any], tencentcloud_region = tencentcloud_region.asInstanceOf[js.Any], tencentcloud_uin = tencentcloud_uin.asInstanceOf[js.Any], time_limit_in_ms = time_limit_in_ms.asInstanceOf[js.Any], environ = environ.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

