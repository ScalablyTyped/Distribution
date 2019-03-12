package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  var astFormat: java.lang.String
  var hasPragma: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Boolean]] = js.undefined
  var preprocess: js.UndefOr[
    js.Function2[/* text */ java.lang.String, /* options */ ParserOptions, java.lang.String]
  ] = js.undefined
  def locEnd(node: js.Any): scala.Double
  def locStart(node: js.Any): scala.Double
  def parse(
    text: java.lang.String,
    parsers: org.scalablytyped.runtime.StringDictionary[Parser],
    options: ParserOptions
  ): AST
}

object Parser {
  @scala.inline
  def apply(
    astFormat: java.lang.String,
    locEnd: js.Any => scala.Double,
    locStart: js.Any => scala.Double,
    parse: (java.lang.String, org.scalablytyped.runtime.StringDictionary[Parser], ParserOptions) => AST,
    hasPragma: /* text */ java.lang.String => scala.Boolean = null,
    preprocess: (/* text */ java.lang.String, /* options */ ParserOptions) => java.lang.String = null
  ): Parser = {
    val __obj = js.Dynamic.literal(astFormat = astFormat, locEnd = js.Any.fromFunction1(locEnd), locStart = js.Any.fromFunction1(locStart), parse = js.Any.fromFunction3(parse))
    if (hasPragma != null) __obj.updateDynamic("hasPragma")(js.Any.fromFunction1(hasPragma))
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction2(preprocess))
    __obj.asInstanceOf[Parser]
  }
}

