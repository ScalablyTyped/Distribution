package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OwnerInput extends js.Object {
  var owner: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_OwnerInput {
  @scala.inline
  def apply(owner: atPulumiPulumiLib.outputMod.Input[java.lang.String]): Anon_OwnerInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OwnerInput]
  }
}

