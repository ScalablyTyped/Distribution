package typings.reactNavigationNative.typesMod

import typings.reactNavigationNative.anon.FnCall
import typings.reactNavigationNative.anon.FnCallStateOptions
import typings.reactNavigationNative.anon.InitialRouteName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkingOptions extends js.Object {
  
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
  implicit class LinkingOptionsOps[Self <: LinkingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrefixesVarargs(value: String*): Self = this.set("prefixes", js.Array(value :_*))
    
    @scala.inline
    def setPrefixes(value: js.Array[String]): Self = this.set("prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: InitialRouteName): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setGetInitialURL(value: () => js.Promise[js.UndefOr[String | Null]]): Self = this.set("getInitialURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInitialURL: Self = this.set("getInitialURL", js.undefined)
    
    @scala.inline
    def setGetPathFromState(value: FnCallStateOptions): Self = this.set("getPathFromState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetPathFromState: Self = this.set("getPathFromState", js.undefined)
    
    @scala.inline
    def setGetStateFromPath(value: FnCall): Self = this.set("getStateFromPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetStateFromPath: Self = this.set("getStateFromPath", js.undefined)
    
    @scala.inline
    def setSubscribe(
      value: /* listener */ js.Function1[/* url */ String, Unit] => js.UndefOr[Unit | js.Function0[Unit]]
    ): Self = this.set("subscribe", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
  }
}
