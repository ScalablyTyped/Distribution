package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resources extends js.Object {
  var Outputs: typings.serverless.awsProviderMod.Outputs
  var Resources: CloudFormationResources
  var extensions: CloudFormationResources
}

object Resources {
  @scala.inline
  def apply(Outputs: Outputs, Resources: CloudFormationResources, extensions: CloudFormationResources): Resources = {
    val __obj = js.Dynamic.literal(Outputs = Outputs.asInstanceOf[js.Any], Resources = Resources.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
}

