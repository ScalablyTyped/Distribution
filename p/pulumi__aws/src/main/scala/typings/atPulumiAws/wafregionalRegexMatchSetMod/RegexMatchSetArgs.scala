package typings.atPulumiAws.wafregionalRegexMatchSetMod

import typings.atPulumiAws.Anon_FieldToMatchRegexPatternSetIdTextTransformation
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexMatchSetArgs extends js.Object {
  /**
    * The name or description of the Regex Match Set.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The regular expression pattern that you want AWS WAF to search for in web requests,
    * the location in requests that you want AWS WAF to search, and other settings. See below.
    */
  val regexMatchTuples: js.UndefOr[Input[js.Array[Input[Anon_FieldToMatchRegexPatternSetIdTextTransformation]]]] = js.undefined
}

object RegexMatchSetArgs {
  @scala.inline
  def apply(
    name: Input[String] = null,
    regexMatchTuples: Input[js.Array[Input[Anon_FieldToMatchRegexPatternSetIdTextTransformation]]] = null
  ): RegexMatchSetArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regexMatchTuples != null) __obj.updateDynamic("regexMatchTuples")(regexMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexMatchSetArgs]
  }
}

