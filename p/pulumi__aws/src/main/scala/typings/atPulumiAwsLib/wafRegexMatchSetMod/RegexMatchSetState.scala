package typings
package atPulumiAwsLib.wafRegexMatchSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexMatchSetState extends js.Object {
  /**
    * The name or description of the Regex Match Set.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The regular expression pattern that you want AWS WAF to search for in web requests,
    * the location in requests that you want AWS WAF to search, and other settings. See below.
    */
  val regexMatchTuples: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FieldToMatchRegexPatternSetIdTextTransformation]
      ]
    ]
  ] = js.undefined
}

object RegexMatchSetState {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    regexMatchTuples: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FieldToMatchRegexPatternSetIdTextTransformation]
      ]
    ] = null
  ): RegexMatchSetState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regexMatchTuples != null) __obj.updateDynamic("regexMatchTuples")(regexMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexMatchSetState]
  }
}

