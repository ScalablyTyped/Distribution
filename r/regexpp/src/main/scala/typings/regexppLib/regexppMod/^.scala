package typings
package regexppLib.regexppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("regexpp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parseRegExpLiteral(source: java.lang.String): regexppLib.astMod.RegExpLiteral = js.native
  def parseRegExpLiteral(source: java.lang.String, options: regexppLib.parserMod.RegExpParserNs.Options): regexppLib.astMod.RegExpLiteral = js.native
  def parseRegExpLiteral(source: stdLib.RegExp): regexppLib.astMod.RegExpLiteral = js.native
  def parseRegExpLiteral(source: stdLib.RegExp, options: regexppLib.parserMod.RegExpParserNs.Options): regexppLib.astMod.RegExpLiteral = js.native
  def validateRegExpLiteral(source: java.lang.String): scala.Unit = js.native
  def validateRegExpLiteral(source: java.lang.String, options: regexppLib.validatorMod.RegExpValidatorNs.Options): scala.Unit = js.native
  def visitRegExpAST(node: regexppLib.astMod.Node, handlers: regexppLib.visitorMod.RegExpVisitorNs.Handlers): scala.Unit = js.native
}

