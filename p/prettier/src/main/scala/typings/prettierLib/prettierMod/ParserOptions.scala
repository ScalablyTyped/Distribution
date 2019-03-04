package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends RequiredOptions {
  var originalText: java.lang.String
  def locEnd(node: js.Any): scala.Double
  def locStart(node: js.Any): scala.Double
}

object ParserOptions {
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
    locEnd: js.Function1[js.Any, scala.Double],
    locStart: js.Function1[js.Any, scala.Double],
    originalText: java.lang.String,
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
  ): ParserOptions = {
    val __obj = js.Dynamic.literal(arrowParens = arrowParens.asInstanceOf[js.Any], bracketSpacing = bracketSpacing, endOfLine = endOfLine.asInstanceOf[js.Any], filepath = filepath, htmlWhitespaceSensitivity = htmlWhitespaceSensitivity.asInstanceOf[js.Any], insertPragma = insertPragma, jsxBracketSameLine = jsxBracketSameLine, jsxSingleQuote = jsxSingleQuote, locEnd = locEnd, locStart = locStart, originalText = originalText, parser = parser.asInstanceOf[js.Any], plugins = plugins, printWidth = printWidth, proseWrap = proseWrap.asInstanceOf[js.Any], rangeEnd = rangeEnd, rangeStart = rangeStart, requirePragma = requirePragma, semi = semi, singleQuote = singleQuote, tabWidth = tabWidth, trailingComma = trailingComma.asInstanceOf[js.Any], useTabs = useTabs)
  
    __obj.asInstanceOf[ParserOptions]
  }
}

