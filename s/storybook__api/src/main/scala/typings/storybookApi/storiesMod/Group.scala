package typings.storybookApi.storiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  var children: js.Array[StoryId] = js.native
  var depth: Double = js.native
  var id: StoryId = js.native
  var isComponent: Boolean = js.native
  var isLeaf: Boolean = js.native
  var isRoot: Boolean = js.native
  var name: String = js.native
  var parent: StoryId = js.native
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
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenVarargs(value: StoryId*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[StoryId]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: StoryId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsComponent(value: Boolean): Self = this.set("isComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLeaf(value: Boolean): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRoot(value: Boolean): Self = this.set("isRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: StoryId): Self = this.set("parent", value.asInstanceOf[js.Any])
  }
  
}

