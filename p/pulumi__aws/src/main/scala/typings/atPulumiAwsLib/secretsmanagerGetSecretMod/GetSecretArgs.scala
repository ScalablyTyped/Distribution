package typings
package atPulumiAwsLib.secretsmanagerGetSecretMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret to retrieve.
    */
  val arn: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the secret to retrieve.
    */
  val name: js.UndefOr[java.lang.String] = js.undefined
}

object GetSecretArgs {
  @scala.inline
  def apply(arn: java.lang.String = null, name: java.lang.String = null): GetSecretArgs = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetSecretArgs]
  }
}

