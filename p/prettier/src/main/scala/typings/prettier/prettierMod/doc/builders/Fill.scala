package typings.prettier.prettierMod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fill extends _Doc {
  var parts: js.Array[typings.prettier.prettierMod.doc.builders.Doc]
  var `type`: typings.prettier.prettierStrings.fill
}

object Fill {
  @scala.inline
  def apply(
    parts: js.Array[typings.prettier.prettierMod.doc.builders.Doc],
    `type`: typings.prettier.prettierStrings.fill
  ): Fill = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
}

@JSImport("prettier", "doc.builders.fill")
@js.native
object fill extends js.Object {
  def apply(parts: js.Array[typings.prettier.prettierMod.doc.builders.Doc]): Fill = js.native
}

