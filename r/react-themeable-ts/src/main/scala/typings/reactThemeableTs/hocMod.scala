package typings.reactThemeableTs

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.SFC
import typings.reactThemeableTs.themeableMod.IStaticFnReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hocMod {
  
  @JSImport("react-themeable-ts/build-es5/hoc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def themeDecorator[P /* <: IThemeDecoratorArgs */](): js.Function1[/* WrappedComponent */ TDecComponent[P], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("themeDecorator")().asInstanceOf[js.Function1[/* WrappedComponent */ TDecComponent[P], js.Any]]
  inline def themeDecorator[P /* <: IThemeDecoratorArgs */](hasThemeKeyThemePropMemoizeeOptsContextPath: IThemeDecoratorArgs): js.Function1[/* WrappedComponent */ TDecComponent[P], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("themeDecorator")(hasThemeKeyThemePropMemoizeeOptsContextPath.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* WrappedComponent */ TDecComponent[P], js.Any]]
  
  trait IHOCDefaultNoThemeProps extends StObject {
    
    var t: IStaticFnReturn
  }
  object IHOCDefaultNoThemeProps {
    
    inline def apply(t: IStaticFnReturn): IHOCDefaultNoThemeProps = {
      val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHOCDefaultNoThemeProps]
    }
    
    extension [Self <: IHOCDefaultNoThemeProps](x: Self) {
      
      inline def setT(value: IStaticFnReturn): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  trait IHOCDefaultProps
    extends StObject
       with IHOCDefaultNoThemeProps {
    
    var theme: js.UndefOr[js.Any] = js.undefined
  }
  object IHOCDefaultProps {
    
    inline def apply(t: IStaticFnReturn): IHOCDefaultProps = {
      val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHOCDefaultProps]
    }
    
    extension [Self <: IHOCDefaultProps](x: Self) {
      
      inline def setTheme(value: js.Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IThemeDecoratorArgs extends StObject {
    
    var contextPath: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var memoizeeOpts: js.UndefOr[js.Any] = js.undefined
    
    var themeKey: js.UndefOr[String] = js.undefined
    
    var themeProp: js.UndefOr[String] = js.undefined
  }
  object IThemeDecoratorArgs {
    
    inline def apply(): IThemeDecoratorArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThemeDecoratorArgs]
    }
    
    extension [Self <: IThemeDecoratorArgs](x: Self) {
      
      inline def setContextPath(value: String | js.Array[String]): Self = StObject.set(x, "contextPath", value.asInstanceOf[js.Any])
      
      inline def setContextPathUndefined: Self = StObject.set(x, "contextPath", js.undefined)
      
      inline def setContextPathVarargs(value: String*): Self = StObject.set(x, "contextPath", js.Array(value :_*))
      
      inline def setMemoizeeOpts(value: js.Any): Self = StObject.set(x, "memoizeeOpts", value.asInstanceOf[js.Any])
      
      inline def setMemoizeeOptsUndefined: Self = StObject.set(x, "memoizeeOpts", js.undefined)
      
      inline def setThemeKey(value: String): Self = StObject.set(x, "themeKey", value.asInstanceOf[js.Any])
      
      inline def setThemeKeyUndefined: Self = StObject.set(x, "themeKey", js.undefined)
      
      inline def setThemeProp(value: String): Self = StObject.set(x, "themeProp", value.asInstanceOf[js.Any])
      
      inline def setThemePropUndefined: Self = StObject.set(x, "themeProp", js.undefined)
    }
  }
  
  type TDecComponent[P] = SFC[P] | (ComponentClass[P, ComponentState])
}
