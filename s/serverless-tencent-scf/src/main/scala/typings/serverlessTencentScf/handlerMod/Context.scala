package typings.serverlessTencentScf.handlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  var callbackWaitsForEmptyEventLoop: Boolean = js.native
  
  var environ: String = js.native
  
  var environment: String = js.native
  
  var function_name: String = js.native
  
  var function_version: String = js.native
  
  def getRemainingTimeInMillis(): Double = js.native
  
  var memory_limit_in_mb: Double = js.native
  
  var namespace: String = js.native
  
  var request_id: String = js.native
  
  var tencentcloud_appid: String = js.native
  
  var tencentcloud_region: String = js.native
  
  var tencentcloud_uin: String = js.native
  
  var time_limit_in_ms: Double = js.native
}
object Context {
  
  @scala.inline
  def apply(
    callbackWaitsForEmptyEventLoop: Boolean,
    environ: String,
    environment: String,
    function_name: String,
    function_version: String,
    getRemainingTimeInMillis: () => Double,
    memory_limit_in_mb: Double,
    namespace: String,
    request_id: String,
    tencentcloud_appid: String,
    tencentcloud_region: String,
    tencentcloud_uin: String,
    time_limit_in_ms: Double
  ): Context = {
    val __obj = js.Dynamic.literal(callbackWaitsForEmptyEventLoop = callbackWaitsForEmptyEventLoop.asInstanceOf[js.Any], environ = environ.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], function_name = function_name.asInstanceOf[js.Any], function_version = function_version.asInstanceOf[js.Any], getRemainingTimeInMillis = js.Any.fromFunction0(getRemainingTimeInMillis), memory_limit_in_mb = memory_limit_in_mb.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], tencentcloud_appid = tencentcloud_appid.asInstanceOf[js.Any], tencentcloud_region = tencentcloud_region.asInstanceOf[js.Any], tencentcloud_uin = tencentcloud_uin.asInstanceOf[js.Any], time_limit_in_ms = time_limit_in_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
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
    def setCallbackWaitsForEmptyEventLoop(value: Boolean): Self = this.set("callbackWaitsForEmptyEventLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnviron(value: String): Self = this.set("environ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction_name(value: String): Self = this.set("function_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction_version(value: String): Self = this.set("function_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRemainingTimeInMillis(value: () => Double): Self = this.set("getRemainingTimeInMillis", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMemory_limit_in_mb(value: Double): Self = this.set("memory_limit_in_mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_id(value: String): Self = this.set("request_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTencentcloud_appid(value: String): Self = this.set("tencentcloud_appid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTencentcloud_region(value: String): Self = this.set("tencentcloud_region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTencentcloud_uin(value: String): Self = this.set("tencentcloud_uin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_limit_in_ms(value: Double): Self = this.set("time_limit_in_ms", value.asInstanceOf[js.Any])
  }
}
