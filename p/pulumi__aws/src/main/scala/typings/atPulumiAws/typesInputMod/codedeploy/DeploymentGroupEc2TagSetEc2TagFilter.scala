package typings.atPulumiAws.typesInputMod.codedeploy

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupEc2TagSetEc2TagFilter extends js.Object {
  /**
    * The key of the tag filter.
    */
  var key: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of the tag filter, either `KEY_ONLY`, `VALUE_ONLY`, or `KEY_AND_VALUE`.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
  /**
    * The value of the tag filter.
    */
  var value: js.UndefOr[Input[String]] = js.undefined
}

object DeploymentGroupEc2TagSetEc2TagFilter {
  @scala.inline
  def apply(key: Input[String] = null, `type`: Input[String] = null, value: Input[String] = null): DeploymentGroupEc2TagSetEc2TagFilter = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupEc2TagSetEc2TagFilter]
  }
}

