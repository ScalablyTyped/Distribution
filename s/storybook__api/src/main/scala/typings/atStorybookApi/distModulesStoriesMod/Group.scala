package typings.atStorybookApi.distModulesStoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var children: js.Array[StoryId]
  var depth: Double
  var id: StoryId
  var isComponent: Boolean
  var isLeaf: Boolean
  var isRoot: Boolean
  var name: String
  var parent: StoryId
}

object Group {
  @scala.inline
  def apply(
    children: js.Array[StoryId],
    depth: Double,
    id: StoryId,
    isComponent: Boolean,
    isLeaf: Boolean,
    isRoot: Boolean,
    name: String,
    parent: StoryId
  ): Group = {
    val __obj = js.Dynamic.literal(children = children, depth = depth, id = id, isComponent = isComponent, isLeaf = isLeaf, isRoot = isRoot, name = name, parent = parent)
  
    __obj.asInstanceOf[Group]
  }
}

