package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RegionInput extends js.Object {
  var region: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_RegionInput {
  @scala.inline
  def apply(region: atPulumiPulumiLib.outputMod.Input[java.lang.String]): Anon_RegionInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RegionInput]
  }
}

