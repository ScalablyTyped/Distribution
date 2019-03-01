package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountInput extends js.Object {
  var count: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_CountInput {
  @scala.inline
  def apply(count: atPulumiPulumiLib.outputMod.Input[scala.Double]): Anon_CountInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CountInput]
  }
}

