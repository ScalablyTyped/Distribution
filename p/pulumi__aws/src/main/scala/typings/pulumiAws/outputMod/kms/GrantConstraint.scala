package typings.pulumiAws.outputMod.kms

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantConstraint extends js.Object {
  /**
    * A list of key-value pairs that must match the encryption context in subsequent cryptographic operation requests. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint. Conflicts with `encryptionContextSubset`.
    */
  var encryptionContextEquals: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A list of key-value pairs that must be included in the encryption context of subsequent cryptographic operation requests. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs. Conflicts with `encryptionContextEquals`.
    */
  var encryptionContextSubset: js.UndefOr[StringDictionary[String]] = js.native
}

object GrantConstraint {
  @scala.inline
  def apply(
    encryptionContextEquals: StringDictionary[String] = null,
    encryptionContextSubset: StringDictionary[String] = null
  ): GrantConstraint = {
    val __obj = js.Dynamic.literal()
    if (encryptionContextEquals != null) __obj.updateDynamic("encryptionContextEquals")(encryptionContextEquals.asInstanceOf[js.Any])
    if (encryptionContextSubset != null) __obj.updateDynamic("encryptionContextSubset")(encryptionContextSubset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantConstraint]
  }
}

