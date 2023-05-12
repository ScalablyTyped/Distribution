package typings.storybookCsf.mod

import typings.std.AbortSignal
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/csf.@storybook/csf.StoryContext<TRenderer, TArgs> & {  step :@storybook/csf.@storybook/csf.StepFunction<TRenderer, TArgs>} */
trait PlayFunctionContext[TRenderer /* <: Renderer */, TArgs] extends StObject {
  
  var abortSignal: AbortSignal
  
  var argTypes: StrictArgTypes[TArgs]
  
  var args: TArgs
  
  var canvasElement: /* import warning: importer.ImportType#apply Failed type conversion: TRenderer['canvasElement'] */ js.Any
  
  var component: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TRenderer & @storybook/csf.anon.TAny['component'] */ js.Any
  ] = js.undefined
  
  var componentId: ComponentId
  
  var globals: Globals
  
  var hooks: Any
  
  var id: StoryId
  
  var initialArgs: TArgs
  
  /** @deprecated */
  var kind: ComponentTitle
  
  var loaded: Record[String, Any]
  
  var name: StoryName
  
  var originalStoryFn: StoryFn[TRenderer, Args]
  
  var parameters: Parameters
  
  def step(label: StepLabel, play: PlayFunction[TRenderer, TArgs]): js.Promise[Unit] | Unit
  @JSName("step")
  var step_Original: StepFunction[TRenderer, TArgs]
  
  /** @deprecated */
  var story: StoryName
  
  var subcomponents: js.UndefOr[
    Record[
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRenderer & @storybook/csf.anon.TAny['component'] */ js.Any
    ]
  ] = js.undefined
  
  var tags: js.Array[Tag]
  
  var title: ComponentTitle
  
  var viewMode: ViewMode
}
object PlayFunctionContext {
  
  inline def apply[TRenderer /* <: Renderer */, TArgs](
    abortSignal: AbortSignal,
    argTypes: StrictArgTypes[TArgs],
    args: TArgs,
    canvasElement: /* import warning: importer.ImportType#apply Failed type conversion: TRenderer['canvasElement'] */ js.Any,
    componentId: ComponentId,
    globals: Globals,
    hooks: Any,
    id: StoryId,
    initialArgs: TArgs,
    kind: ComponentTitle,
    loaded: Record[String, Any],
    name: StoryName,
    originalStoryFn: StoryFn[TRenderer, Args],
    parameters: Parameters,
    step: (/* label */ StepLabel, /* play */ PlayFunction[TRenderer, TArgs]) => js.Promise[Unit] | Unit,
    story: StoryName,
    tags: js.Array[Tag],
    title: ComponentTitle,
    viewMode: ViewMode
  ): PlayFunctionContext[TRenderer, TArgs] = {
    val __obj = js.Dynamic.literal(abortSignal = abortSignal.asInstanceOf[js.Any], argTypes = argTypes.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], canvasElement = canvasElement.asInstanceOf[js.Any], componentId = componentId.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialArgs = initialArgs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalStoryFn = originalStoryFn.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], step = js.Any.fromFunction2(step), story = story.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayFunctionContext[TRenderer, TArgs]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayFunctionContext[?, ?], TRenderer /* <: Renderer */, TArgs] (val x: Self & (PlayFunctionContext[TRenderer, TArgs])) extends AnyVal {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setArgTypes(value: StrictArgTypes[TArgs]): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    inline def setArgs(value: TArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setCanvasElement(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TRenderer['canvasElement'] */ js.Any
    ): Self = StObject.set(x, "canvasElement", value.asInstanceOf[js.Any])
    
    inline def setComponent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TRenderer & @storybook/csf.anon.TAny['component'] */ js.Any
    ): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentId(value: ComponentId): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setGlobals(value: Globals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setHooks(value: Any): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitialArgs(value: TArgs): Self = StObject.set(x, "initialArgs", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ComponentTitle): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLoaded(value: Record[String, Any]): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setName(value: StoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginalStoryFn(value: StoryFn[TRenderer, Args]): Self = StObject.set(x, "originalStoryFn", value.asInstanceOf[js.Any])
    
    inline def setOriginalStoryFnFunction1(
      value: /* context */ StoryContext[TRenderer, Args] => /* import warning: importer.ImportType#apply Failed type conversion: TRenderer['storyResult'] */ js.Any
    ): Self = StObject.set(x, "originalStoryFn", js.Any.fromFunction1(value))
    
    inline def setOriginalStoryFnFunction2(
      value: (Args, /* context */ StoryContext[TRenderer, Args]) => /* import warning: importer.ImportType#apply Failed type conversion: TRenderer & @storybook/csf.anon.T<TArgs>['storyResult'] */ js.Any
    ): Self = StObject.set(x, "originalStoryFn", js.Any.fromFunction2(value))
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setStep(
      value: (/* label */ StepLabel, /* play */ PlayFunction[TRenderer, TArgs]) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
    
    inline def setStory(value: StoryName): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
    
    inline def setSubcomponents(
      value: Record[
          String, 
          /* import warning: importer.ImportType#apply Failed type conversion: TRenderer & @storybook/csf.anon.TAny['component'] */ js.Any
        ]
    ): Self = StObject.set(x, "subcomponents", value.asInstanceOf[js.Any])
    
    inline def setSubcomponentsUndefined: Self = StObject.set(x, "subcomponents", js.undefined)
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTitle(value: ComponentTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
