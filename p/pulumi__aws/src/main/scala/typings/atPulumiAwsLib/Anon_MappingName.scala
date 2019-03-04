package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MappingName extends js.Object {
  var mapping: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var sqlType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_MappingName {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    sqlType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    mapping: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_MappingName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sqlType = sqlType.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MappingName]
  }
}

