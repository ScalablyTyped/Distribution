package typings.redisInfo.mod

import typings.redisInfo.redisInfoStrings.master
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationMasterInfo extends StObject {
  
  var role: master = js.native
}
object ReplicationMasterInfo {
  
  @scala.inline
  def apply(role: master): ReplicationMasterInfo = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationMasterInfo]
  }
  
  @scala.inline
  implicit class ReplicationMasterInfoMutableBuilder[Self <: ReplicationMasterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: master): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
