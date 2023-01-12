package typings.redisInfo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPUInfo extends StObject {
  
  var used_cpu_sys: String
  
  var used_cpu_sys_children: String
  
  var used_cpu_user: String
  
  var used_cpu_user_children: String
}
object CPUInfo {
  
  inline def apply(
    used_cpu_sys: String,
    used_cpu_sys_children: String,
    used_cpu_user: String,
    used_cpu_user_children: String
  ): CPUInfo = {
    val __obj = js.Dynamic.literal(used_cpu_sys = used_cpu_sys.asInstanceOf[js.Any], used_cpu_sys_children = used_cpu_sys_children.asInstanceOf[js.Any], used_cpu_user = used_cpu_user.asInstanceOf[js.Any], used_cpu_user_children = used_cpu_user_children.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CPUInfo] (val x: Self) extends AnyVal {
    
    inline def setUsed_cpu_sys(value: String): Self = StObject.set(x, "used_cpu_sys", value.asInstanceOf[js.Any])
    
    inline def setUsed_cpu_sys_children(value: String): Self = StObject.set(x, "used_cpu_sys_children", value.asInstanceOf[js.Any])
    
    inline def setUsed_cpu_user(value: String): Self = StObject.set(x, "used_cpu_user", value.asInstanceOf[js.Any])
    
    inline def setUsed_cpu_user_children(value: String): Self = StObject.set(x, "used_cpu_user_children", value.asInstanceOf[js.Any])
  }
}
