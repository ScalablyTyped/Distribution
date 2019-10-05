package typings.prettier.prettierMod.doc.builders

import typings.prettier.prettierStrings.fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fill extends _Doc {
  var parts: js.Array[typings.prettier.prettierMod.doc.builders.Doc]
  var `type`: fill
}

object Fill {
  @scala.inline
  def apply(parts: js.Array[typings.prettier.prettierMod.doc.builders.Doc], `type`: fill): Fill = {
    val __obj = js.Dynamic.literal(parts = parts)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Fill]
  }
}

@JSImport("prettier", "doc.builders.fill")
@js.native
object fill extends js.Object {
  def apply(parts: js.Array[typings.prettier.prettierMod.doc.builders.Doc]): Fill = js.native
}

