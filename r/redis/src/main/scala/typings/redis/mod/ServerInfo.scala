package typings.redis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerInfo extends js.Object {
  
  var redis_version: String = js.native
  
  var versions: js.Array[Double] = js.native
}
object ServerInfo {
  
  @scala.inline
  def apply(redis_version: String, versions: js.Array[Double]): ServerInfo = {
    val __obj = js.Dynamic.literal(redis_version = redis_version.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
  
  @scala.inline
  implicit class ServerInfoOps[Self <: ServerInfo] (val x: Self) extends AnyVal {
    
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
    def setRedis_version(value: String): Self = this.set("redis_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsVarargs(value: Double*): Self = this.set("versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: js.Array[Double]): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
}
