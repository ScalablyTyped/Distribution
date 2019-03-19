package typings
package regexpDashTreeLib.regexpDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("regexp-tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generate(ast: regexpDashTreeLib.astMod.AstRegExp): java.lang.String = js.native
  def parse(s: java.lang.String): regexpDashTreeLib.astMod.AstRegExp = js.native
  def parse(s: java.lang.String, options: ParserOptions): regexpDashTreeLib.astMod.AstRegExp = js.native
  def parse(s: stdLib.RegExp): regexpDashTreeLib.astMod.AstRegExp = js.native
  def parse(s: stdLib.RegExp, options: ParserOptions): regexpDashTreeLib.astMod.AstRegExp = js.native
  def toRegExp(regexp: java.lang.String): stdLib.RegExp = js.native
}

