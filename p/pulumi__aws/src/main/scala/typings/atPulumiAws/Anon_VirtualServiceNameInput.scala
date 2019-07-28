package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_VirtualServiceNameInput extends js.Object {
  var virtualServiceName: Input[String]
}

object Anon_VirtualServiceNameInput {
  @scala.inline
  def apply(virtualServiceName: Input[String]): Anon_VirtualServiceNameInput = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_VirtualServiceNameInput]
  }
}

