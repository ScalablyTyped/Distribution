package typings
package atPulumiAwsLib.cloudfrontOriginAccessIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginAccessIdentityArgs extends js.Object {
  /**
    * An optional comment for the origin access identity.
    */
  val comment: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object OriginAccessIdentityArgs {
  @scala.inline
  def apply(comment: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): OriginAccessIdentityArgs = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginAccessIdentityArgs]
  }
}

