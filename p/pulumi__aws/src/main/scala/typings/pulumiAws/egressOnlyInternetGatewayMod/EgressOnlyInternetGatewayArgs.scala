package typings.pulumiAws.egressOnlyInternetGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EgressOnlyInternetGatewayArgs extends js.Object {
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The VPC ID to create in.
    */
  val vpcId: Input[String] = js.native
}

object EgressOnlyInternetGatewayArgs {
  @scala.inline
  def apply(vpcId: Input[String], tags: Input[StringDictionary[_]] = null): EgressOnlyInternetGatewayArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EgressOnlyInternetGatewayArgs]
  }
}

