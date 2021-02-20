package typings.reactThemeableTs

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.PureComponent
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeProviderMod {
  
  @JSImport("react-themeable-ts/build-es5/theme-provider", "ThemeProvider")
  @js.native
  class ThemeProvider protected ()
    extends PureComponent[IThemeProviderProps, js.Object, js.Any] {
    def this(props: IThemeProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IThemeProviderProps, context: js.Any) = this()
    
    def getChildContext(): StringDictionary[js.Any] = js.native
  }
  /* static members */
  object ThemeProvider {
    
    @JSImport("react-themeable-ts/build-es5/theme-provider", "ThemeProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-themeable-ts/build-es5/theme-provider", "ThemeProvider.childContextTypes")
    @js.native
    def childContextTypes: StringDictionary[Validator[js.Any]] = js.native
    @scala.inline
    def childContextTypes_=(x: StringDictionary[Validator[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-themeable-ts/build-es5/theme-provider", "ThemeProvider.defaultProps")
    @js.native
    def defaultProps: StringDictionary[js.Object] = js.native
    @scala.inline
    def defaultProps_=(x: StringDictionary[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IThemeProviderContext extends StObject {
    
    var reactThemeable: js.Any = js.native
  }
  object IThemeProviderContext {
    
    @scala.inline
    def apply(reactThemeable: js.Any): IThemeProviderContext = {
      val __obj = js.Dynamic.literal(reactThemeable = reactThemeable.asInstanceOf[js.Any])
      __obj.asInstanceOf[IThemeProviderContext]
    }
    
    @scala.inline
    implicit class IThemeProviderContextMutableBuilder[Self <: IThemeProviderContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReactThemeable(value: js.Any): Self = StObject.set(x, "reactThemeable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IThemeProviderProps extends StObject {
    
    var children: js.UndefOr[js.Any] = js.native
    
    var reactThemeable: js.Any = js.native
  }
  object IThemeProviderProps {
    
    @scala.inline
    def apply(reactThemeable: js.Any): IThemeProviderProps = {
      val __obj = js.Dynamic.literal(reactThemeable = reactThemeable.asInstanceOf[js.Any])
      __obj.asInstanceOf[IThemeProviderProps]
    }
    
    @scala.inline
    implicit class IThemeProviderPropsMutableBuilder[Self <: IThemeProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setReactThemeable(value: js.Any): Self = StObject.set(x, "reactThemeable", value.asInstanceOf[js.Any])
    }
  }
}
