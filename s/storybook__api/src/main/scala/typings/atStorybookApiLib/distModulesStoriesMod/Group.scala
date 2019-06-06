package typings
package atStorybookApiLib.distModulesStoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var children: js.Array[StoryId]
  var depth: scala.Double
  var id: StoryId
  var isComponent: scala.Boolean
  var isLeaf: scala.Boolean
  var isRoot: scala.Boolean
  var name: java.lang.String
  var parent: StoryId
}

object Group {
  @scala.inline
  def apply(
    children: js.Array[StoryId],
    depth: scala.Double,
    id: StoryId,
    isComponent: scala.Boolean,
    isLeaf: scala.Boolean,
    isRoot: scala.Boolean,
    name: java.lang.String,
    parent: StoryId
  ): Group = {
    val __obj = js.Dynamic.literal(children = children, depth = depth, id = id, isComponent = isComponent, isLeaf = isLeaf, isRoot = isRoot, name = name, parent = parent)
  
    __obj.asInstanceOf[Group]
  }
}

