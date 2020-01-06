package typings.atPulumiAws.cloudfrontOriginAccessIdentityMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginAccessIdentityArgs extends js.Object {
  /**
    * An optional comment for the origin access identity.
    */
  val comment: js.UndefOr[Input[String]] = js.native
}

object OriginAccessIdentityArgs {
  @scala.inline
  def apply(comment: Input[String] = null): OriginAccessIdentityArgs = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginAccessIdentityArgs]
  }
}

