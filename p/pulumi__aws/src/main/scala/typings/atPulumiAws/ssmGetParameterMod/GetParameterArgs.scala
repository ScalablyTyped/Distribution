package typings.atPulumiAws.ssmGetParameterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParameterArgs extends js.Object {
  /**
    * The name of the parameter.
    */
  val name: String
  /**
    * Whether to return decrypted `SecureString` value. Defaults to `true`.
    */
  val withDecryption: js.UndefOr[Boolean] = js.undefined
}

object GetParameterArgs {
  @scala.inline
  def apply(name: String, withDecryption: js.UndefOr[Boolean] = js.undefined): GetParameterArgs = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(withDecryption)) __obj.updateDynamic("withDecryption")(withDecryption)
    __obj.asInstanceOf[GetParameterArgs]
  }
}

