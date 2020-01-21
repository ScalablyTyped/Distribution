package typings.pulumiAws.staticIpAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticIpAttachmentArgs extends js.Object {
  /**
    * The name of the Lightsail instance to attach the IP to
    */
  val instanceName: Input[String] = js.native
  /**
    * The name of the allocated static IP
    */
  val staticIpName: Input[String] = js.native
}

object StaticIpAttachmentArgs {
  @scala.inline
  def apply(instanceName: Input[String], staticIpName: Input[String]): StaticIpAttachmentArgs = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], staticIpName = staticIpName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StaticIpAttachmentArgs]
  }
}

