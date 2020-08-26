package typings.pulumiAws.localGatewayRouteTableVpcAssociationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGatewayRouteTableVpcAssociationArgs extends js.Object {
  /**
    * Identifier of EC2 Local Gateway Route Table.
    */
  val localGatewayRouteTableId: Input[String] = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: Input[String] = js.native
}

object LocalGatewayRouteTableVpcAssociationArgs {
  @scala.inline
  def apply(localGatewayRouteTableId: Input[String], vpcId: Input[String]): LocalGatewayRouteTableVpcAssociationArgs = {
    val __obj = js.Dynamic.literal(localGatewayRouteTableId = localGatewayRouteTableId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalGatewayRouteTableVpcAssociationArgs]
  }
  @scala.inline
  implicit class LocalGatewayRouteTableVpcAssociationArgsOps[Self <: LocalGatewayRouteTableVpcAssociationArgs] (val x: Self) extends AnyVal {
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
    def setLocalGatewayRouteTableId(value: Input[String]): Self = this.set("localGatewayRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

