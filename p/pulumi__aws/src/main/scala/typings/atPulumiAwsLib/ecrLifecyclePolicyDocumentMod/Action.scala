package typings
package atPulumiAwsLib.ecrLifecyclePolicyDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /**
    * The specified action type - the only supported value is `expire`.
    */
  var `type`: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.atPulumiAwsLibStrings.expire]
}

object Action {
  @scala.inline
  def apply(`type`: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.atPulumiAwsLibStrings.expire]): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

