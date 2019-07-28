package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_VirtualNodeWeight extends js.Object {
  var virtualNode: Input[String]
  var weight: Input[Double]
}

object Anon_VirtualNodeWeight {
  @scala.inline
  def apply(virtualNode: Input[String], weight: Input[Double]): Anon_VirtualNodeWeight = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_VirtualNodeWeight]
  }
}

