package typings
package prismjsLib.prismjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageDefinition extends js.Object {
  /**
    * This option can be used to define one or more aliases for the matched token. The result will be, that the styles
    * of the token and its aliases are combined. This can be useful, to combine the styling of a well known token,
    * which is already supported by most of the themes, with a semantically correct token name. The option can be
    * set to a string literal or an array of string literals. In the following example the token name latex-equation
    * is not supported by any theme, but it will be highlighted the same as a string.
    */
  var alias: js.UndefOr[java.lang.String] = js.undefined
  var atrule: js.UndefOr[stdLib.RegExp | LanguageDefinition] = js.undefined
  var boolean: js.UndefOr[stdLib.RegExp | LanguageDefinition] = js.undefined
  var function: js.UndefOr[stdLib.RegExp | LanguageDefinition] = js.undefined
  var important: js.UndefOr[stdLib.RegExp | LanguageDefinition] = js.undefined
  /**
    * This property accepts another object literal, with tokens that are allowed to be nested in this token.
    * This makes it easier to define certain languages. However, keep in mind that they’re slower and if coded poorly,
    * can even result in infinite recursion. For an example of nested tokens, check out the Markup language definition
    */
  var inside: js.UndefOr[LanguageDefinition] = js.undefined
  var keyword: js.UndefOr[stdLib.RegExp | LanguageDefinition] = js.undefined
  /**
    * This option mitigates JavaScript’s lack of lookbehind. When set to true, the first capturing group in the regex
    * pattern is discarded when matching this token, so it effectively behaves as if it was lookbehind
    */
  var lookbehind: js.UndefOr[scala.Boolean] = js.undefined
  var number: js.UndefOr[stdLib.RegExp | LanguageDefinition] = js.undefined
  var operator: js.UndefOr[stdLib.RegExp | LanguageDefinition] = js.undefined
  var pattern: js.UndefOr[stdLib.RegExp] = js.undefined
  var property: js.UndefOr[stdLib.RegExp | LanguageDefinition] = js.undefined
  var punctuation: js.UndefOr[stdLib.RegExp | LanguageDefinition] = js.undefined
  /**
    * Accepts an object literal with tokens and appends them to the end of the current object literal.
    */
  var rest: js.UndefOr[js.Array[Token]] = js.undefined
  var selector: js.UndefOr[stdLib.RegExp | LanguageDefinition] = js.undefined
  var string: js.UndefOr[stdLib.RegExp | LanguageDefinition] = js.undefined
  var style: js.UndefOr[stdLib.RegExp | LanguageDefinition] = js.undefined
  var url: js.UndefOr[stdLib.RegExp | LanguageDefinition] = js.undefined
}

object LanguageDefinition {
  @scala.inline
  def apply(
    alias: java.lang.String = null,
    atrule: stdLib.RegExp | LanguageDefinition = null,
    boolean: stdLib.RegExp | LanguageDefinition = null,
    function: stdLib.RegExp | LanguageDefinition = null,
    important: stdLib.RegExp | LanguageDefinition = null,
    inside: LanguageDefinition = null,
    keyword: stdLib.RegExp | LanguageDefinition = null,
    lookbehind: js.UndefOr[scala.Boolean] = js.undefined,
    number: stdLib.RegExp | LanguageDefinition = null,
    operator: stdLib.RegExp | LanguageDefinition = null,
    pattern: stdLib.RegExp = null,
    property: stdLib.RegExp | LanguageDefinition = null,
    punctuation: stdLib.RegExp | LanguageDefinition = null,
    rest: js.Array[Token] = null,
    selector: stdLib.RegExp | LanguageDefinition = null,
    string: stdLib.RegExp | LanguageDefinition = null,
    style: stdLib.RegExp | LanguageDefinition = null,
    url: stdLib.RegExp | LanguageDefinition = null
  ): LanguageDefinition = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (atrule != null) __obj.updateDynamic("atrule")(atrule.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (important != null) __obj.updateDynamic("important")(important.asInstanceOf[js.Any])
    if (inside != null) __obj.updateDynamic("inside")(inside)
    if (keyword != null) __obj.updateDynamic("keyword")(keyword.asInstanceOf[js.Any])
    if (!js.isUndefined(lookbehind)) __obj.updateDynamic("lookbehind")(lookbehind)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (punctuation != null) __obj.updateDynamic("punctuation")(punctuation.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest)
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDefinition]
  }
}

