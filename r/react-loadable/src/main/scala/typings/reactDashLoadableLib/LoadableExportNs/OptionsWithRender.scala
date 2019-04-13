package typings
package reactDashLoadableLib.LoadableExportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithRender[Props, Exports /* <: js.Object */]
  extends CommonOptions
     with Options[Props, Exports] {
  /**
    * Function returning a promise which returns an object to be passed to `render` on success.
    */
  def loader(): js.Promise[Exports]
  /**
    * If you want to customize what gets rendered from your loader you can also pass `render`.
    *
    * Note: If you want to load multiple resources at once, you can also use `Loadable.Map`.
    *
    * ```ts
    * Loadable({
    *     // ...
    *     render(loaded, props) {
    *         const Component = loaded.default;
    *         return <Component {...props} />
    *     }
    * });
    * ```
    */
  def render(loaded: Exports, props: Props): reactLib.reactMod.ReactNode
}

object OptionsWithRender {
  @scala.inline
  def apply[Props, Exports /* <: js.Object */](
    loader: () => js.Promise[Exports],
    loading: reactLib.reactMod.ComponentType[LoadingComponentProps] | js.Function0[scala.Null],
    render: (Exports, Props) => reactLib.reactMod.ReactNode,
    delay: scala.Double | reactDashLoadableLib.reactDashLoadableLibNumbers.`false` = null,
    modules: js.Array[java.lang.String] = null,
    timeout: scala.Double | reactDashLoadableLib.reactDashLoadableLibNumbers.`false` = null,
    webpack: () => js.Array[scala.Double] = null
  ): OptionsWithRender[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (webpack != null) __obj.updateDynamic("webpack")(js.Any.fromFunction0(webpack))
    __obj.asInstanceOf[OptionsWithRender[Props, Exports]]
  }
}

