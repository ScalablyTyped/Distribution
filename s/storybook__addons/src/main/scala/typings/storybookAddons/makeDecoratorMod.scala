package typings.storybookAddons

import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryGetter
import typings.storybookAddons.typesMod.StoryWrapper
import typings.storybookAddons.typesMod.WrapperSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeDecoratorMod {
  
  @JSImport("@storybook/addons/dist/make-decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def makeDecorator(hasNameParameterNameWrapperSkipIfNoParametersOrOptions: MakeDecoratorOptions): MakeDecoratorResult = ^.asInstanceOf[js.Dynamic].applyDynamic("makeDecorator")(hasNameParameterNameWrapperSkipIfNoParametersOrOptions.asInstanceOf[js.Any]).asInstanceOf[MakeDecoratorResult]
  
  trait MakeDecoratorOptions extends StObject {
    
    var name: String
    
    var parameterName: String
    
    var skipIfNoParametersOrOptions: js.UndefOr[Boolean] = js.undefined
    
    var wrapper: StoryWrapper
  }
  object MakeDecoratorOptions {
    
    @scala.inline
    def apply(
      name: String,
      parameterName: String,
      wrapper: (/* getStory */ StoryGetter, /* context */ StoryContext, /* settings */ WrapperSettings) => js.Any
    ): MakeDecoratorOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], wrapper = js.Any.fromFunction3(wrapper))
      __obj.asInstanceOf[MakeDecoratorOptions]
    }
    
    @scala.inline
    implicit class MakeDecoratorOptionsMutableBuilder[Self <: MakeDecoratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfNoParametersOrOptions(value: Boolean): Self = StObject.set(x, "skipIfNoParametersOrOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfNoParametersOrOptionsUndefined: Self = StObject.set(x, "skipIfNoParametersOrOptions", js.undefined)
      
      @scala.inline
      def setWrapper(
        value: (/* getStory */ StoryGetter, /* context */ StoryContext, /* settings */ WrapperSettings) => js.Any
      ): Self = StObject.set(x, "wrapper", js.Any.fromFunction3(value))
    }
  }
  
  type MakeDecoratorResult = js.Function1[/* args */ js.Any, js.Any]
}
