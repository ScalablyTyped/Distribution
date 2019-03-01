package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RegionNameInput extends js.Object {
  var regionName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_RegionNameInput {
  @scala.inline
  def apply(regionName: atPulumiPulumiLib.outputMod.Input[java.lang.String]): Anon_RegionNameInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("regionName")(regionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RegionNameInput]
  }
}

