package typings.storybookApi.storiesMod

import typings.storybookApi.anon.DictparameterName
import typings.storybookApi.mod.Args
import typings.storybookApi.mod.StoryId
import typings.storybookApi.mod.StoryKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryInput extends js.Object {
  
  var args: Args = js.native
  
  var children: js.Array[String] = js.native
  
  var id: StoryId = js.native
  
  var isLeaf: Boolean = js.native
  
  var kind: StoryKind = js.native
  
  var name: String = js.native
  
  var parameters: DictparameterName = js.native
  
  var refId: js.UndefOr[String] = js.native
}
object StoryInput {
  
  @scala.inline
  def apply(
    args: Args,
    children: js.Array[String],
    id: StoryId,
    isLeaf: Boolean,
    kind: StoryKind,
    name: String,
    parameters: DictparameterName
  ): StoryInput = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryInput]
  }
  
  @scala.inline
  implicit class StoryInputOps[Self <: StoryInput] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: String*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[String]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: StoryId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLeaf(value: Boolean): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: StoryKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: DictparameterName): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefId: Self = this.set("refId", js.undefined)
  }
}
