package typings.prettier.prettierMod.doc.builders

import typings.prettier.prettierStrings.`line-suffix`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineSuffix extends _Doc {
  var contents: Doc
  var `type`: `line-suffix`
}

object LineSuffix {
  @scala.inline
  def apply(contents: Doc, `type`: `line-suffix`): LineSuffix = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSuffix]
  }
}

@JSImport("prettier", "doc.builders.lineSuffix")
@js.native
object lineSuffix extends js.Object {
  def apply(contents: Doc): LineSuffix = js.native
}

