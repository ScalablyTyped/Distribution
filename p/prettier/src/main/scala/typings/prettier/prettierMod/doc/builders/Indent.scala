package typings.prettier.prettierMod.doc.builders

import typings.prettier.prettierStrings.indent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indent extends _Doc {
  var contents: typings.prettier.prettierMod.doc.builders.Doc
  var `type`: indent
}

object Indent {
  @scala.inline
  def apply(contents: typings.prettier.prettierMod.doc.builders.Doc, `type`: indent): Indent = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Indent]
  }
}

@JSImport("prettier", "doc.builders.indent")
@js.native
object indent extends js.Object {
  def apply(contents: typings.prettier.prettierMod.doc.builders.Doc): Indent = js.native
}

