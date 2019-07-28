package typings.atPulumiAws.ec2RouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_CidrBlockEgressOnlyGatewayId
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTableState extends js.Object {
  /**
    * The ID of the AWS account that owns the route table
    */
  val ownerId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of virtual gateways for propagation.
    */
  val propagatingVgws: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A list of route objects. Their keys are documented below. This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val routes: js.UndefOr[Input[js.Array[Input[Anon_CidrBlockEgressOnlyGatewayId]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The VPC ID.
    */
  val vpcId: js.UndefOr[Input[String]] = js.undefined
}

object RouteTableState {
  @scala.inline
  def apply(
    ownerId: Input[String] = null,
    propagatingVgws: Input[js.Array[Input[String]]] = null,
    routes: Input[js.Array[Input[Anon_CidrBlockEgressOnlyGatewayId]]] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null
  ): RouteTableState = {
    val __obj = js.Dynamic.literal()
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (propagatingVgws != null) __obj.updateDynamic("propagatingVgws")(propagatingVgws.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableState]
  }
}

