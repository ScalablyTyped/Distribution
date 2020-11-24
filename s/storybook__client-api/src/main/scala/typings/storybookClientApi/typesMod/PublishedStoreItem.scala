package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.ArgTypes
import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookAddons.typesMod.StoryId
import typings.storybookAddons.typesMod.StoryKind
import typings.storybookAddons.typesMod.StoryName
import typings.storybookClientApi.hooksMod.HooksContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/client-api.@storybook/client-api/dist/types.StoreItem & {  globals :@storybook/addons.@storybook/addons.Args} */
@js.native
trait PublishedStoreItem extends js.Object {
  
  def applyLoaders(): js.Promise[StoryContext] = js.native
  
  var argTypes: ArgTypes = js.native
  
  var args: Args = js.native
  
  def getDecorated(): StoryFn[_] = js.native
  
  def getOriginal(): StoryFn[_] = js.native
  
  var globals: Args = js.native
  
  var hooks: HooksContext = js.native
  
  var id: StoryId = js.native
  
  var initialArgs: Args = js.native
  
  var kind: StoryKind = js.native
  
  var name: StoryName = js.native
  
  var parameters: Parameters = js.native
  
  var storyFn: StoryFn[_] = js.native
  
  var unboundStoryFn: StoryFn[_] = js.native
}
object PublishedStoreItem {
  
  @scala.inline
  def apply(
    applyLoaders: () => js.Promise[StoryContext],
    argTypes: ArgTypes,
    args: Args,
    getDecorated: () => StoryFn[_],
    getOriginal: () => StoryFn[_],
    globals: Args,
    hooks: HooksContext,
    id: StoryId,
    initialArgs: Args,
    kind: StoryKind,
    name: StoryName,
    parameters: Parameters,
    storyFn: StoryFn[_],
    unboundStoryFn: StoryFn[_]
  ): PublishedStoreItem = {
    val __obj = js.Dynamic.literal(applyLoaders = js.Any.fromFunction0(applyLoaders), argTypes = argTypes.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], getDecorated = js.Any.fromFunction0(getDecorated), getOriginal = js.Any.fromFunction0(getOriginal), globals = globals.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialArgs = initialArgs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any], unboundStoryFn = unboundStoryFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishedStoreItem]
  }
  
  @scala.inline
  implicit class PublishedStoreItemOps[Self <: PublishedStoreItem] (val x: Self) extends AnyVal {
    
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
    def setApplyLoaders(value: () => js.Promise[StoryContext]): Self = this.set("applyLoaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setArgTypes(value: ArgTypes): Self = this.set("argTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: Args): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDecorated(value: () => StoryFn[_]): Self = this.set("getDecorated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOriginal(value: () => StoryFn[_]): Self = this.set("getOriginal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGlobals(value: Args): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooks(value: HooksContext): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: StoryId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialArgs(value: Args): Self = this.set("initialArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: StoryKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: StoryName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => _): Self = this.set("storyFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => _): Self = this.set("storyFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoryFn(value: StoryFn[_]): Self = this.set("storyFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnboundStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => _): Self = this.set("unboundStoryFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnboundStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => _): Self = this.set("unboundStoryFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnboundStoryFn(value: StoryFn[_]): Self = this.set("unboundStoryFn", value.asInstanceOf[js.Any])
  }
}
