package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginAccessIdentityInput extends js.Object {
  var originAccessIdentity: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_OriginAccessIdentityInput {
  @scala.inline
  def apply(originAccessIdentity: atPulumiPulumiLib.outputMod.Input[java.lang.String]): Anon_OriginAccessIdentityInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("originAccessIdentity")(originAccessIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OriginAccessIdentityInput]
  }
}

