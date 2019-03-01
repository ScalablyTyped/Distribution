package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredOptions
  extends prettierLib.prettierMod.docNs.printerNs.Options {
  /**
    * Include parentheses around a sole arrow function parameter.
    */
  var arrowParens: prettierLib.prettierLibStrings.avoid | prettierLib.prettierLibStrings.always
  /**
    * Print spaces between brackets in object literals.
    */
  var bracketSpacing: scala.Boolean
  /**
    * Which end of line characters to apply.
    */
  var endOfLine: prettierLib.prettierLibStrings.auto | prettierLib.prettierLibStrings.lf | prettierLib.prettierLibStrings.crlf | prettierLib.prettierLibStrings.cr
  /**
    * Specify the input filepath. This will be used to do parser inference.
    */
  var filepath: java.lang.String
  /**
    * How to handle whitespaces in HTML.
    */
  var htmlWhitespaceSensitivity: prettierLib.prettierLibStrings.css | prettierLib.prettierLibStrings.strict | prettierLib.prettierLibStrings.ignore
  /**
    * Prettier can insert a special @format marker at the top of files specifying that
    * the file has been formatted with prettier. This works well when used in tandem with
    * the --require-pragma option. If there is already a docblock at the top of
    * the file then this option will add a newline to it with the @format marker.
    */
  var insertPragma: scala.Boolean
  /**
    * Put the `>` of a multi-line JSX element at the end of the last line instead of being alone on the next line.
    */
  var jsxBracketSameLine: scala.Boolean
  /**
    * Use single quotes in JSX.
    */
  var jsxSingleQuote: scala.Boolean
  /**
    * Specify which parser to use.
    */
  var parser: BuiltInParserName | CustomParser
  /**
    * The plugin API is in a beta state.
    */
  var plugins: js.Array[java.lang.String | Plugin]
  /**
    * By default, Prettier will wrap markdown text as-is since some services use a linebreak-sensitive renderer.
    * In some cases you may want to rely on editor/viewer soft wrapping instead, so this option allows you to opt out.
    */
  var proseWrap: scala.Boolean | prettierLib.prettierLibStrings.always | prettierLib.prettierLibStrings.never | prettierLib.prettierLibStrings.preserve
  /**
    * Format only a segment of a file.
    */
  var rangeEnd: scala.Double
  /**
    * Format only a segment of a file.
    */
  var rangeStart: scala.Double
  /**
    * Prettier can restrict itself to only format files that contain a special comment, called a pragma, at the top of the file.
    * This is very useful when gradually transitioning large, unformatted codebases to prettier.
    */
  var requirePragma: scala.Boolean
  /**
    * Print semicolons at the ends of statements.
    */
  var semi: scala.Boolean
  /**
    * Use single quotes instead of double quotes.
    */
  var singleQuote: scala.Boolean
  /**
    * Print trailing commas wherever possible.
    */
  var trailingComma: prettierLib.prettierLibStrings.none | prettierLib.prettierLibStrings.es5 | prettierLib.prettierLibStrings.all
}

object RequiredOptions {
  @scala.inline
  def apply(
    arrowParens: prettierLib.prettierLibStrings.avoid | prettierLib.prettierLibStrings.always,
    bracketSpacing: scala.Boolean,
    endOfLine: prettierLib.prettierLibStrings.auto | prettierLib.prettierLibStrings.lf | prettierLib.prettierLibStrings.crlf | prettierLib.prettierLibStrings.cr,
    filepath: java.lang.String,
    htmlWhitespaceSensitivity: prettierLib.prettierLibStrings.css | prettierLib.prettierLibStrings.strict | prettierLib.prettierLibStrings.ignore,
    insertPragma: scala.Boolean,
    jsxBracketSameLine: scala.Boolean,
    jsxSingleQuote: scala.Boolean,
    parser: BuiltInParserName | CustomParser,
    plugins: js.Array[java.lang.String | Plugin],
    printWidth: scala.Double,
    proseWrap: scala.Boolean | prettierLib.prettierLibStrings.always | prettierLib.prettierLibStrings.never | prettierLib.prettierLibStrings.preserve,
    rangeEnd: scala.Double,
    rangeStart: scala.Double,
    requirePragma: scala.Boolean,
    semi: scala.Boolean,
    singleQuote: scala.Boolean,
    tabWidth: scala.Double,
    trailingComma: prettierLib.prettierLibStrings.none | prettierLib.prettierLibStrings.es5 | prettierLib.prettierLibStrings.all,
    useTabs: scala.Boolean
  ): RequiredOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrowParens")(arrowParens.asInstanceOf[js.Any])
    __obj.updateDynamic("bracketSpacing")(bracketSpacing)
    __obj.updateDynamic("endOfLine")(endOfLine.asInstanceOf[js.Any])
    __obj.updateDynamic("filepath")(filepath)
    __obj.updateDynamic("htmlWhitespaceSensitivity")(htmlWhitespaceSensitivity.asInstanceOf[js.Any])
    __obj.updateDynamic("insertPragma")(insertPragma)
    __obj.updateDynamic("jsxBracketSameLine")(jsxBracketSameLine)
    __obj.updateDynamic("jsxSingleQuote")(jsxSingleQuote)
    __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    __obj.updateDynamic("plugins")(plugins)
    __obj.updateDynamic("printWidth")(printWidth)
    __obj.updateDynamic("proseWrap")(proseWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("rangeEnd")(rangeEnd)
    __obj.updateDynamic("rangeStart")(rangeStart)
    __obj.updateDynamic("requirePragma")(requirePragma)
    __obj.updateDynamic("semi")(semi)
    __obj.updateDynamic("singleQuote")(singleQuote)
    __obj.updateDynamic("tabWidth")(tabWidth)
    __obj.updateDynamic("trailingComma")(trailingComma.asInstanceOf[js.Any])
    __obj.updateDynamic("useTabs")(useTabs)
    __obj.asInstanceOf[RequiredOptions]
  }
}

