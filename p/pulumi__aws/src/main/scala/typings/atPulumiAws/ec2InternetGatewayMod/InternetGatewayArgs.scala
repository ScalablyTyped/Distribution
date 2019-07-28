package typings.atPulumiAws.ec2InternetGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternetGatewayArgs extends js.Object {
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The VPC ID to create in.
    */
  val vpcId: js.UndefOr[Input[String]] = js.undefined
}

object InternetGatewayArgs {
  @scala.inline
  def apply(tags: Input[StringDictionary[_]] = null, vpcId: Input[String] = null): InternetGatewayArgs = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternetGatewayArgs]
  }
}

