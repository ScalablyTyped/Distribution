package typings.rbx

import typings.rbx.anon.ClassName
import typings.rbx.anon.PreferHelpersPropsOverrid
import typings.rbx.baseHelpersFactoryMod.TransformFunction
import typings.rbx.baseHelpersFactoryMod.ValidatingTransformFunction
import typings.rbx.baseHelpersMod.HelpersProps
import typings.react.mod.Context
import typings.std.Partial
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseThemeMod {
  
  @JSImport("rbx/base/theme", "ThemeContext")
  @js.native
  val ThemeContext: Context[ThemeContextValue[PreferHelpersPropsOverrid, js.Object]] = js.native
  
  @JSImport("rbx/base/theme", "initialValue")
  @js.native
  val initialValue: ThemeContextValue[HelpersProps, js.Object] = js.native
  
  trait ThemeContextValue[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] extends StObject {
    
    var transform: ValidatingTransformFunction[TTransformProps, TNewProps]
  }
  object ThemeContextValue {
    
    inline def apply[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */](
      transform: (/* props */ ClassName & Partial[TTransformProps], /* componentName */ String, /* location */ js.UndefOr[String]) => ReturnType[TransformFunction[TTransformProps, TNewProps]]
    ): ThemeContextValue[TTransformProps, TNewProps] = {
      val __obj = js.Dynamic.literal(transform = js.Any.fromFunction3(transform))
      __obj.asInstanceOf[ThemeContextValue[TTransformProps, TNewProps]]
    }
    
    extension [Self <: ThemeContextValue[?, ?], TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */](x: Self & (ThemeContextValue[TTransformProps, TNewProps])) {
      
      inline def setTransform(
        value: (/* props */ ClassName & Partial[TTransformProps], /* componentName */ String, /* location */ js.UndefOr[String]) => ReturnType[TransformFunction[TTransformProps, TNewProps]]
      ): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
    }
  }
}
