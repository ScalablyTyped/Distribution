package typings.storybookAddons

import typings.storybookAddons.distTs3Dot9TypesMod.LegacyStoryFn
import typings.storybookAddons.distTs3Dot9TypesMod.StoryContext
import typings.storybookAddons.distTs3Dot9TypesMod.StoryWrapper
import typings.storybookAddons.distTs3Dot9TypesMod.WrapperSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9MakeDecoratorMod {
  
  @JSImport("@storybook/addons/dist/ts3.9/make-decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeDecorator(param0: MakeDecoratorOptions): MakeDecoratorResult = ^.asInstanceOf[js.Dynamic].applyDynamic("makeDecorator")(param0.asInstanceOf[js.Any]).asInstanceOf[MakeDecoratorResult]
  
  trait MakeDecoratorOptions extends StObject {
    
    var name: String
    
    var parameterName: String
    
    var skipIfNoParametersOrOptions: js.UndefOr[Boolean] = js.undefined
    
    var wrapper: StoryWrapper
  }
  object MakeDecoratorOptions {
    
    inline def apply(
      name: String,
      parameterName: String,
      wrapper: (/* storyFn */ LegacyStoryFn[Any], /* context */ StoryContext, /* settings */ WrapperSettings) => Any
    ): MakeDecoratorOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], wrapper = js.Any.fromFunction3(wrapper))
      __obj.asInstanceOf[MakeDecoratorOptions]
    }
    
    extension [Self <: MakeDecoratorOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
      
      inline def setSkipIfNoParametersOrOptions(value: Boolean): Self = StObject.set(x, "skipIfNoParametersOrOptions", value.asInstanceOf[js.Any])
      
      inline def setSkipIfNoParametersOrOptionsUndefined: Self = StObject.set(x, "skipIfNoParametersOrOptions", js.undefined)
      
      inline def setWrapper(
        value: (/* storyFn */ LegacyStoryFn[Any], /* context */ StoryContext, /* settings */ WrapperSettings) => Any
      ): Self = StObject.set(x, "wrapper", js.Any.fromFunction3(value))
    }
  }
  
  type MakeDecoratorResult = js.Function1[/* args */ Any, Any]
}
