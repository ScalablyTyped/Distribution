package typings.sccBrokerClient.clusterBrokerClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorkersData extends js.Object {
  
  var sourceWorkerURI: String = js.native
  
  var workerURIs: String = js.native
}
object UpdateWorkersData {
  
  @scala.inline
  def apply(sourceWorkerURI: String, workerURIs: String): UpdateWorkersData = {
    val __obj = js.Dynamic.literal(sourceWorkerURI = sourceWorkerURI.asInstanceOf[js.Any], workerURIs = workerURIs.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkersData]
  }
  
  @scala.inline
  implicit class UpdateWorkersDataOps[Self <: UpdateWorkersData] (val x: Self) extends AnyVal {
    
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
    def setSourceWorkerURI(value: String): Self = this.set("sourceWorkerURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerURIs(value: String): Self = this.set("workerURIs", value.asInstanceOf[js.Any])
  }
}
