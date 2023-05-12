package typings.storybookCsf.mod

import typings.std.Partial
import typings.typeFest.sourceSimplifyMod.Simplify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAnnotations[TRenderer /* <: Renderer */, TArgs] extends StObject {
  
  /**
    * ArgTypes encode basic metadata for args, such as `name`, `description`, `defaultValue` for an arg. These get automatically filled in by Storybook Docs.
    * @see [Control annotations](https://github.com/storybookjs/storybook/blob/91e9dee33faa8eff0b342a366845de7100415367/addons/controls/README.md#control-annotations)
    */
  var argTypes: js.UndefOr[Partial[ArgTypes[TArgs]]] = js.undefined
  
  /**
    * Dynamic data that are provided (and possibly updated by) Storybook and its addons.
    * @see [Arg story inputs](https://storybook.js.org/docs/react/api/csf#args-story-inputs)
    */
  var args: js.UndefOr[Partial[TArgs]] = js.undefined
  
  /**
    * Wrapper components or Storybook decorators that wrap a story.
    *
    * Decorators defined in Meta will be applied to every story variation.
    * @see [Decorators](https://storybook.js.org/docs/addons/introduction/#1-decorators)
    */
  var decorators: js.UndefOr[js.Array[DecoratorFunction[TRenderer, Simplify[TArgs]]]] = js.undefined
  
  /**
    * Asynchronous functions which provide data for a story.
    * @see [Loaders](https://storybook.js.org/docs/react/writing-stories/loaders)
    */
  var loaders: js.UndefOr[js.Array[LoaderFunction[TRenderer, TArgs]]] = js.undefined
  
  /**
    * Custom metadata for a story.
    * @see [Parameters](https://storybook.js.org/docs/basics/writing-stories/#parameters)
    */
  var parameters: js.UndefOr[Parameters] = js.undefined
  
  /**
    * Define a custom render function for the story(ies). If not passed, a default render function by the renderer will be used.
    */
  var render: js.UndefOr[ArgsStoryFn[TRenderer, TArgs]] = js.undefined
}
object BaseAnnotations {
  
  inline def apply[TRenderer /* <: Renderer */, TArgs](): BaseAnnotations[TRenderer, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseAnnotations[TRenderer, TArgs]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseAnnotations[?, ?], TRenderer /* <: Renderer */, TArgs] (val x: Self & (BaseAnnotations[TRenderer, TArgs])) extends AnyVal {
    
    inline def setArgTypes(value: Partial[ArgTypes[TArgs]]): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    inline def setArgTypesUndefined: Self = StObject.set(x, "argTypes", js.undefined)
    
    inline def setArgs(value: Partial[TArgs]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setDecorators(value: js.Array[DecoratorFunction[TRenderer, Simplify[TArgs]]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: (DecoratorFunction[TRenderer, Simplify[TArgs]])*): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setLoaders(value: js.Array[LoaderFunction[TRenderer, TArgs]]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
    
    inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
    
    inline def setLoadersVarargs(value: (LoaderFunction[TRenderer, TArgs])*): Self = StObject.set(x, "loaders", js.Array(value*))
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setRender(
      value: (TArgs, /* context */ StoryContext[TRenderer, TArgs]) => /* import warning: importer.ImportType#apply Failed type conversion: TRenderer & @storybook/csf.anon.T<TArgs>['storyResult'] */ js.Any
    ): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
