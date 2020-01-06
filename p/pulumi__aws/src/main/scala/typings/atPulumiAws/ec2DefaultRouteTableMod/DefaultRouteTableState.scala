package typings.atPulumiAws.ec2DefaultRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2.DefaultRouteTableRoute
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultRouteTableState extends js.Object {
  /**
    * The ID of the Default Routing Table.
    */
  val defaultRouteTableId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the AWS account that owns the route table
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of virtual gateways for propagation.
    */
  val propagatingVgws: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of route objects. Their keys are documented below.
    * This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val routes: js.UndefOr[Input[js.Array[Input[DefaultRouteTableRoute]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object DefaultRouteTableState {
  @scala.inline
  def apply(
    defaultRouteTableId: Input[String] = null,
    ownerId: Input[String] = null,
    propagatingVgws: Input[js.Array[Input[String]]] = null,
    routes: Input[js.Array[Input[DefaultRouteTableRoute]]] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null
  ): DefaultRouteTableState = {
    val __obj = js.Dynamic.literal()
    if (defaultRouteTableId != null) __obj.updateDynamic("defaultRouteTableId")(defaultRouteTableId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (propagatingVgws != null) __obj.updateDynamic("propagatingVgws")(propagatingVgws.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultRouteTableState]
  }
}

