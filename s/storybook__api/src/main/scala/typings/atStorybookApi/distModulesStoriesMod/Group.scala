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
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Group]
  }
}

