package typings.prettier.prettierMod.doc.builders

import typings.prettier.prettierStrings.`line-suffix`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineSuffix extends _Doc {
  var contents: typings.prettier.prettierMod.doc.builders.Doc
  var `type`: `line-suffix`
}

object LineSuffix {
  @scala.inline
  def apply(contents: typings.prettier.prettierMod.doc.builders.Doc, `type`: `line-suffix`): LineSuffix = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LineSuffix]
  }
}

@JSImport("prettier", "doc.builders.lineSuffix")
@js.native
object lineSuffix extends js.Object {
  def apply(contents: typings.prettier.prettierMod.doc.builders.Doc): LineSuffix = js.native
}

