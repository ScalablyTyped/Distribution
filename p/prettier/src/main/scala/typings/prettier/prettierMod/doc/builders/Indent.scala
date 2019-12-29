package typings.prettier.prettierMod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indent extends _Doc {
  var contents: Doc
  var `type`: typings.prettier.prettierStrings.indent
}

object Indent {
  @scala.inline
  def apply(contents: Doc, `type`: typings.prettier.prettierStrings.indent): Indent = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indent]
  }
}

@JSImport("prettier", "doc.builders.indent")
@js.native
object indent extends js.Object {
  def apply(contents: Doc): Indent = js.native
}

