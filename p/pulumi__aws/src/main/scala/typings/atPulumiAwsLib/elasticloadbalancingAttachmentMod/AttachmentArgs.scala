package typings
package atPulumiAwsLib.elasticloadbalancingAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentArgs extends js.Object {
  /**
    * The name of the ELB.
    */
  val elb: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Instance ID to place in the ELB pool.
    */
  val instance: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

