package typings
package atPulumiAwsLib.lightsailStaticIpAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticIpAttachmentState extends js.Object {
  /**
    * The name of the Lightsail instance to attach the IP to
    */
  val instanceName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the allocated static IP
    */
  val staticIpName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

