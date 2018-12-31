package typings
package reactDashLoadableLib.LoadableExportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  /**
    * Defaults to 200, in milliseconds.
    *
    * Only show the loading component if the loader() has taken this long to succeed or error.
    */
  var delay: js.UndefOr[
    scala.Double | reactDashLoadableLib.reactDashLoadableLibNumbers.`false` | scala.Null
  ] = js.undefined
  /**
    * React component displayed after delay until loader() succeeds. Also responsible for displaying errors.
    *
    * If you don't want to render anything you can pass a function that returns null
    * (this is considered a valid React component).
    */
  // NOTE: () => null is only needed until React.SFC supports components returning null
  var loading: reactLib.reactMod.ReactNs.ComponentType[LoadingComponentProps] | js.Function0[scala.Null]
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
  var modules: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Disabled by default.
    *
    * After the specified time in milliseconds passes, the component's `timedOut` prop will be set to true.
    */
  var timeout: js.UndefOr[
    scala.Double | reactDashLoadableLib.reactDashLoadableLibNumbers.`false` | scala.Null
  ] = js.undefined
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
  var webpack: js.UndefOr[js.Function0[js.Array[scala.Double]]] = js.undefined
}

