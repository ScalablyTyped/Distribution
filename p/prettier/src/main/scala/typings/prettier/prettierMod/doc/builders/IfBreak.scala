package typings.prettier.prettierMod.doc.builders

import typings.prettier.prettierStrings.`if-break`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfBreak extends _Doc {
  var breakContents: typings.prettier.prettierMod.doc.builders.Doc
  var flatContents: typings.prettier.prettierMod.doc.builders.Doc
  var `type`: `if-break`
}

object IfBreak {
  @scala.inline
  def apply(
    breakContents: typings.prettier.prettierMod.doc.builders.Doc,
    flatContents: typings.prettier.prettierMod.doc.builders.Doc,
    `type`: `if-break`
  ): IfBreak = {
    val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IfBreak]
  }
}

@JSImport("prettier", "doc.builders.ifBreak")
@js.native
object ifBreak extends js.Object {
  def apply(
    breakContents: typings.prettier.prettierMod.doc.builders.Doc,
    flatContents: typings.prettier.prettierMod.doc.builders.Doc
  ): IfBreak = js.native
}

