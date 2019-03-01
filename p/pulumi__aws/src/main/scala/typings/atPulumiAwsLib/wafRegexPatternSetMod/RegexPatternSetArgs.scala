package typings
package atPulumiAwsLib.wafRegexPatternSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexPatternSetArgs extends js.Object {
  /**
    * The name or description of the Regex Pattern Set.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
    */
  val regexPatternStrings: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object RegexPatternSetArgs {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    regexPatternStrings: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): RegexPatternSetArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regexPatternStrings != null) __obj.updateDynamic("regexPatternStrings")(regexPatternStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSetArgs]
  }
}

