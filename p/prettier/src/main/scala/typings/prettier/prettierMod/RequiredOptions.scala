package typings.prettier.prettierMod

import typings.prettier.prettierStrings.`as-needed`
import typings.prettier.prettierStrings.all
import typings.prettier.prettierStrings.always
import typings.prettier.prettierStrings.auto
import typings.prettier.prettierStrings.avoid
import typings.prettier.prettierStrings.consistent
import typings.prettier.prettierStrings.cr
import typings.prettier.prettierStrings.crlf
import typings.prettier.prettierStrings.css
import typings.prettier.prettierStrings.es5
import typings.prettier.prettierStrings.ignore
import typings.prettier.prettierStrings.lf
import typings.prettier.prettierStrings.never
import typings.prettier.prettierStrings.none
import typings.prettier.prettierStrings.preserve
import typings.prettier.prettierStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredOptions
  extends typings.prettier.prettierMod.doc.printer.Options {
  /**
    * Include parentheses around a sole arrow function parameter.
    */
  var arrowParens: avoid | always
  /**
    * Print spaces between brackets in object literals.
    */
  var bracketSpacing: Boolean
  /**
    * Which end of line characters to apply.
    */
  var endOfLine: auto | lf | crlf | cr
  /**
    * Specify the input filepath. This will be used to do parser inference.
    */
  var filepath: String
  /**
    * How to handle whitespaces in HTML.
    */
  var htmlWhitespaceSensitivity: css | strict | ignore
  /**
    * Prettier can insert a special @format marker at the top of files specifying that
    * the file has been formatted with prettier. This works well when used in tandem with
    * the --require-pragma option. If there is already a docblock at the top of
    * the file then this option will add a newline to it with the @format marker.
    */
  var insertPragma: Boolean
  /**
    * Put the `>` of a multi-line JSX element at the end of the last line instead of being alone on the next line.
    */
  var jsxBracketSameLine: Boolean
  /**
    * Use single quotes in JSX.
    */
  var jsxSingleQuote: Boolean
  /**
    * Specify which parser to use.
    */
  var parser: BuiltInParserName | CustomParser
  /**
    * The plugin API is in a beta state.
    */
  var plugins: js.Array[String | Plugin]
  /**
    * By default, Prettier will wrap markdown text as-is since some services use a linebreak-sensitive renderer.
    * In some cases you may want to rely on editor/viewer soft wrapping instead, so this option allows you to opt out.
    */
  var proseWrap: Boolean | always | never | preserve
  /**
    * Change when properties in objects are quoted.
    */
  var quoteProps: `as-needed` | consistent | preserve
  /**
    * Format only a segment of a file.
    */
  var rangeEnd: Double
  /**
    * Format only a segment of a file.
    */
  var rangeStart: Double
  /**
    * Prettier can restrict itself to only format files that contain a special comment, called a pragma, at the top of the file.
    * This is very useful when gradually transitioning large, unformatted codebases to prettier.
    */
  var requirePragma: Boolean
  /**
    * Print semicolons at the ends of statements.
    */
  var semi: Boolean
  /**
    * Use single quotes instead of double quotes.
    */
  var singleQuote: Boolean
  /**
    * Print trailing commas wherever possible.
    */
  var trailingComma: none | es5 | all
  /**
    * Whether or not to indent the code inside <script> and <style> tags in Vue files.
    */
  var vueIndentScriptAndStyle: Boolean
}

object RequiredOptions {
  @scala.inline
  def apply(
    arrowParens: avoid | always,
    bracketSpacing: Boolean,
    endOfLine: auto | lf | crlf | cr,
    filepath: String,
    htmlWhitespaceSensitivity: css | strict | ignore,
    insertPragma: Boolean,
    jsxBracketSameLine: Boolean,
    jsxSingleQuote: Boolean,
    parser: BuiltInParserName | CustomParser,
    plugins: js.Array[String | Plugin],
    printWidth: Double,
    proseWrap: Boolean | always | never | preserve,
    quoteProps: `as-needed` | consistent | preserve,
    rangeEnd: Double,
    rangeStart: Double,
    requirePragma: Boolean,
    semi: Boolean,
    singleQuote: Boolean,
    tabWidth: Double,
    trailingComma: none | es5 | all,
    useTabs: Boolean,
    vueIndentScriptAndStyle: Boolean
  ): RequiredOptions = {
    val __obj = js.Dynamic.literal(arrowParens = arrowParens.asInstanceOf[js.Any], bracketSpacing = bracketSpacing, endOfLine = endOfLine.asInstanceOf[js.Any], filepath = filepath, htmlWhitespaceSensitivity = htmlWhitespaceSensitivity.asInstanceOf[js.Any], insertPragma = insertPragma, jsxBracketSameLine = jsxBracketSameLine, jsxSingleQuote = jsxSingleQuote, parser = parser.asInstanceOf[js.Any], plugins = plugins, printWidth = printWidth, proseWrap = proseWrap.asInstanceOf[js.Any], quoteProps = quoteProps.asInstanceOf[js.Any], rangeEnd = rangeEnd, rangeStart = rangeStart, requirePragma = requirePragma, semi = semi, singleQuote = singleQuote, tabWidth = tabWidth, trailingComma = trailingComma.asInstanceOf[js.Any], useTabs = useTabs, vueIndentScriptAndStyle = vueIndentScriptAndStyle)
  
    __obj.asInstanceOf[RequiredOptions]
  }
}

