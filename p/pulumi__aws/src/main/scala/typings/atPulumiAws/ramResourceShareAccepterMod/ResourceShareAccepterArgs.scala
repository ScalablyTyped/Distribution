package typings.atPulumiAws.ramResourceShareAccepterMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceShareAccepterArgs extends js.Object {
  /**
    * The ARN of the resource share.
    */
  val shareArn: Input[String] = js.native
}

object ResourceShareAccepterArgs {
  @scala.inline
  def apply(shareArn: Input[String]): ResourceShareAccepterArgs = {
    val __obj = js.Dynamic.literal(shareArn = shareArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceShareAccepterArgs]
  }
}

