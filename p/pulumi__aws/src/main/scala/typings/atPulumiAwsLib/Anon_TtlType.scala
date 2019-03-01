package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TtlType extends js.Object {
  var ttl: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_TtlType {
  @scala.inline
  def apply(
    ttl: atPulumiPulumiLib.outputMod.Input[scala.Double],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_TtlType = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TtlType]
  }
}

