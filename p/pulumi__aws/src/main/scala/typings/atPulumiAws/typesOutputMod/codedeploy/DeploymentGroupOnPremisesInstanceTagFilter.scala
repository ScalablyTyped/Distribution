package typings.atPulumiAws.typesOutputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupOnPremisesInstanceTagFilter extends js.Object {
  /**
    * The key of the tag filter.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The type of the tag filter, either `KEY_ONLY`, `VALUE_ONLY`, or `KEY_AND_VALUE`.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The value of the tag filter.
    */
  var value: js.UndefOr[String] = js.native
}

object DeploymentGroupOnPremisesInstanceTagFilter {
  @scala.inline
  def apply(key: String = null, `type`: String = null, value: String = null): DeploymentGroupOnPremisesInstanceTagFilter = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupOnPremisesInstanceTagFilter]
  }
}

