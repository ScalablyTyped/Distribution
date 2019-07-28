package typings.regexpp.regexppMod

import typings.regexpp.astMod.Node
import typings.regexpp.astMod.RegExpLiteral
import typings.regexpp.parserMod.RegExpParserNs.Options
import typings.regexpp.visitorMod.RegExpVisitorNs.Handlers
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("regexpp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parseRegExpLiteral(source: String): RegExpLiteral = js.native
  def parseRegExpLiteral(source: String, options: Options): RegExpLiteral = js.native
  def parseRegExpLiteral(source: RegExp): RegExpLiteral = js.native
  def parseRegExpLiteral(source: RegExp, options: Options): RegExpLiteral = js.native
  def validateRegExpLiteral(source: String): Unit = js.native
  def validateRegExpLiteral(source: String, options: typings.regexpp.validatorMod.RegExpValidatorNs.Options): Unit = js.native
  def visitRegExpAST(node: Node, handlers: Handlers): Unit = js.native
}

