package typings.socketcluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KillWorkersOptions extends js.Object {
  
  // Shut down the workers immediately without waiting for termination timeout.
  var immediate: js.UndefOr[Boolean] = js.native
  
  // Shut down the cluster master (load balancer) as well as all the workers.
  var killClusterMaster: js.UndefOr[Boolean] = js.native
}
object KillWorkersOptions {
  
  @scala.inline
  def apply(): KillWorkersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KillWorkersOptions]
  }
  
  @scala.inline
  implicit class KillWorkersOptionsOps[Self <: KillWorkersOptions] (val x: Self) extends AnyVal {
    
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
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
    
    @scala.inline
    def setKillClusterMaster(value: Boolean): Self = this.set("killClusterMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKillClusterMaster: Self = this.set("killClusterMaster", js.undefined)
  }
}
