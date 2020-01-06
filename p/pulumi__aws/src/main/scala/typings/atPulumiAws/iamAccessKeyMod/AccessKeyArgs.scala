package typings.atPulumiAws.iamAccessKeyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessKeyArgs extends js.Object {
  /**
    * Either a base-64 encoded PGP public key, or a
    * keybase username in the form `keybase:some_person_that_exists`, for use
    * in the `encryptedSecret` output attribute.
    */
  val pgpKey: js.UndefOr[Input[String]] = js.native
  /**
    * The access key status to apply. Defaults to `Active`.
    * Valid values are `Active` and `Inactive`.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM user to associate with this access key.
    */
  val user: Input[String] = js.native
}

object AccessKeyArgs {
  @scala.inline
  def apply(user: Input[String], pgpKey: Input[String] = null, status: Input[String] = null): AccessKeyArgs = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    if (pgpKey != null) __obj.updateDynamic("pgpKey")(pgpKey.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKeyArgs]
  }
}

