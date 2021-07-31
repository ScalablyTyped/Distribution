package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.ArgTypes
import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookAddons.typesMod.StoryId
import typings.storybookAddons.typesMod.StoryIdentifier
import typings.storybookAddons.typesMod.StoryKind
import typings.storybookAddons.typesMod.StoryName
import typings.storybookClientApi.hooksMod.HooksContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreItem
  extends StObject
     with StoryIdentifier {
  
  def applyLoaders(): js.Promise[StoryContext]
  
  var argTypes: ArgTypes
  
  var args: Args
  
  def getDecorated(): StoryFn[js.Any]
  
  def getOriginal(): StoryFn[js.Any]
  
  var hooks: HooksContext
  
  var initialArgs: Args
  
  var parameters: Parameters
  
  var storyFn: StoryFn[js.Any]
  
  var unboundStoryFn: StoryFn[js.Any]
}
object StoreItem {
  
  @scala.inline
  def apply(
    applyLoaders: () => js.Promise[StoryContext],
    argTypes: ArgTypes,
    args: Args,
    getDecorated: () => StoryFn[js.Any],
    getOriginal: () => StoryFn[js.Any],
    hooks: HooksContext,
    id: StoryId,
    initialArgs: Args,
    kind: StoryKind,
    name: StoryName,
    parameters: Parameters,
    storyFn: StoryFn[js.Any],
    unboundStoryFn: StoryFn[js.Any]
  ): StoreItem = {
    val __obj = js.Dynamic.literal(applyLoaders = js.Any.fromFunction0(applyLoaders), argTypes = argTypes.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], getDecorated = js.Any.fromFunction0(getDecorated), getOriginal = js.Any.fromFunction0(getOriginal), hooks = hooks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialArgs = initialArgs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any], unboundStoryFn = unboundStoryFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreItem]
  }
  
  @scala.inline
  implicit class StoreItemMutableBuilder[Self <: StoreItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyLoaders(value: () => js.Promise[StoryContext]): Self = StObject.set(x, "applyLoaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setArgTypes(value: ArgTypes): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDecorated(value: () => StoryFn[js.Any]): Self = StObject.set(x, "getDecorated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOriginal(value: () => StoryFn[js.Any]): Self = StObject.set(x, "getOriginal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHooks(value: HooksContext): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialArgs(value: Args): Self = StObject.set(x, "initialArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryFn(value: StoryFn[js.Any]): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => js.Any): Self = StObject.set(x, "storyFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => js.Any): Self = StObject.set(x, "storyFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnboundStoryFn(value: StoryFn[js.Any]): Self = StObject.set(x, "unboundStoryFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnboundStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => js.Any): Self = StObject.set(x, "unboundStoryFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnboundStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => js.Any): Self = StObject.set(x, "unboundStoryFn", js.Any.fromFunction2(value))
  }
}
