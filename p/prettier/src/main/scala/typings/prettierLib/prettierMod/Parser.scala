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

