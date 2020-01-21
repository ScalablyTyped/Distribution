package typings.pulumiAws.outputMod.kms

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantConstraint extends js.Object {
  var encryptionContextEquals: js.UndefOr[StringDictionary[String]] = js.native
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

