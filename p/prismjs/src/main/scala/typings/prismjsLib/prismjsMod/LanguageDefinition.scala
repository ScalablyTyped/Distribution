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

