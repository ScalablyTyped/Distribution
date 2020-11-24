package typings.pulumiAws.getOrderableClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrderableClusterResult extends js.Object {
  
  /**
    * List of Availability Zone names where the Redshit Cluster is available.
    */
  val availabilityZones: js.Array[String] = js.native
  
  val clusterType: String = js.native
  
  val clusterVersion: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val nodeType: String = js.native
  
  val preferredNodeTypes: js.UndefOr[js.Array[String]] = js.native
}
object GetOrderableClusterResult {
  
  @scala.inline
  def apply(
    availabilityZones: js.Array[String],
    clusterType: String,
    clusterVersion: String,
    id: String,
    nodeType: String
  ): GetOrderableClusterResult = {
    val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], clusterType = clusterType.asInstanceOf[js.Any], clusterVersion = clusterVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrderableClusterResult]
  }
  
  @scala.inline
  implicit class GetOrderableClusterResultOps[Self <: GetOrderableClusterResult] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: js.Array[String]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterType(value: String): Self = this.set("clusterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterVersion(value: String): Self = this.set("clusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeType(value: String): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredNodeTypesVarargs(value: String*): Self = this.set("preferredNodeTypes", js.Array(value :_*))
    
    @scala.inline
    def setPreferredNodeTypes(value: js.Array[String]): Self = this.set("preferredNodeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredNodeTypes: Self = this.set("preferredNodeTypes", js.undefined)
  }
}
