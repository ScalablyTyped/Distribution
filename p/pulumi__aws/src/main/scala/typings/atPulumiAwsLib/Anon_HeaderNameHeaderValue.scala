package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeaderNameHeaderValue extends js.Object {
  var headerName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var headerValue: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var position: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_HeaderNameHeaderValue {
  @scala.inline
  def apply(
    headerName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    headerValue: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    position: atPulumiPulumiLib.outputMod.Input[scala.Double]
  ): Anon_HeaderNameHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headerName")(headerName.asInstanceOf[js.Any])
    __obj.updateDynamic("headerValue")(headerValue.asInstanceOf[js.Any])
    __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeaderNameHeaderValue]
  }
}

