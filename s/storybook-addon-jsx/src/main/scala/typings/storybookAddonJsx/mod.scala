package typings.storybookAddonJsx

import typings.node.NodeModule
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.storybookAddonJsx.anon.AddWithJSX
import typings.storybookAddonJsx.anon.ParametersjsxAddonParamet
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("storybook-addon-jsx", "jsxDecorator")
  @js.native
  val jsxDecorator: DecoratorFunction[ReactElement] = js.native
  
  type AddWithJSXFunc[StoryFnReturnType] = js.Function3[
    /* kind */ String, 
    /* fn */ js.Function0[ReactNode], 
    /* options */ js.UndefOr[AddonParameters], 
    StoryApi[StoryFnReturnType]
  ]
  
  trait AddonParameters extends StObject {
    
    var displayName: js.UndefOr[String | displayNameFunc] = js.undefined
    
    var enableBeautify: js.UndefOr[Boolean] = js.undefined
    
    var onBeforeRender: js.UndefOr[js.Function1[/* domString */ String, String]] = js.undefined
    
    var skip: js.UndefOr[Double] = js.undefined
  }
  object AddonParameters {
    
    @scala.inline
    def apply(): AddonParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddonParameters]
    }
    
    @scala.inline
    implicit class AddonParametersMutableBuilder[Self <: AddonParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String | displayNameFunc): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameFunction1(value: /* element */ ReactElement => String): Self = StObject.set(x, "displayName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setEnableBeautify(value: Boolean): Self = StObject.set(x, "enableBeautify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBeautifyUndefined: Self = StObject.set(x, "enableBeautify", js.undefined)
      
      @scala.inline
      def setOnBeforeRender(value: /* domString */ String => String): Self = StObject.set(x, "onBeforeRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeRenderUndefined: Self = StObject.set(x, "onBeforeRender", js.undefined)
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
  
  type displayNameFunc = js.Function1[/* element */ ReactElement, String]
  
  /* augmented module */
  object storybookAddonsAugmentingMod {
    
    trait ClientStoryApi[StoryFnReturnType] extends StObject {
      
      def addDecorator(decorator: DecoratorFunction[StoryFnReturnType]): StoryApi[StoryFnReturnType]
      
      def addParameters(parameter: ParametersjsxAddonParamet): StoryApi[StoryFnReturnType]
      
      def storiesOf(kind: String, module: NodeModule): StoryApi[StoryFnReturnType] & AddWithJSX[StoryFnReturnType]
    }
    object ClientStoryApi {
      
      @scala.inline
      def apply[StoryFnReturnType](
        addDecorator: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType],
        addParameters: ParametersjsxAddonParamet => StoryApi[StoryFnReturnType],
        storiesOf: (String, NodeModule) => StoryApi[StoryFnReturnType] & AddWithJSX[StoryFnReturnType]
      ): ClientStoryApi[StoryFnReturnType] = {
        val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), storiesOf = js.Any.fromFunction2(storiesOf))
        __obj.asInstanceOf[ClientStoryApi[StoryFnReturnType]]
      }
      
      @scala.inline
      implicit class ClientStoryApiMutableBuilder[Self <: ClientStoryApi[?], StoryFnReturnType] (val x: Self & ClientStoryApi[StoryFnReturnType]) extends AnyVal {
        
        @scala.inline
        def setAddDecorator(value: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType]): Self = StObject.set(x, "addDecorator", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAddParameters(value: ParametersjsxAddonParamet => StoryApi[StoryFnReturnType]): Self = StObject.set(x, "addParameters", js.Any.fromFunction1(value))
        
        @scala.inline
        def setStoriesOf(value: (String, NodeModule) => StoryApi[StoryFnReturnType] & AddWithJSX[StoryFnReturnType]): Self = StObject.set(x, "storiesOf", js.Any.fromFunction2(value))
      }
    }
  }
}
