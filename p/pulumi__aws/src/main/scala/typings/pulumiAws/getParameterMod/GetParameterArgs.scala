package typings.pulumiAws.getParameterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParameterArgs extends js.Object {
  /**
    * The name of the parameter.
    */
  val name: String = js.native
  /**
    * Whether to return decrypted `SecureString` value. Defaults to `true`.
    */
  val withDecryption: js.UndefOr[Boolean] = js.native
}

object GetParameterArgs {
  @scala.inline
  def apply(name: String, withDecryption: js.UndefOr[Boolean] = js.undefined): GetParameterArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(withDecryption)) __obj.updateDynamic("withDecryption")(withDecryption.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameterArgs]
  }
}

