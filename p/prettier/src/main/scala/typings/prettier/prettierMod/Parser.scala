package typings.prettier.prettierMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  var astFormat: String
  var hasPragma: js.UndefOr[js.Function1[/* text */ String, Boolean]] = js.undefined
  var preprocess: js.UndefOr[js.Function2[/* text */ String, /* options */ ParserOptions, String]] = js.undefined
  def locEnd(node: js.Any): Double
  def locStart(node: js.Any): Double
  def parse(text: String, parsers: StringDictionary[Parser], options: ParserOptions): AST
}

object Parser {
  @scala.inline
  def apply(
    astFormat: String,
    locEnd: js.Any => Double,
    locStart: js.Any => Double,
    parse: (String, StringDictionary[Parser], ParserOptions) => AST,
    hasPragma: /* text */ String => Boolean = null,
    preprocess: (/* text */ String, /* options */ ParserOptions) => String = null
  ): Parser = {
    val __obj = js.Dynamic.literal(astFormat = astFormat.asInstanceOf[js.Any], locEnd = js.Any.fromFunction1(locEnd), locStart = js.Any.fromFunction1(locStart), parse = js.Any.fromFunction3(parse))
    if (hasPragma != null) __obj.updateDynamic("hasPragma")(js.Any.fromFunction1(hasPragma))
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction2(preprocess))
    __obj.asInstanceOf[Parser]
  }
}

