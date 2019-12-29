package typings.prettier.prettierMod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Concat extends _Doc {
  var parts: js.Array[Doc]
  var `type`: typings.prettier.prettierStrings.concat
}

object Concat {
  @scala.inline
  def apply(parts: js.Array[Doc], `type`: typings.prettier.prettierStrings.concat): Concat = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concat]
  }
}

@JSImport("prettier", "doc.builders.concat")
@js.native
object concat extends js.Object {
  def apply(contents: js.Array[Doc]): Concat = js.native
}

