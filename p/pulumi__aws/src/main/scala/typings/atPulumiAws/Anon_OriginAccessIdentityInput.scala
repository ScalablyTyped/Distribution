package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginAccessIdentityInput extends js.Object {
  var originAccessIdentity: Input[String]
}

object Anon_OriginAccessIdentityInput {
  @scala.inline
  def apply(originAccessIdentity: Input[String]): Anon_OriginAccessIdentityInput = {
    val __obj = js.Dynamic.literal(originAccessIdentity = originAccessIdentity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_OriginAccessIdentityInput]
  }
}

