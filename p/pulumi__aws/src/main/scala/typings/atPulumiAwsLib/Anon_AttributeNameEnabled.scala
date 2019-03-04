package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeNameEnabled extends js.Object {
  var attributeName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
}

object Anon_AttributeNameEnabled {
  @scala.inline
  def apply(
    attributeName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  ): Anon_AttributeNameEnabled = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AttributeNameEnabled]
  }
}

