package typings.prettier.mod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group_ extends _Doc {
  var break: Boolean
  var contents: Doc
  var expandedStates: js.Array[Doc]
  var `type`: typings.prettier.prettierStrings.group
}

object Group_ {
  @scala.inline
  def apply(
    break: Boolean,
    contents: Doc,
    expandedStates: js.Array[Doc],
    `type`: typings.prettier.prettierStrings.group
  ): Group_ = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group_]
  }
}

