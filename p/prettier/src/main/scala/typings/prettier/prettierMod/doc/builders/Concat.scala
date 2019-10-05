package typings.prettier.prettierMod.doc.builders

import typings.prettier.prettierStrings.concat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Concat extends _Doc {
  var parts: js.Array[typings.prettier.prettierMod.doc.builders.Doc]
  var `type`: concat
}

object Concat {
  @scala.inline
  def apply(parts: js.Array[typings.prettier.prettierMod.doc.builders.Doc], `type`: concat): Concat = {
    val __obj = js.Dynamic.literal(parts = parts)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Concat]
  }
}

@JSImport("prettier", "doc.builders.concat")
@js.native
object concat extends js.Object {
  def apply(contents: js.Array[typings.prettier.prettierMod.doc.builders.Doc]): Concat = js.native
}

