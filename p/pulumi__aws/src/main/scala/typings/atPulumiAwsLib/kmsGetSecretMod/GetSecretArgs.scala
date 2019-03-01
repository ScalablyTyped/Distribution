package typings
package atPulumiAwsLib.kmsGetSecretMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretArgs extends js.Object {
  val __hasDynamicAttributes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * One or more encrypted payload definitions from the KMS
    * service.  See the Secret Definitions below.
    */
  val secrets: js.Array[atPulumiAwsLib.Anon_Context]
}

object GetSecretArgs {
  @scala.inline
  def apply(secrets: js.Array[atPulumiAwsLib.Anon_Context], __hasDynamicAttributes: java.lang.String = null): GetSecretArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("secrets")(secrets)
    if (__hasDynamicAttributes != null) __obj.updateDynamic("__hasDynamicAttributes")(__hasDynamicAttributes)
    __obj.asInstanceOf[GetSecretArgs]
  }
}

