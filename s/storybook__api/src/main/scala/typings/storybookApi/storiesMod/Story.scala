package typings.storybookApi.storiesMod

import typings.storybookApi.anon.DictparameterName
import typings.storybookApi.mod.Args
import typings.storybookApi.mod.StoryId
import typings.storybookApi.mod.StoryKind
import typings.storybookApi.storybookApiBooleans.`false`
import typings.storybookApi.storybookApiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Story extends js.Object {
  
  var args: Args = js.native
  
  var children: js.UndefOr[js.Array[StoryId]] = js.native
  
  var depth: Double = js.native
  
  var id: StoryId = js.native
  
  var isComponent: Boolean = js.native
  
  var isLeaf: `true` = js.native
  
  var isRoot: `false` = js.native
  
  var kind: StoryKind = js.native
  
  var name: String = js.native
  
  var parameters: js.UndefOr[DictparameterName] = js.native
  
  var parent: StoryId = js.native
  
  var refId: js.UndefOr[String] = js.native
}
object Story {
  
  @scala.inline
  def apply(
    args: Args,
    depth: Double,
    id: StoryId,
    isComponent: Boolean,
    isLeaf: `true`,
    isRoot: `false`,
    kind: StoryKind,
    name: String,
    parent: StoryId
  ): Story = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Story]
  }
  
  @scala.inline
  implicit class StoryOps[Self <: Story] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: Args): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: StoryId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComponent(value: Boolean): Self = this.set("isComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLeaf(value: `true`): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRoot(value: `false`): Self = this.set("isRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: StoryKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: StoryId): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: StoryId*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[StoryId]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setParameters(value: DictparameterName): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefId: Self = this.set("refId", js.undefined)
  }
}
