package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resources extends js.Object {
  var Outputs: js.UndefOr[typings.serverless.awsProviderMod.Outputs] = js.undefined
  var Resources: CloudFormationResources
  var extensions: js.UndefOr[CloudFormationResources] = js.undefined
}

object Resources {
  @scala.inline
  def apply(
    Resources: CloudFormationResources,
    Outputs: Outputs = null,
    extensions: CloudFormationResources = null
  ): Resources = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
}

