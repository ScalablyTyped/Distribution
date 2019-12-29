package typings.prettier.prettierMod.doc.builders

import typings.prettier.prettierStrings.`if-break`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfBreak extends _Doc {
  var breakContents: Doc
  var flatContents: Doc
  var `type`: `if-break`
}

object IfBreak {
  @scala.inline
  def apply(breakContents: Doc, flatContents: Doc, `type`: `if-break`): IfBreak = {
    val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfBreak]
  }
}

@JSImport("prettier", "doc.builders.ifBreak")
@js.native
object ifBreak extends js.Object {
  def apply(breakContents: Doc, flatContents: Doc): IfBreak = js.native
}

