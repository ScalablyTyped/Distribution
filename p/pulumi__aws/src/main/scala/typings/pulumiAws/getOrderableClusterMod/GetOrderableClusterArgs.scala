package typings.pulumiAws.getOrderableClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrderableClusterArgs extends js.Object {
  
  /**
    * Reshift Cluster type. e.g. `multi-node` or `single-node`
    */
  val clusterType: js.UndefOr[String] = js.native
  
  /**
    * Redshift Cluster version. e.g. `1.0`
    */
  val clusterVersion: js.UndefOr[String] = js.native
  
  /**
    * Redshift Cluster node type. e.g. `dc2.8xlarge`
    */
  val nodeType: js.UndefOr[String] = js.native
  
  /**
    * Ordered list of preferred Redshift Cluster node types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
    */
  val preferredNodeTypes: js.UndefOr[js.Array[String]] = js.native
}
object GetOrderableClusterArgs {
  
  @scala.inline
  def apply(): GetOrderableClusterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrderableClusterArgs]
  }
  
  @scala.inline
  implicit class GetOrderableClusterArgsOps[Self <: GetOrderableClusterArgs] (val x: Self) extends AnyVal {
    
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
    def setClusterType(value: String): Self = this.set("clusterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterType: Self = this.set("clusterType", js.undefined)
    
    @scala.inline
    def setClusterVersion(value: String): Self = this.set("clusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterVersion: Self = this.set("clusterVersion", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("nodeType", js.undefined)
    
    @scala.inline
    def setPreferredNodeTypesVarargs(value: String*): Self = this.set("preferredNodeTypes", js.Array(value :_*))
    
    @scala.inline
    def setPreferredNodeTypes(value: js.Array[String]): Self = this.set("preferredNodeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredNodeTypes: Self = this.set("preferredNodeTypes", js.undefined)
  }
}
