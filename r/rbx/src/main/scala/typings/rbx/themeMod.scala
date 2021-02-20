package typings.rbx

import typings.rbx.anon.ClassName
import typings.rbx.anon.PreferHelpersPropsOverrid
import typings.rbx.factoryMod.TransformFunction
import typings.rbx.factoryMod.ValidatingTransformFunction
import typings.rbx.helpersMod.HelpersProps
import typings.react.mod.Context
import typings.std.Partial
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeMod {
  
  @JSImport("rbx/base/theme", "ThemeContext")
  @js.native
  val ThemeContext: Context[ThemeContextValue[PreferHelpersPropsOverrid, js.Object]] = js.native
  
  @JSImport("rbx/base/theme", "initialValue")
  @js.native
  val initialValue: ThemeContextValue[HelpersProps, js.Object] = js.native
  
  @js.native
  trait ThemeContextValue[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] extends StObject {
    
    var transform: ValidatingTransformFunction[TTransformProps, TNewProps] = js.native
  }
  object ThemeContextValue {
    
    @scala.inline
    def apply[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */](
      transform: (/* props */ ClassName with Partial[TTransformProps], /* componentName */ String, /* location */ js.UndefOr[String]) => ReturnType[TransformFunction[TTransformProps, TNewProps]]
    ): ThemeContextValue[TTransformProps, TNewProps] = {
      val __obj = js.Dynamic.literal(transform = js.Any.fromFunction3(transform))
      __obj.asInstanceOf[ThemeContextValue[TTransformProps, TNewProps]]
    }
    
    @scala.inline
    implicit class ThemeContextValueMutableBuilder[Self <: ThemeContextValue[_, _], TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] (val x: Self with (ThemeContextValue[TTransformProps, TNewProps])) extends AnyVal {
      
      @scala.inline
      def setTransform(
        value: (/* props */ ClassName with Partial[TTransformProps], /* componentName */ String, /* location */ js.UndefOr[String]) => ReturnType[TransformFunction[TTransformProps, TNewProps]]
      ): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
    }
  }
}
