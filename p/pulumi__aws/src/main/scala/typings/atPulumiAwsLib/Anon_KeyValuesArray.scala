package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValuesArray extends js.Object {
  var key: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var values: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
}

object Anon_KeyValuesArray {
  @scala.inline
  def apply(
    key: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    values: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ): Anon_KeyValuesArray = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyValuesArray]
  }
}

