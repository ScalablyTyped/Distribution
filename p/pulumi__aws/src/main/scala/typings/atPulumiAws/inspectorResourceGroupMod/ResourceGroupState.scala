package typings.atPulumiAws.inspectorResourceGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceGroupState extends js.Object {
  /**
    * The resource group ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The tags on your EC2 Instance.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ResourceGroupState {
  @scala.inline
  def apply(arn: Input[String] = null, tags: Input[StringDictionary[_]] = null): ResourceGroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceGroupState]
  }
}

