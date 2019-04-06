package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_VirtualServiceAnonVirtualServiceNameInput extends js.Object {
  var virtualService: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_VirtualServiceNameInput]] = js.undefined
}

object Anon_VirtualServiceAnonVirtualServiceNameInput {
  @scala.inline
  def apply(virtualService: atPulumiPulumiLib.outputMod.Input[Anon_VirtualServiceNameInput] = null): Anon_VirtualServiceAnonVirtualServiceNameInput = {
    val __obj = js.Dynamic.literal()
    if (virtualService != null) __obj.updateDynamic("virtualService")(virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_VirtualServiceAnonVirtualServiceNameInput]
  }
}

