package typings.streamDashJson

import typings.streamDashJson.parserMod.ParserOptions
import typings.streamDashJson.parserMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-json", JSImport.Namespace)
@js.native
object streamDashJsonMod extends js.Object {
  val Parser: ParserType = js.native
  def apply(): typings.streamDashJson.streamDashJsonMod.Parser = js.native
  def apply(options: ParserOptions): typings.streamDashJson.streamDashJsonMod.Parser = js.native
  def parser(): typings.streamDashJson.streamDashJsonMod.Parser = js.native
  def parser(options: ParserOptions): typings.streamDashJson.streamDashJsonMod.Parser = js.native
  type Parser = ParserClass
  type ParserClass = ^
  type ParserType = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias stream-json.stream-json.ParserType */ js.Object
}

