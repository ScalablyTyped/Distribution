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

