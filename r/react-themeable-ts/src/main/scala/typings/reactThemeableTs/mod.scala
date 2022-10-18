package typings.reactThemeableTs

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Validator
import typings.reactThemeableTs.buildEs5HocMod.IThemeDecoratorArgs
import typings.reactThemeableTs.buildEs5HocMod.TDecComponent
import typings.reactThemeableTs.buildEs5ThemeProviderMod.IThemeProviderProps
import typings.reactThemeableTs.buildEs5ThemeableMod.IStaticFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-themeable-ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-themeable-ts", "ThemeProvider")
  @js.native
  open class ThemeProvider protected ()
    extends typings.reactThemeableTs.buildEs5ThemeProviderMod.ThemeProvider {
    def this(props: IThemeProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IThemeProviderProps, context: Any) = this()
  }
  /* static members */
  object ThemeProvider {
    
    @JSImport("react-themeable-ts", "ThemeProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-themeable-ts", "ThemeProvider.childContextTypes")
    @js.native
    def childContextTypes: StringDictionary[Validator[Any]] = js.native
    inline def childContextTypes_=(x: StringDictionary[Validator[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-themeable-ts", "ThemeProvider.defaultProps")
    @js.native
    def defaultProps: StringDictionary[js.Object] = js.native
    inline def defaultProps_=(x: StringDictionary[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def themeDecorator[P /* <: IThemeDecoratorArgs */](): js.Function1[/* WrappedComponent */ TDecComponent[P], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("themeDecorator")().asInstanceOf[js.Function1[/* WrappedComponent */ TDecComponent[P], Any]]
  inline def themeDecorator[P /* <: IThemeDecoratorArgs */](hasThemeKeyThemePropMemoizeeOptsContextPath: IThemeDecoratorArgs): js.Function1[/* WrappedComponent */ TDecComponent[P], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("themeDecorator")(hasThemeKeyThemePropMemoizeeOptsContextPath.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* WrappedComponent */ TDecComponent[P], Any]]
  
  @JSImport("react-themeable-ts", "themeable")
  @js.native
  val themeable: IStaticFn = js.native
}
