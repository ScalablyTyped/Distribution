package typings.storybookApi.storiesMod

import typings.storybookApi.mod.StoryId
import typings.storybookApi.storybookApiBooleans.`false`
import typings.storybookApi.storybookApiBooleans.`true`
import typings.storybookApi.storybookApiNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Root extends js.Object {
  
  var children: js.Array[StoryId] = js.native
  
  var depth: `0` = js.native
  
  var id: StoryId = js.native
  
  var isComponent: `false` = js.native
  
  var isLeaf: `false` = js.native
  
  var isRoot: `true` = js.native
  
  var name: String = js.native
  
  var refId: js.UndefOr[String] = js.native
}
object Root {
  
  @scala.inline
  def apply(
    children: js.Array[StoryId],
    depth: `0`,
    id: StoryId,
    isComponent: `false`,
    isLeaf: `false`,
    isRoot: `true`,
    name: String
  ): Root = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
  
  @scala.inline
  implicit class RootOps[Self <: Root] (val x: Self) extends AnyVal {
    
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
    def setDepth(value: `0`): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: StoryId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComponent(value: `false`): Self = this.set("isComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLeaf(value: `false`): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRoot(value: `true`): Self = this.set("isRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefId: Self = this.set("refId", js.undefined)
  }
}
