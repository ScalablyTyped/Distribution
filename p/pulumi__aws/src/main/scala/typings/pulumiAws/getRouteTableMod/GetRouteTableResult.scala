package typings.pulumiAws.getRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2transitgateway.GetRouteTableFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRouteTableResult extends js.Object {
  
  /**
    * EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
    */
  val arn: String = js.native
  
  /**
    * Boolean whether this is the default association route table for the EC2 Transit Gateway
    */
  val defaultAssociationRouteTable: Boolean = js.native
  
  /**
    * Boolean whether this is the default propagation route table for the EC2 Transit Gateway
    */
  val defaultPropagationRouteTable: Boolean = js.native
  
  val filters: js.UndefOr[js.Array[GetRouteTableFilter]] = js.native
  
  /**
    * EC2 Transit Gateway Route Table identifier
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * Key-value tags for the EC2 Transit Gateway Route Table
    */
  val tags: StringDictionary[String] = js.native
  
  /**
    * EC2 Transit Gateway identifier
    */
  val transitGatewayId: String = js.native
}
object GetRouteTableResult {
  
  @scala.inline
  def apply(
    arn: String,
    defaultAssociationRouteTable: Boolean,
    defaultPropagationRouteTable: Boolean,
    tags: StringDictionary[String],
    transitGatewayId: String
  ): GetRouteTableResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], defaultAssociationRouteTable = defaultAssociationRouteTable.asInstanceOf[js.Any], defaultPropagationRouteTable = defaultPropagationRouteTable.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteTableResult]
  }
  
  @scala.inline
  implicit class GetRouteTableResultOps[Self <: GetRouteTableResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAssociationRouteTable(value: Boolean): Self = this.set("defaultAssociationRouteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropagationRouteTable(value: Boolean): Self = this.set("defaultPropagationRouteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetRouteTableFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetRouteTableFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
