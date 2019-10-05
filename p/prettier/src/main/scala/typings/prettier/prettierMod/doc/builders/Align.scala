package typings.prettier.prettierMod.doc.builders

import typings.prettier.Anon_Root
import typings.prettier.prettierStrings.align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends _Doc {
  var contents: typings.prettier.prettierMod.doc.builders.Doc
  var n: Double | String | Anon_Root
  var `type`: align
}

object Align {
  @scala.inline
  def apply(
    contents: typings.prettier.prettierMod.doc.builders.Doc,
    n: Double | String | Anon_Root,
    `type`: align
  ): Align = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Align]
  }
}

@JSImport("prettier", "doc.builders.align")
@js.native
object align extends js.Object {
  def apply(n: String, contents: typings.prettier.prettierMod.doc.builders.Doc): Align = js.native
  def apply(n: Double, contents: typings.prettier.prettierMod.doc.builders.Doc): Align = js.native
  def apply(n: Anon_Root, contents: typings.prettier.prettierMod.doc.builders.Doc): Align = js.native
}

