package typings.storybookAddons.distTs3Dot9TypesMod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAnnotations[Args, StoryFnReturnType] extends StObject {
  
  /**
    * ArgTypes encode basic metadata for args, such as `name`, `description`, `defaultValue` for an arg. These get automatically filled in by Storybook Docs.
    * @see [Control annotations](https://github.com/storybookjs/storybook/blob/91e9dee33faa8eff0b342a366845de7100415367/addons/controls/README.md#control-annotations)
    */
  var argTypes: js.UndefOr[ArgTypes[Args]] = js.undefined
  
  /**
    * Dynamic data that are provided (and possibly updated by) Storybook and its addons.
    * @see [Arg story inputs](https://storybook.js.org/docs/react/api/csf#args-story-inputs)
    */
  var args: js.UndefOr[Partial[Args]] = js.undefined
  
  /**
    * Wrapper components or Storybook decorators that wrap a story.
    *
    * Decorators defined in Meta will be applied to every story variation.
    * @see [Decorators](https://storybook.js.org/docs/addons/introduction/#1-decorators)
    */
  var decorators: js.UndefOr[BaseDecorators[StoryFnReturnType]] = js.undefined
  
  /**
    * Custom metadata for a story.
    * @see [Parameters](https://storybook.js.org/docs/basics/writing-stories/#parameters)
    */
  var parameters: js.UndefOr[Parameters] = js.undefined
  
  /**
    * Function that is executed after the story is rendered.
    */
  var play: js.UndefOr[js.Function1[/* context */ StoryContext, js.Promise[Unit] | Unit]] = js.undefined
  
  /**
    * Define a custom render function for the story(ies). If not passed, a default render function by the framework will be used.
    */
  var render: js.UndefOr[js.Function2[/* args */ Args, /* context */ StoryContext, StoryFnReturnType]] = js.undefined
}
object BaseAnnotations {
  
  inline def apply[Args, StoryFnReturnType](): BaseAnnotations[Args, StoryFnReturnType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseAnnotations[Args, StoryFnReturnType]]
  }
  
  extension [Self <: BaseAnnotations[?, ?], Args, StoryFnReturnType](x: Self & (BaseAnnotations[Args, StoryFnReturnType])) {
    
    inline def setArgTypes(value: ArgTypes[Args]): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    inline def setArgTypesUndefined: Self = StObject.set(x, "argTypes", js.undefined)
    
    inline def setArgs(value: Partial[Args]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setDecorators(value: BaseDecorators[StoryFnReturnType]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(
      value: (js.Function2[
          /* story */ js.Function0[StoryFnReturnType], 
          /* context */ StoryContext, 
          StoryFnReturnType
        ])*
    ): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPlay(value: /* context */ StoryContext => js.Promise[Unit] | Unit): Self = StObject.set(x, "play", js.Any.fromFunction1(value))
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    inline def setRender(value: (/* args */ Args, /* context */ StoryContext) => StoryFnReturnType): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
