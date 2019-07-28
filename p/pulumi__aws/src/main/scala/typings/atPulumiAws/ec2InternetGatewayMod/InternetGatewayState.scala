package typings.atPulumiAws.ec2InternetGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternetGatewayState extends js.Object {
  /**
    * The ID of the AWS account that owns the internet gateway.
    */
  val ownerId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The VPC ID to create in.
    */
  val vpcId: js.UndefOr[Input[String]] = js.undefined
}

object InternetGatewayState {
  @scala.inline
  def apply(
    ownerId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null
  ): InternetGatewayState = {
    val __obj = js.Dynamic.literal()
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternetGatewayState]
  }
}

