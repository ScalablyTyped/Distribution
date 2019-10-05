package typings.prettier.prettierMod.doc.builders

import typings.prettier.Anon_ShouldBreak
import typings.prettier.prettierStrings.group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends _Doc {
  var break: Boolean
  var contents: typings.prettier.prettierMod.doc.builders.Doc
  var expandedStates: js.Array[typings.prettier.prettierMod.doc.builders.Doc]
  var `type`: group
}

object Group {
  @scala.inline
  def apply(
    break: Boolean,
    contents: typings.prettier.prettierMod.doc.builders.Doc,
    expandedStates: js.Array[typings.prettier.prettierMod.doc.builders.Doc],
    `type`: group
  ): Group = {
    val __obj = js.Dynamic.literal(break = break, contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Group]
  }
}

@JSImport("prettier", "doc.builders.group")
@js.native
object group extends js.Object {
  def apply(contents: typings.prettier.prettierMod.doc.builders.Doc): Group = js.native
  def apply(contents: typings.prettier.prettierMod.doc.builders.Doc, opts: Anon_ShouldBreak): Group = js.native
}

