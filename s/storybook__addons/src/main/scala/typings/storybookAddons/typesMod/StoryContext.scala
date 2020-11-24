package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddons.hooksMod.HooksContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/addons.@storybook/addons/dist/types.StoryIdentifier & {[key: string] : any,   parameters :@storybook/addons.@storybook/addons/dist/types.Parameters,   args :@storybook/addons.@storybook/addons/dist/types.Args,   argTypes :@storybook/addons.@storybook/addons/dist/types.ArgTypes,   globals :@storybook/addons.@storybook/addons/dist/types.Args,   hooks :@storybook/addons.@storybook/addons/dist/hooks.HooksContext | undefined,   viewMode :@storybook/addons.@storybook/addons/dist/types.ViewMode | undefined} */
@js.native
trait StoryContext
  extends /* key */ StringDictionary[js.Any] {
  
  var argTypes: ArgTypes = js.native
  
  var args: Args = js.native
  
  var globals: Args = js.native
  
  var hooks: js.UndefOr[HooksContext] = js.native
  
  var id: StoryId = js.native
  
  var kind: StoryKind = js.native
  
  var name: StoryName = js.native
  
  var parameters: Parameters = js.native
  
  var viewMode: js.UndefOr[ViewMode] = js.native
}
object StoryContext {
  
  @scala.inline
  def apply(
    argTypes: ArgTypes,
    args: Args,
    globals: Args,
    id: StoryId,
    kind: StoryKind,
    name: StoryName,
    parameters: Parameters
  ): StoryContext = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryContext]
  }
  
  @scala.inline
  implicit class StoryContextOps[Self <: StoryContext] (val x: Self) extends AnyVal {
    
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
    def setArgTypes(value: ArgTypes): Self = this.set("argTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: Args): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobals(value: Args): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: StoryId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: StoryKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: StoryName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooks(value: HooksContext): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    
    @scala.inline
    def setViewMode(value: ViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
}
