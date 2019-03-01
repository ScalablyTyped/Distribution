package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthMechanismAuthSource extends js.Object {
  var authMechanism: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var authSource: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var authType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var docsToInvestigate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var extractDocId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var nestingLevel: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AuthMechanismAuthSource {
  @scala.inline
  def apply(
    authMechanism: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    authSource: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    authType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    docsToInvestigate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    extractDocId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    nestingLevel: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AuthMechanismAuthSource = {
    val __obj = js.Dynamic.literal()
    if (authMechanism != null) __obj.updateDynamic("authMechanism")(authMechanism.asInstanceOf[js.Any])
    if (authSource != null) __obj.updateDynamic("authSource")(authSource.asInstanceOf[js.Any])
    if (authType != null) __obj.updateDynamic("authType")(authType.asInstanceOf[js.Any])
    if (docsToInvestigate != null) __obj.updateDynamic("docsToInvestigate")(docsToInvestigate.asInstanceOf[js.Any])
    if (extractDocId != null) __obj.updateDynamic("extractDocId")(extractDocId.asInstanceOf[js.Any])
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthMechanismAuthSource]
  }
}

