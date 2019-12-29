package typings.prettier.prettierMod.doc.builders

import typings.prettier.Anon_Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends _Doc {
  var contents: Doc
  var n: Double | String | Anon_Root
  var `type`: typings.prettier.prettierStrings.align
}

object Align {
  @scala.inline
  def apply(contents: Doc, n: Double | String | Anon_Root, `type`: typings.prettier.prettierStrings.align): Align = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
}

@JSImport("prettier", "doc.builders.align")
@js.native
object align extends js.Object {
  def apply(n: String, contents: Doc): Align = js.native
  def apply(n: Double, contents: Doc): Align = js.native
  def apply(n: Anon_Root, contents: Doc): Align = js.native
}

