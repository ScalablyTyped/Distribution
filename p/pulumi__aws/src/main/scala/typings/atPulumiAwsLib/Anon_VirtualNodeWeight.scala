package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_VirtualNodeWeight extends js.Object {
  var virtualNode: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var weight: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_VirtualNodeWeight {
  @scala.inline
  def apply(
    virtualNode: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    weight: atPulumiPulumiLib.outputMod.Input[scala.Double]
  ): Anon_VirtualNodeWeight = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_VirtualNodeWeight]
  }
}

