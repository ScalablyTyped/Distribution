package typings.storybookClientApi.typesMod

import typings.std.Error
import typings.storybookAddons.typesMod.ArgTypes
import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookAddons.typesMod.StoryId
import typings.storybookAddons.typesMod.StoryKind
import typings.storybookAddons.typesMod.StoryName
import typings.storybookClientApi.anon.Description
import typings.storybookClientApi.hooksMod.HooksContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/client-api.@storybook/client-api/dist/types.StoreItem & {  forceRender :boolean, showMain (): void, showError (error : {  title :string,   description :string}): void, showException (err : std.Error): void} */
trait RenderContextWithoutStoryContext extends StObject {
  
  def applyLoaders(): js.Promise[StoryContext]
  
  var argTypes: ArgTypes
  
  var args: Args
  
  var forceRender: Boolean
  
  def getDecorated(): StoryFn[js.Any]
  
  def getOriginal(): StoryFn[js.Any]
  
  var hooks: HooksContext
  
  var id: StoryId
  
  var initialArgs: Args
  
  var kind: StoryKind
  
  var name: StoryName
  
  var parameters: Parameters
  
  def showError(error: Description): Unit
  
  def showException(err: Error): Unit
  
  def showMain(): Unit
  
  var storyFn: StoryFn[js.Any]
  
  var unboundStoryFn: StoryFn[js.Any]
}
object RenderContextWithoutStoryContext {
  
  @scala.inline
  def apply(
    applyLoaders: () => js.Promise[StoryContext],
    argTypes: ArgTypes,
    args: Args,
    forceRender: Boolean,
    getDecorated: () => StoryFn[js.Any],
    getOriginal: () => StoryFn[js.Any],
    hooks: HooksContext,
    id: StoryId,
    initialArgs: Args,
    kind: StoryKind,
    name: StoryName,
    parameters: Parameters,
    showError: Description => Unit,
    showException: Error => Unit,
    showMain: () => Unit,
    storyFn: StoryFn[js.Any],
    unboundStoryFn: StoryFn[js.Any]
  ): RenderContextWithoutStoryContext = {
    val __obj = js.Dynamic.literal(applyLoaders = js.Any.fromFunction0(applyLoaders), argTypes = argTypes.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], forceRender = forceRender.asInstanceOf[js.Any], getDecorated = js.Any.fromFunction0(getDecorated), getOriginal = js.Any.fromFunction0(getOriginal), hooks = hooks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialArgs = initialArgs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], showError = js.Any.fromFunction1(showError), showException = js.Any.fromFunction1(showException), showMain = js.Any.fromFunction0(showMain), storyFn = storyFn.asInstanceOf[js.Any], unboundStoryFn = unboundStoryFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextWithoutStoryContext]
  }
  
  @scala.inline
  implicit class RenderContextWithoutStoryContextMutableBuilder[Self <: RenderContextWithoutStoryContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyLoaders(value: () => js.Promise[StoryContext]): Self = StObject.set(x, "applyLoaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setArgTypes(value: ArgTypes): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDecorated(value: () => StoryFn[js.Any]): Self = StObject.set(x, "getDecorated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOriginal(value: () => StoryFn[js.Any]): Self = StObject.set(x, "getOriginal", js.Any.fromFunction0(value))
    
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
    def setShowError(value: Description => Unit): Self = StObject.set(x, "showError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowException(value: Error => Unit): Self = StObject.set(x, "showException", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowMain(value: () => Unit): Self = StObject.set(x, "showMain", js.Any.fromFunction0(value))
    
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
