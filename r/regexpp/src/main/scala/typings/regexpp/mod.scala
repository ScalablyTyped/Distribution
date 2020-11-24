package typings.regexpp

import typings.regexpp.astMod.Node
import typings.regexpp.astMod.RegExpLiteral
import typings.regexpp.parserMod.RegExpParser.Options
import typings.regexpp.visitorMod.RegExpVisitor.Handlers
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("regexpp", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def parseRegExpLiteral(source: String): RegExpLiteral = js.native
  def parseRegExpLiteral(source: String, options: Options): RegExpLiteral = js.native
  def parseRegExpLiteral(source: RegExp): RegExpLiteral = js.native
  def parseRegExpLiteral(source: RegExp, options: Options): RegExpLiteral = js.native
  
  def validateRegExpLiteral(source: String): Unit = js.native
  def validateRegExpLiteral(source: String, options: typings.regexpp.validatorMod.RegExpValidator.Options): Unit = js.native
  
  def visitRegExpAST(node: Node, handlers: Handlers): Unit = js.native
  
  @js.native
  class RegExpParser ()
    extends typings.regexpp.parserMod.RegExpParser {
    def this(options: Options) = this()
  }
  
  @js.native
  class RegExpValidator ()
    extends typings.regexpp.validatorMod.RegExpValidator {
    def this(options: typings.regexpp.validatorMod.RegExpValidator.Options) = this()
  }
}
