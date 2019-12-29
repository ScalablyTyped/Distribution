package typings.prettier.prettierMod.doc.builders

import typings.prettier.Anon_ShouldBreak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends _Doc {
  var break: Boolean
  var contents: Doc
  var expandedStates: js.Array[Doc]
  var `type`: typings.prettier.prettierStrings.group
}

object Group {
  @scala.inline
  def apply(
    break: Boolean,
    contents: Doc,
    expandedStates: js.Array[Doc],
    `type`: typings.prettier.prettierStrings.group
  ): Group = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

@JSImport("prettier", "doc.builders.group")
@js.native
object group extends js.Object {
  def apply(contents: Doc): Group = js.native
  def apply(contents: Doc, opts: Anon_ShouldBreak): Group = js.native
}

