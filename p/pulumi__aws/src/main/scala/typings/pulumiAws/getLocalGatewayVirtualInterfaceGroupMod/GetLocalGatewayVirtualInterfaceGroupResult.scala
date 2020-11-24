package typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceGroupFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocalGatewayVirtualInterfaceGroupResult extends js.Object {
  
  val filters: js.UndefOr[js.Array[GetLocalGatewayVirtualInterfaceGroupFilter]] = js.native
  
  val id: String = js.native
  
  val localGatewayId: String = js.native
  
  /**
    * Set of EC2 Local Gateway Virtual Interface identifiers.
    */
  val localGatewayVirtualInterfaceIds: js.Array[String] = js.native
  
  val tags: StringDictionary[String] = js.native
}
object GetLocalGatewayVirtualInterfaceGroupResult {
  
  @scala.inline
  def apply(
    id: String,
    localGatewayId: String,
    localGatewayVirtualInterfaceIds: js.Array[String],
    tags: StringDictionary[String]
  ): GetLocalGatewayVirtualInterfaceGroupResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localGatewayId = localGatewayId.asInstanceOf[js.Any], localGatewayVirtualInterfaceIds = localGatewayVirtualInterfaceIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceGroupResult]
  }
  
  @scala.inline
  implicit class GetLocalGatewayVirtualInterfaceGroupResultOps[Self <: GetLocalGatewayVirtualInterfaceGroupResult] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayId(value: String): Self = this.set("localGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceIdsVarargs(value: String*): Self = this.set("localGatewayVirtualInterfaceIds", js.Array(value :_*))
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceIds(value: js.Array[String]): Self = this.set("localGatewayVirtualInterfaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetLocalGatewayVirtualInterfaceGroupFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetLocalGatewayVirtualInterfaceGroupFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}
