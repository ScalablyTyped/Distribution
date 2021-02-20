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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-jss", JSImport.Default)
  @js.native
  def default[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S): js.Function1[
    /* comp */ js.Any, 
    ComponentType[
      LibraryManagedAttributes[_, (Omit[GetProps[_], classes]) with Partial[WithStylesProps[S]] with InnerRef]
    ]
  ] = js.native
  @JSImport("react-jss", JSImport.Default)
  @js.native
  def default[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S, options: WithStylesOptions): js.Function1[
    /* comp */ js.Any, 
    ComponentType[
      LibraryManagedAttributes[_, (Omit[GetProps[_], classes]) with Partial[WithStylesProps[S]] with InnerRef]
    ]
  ] = js.native
  
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
  
  @JSImport("react-jss", "createTheming")
  @js.native
  def createTheming[Theme](context: Context[Theme]): Theming[Theme] = js.native
  
  @JSImport("react-jss", "createUseStyles")
  @js.native
  def createUseStyles[Theme, C /* <: String */](styles: js.Function1[/* theme */ Theme, Styles[C]]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  @JSImport("react-jss", "createUseStyles")
  @js.native
  def createUseStyles[Theme, C /* <: String */](styles: js.Function1[/* theme */ Theme, Styles[C]], options: CreateUseStylesOptions[Theme]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  @JSImport("react-jss", "createUseStyles")
  @js.native
  def createUseStyles[Theme, C /* <: String */](styles: Styles[C]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  @JSImport("react-jss", "createUseStyles")
  @js.native
  def createUseStyles[Theme, C /* <: String */](styles: Styles[C], options: CreateUseStylesOptions[Theme]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  
  @JSImport("react-jss", "jss")
  @js.native
  val jss: Jss = js.native
  
  @JSImport("react-jss", "useTheme")
  @js.native
  val useTheme: UseThemeFactory[typings.theming.mod.DefaultTheme] = js.native
  
  @JSImport("react-jss", "withTheme")
  @js.native
  val withTheme: WithThemeFactory[typings.theming.mod.DefaultTheme] = js.native
  
  @js.native
  trait BaseOptions[Theme] extends StyleSheetFactoryOptions {
    
    var theming: js.UndefOr[Theming[Theme]] = js.native
  }
  object BaseOptions {
    
    @scala.inline
    def apply[Theme](): BaseOptions[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions[Theme]]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions[_], Theme] (val x: Self with BaseOptions[Theme]) extends AnyVal {
      
      @scala.inline
      def setTheming(value: Theming[Theme]): Self = StObject.set(x, "theming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemingUndefined: Self = StObject.set(x, "theming", js.undefined)
    }
  }
  
  @js.native
  trait CreateUseStylesOptions[Theme] extends BaseOptions[Theme] {
    
    var name: js.UndefOr[String] = js.native
  }
  object CreateUseStylesOptions {
    
    @scala.inline
    def apply[Theme](): CreateUseStylesOptions[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateUseStylesOptions[Theme]]
    }
    
    @scala.inline
    implicit class CreateUseStylesOptionsMutableBuilder[Self <: CreateUseStylesOptions[_], Theme] (val x: Self with CreateUseStylesOptions[Theme]) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait DefaultTheme extends StObject
  
  type GetProps[C] = js.Any
  
  type Managers = NumberDictionary[StyleSheet]
  
  /**
    * @deprecated Please use `WithStylesProps` instead
    */
  type WithStyles[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] = WithStylesProps[S]
  
  @js.native
  trait WithStylesOptions extends BaseOptions[DefaultTheme] {
    
    var injectTheme: js.UndefOr[Boolean] = js.native
    
    var jss: js.UndefOr[Jss] = js.native
  }
  object WithStylesOptions {
    
    @scala.inline
    def apply(): WithStylesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithStylesOptions]
    }
    
    @scala.inline
    implicit class WithStylesOptionsMutableBuilder[Self <: WithStylesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInjectTheme(value: Boolean): Self = StObject.set(x, "injectTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectThemeUndefined: Self = StObject.set(x, "injectTheme", js.undefined)
      
      @scala.inline
      def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
    }
  }
  
  @js.native
  trait WithStylesProps[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] extends StObject {
    
    var classes: Classes[/* keyof S */ String] = js.native
  }
  object WithStylesProps {
    
    @scala.inline
    def apply[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */](classes: Classes[/* keyof S */ String]): WithStylesProps[S] = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithStylesProps[S]]
    }
    
    @scala.inline
    implicit class WithStylesPropsMutableBuilder[Self <: WithStylesProps[_], S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] (val x: Self with WithStylesProps[S]) extends AnyVal {
      
      @scala.inline
      def setClasses(value: Classes[/* keyof S */ String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    }
  }
}
