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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrowParens")(arrowParens.asInstanceOf[js.Any])
    __obj.updateDynamic("bracketSpacing")(bracketSpacing)
    __obj.updateDynamic("endOfLine")(endOfLine.asInstanceOf[js.Any])
    __obj.updateDynamic("filepath")(filepath)
    __obj.updateDynamic("htmlWhitespaceSensitivity")(htmlWhitespaceSensitivity.asInstanceOf[js.Any])
    __obj.updateDynamic("insertPragma")(insertPragma)
    __obj.updateDynamic("jsxBracketSameLine")(jsxBracketSameLine)
    __obj.updateDynamic("jsxSingleQuote")(jsxSingleQuote)
    __obj.updateDynamic("locEnd")(locEnd)
    __obj.updateDynamic("locStart")(locStart)
    __obj.updateDynamic("originalText")(originalText)
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
    __obj.asInstanceOf[ParserOptions]
  }
}

