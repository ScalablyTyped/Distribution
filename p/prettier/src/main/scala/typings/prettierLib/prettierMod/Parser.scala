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
    locEnd: js.Function1[js.Any, scala.Double],
    locStart: js.Function1[js.Any, scala.Double],
    parse: js.Function3[
      java.lang.String, 
      org.scalablytyped.runtime.StringDictionary[Parser], 
      ParserOptions, 
      AST
    ],
    hasPragma: js.Function1[/* text */ java.lang.String, scala.Boolean] = null,
    preprocess: js.Function2[/* text */ java.lang.String, /* options */ ParserOptions, java.lang.String] = null
  ): Parser = {
    val __obj = js.Dynamic.literal(astFormat = astFormat, locEnd = locEnd, locStart = locStart, parse = parse)
    if (hasPragma != null) __obj.updateDynamic("hasPragma")(hasPragma)
    if (preprocess != null) __obj.updateDynamic("preprocess")(preprocess)
    __obj.asInstanceOf[Parser]
  }
}

