package typings.pulumiAws.getSecurityGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetSecurityGroupFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecurityGroupArgs extends js.Object {
  
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetSecurityGroupFilter]] = js.native
  
  /**
    * The id of the specific security group to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html).
    */
  val name: js.UndefOr[String] = js.native
  
  /**
    * A map of tags, each pair of which must exactly match
    * a pair on the desired security group.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The id of the VPC that the desired security group belongs to.
    */
  val vpcId: js.UndefOr[String] = js.native
}
object GetSecurityGroupArgs {
  
  @scala.inline
  def apply(): GetSecurityGroupArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityGroupArgs]
  }
  
  @scala.inline
  implicit class GetSecurityGroupArgsOps[Self <: GetSecurityGroupArgs] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: GetSecurityGroupFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetSecurityGroupFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
