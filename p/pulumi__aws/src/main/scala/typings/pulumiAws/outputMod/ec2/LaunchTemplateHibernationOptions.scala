package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateHibernationOptions extends js.Object {
  /**
    * If set to `true`, the launched EC2 instance will hibernation enabled.
    */
  var configured: Boolean = js.native
}

object LaunchTemplateHibernationOptions {
  @scala.inline
  def apply(configured: Boolean): LaunchTemplateHibernationOptions = {
    val __obj = js.Dynamic.literal(configured = configured.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LaunchTemplateHibernationOptions]
  }
}

