package typings.atPulumiAws.lightsailStaticIpAttachmentMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticIpAttachmentArgs extends js.Object {
  /**
    * The name of the Lightsail instance to attach the IP to
    */
  val instanceName: Input[String]
  /**
    * The name of the allocated static IP
    */
  val staticIpName: Input[String]
}

object StaticIpAttachmentArgs {
  @scala.inline
  def apply(instanceName: Input[String], staticIpName: Input[String]): StaticIpAttachmentArgs = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], staticIpName = staticIpName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StaticIpAttachmentArgs]
  }
}

