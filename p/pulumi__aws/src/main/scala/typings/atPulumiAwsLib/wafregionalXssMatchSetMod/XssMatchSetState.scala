package typings
package atPulumiAwsLib.wafregionalXssMatchSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XssMatchSetState extends js.Object {
  /**
    * The name of the set
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The parts of web requests that you want to inspect for cross-site scripting attacks.
    */
  val xssMatchTuples: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FieldToMatchTextTransformationAnonDataTypeInput]
      ]
    ]
  ] = js.undefined
}

object XssMatchSetState {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    xssMatchTuples: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FieldToMatchTextTransformationAnonDataTypeInput]
      ]
    ] = null
  ): XssMatchSetState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (xssMatchTuples != null) __obj.updateDynamic("xssMatchTuples")(xssMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[XssMatchSetState]
  }
}

