package typings.reactCssThemr

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactCssThemr.anon.MapThemrProps
import typings.reactCssThemr.anon.Theme
import typings.reactCssThemr.reactCssThemrBooleans.`false`
import typings.reactCssThemr.reactCssThemrStrings.deeply
import typings.reactCssThemr.reactCssThemrStrings.softly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-css-themr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-css-themr", "ThemeProvider")
  @js.native
  open class ThemeProvider protected () extends Component[ThemeProviderProps, Any, Any] {
    def this(props: ThemeProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ThemeProviderProps, context: Any) = this()
  }
  
  inline def themeable(themes: TReactCSSThemrTheme*): TReactCSSThemrTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("themeable")(themes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TReactCSSThemrTheme]
  
  inline def themr(identifier: String): js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("themr")(identifier.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ]]
  inline def themr(identifier: String, defaultTheme: js.Object): js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("themr")(identifier.asInstanceOf[js.Any], defaultTheme.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ]]
  inline def themr(identifier: String, defaultTheme: js.Object, options: IThemrOptions): js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("themr")(identifier.asInstanceOf[js.Any], defaultTheme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ]]
  inline def themr(identifier: String, defaultTheme: Unit, options: IThemrOptions): js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("themr")(identifier.asInstanceOf[js.Any], defaultTheme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ]]
  inline def themr(identifier: js.Symbol): js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("themr")(identifier.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ]]
  inline def themr(identifier: js.Symbol, defaultTheme: js.Object): js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("themr")(identifier.asInstanceOf[js.Any], defaultTheme.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ]]
  inline def themr(identifier: js.Symbol, defaultTheme: js.Object, options: IThemrOptions): js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("themr")(identifier.asInstanceOf[js.Any], defaultTheme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ]]
  inline def themr(identifier: js.Symbol, defaultTheme: Unit, options: IThemrOptions): js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("themr")(identifier.asInstanceOf[js.Any], defaultTheme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ]]
  inline def themr(identifier: Double): js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("themr")(identifier.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ]]
  inline def themr(identifier: Double, defaultTheme: js.Object): js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("themr")(identifier.asInstanceOf[js.Any], defaultTheme.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ]]
  inline def themr(identifier: Double, defaultTheme: js.Object, options: IThemrOptions): js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("themr")(identifier.asInstanceOf[js.Any], defaultTheme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ]]
  inline def themr(identifier: Double, defaultTheme: Unit, options: IThemrOptions): js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("themr")(identifier.asInstanceOf[js.Any], defaultTheme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ (Instantiable2[/* props */ js.UndefOr[Any], /* context */ js.UndefOr[Any], Component[Any, Any, Any]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any), 
    ThemedComponentClass[Any & MapThemrProps[Any], Any]
  ]]
  
  trait IThemrOptions extends StObject {
    
    /** @default "deeply" */
    var composeTheme: js.UndefOr[deeply | softly | `false`] = js.undefined
    
    //currently there's no way to lift decorated component's generic type argument (P) to upper decorator
    //that's why just {}
    var mapThemrProps: js.UndefOr[TMapThemrProps[js.Object]] = js.undefined
  }
  object IThemrOptions {
    
    inline def apply(): IThemrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThemrOptions]
    }
    
    extension [Self <: IThemrOptions](x: Self) {
      
      inline def setComposeTheme(value: deeply | softly | `false`): Self = StObject.set(x, "composeTheme", value.asInstanceOf[js.Any])
      
      inline def setComposeThemeUndefined: Self = StObject.set(x, "composeTheme", js.undefined)
      
      inline def setMapThemrProps(value: (js.Object, /* theme */ TReactCSSThemrTheme) => js.Object & Theme): Self = StObject.set(x, "mapThemrProps", js.Any.fromFunction2(value))
      
      inline def setMapThemrPropsUndefined: Self = StObject.set(x, "mapThemrProps", js.undefined)
    }
  }
  
  type TMapThemrProps[P] = js.Function2[/* ownProps */ P, /* theme */ TReactCSSThemrTheme, P & Theme]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type TReactCSSThemrTheme = {[key: string] : string | react-css-themr.react-css-themr.TReactCSSThemrTheme}
  }}}
  to avoid circular code involving: 
  - react-css-themr.react-css-themr.TMapThemrProps
  - react-css-themr.react-css-themr.TReactCSSThemrTheme
  */
  trait TReactCSSThemrTheme
    extends StObject
       with /* key */ StringDictionary[String | TReactCSSThemrTheme]
  object TReactCSSThemrTheme {
    
    inline def apply(): TReactCSSThemrTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TReactCSSThemrTheme]
    }
  }
  
  trait ThemeProviderProps extends StObject {
    
    var innerRef: js.UndefOr[js.Function] = js.undefined
    
    var theme: TReactCSSThemrTheme
  }
  object ThemeProviderProps {
    
    inline def apply(theme: TReactCSSThemrTheme): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    extension [Self <: ThemeProviderProps](x: Self) {
      
      inline def setInnerRef(value: js.Function): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setTheme(value: TReactCSSThemrTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type ThemedComponent[P, S] = Component[P, S, Any]
  
  @js.native
  trait ThemedComponentClass[P, S]
    extends StObject
       with ComponentClass[P, ComponentState]
       with Instantiable0[ThemedComponent[P, S]]
}
