package typings.reactLoadable.LoadableExport

import typings.react.mod.ComponentType
import typings.reactLoadable.reactLoadableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonOptions extends js.Object {
  /**
    * Defaults to 200, in milliseconds.
    *
    * Only show the loading component if the loader() has taken this long to succeed or error.
    */
  var delay: js.UndefOr[Double | `false` | Null] = js.native
  /**
    * React component displayed after delay until loader() succeeds. Also responsible for displaying errors.
    *
    * If you don't want to render anything you can pass a function that returns null
    * (this is considered a valid React component).
    */
  var loading: ComponentType[LoadingComponentProps] = js.native
  /**
    * Optional array of module paths that `Loadable.Capture`'s `report` function will be applied on during
    * server-side rendering. This helps the server know which modules were imported/used during SSR.
    * ```ts
    * Loadable({
    *   loader: () => import('./my-component'),
    *   modules: ['./my-component'],
    * });
    * ```
    */
  var modules: js.UndefOr[js.Array[String]] = js.native
  /**
    * Disabled by default.
    *
    * After the specified time in milliseconds passes, the component's `timedOut` prop will be set to true.
    */
  var timeout: js.UndefOr[Double | `false` | Null] = js.native
  /**
    * An optional function which returns an array of Webpack module ids which you can get
    * with require.resolveWeak. This is used by the client (inside `Loadable.preloadReady`) to
    * guarantee each webpack module is preloaded before the first client render.
    * ```ts
    * Loadable({
    *  loader: () => import('./Foo'),
    *  webpack: () => [require.resolveWeak('./Foo')],
    * });
    * ```
    */
  var webpack: js.UndefOr[js.Function0[js.Array[String | Double]]] = js.native
}

object CommonOptions {
  @scala.inline
  def apply(loading: ComponentType[LoadingComponentProps]): CommonOptions = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
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
    def setLoading(value: ComponentType[LoadingComponentProps]): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double | `false`): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDelayNull: Self = this.set("delay", null)
    @scala.inline
    def setModulesVarargs(value: String*): Self = this.set("modules", js.Array(value :_*))
    @scala.inline
    def setModules(value: js.Array[String]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setTimeout(value: Double | `false`): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTimeoutNull: Self = this.set("timeout", null)
    @scala.inline
    def setWebpack(value: () => js.Array[String | Double]): Self = this.set("webpack", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWebpack: Self = this.set("webpack", js.undefined)
  }
  
}

