package typings.atPulumiAws.secretsmanagerGetSecretMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret to retrieve.
    */
  val arn: js.UndefOr[String] = js.native
  /**
    * The name of the secret to retrieve.
    */
  val name: js.UndefOr[String] = js.native
}

object GetSecretArgs {
  @scala.inline
  def apply(arn: String = null, name: String = null): GetSecretArgs = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretArgs]
  }
}

