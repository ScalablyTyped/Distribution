package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddons.hooksMod.HooksContext
import org.scalablytyped.runtime.StObject
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
  implicit class StoryContextMutableBuilder[Self <: StoryContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgTypes(value: ArgTypes): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobals(value: Args): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooks(value: HooksContext): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: StoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}
