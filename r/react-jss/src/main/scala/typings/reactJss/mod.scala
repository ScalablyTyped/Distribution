package typings.reactJss

import org.scalablytyped.runtime.NumberDictionary
import typings.jss.mod.Classes
import typings.jss.mod.CreateGenerateId_
import typings.jss.mod.Jss
import typings.jss.mod.StyleSheetFactoryOptions
import typings.jss.mod.Styles
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactJss.anon.Children
import typings.reactJss.anon.DisableStylesGeneration
import typings.reactJss.anon.InnerRef
import typings.reactJss.reactJssStrings.classes
import typings.std.Omit
import typings.std.Partial
import typings.std.StyleSheet
import typings.theming.mod.ThemeProviderFactory
import typings.theming.mod.Theming
import typings.theming.mod.UseThemeFactory
import typings.theming.mod.WithThemeFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-jss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S): js.Function1[
    /* comp */ js.Any, 
    ComponentType[
      LibraryManagedAttributes[js.Any, (Omit[GetProps[js.Any], classes]) & Partial[WithStylesProps[S]] & InnerRef]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* comp */ js.Any, 
    ComponentType[
      LibraryManagedAttributes[js.Any, (Omit[GetProps[js.Any], classes]) & Partial[WithStylesProps[S]] & InnerRef]
    ]
  ]]
  inline def default[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S, options: WithStylesOptions): js.Function1[
    /* comp */ js.Any, 
    ComponentType[
      LibraryManagedAttributes[js.Any, (Omit[GetProps[js.Any], classes]) & Partial[WithStylesProps[S]] & InnerRef]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* comp */ js.Any, 
    ComponentType[
      LibraryManagedAttributes[js.Any, (Omit[GetProps[js.Any], classes]) & Partial[WithStylesProps[S]] & InnerRef]
    ]
  ]]
  
  @JSImport("react-jss", "JssContext")
  @js.native
  val JssContext: Context[DisableStylesGeneration] = js.native
  
  @JSImport("react-jss", "JssProvider")
  @js.native
  val JssProvider: ComponentType[Children] = js.native
  
  @JSImport("react-jss", "SheetsRegistry")
  @js.native
  class SheetsRegistry ()
    extends typings.jss.mod.SheetsRegistry
  
  @JSImport("react-jss", "ThemeProvider")
  @js.native
  val ThemeProvider: ThemeProviderFactory[typings.theming.mod.DefaultTheme] = js.native
  
  @JSImport("react-jss", "createGenerateId")
  @js.native
  val createGenerateId: CreateGenerateId_ = js.native
  
  inline def createTheming[Theme](context: Context[Theme]): Theming[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheming")(context.asInstanceOf[js.Any]).asInstanceOf[Theming[Theme]]
  
  inline def createUseStyles[Theme, C /* <: String */](styles: js.Function1[/* theme */ Theme, Styles[C]]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUseStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]]]
  inline def createUseStyles[Theme, C /* <: String */](styles: js.Function1[/* theme */ Theme, Styles[C]], options: CreateUseStylesOptions[Theme]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUseStyles")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]]]
  inline def createUseStyles[Theme, C /* <: String */](styles: Styles[C]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUseStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]]]
  inline def createUseStyles[Theme, C /* <: String */](styles: Styles[C], options: CreateUseStylesOptions[Theme]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUseStyles")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]]]
  
  @JSImport("react-jss", "jss")
  @js.native
  val jss: Jss = js.native
  
  @JSImport("react-jss", "useTheme")
  @js.native
  val useTheme: UseThemeFactory[typings.theming.mod.DefaultTheme] = js.native
  
  @JSImport("react-jss", "withTheme")
  @js.native
  val withTheme: WithThemeFactory[typings.theming.mod.DefaultTheme] = js.native
  
  trait BaseOptions[Theme]
    extends StObject
       with StyleSheetFactoryOptions {
    
    var theming: js.UndefOr[Theming[Theme]] = js.undefined
  }
  object BaseOptions {
    
    inline def apply[Theme](): BaseOptions[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions[Theme]]
    }
    
    extension [Self <: BaseOptions[?], Theme](x: Self & BaseOptions[Theme]) {
      
      inline def setTheming(value: Theming[Theme]): Self = StObject.set(x, "theming", value.asInstanceOf[js.Any])
      
      inline def setThemingUndefined: Self = StObject.set(x, "theming", js.undefined)
    }
  }
  
  trait CreateUseStylesOptions[Theme]
    extends StObject
       with BaseOptions[Theme] {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object CreateUseStylesOptions {
    
    inline def apply[Theme](): CreateUseStylesOptions[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateUseStylesOptions[Theme]]
    }
    
    extension [Self <: CreateUseStylesOptions[?], Theme](x: Self & CreateUseStylesOptions[Theme]) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait DefaultTheme extends StObject
  
  type GetProps[C] = js.Any
  
  type Managers = NumberDictionary[StyleSheet]
  
  /**
    * @deprecated Please use `WithStylesProps` instead
    */
  type WithStyles[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] = WithStylesProps[S]
  
  trait WithStylesOptions
    extends StObject
       with BaseOptions[DefaultTheme] {
    
    var injectTheme: js.UndefOr[Boolean] = js.undefined
    
    var jss: js.UndefOr[Jss] = js.undefined
  }
  object WithStylesOptions {
    
    inline def apply(): WithStylesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithStylesOptions]
    }
    
    extension [Self <: WithStylesOptions](x: Self) {
      
      inline def setInjectTheme(value: Boolean): Self = StObject.set(x, "injectTheme", value.asInstanceOf[js.Any])
      
      inline def setInjectThemeUndefined: Self = StObject.set(x, "injectTheme", js.undefined)
      
      inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      inline def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
    }
  }
  
  trait WithStylesProps[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] extends StObject {
    
    var classes: Classes[/* keyof S */ String]
  }
  object WithStylesProps {
    
    inline def apply[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */](classes: Classes[/* keyof S */ String]): WithStylesProps[S] = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithStylesProps[S]]
    }
    
    extension [Self <: WithStylesProps[?], S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */](x: Self & WithStylesProps[S]) {
      
      inline def setClasses(value: Classes[/* keyof S */ String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    }
  }
}
