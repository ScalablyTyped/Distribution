package typings
package atPulumiAwsLib.ssmGetParameterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParameterArgs extends js.Object {
  /**
    * The name of the parameter.
    */
  val name: java.lang.String
  /**
    * Whether to return decrypted `SecureString` value. Defaults to `true`.
    */
  val withDecryption: js.UndefOr[scala.Boolean] = js.undefined
}

object GetParameterArgs {
  @scala.inline
  def apply(name: java.lang.String, withDecryption: js.UndefOr[scala.Boolean] = js.undefined): GetParameterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(withDecryption)) __obj.updateDynamic("withDecryption")(withDecryption)
    __obj.asInstanceOf[GetParameterArgs]
  }
}

