package typings.pulumiAws.replicationSubnetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationSubnetGroupState extends js.Object {
  
  val replicationSubnetGroupArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The description for the subnet group.
    */
  val replicationSubnetGroupDescription: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name for the replication subnet group. This value is stored as a lowercase string.
    */
  val replicationSubnetGroupId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of the EC2 subnet IDs for the subnet group.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The ID of the VPC the subnet group is in.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}
object ReplicationSubnetGroupState {
  
  @scala.inline
  def apply(): ReplicationSubnetGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationSubnetGroupState]
  }
  
  @scala.inline
  implicit class ReplicationSubnetGroupStateOps[Self <: ReplicationSubnetGroupState] (val x: Self) extends AnyVal {
    
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
    def setReplicationSubnetGroupArn(value: Input[String]): Self = this.set("replicationSubnetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationSubnetGroupArn: Self = this.set("replicationSubnetGroupArn", js.undefined)
    
    @scala.inline
    def setReplicationSubnetGroupDescription(value: Input[String]): Self = this.set("replicationSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationSubnetGroupDescription: Self = this.set("replicationSubnetGroupDescription", js.undefined)
    
    @scala.inline
    def setReplicationSubnetGroupId(value: Input[String]): Self = this.set("replicationSubnetGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationSubnetGroupId: Self = this.set("replicationSubnetGroupId", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
