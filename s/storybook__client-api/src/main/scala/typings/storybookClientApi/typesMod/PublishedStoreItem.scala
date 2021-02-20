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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/client-api.@storybook/client-api/dist/types.StoreItem & {  globals :@storybook/addons.@storybook/addons.Args} */
@js.native
trait PublishedStoreItem extends StObject {
  
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
  implicit class PublishedStoreItemMutableBuilder[Self <: PublishedStoreItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyLoaders(value: () => js.Promise[StoryContext]): Self = StObject.set(x, "applyLoaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setArgTypes(value: ArgTypes): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDecorated(value: () => StoryFn[_]): Self = StObject.set(x, "getDecorated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOriginal(value: () => StoryFn[_]): Self = StObject.set(x, "getOriginal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGlobals(value: Args): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooks(value: HooksContext): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialArgs(value: Args): Self = StObject.set(x, "initialArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: StoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryFn(value: StoryFn[_]): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => _): Self = StObject.set(x, "storyFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => _): Self = StObject.set(x, "storyFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnboundStoryFn(value: StoryFn[_]): Self = StObject.set(x, "unboundStoryFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnboundStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => _): Self = StObject.set(x, "unboundStoryFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnboundStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => _): Self = StObject.set(x, "unboundStoryFn", js.Any.fromFunction2(value))
  }
}
