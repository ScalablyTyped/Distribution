package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameValue extends js.Object {
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var value: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_NameValue {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    value: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_NameValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NameValue]
  }
}

