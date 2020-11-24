package typings.pulumiAws.getServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceArgs extends js.Object {
  
  /**
    * The arn of the ECS Cluster
    */
  val clusterArn: String = js.native
  
  /**
    * The name of the ECS Service
    */
  val serviceName: String = js.native
}
object GetServiceArgs {
  
  @scala.inline
  def apply(clusterArn: String, serviceName: String): GetServiceArgs = {
    val __obj = js.Dynamic.literal(clusterArn = clusterArn.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceArgs]
  }
  
  @scala.inline
  implicit class GetServiceArgsOps[Self <: GetServiceArgs] (val x: Self) extends AnyVal {
    
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
    def setClusterArn(value: String): Self = this.set("clusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
  }
}
