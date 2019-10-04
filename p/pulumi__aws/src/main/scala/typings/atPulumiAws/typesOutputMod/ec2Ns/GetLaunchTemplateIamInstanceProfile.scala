package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchTemplateIamInstanceProfile extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  var arn: String
  /**
    * The name of the launch template.
    */
  var name: String
}

object GetLaunchTemplateIamInstanceProfile {
  @scala.inline
  def apply(arn: String, name: String): GetLaunchTemplateIamInstanceProfile = {
    val __obj = js.Dynamic.literal(arn = arn, name = name)
  
    __obj.asInstanceOf[GetLaunchTemplateIamInstanceProfile]
  }
}

