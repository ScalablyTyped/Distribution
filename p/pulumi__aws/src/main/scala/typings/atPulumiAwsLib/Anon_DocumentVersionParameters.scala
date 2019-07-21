package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentVersionParameters extends js.Object {
  var documentVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var parameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameValuesArray]]]
  ] = js.undefined
}

object Anon_DocumentVersionParameters {
  @scala.inline
  def apply(
    documentVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    parameters: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameValuesArray]]] = null
  ): Anon_DocumentVersionParameters = {
    val __obj = js.Dynamic.literal()
    if (documentVersion != null) __obj.updateDynamic("documentVersion")(documentVersion.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DocumentVersionParameters]
  }
}

