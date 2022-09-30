package typings.storybookReact

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactElementToJsxString.mod.ReactElementToJSXStringOptions
import typings.storybookReact.previewTypesMod.StoryFnReactReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsxDecoratorMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/jsxDecorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jsxDecorator(
    storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<ReactFramework> */ Any,
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<ReactFramework> */ Any
  ): StoryFnReactReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDecorator")(storyFn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[StoryFnReactReturnType]
  
  inline def renderJsx(code: ReactElement, options: JSXOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderJsx")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def skipJsxRender(
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<ReactFramework> */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("skipJsxRender")(context.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait JSXOptions
    extends StObject
       with ReactElementToJSXStringOptions {
    
    /** Override the display name used for a component */
    @JSName("displayName")
    var displayName_JSXOptions: js.UndefOr[String | (js.Function1[/* element */ ReactNode, String])] = js.undefined
    
    /** Whether to format HTML or Vue markup */
    var enableBeautify: js.UndefOr[Boolean] = js.undefined
    
    /** Deprecated: A function ran after the story is rendered */
    var onBeforeRender: js.UndefOr[js.Function1[/* dom */ String, String]] = js.undefined
    
    /** How many wrappers to skip when rendering the jsx */
    var skip: js.UndefOr[Double] = js.undefined
    
    /** A function ran after a story is rendered (prefer this over `onBeforeRender`) */
    var transformSource: js.UndefOr[
        js.Function2[
          /* dom */ String, 
          /* context */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<ReactFramework> */ Any
          ], 
          String
        ]
      ] = js.undefined
  }
  object JSXOptions {
    
    inline def apply(): JSXOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSXOptions]
    }
    
    extension [Self <: JSXOptions](x: Self) {
      
      inline def setDisplayName(value: String | (js.Function1[/* element */ ReactNode, String])): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameFunction1(value: /* element */ ReactNode => String): Self = StObject.set(x, "displayName", js.Any.fromFunction1(value))
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEnableBeautify(value: Boolean): Self = StObject.set(x, "enableBeautify", value.asInstanceOf[js.Any])
      
      inline def setEnableBeautifyUndefined: Self = StObject.set(x, "enableBeautify", js.undefined)
      
      inline def setOnBeforeRender(value: /* dom */ String => String): Self = StObject.set(x, "onBeforeRender", js.Any.fromFunction1(value))
      
      inline def setOnBeforeRenderUndefined: Self = StObject.set(x, "onBeforeRender", js.undefined)
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTransformSource(
        value: (/* dom */ String, /* context */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<ReactFramework> */ Any
            ]) => String
      ): Self = StObject.set(x, "transformSource", js.Any.fromFunction2(value))
      
      inline def setTransformSourceUndefined: Self = StObject.set(x, "transformSource", js.undefined)
    }
  }
}
