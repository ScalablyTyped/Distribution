package typings.reactNavigationNative

import typings.reactNavigationNative.anon.Background
import typings.reactNavigationNative.anon.FnCall
import typings.reactNavigationNative.anon.FnCallStateOptions
import typings.reactNavigationNative.anon.InitialRouteName
import typings.reactNavigationRouters.typesMod.Route
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait DocumentTitleOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var formatter: js.UndefOr[
        js.Function2[
          /* options */ js.UndefOr[Record[String, _]], 
          /* route */ js.UndefOr[Route[String, js.UndefOr[js.Object]]], 
          String
        ]
      ] = js.native
  }
  object DocumentTitleOptions {
    
    @scala.inline
    def apply(): DocumentTitleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentTitleOptions]
    }
    
    @scala.inline
    implicit class DocumentTitleOptionsMutableBuilder[Self <: DocumentTitleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFormatter(
        value: (/* options */ js.UndefOr[Record[String, _]], /* route */ js.UndefOr[Route[String, js.UndefOr[js.Object]]]) => String
      ): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    }
  }
  
  @js.native
  trait LinkingOptions extends StObject {
    
    /**
      * Config to fine-tune how to parse the path.
      *
      * @example
      * ```js
      * {
      *   Chat: {
      *     path: 'chat/:author/:id',
      *     parse: { id: Number }
      *   }
      * }
      * ```
      */
    var config: js.UndefOr[InitialRouteName] = js.native
    
    /**
      * Whether deep link handling should be enabled.
      * Defaults to true.
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Custom function to get the initial URL used for linking.
      * Uses `Linking.getInitialURL()` by default.
      * Not supported on Web.
      *
      * @example
      * ```js
      * {
      *    getInitialURL () => Linking.getInitialURL(),
      * }
      * ```
      */
    var getInitialURL: js.UndefOr[js.Function0[js.Promise[js.UndefOr[String | Null]]]] = js.native
    
    /**
      * Custom function to convert the state object to a valid URL (advanced).
      * Only applicable on Web.
      */
    var getPathFromState: js.UndefOr[FnCallStateOptions] = js.native
    
    /**
      * Custom function to parse the URL to a valid navigation state (advanced).
      */
    var getStateFromPath: js.UndefOr[FnCall] = js.native
    
    /**
      * The prefixes are stripped from the URL before parsing them.
      * Usually they are the `scheme` + `host` (e.g. `myapp://chat?user=jane`)
      * Only applicable on Android and iOS.
      *
      * @example
      * ```js
      * {
      *    prefixes: [
      *      "myapp://", // App-specific scheme
      *      "https://example.com", // Prefix for universal links
      *      "https:// *.example.com" // Prefix which matches any subdomain
      *    ]
      * }
      * ```
      */
    var prefixes: js.Array[String] = js.native
    
    /**
      * Custom function to get subscribe to URL updates.
      * Uses `Linking.addEventListener('url', callback)` by default.
      * Not supported on Web.
      *
      * @example
      * ```js
      * {
      *    subscribe: (listener) => {
      *      const onReceiveURL = ({ url }) => listener(url);
      *
      *      Linking.addEventListener('url', onReceiveURL);
      *
      *      return () => Linking.removeEventListener('url', onReceiveURL);
      *   }
      * }
      * ```
      */
    var subscribe: js.UndefOr[
        js.Function1[
          /* listener */ js.Function1[/* url */ String, Unit], 
          js.UndefOr[Unit | js.Function0[Unit]]
        ]
      ] = js.native
  }
  object LinkingOptions {
    
    @scala.inline
    def apply(prefixes: js.Array[String]): LinkingOptions = {
      val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkingOptions]
    }
    
    @scala.inline
    implicit class LinkingOptionsMutableBuilder[Self <: LinkingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: InitialRouteName): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setGetInitialURL(value: () => js.Promise[js.UndefOr[String | Null]]): Self = StObject.set(x, "getInitialURL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInitialURLUndefined: Self = StObject.set(x, "getInitialURL", js.undefined)
      
      @scala.inline
      def setGetPathFromState(value: FnCallStateOptions): Self = StObject.set(x, "getPathFromState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPathFromStateUndefined: Self = StObject.set(x, "getPathFromState", js.undefined)
      
      @scala.inline
      def setGetStateFromPath(value: FnCall): Self = StObject.set(x, "getStateFromPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetStateFromPathUndefined: Self = StObject.set(x, "getStateFromPath", js.undefined)
      
      @scala.inline
      def setPrefixes(value: js.Array[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixesVarargs(value: String*): Self = StObject.set(x, "prefixes", js.Array(value :_*))
      
      @scala.inline
      def setSubscribe(
        value: /* listener */ js.Function1[/* url */ String, Unit] => js.UndefOr[Unit | js.Function0[Unit]]
      ): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    }
  }
  
  @js.native
  trait ServerContainerRef extends StObject {
    
    def getCurrentOptions(): js.UndefOr[Record[String, _]] = js.native
  }
  object ServerContainerRef {
    
    @scala.inline
    def apply(getCurrentOptions: () => js.UndefOr[Record[String, _]]): ServerContainerRef = {
      val __obj = js.Dynamic.literal(getCurrentOptions = js.Any.fromFunction0(getCurrentOptions))
      __obj.asInstanceOf[ServerContainerRef]
    }
    
    @scala.inline
    implicit class ServerContainerRefMutableBuilder[Self <: ServerContainerRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCurrentOptions(value: () => js.UndefOr[Record[String, _]]): Self = StObject.set(x, "getCurrentOptions", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Theme extends StObject {
    
    var colors: Background = js.native
    
    var dark: Boolean = js.native
  }
  object Theme {
    
    @scala.inline
    def apply(colors: Background, dark: Boolean): Theme = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: Background): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    }
  }
}
