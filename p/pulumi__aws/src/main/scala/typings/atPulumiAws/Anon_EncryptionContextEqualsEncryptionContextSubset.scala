package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionContextEqualsEncryptionContextSubset extends js.Object {
  var encryptionContextEquals: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  var encryptionContextSubset: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object Anon_EncryptionContextEqualsEncryptionContextSubset {
  @scala.inline
  def apply(
    encryptionContextEquals: Input[StringDictionary[Input[String]]] = null,
    encryptionContextSubset: Input[StringDictionary[Input[String]]] = null
  ): Anon_EncryptionContextEqualsEncryptionContextSubset = {
    val __obj = js.Dynamic.literal()
    if (encryptionContextEquals != null) __obj.updateDynamic("encryptionContextEquals")(encryptionContextEquals.asInstanceOf[js.Any])
    if (encryptionContextSubset != null) __obj.updateDynamic("encryptionContextSubset")(encryptionContextSubset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncryptionContextEqualsEncryptionContextSubset]
  }
}

