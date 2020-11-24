package typings.storybookApi.storiesMod

import typings.storybookApi.anon.DocsOnly
import typings.storybookApi.mod.StoryId
import typings.storybookApi.storybookApiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends js.Object {
  
  var children: js.Array[StoryId] = js.native
  
  var depth: Double = js.native
  
  var id: StoryId = js.native
  
  var isComponent: Boolean = js.native
  
  var isLeaf: `false` = js.native
  
  var isRoot: `false` = js.native
  
  var name: String = js.native
  
  var parameters: js.UndefOr[DocsOnly] = js.native
  
  var parent: js.UndefOr[StoryId] = js.native
  
  var refId: js.UndefOr[String] = js.native
}
object Group {
  
  @scala.inline
  def apply(
    children: js.Array[StoryId],
    depth: Double,
    id: StoryId,
    isComponent: Boolean,
    isLeaf: `false`,
    isRoot: `false`,
    name: String
  ): Group = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
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
    def setIsLeaf(value: `false`): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRoot(value: `false`): Self = this.set("isRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: DocsOnly): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setParent(value: StoryId): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefId: Self = this.set("refId", js.undefined)
  }
}
