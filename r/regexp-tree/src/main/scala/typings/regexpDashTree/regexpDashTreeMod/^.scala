package typings.regexpDashTree.regexpDashTreeMod

import typings.regexpDashTree.astMod.AstRegExp
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("regexp-tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generate(ast: AstRegExp): String = js.native
  def parse(s: String): AstRegExp = js.native
  def parse(s: String, options: ParserOptions): AstRegExp = js.native
  def parse(s: RegExp): AstRegExp = js.native
  def parse(s: RegExp, options: ParserOptions): AstRegExp = js.native
  def toRegExp(regexp: String): RegExp = js.native
}

