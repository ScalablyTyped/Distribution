package typings.atPulumiAws.typesOutputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupEc2TagSetEc2TagFilter extends js.Object {
  /**
    * The key of the tag filter.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The type of the tag filter, either `KEY_ONLY`, `VALUE_ONLY`, or `KEY_AND_VALUE`.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The value of the tag filter.
    */
  var value: js.UndefOr[String] = js.undefined
}

object DeploymentGroupEc2TagSetEc2TagFilter {
  @scala.inline
  def apply(key: String = null, `type`: String = null, value: String = null): DeploymentGroupEc2TagSetEc2TagFilter = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DeploymentGroupEc2TagSetEc2TagFilter]
  }
}

