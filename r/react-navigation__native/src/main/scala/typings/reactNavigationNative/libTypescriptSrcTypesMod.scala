package typings.reactNavigationNative

import typings.reactNavigationNative.anon.Background
import typings.reactNavigationNative.anon.Fn0
import typings.reactNavigationNative.anon.FnCall
import typings.reactNavigationNative.anon.FnCallStateOptions
import typings.reactNavigationNative.anon.InitialRouteName
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.Route
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcTypesMod {
  
  trait DocumentTitleOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var formatter: js.UndefOr[
        js.Function2[
          /* options */ js.UndefOr[Record[String, Any]], 
          /* route */ js.UndefOr[Route[String, js.UndefOr[js.Object]]], 
          String
        ]
      ] = js.undefined
  }
  object DocumentTitleOptions {
    
    inline def apply(): DocumentTitleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentTitleOptions]
    }
    
    extension [Self <: DocumentTitleOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFormatter(
        value: (/* options */ js.UndefOr[Record[String, Any]], /* route */ js.UndefOr[Route[String, js.UndefOr[js.Object]]]) => String
      ): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    }
  }
  
  trait LinkingOptions[ParamList /* <: js.Object */] extends StObject {
    
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
    var config: js.UndefOr[InitialRouteName[ParamList]] = js.undefined
    
    /**
      * Whether deep link handling should be enabled.
      * Defaults to true.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional function which takes an incoming URL returns a boolean
      * indicating whether React Navigation should handle it.
      *
      * This can be used to disable deep linking for specific URLs.
      * e.g. URLs used for authentication, and not for deep linking to screens.
      *
      * This is not supported on Web.
      *
      * @example
      * ```js
      * {
      *   // Filter out URLs used by expo-auth-session
      *   filter: (url) => !url.includes('+expo-auth-session')
      * }
      * ```
      */
    var filter: js.UndefOr[js.Function1[/* url */ String, Boolean]] = js.undefined
    
    /**
      * Custom function to convert the state object to a valid action (advanced).
      */
    var getActionFromState: js.UndefOr[Fn0] = js.undefined
    
    /**
      * Custom function to get the initial URL used for linking.
      * Uses `Linking.getInitialURL()` by default.
      *
      * This is not supported on Web.
      *
      * @example
      * ```js
      * {
      *    getInitialURL () => Linking.getInitialURL(),
      * }
      * ```
      */
    var getInitialURL: js.UndefOr[
        js.Function0[js.UndefOr[String | Null | (js.Promise[js.UndefOr[String | Null]])]]
      ] = js.undefined
    
    /**
      * Custom function to convert the state object to a valid URL (advanced).
      * Only applicable on Web.
      */
    var getPathFromState: js.UndefOr[FnCallStateOptions] = js.undefined
    
    /**
      * Custom function to parse the URL to a valid navigation state (advanced).
      */
    var getStateFromPath: js.UndefOr[FnCall] = js.undefined
    
    /**
      * The prefixes are stripped from the URL before parsing them.
      * Usually they are the `scheme` + `host` (e.g. `myapp://chat?user=jane`)
      *
      * This is not supported on Web.
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
    var prefixes: js.Array[String]
    
    /**
      * Custom function to get subscribe to URL updates.
      * Uses `Linking.addEventListener('url', callback)` by default.
      *
      * This is not supported on Web.
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
      ] = js.undefined
  }
  object LinkingOptions {
    
    inline def apply[ParamList /* <: js.Object */](prefixes: js.Array[String]): LinkingOptions[ParamList] = {
      val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkingOptions[ParamList]]
    }
    
    extension [Self <: LinkingOptions[?], ParamList /* <: js.Object */](x: Self & LinkingOptions[ParamList]) {
      
      inline def setConfig(value: InitialRouteName[ParamList]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFilter(value: /* url */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGetActionFromState(value: Fn0): Self = StObject.set(x, "getActionFromState", value.asInstanceOf[js.Any])
      
      inline def setGetActionFromStateUndefined: Self = StObject.set(x, "getActionFromState", js.undefined)
      
      inline def setGetInitialURL(value: () => js.UndefOr[String | Null | (js.Promise[js.UndefOr[String | Null]])]): Self = StObject.set(x, "getInitialURL", js.Any.fromFunction0(value))
      
      inline def setGetInitialURLUndefined: Self = StObject.set(x, "getInitialURL", js.undefined)
      
      inline def setGetPathFromState(value: FnCallStateOptions): Self = StObject.set(x, "getPathFromState", value.asInstanceOf[js.Any])
      
      inline def setGetPathFromStateUndefined: Self = StObject.set(x, "getPathFromState", js.undefined)
      
      inline def setGetStateFromPath(value: FnCall): Self = StObject.set(x, "getStateFromPath", value.asInstanceOf[js.Any])
      
      inline def setGetStateFromPathUndefined: Self = StObject.set(x, "getStateFromPath", js.undefined)
      
      inline def setPrefixes(value: js.Array[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      inline def setPrefixesVarargs(value: String*): Self = StObject.set(x, "prefixes", js.Array(value*))
      
      inline def setSubscribe(
        value: /* listener */ js.Function1[/* url */ String, Unit] => js.UndefOr[Unit | js.Function0[Unit]]
      ): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    }
  }
  
  trait ServerContainerRef extends StObject {
    
    def getCurrentOptions(): js.UndefOr[Record[String, Any]]
  }
  object ServerContainerRef {
    
    inline def apply(getCurrentOptions: () => js.UndefOr[Record[String, Any]]): ServerContainerRef = {
      val __obj = js.Dynamic.literal(getCurrentOptions = js.Any.fromFunction0(getCurrentOptions))
      __obj.asInstanceOf[ServerContainerRef]
    }
    
    extension [Self <: ServerContainerRef](x: Self) {
      
      inline def setGetCurrentOptions(value: () => js.UndefOr[Record[String, Any]]): Self = StObject.set(x, "getCurrentOptions", js.Any.fromFunction0(value))
    }
  }
  
  trait Theme extends StObject {
    
    var colors: Background
    
    var dark: Boolean
  }
  object Theme {
    
    inline def apply(colors: Background, dark: Boolean): Theme = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setColors(value: Background): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    }
  }
}
