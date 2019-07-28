package typings.atPulumiAws.secretsmanagerGetSecretMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret to retrieve.
    */
  val arn: js.UndefOr[String] = js.undefined
  /**
    * The name of the secret to retrieve.
    */
  val name: js.UndefOr[String] = js.undefined
}

object GetSecretArgs {
  @scala.inline
  def apply(arn: String = null, name: String = null): GetSecretArgs = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetSecretArgs]
  }
}

