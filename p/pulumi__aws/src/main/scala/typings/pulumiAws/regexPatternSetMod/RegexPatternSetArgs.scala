package typings.pulumiAws.regexPatternSetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexPatternSetArgs extends js.Object {
  /**
    * The name or description of the Regex Pattern Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
    */
  val regexPatternStrings: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object RegexPatternSetArgs {
  @scala.inline
  def apply(name: Input[String] = null, regexPatternStrings: Input[js.Array[Input[String]]] = null): RegexPatternSetArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regexPatternStrings != null) __obj.updateDynamic("regexPatternStrings")(regexPatternStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSetArgs]
  }
}

