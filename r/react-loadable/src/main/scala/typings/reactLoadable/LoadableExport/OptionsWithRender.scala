package typings.reactLoadable.LoadableExport

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactLoadable.reactLoadableBooleans.`false`
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
  def render(loaded: Exports, props: Props): ReactNode
}

object OptionsWithRender {
  @scala.inline
  def apply[Props, /* <: js.Object */ Exports](
    loader: () => js.Promise[Exports],
    loading: ComponentType[LoadingComponentProps],
    render: (Exports, Props) => ReactNode,
    delay: js.UndefOr[Null | Double | `false`] = js.undefined,
    modules: js.Array[String] = null,
    timeout: js.UndefOr[Null | Double | `false`] = js.undefined,
    webpack: () => js.Array[String | Double] = null
  ): OptionsWithRender[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (webpack != null) __obj.updateDynamic("webpack")(js.Any.fromFunction0(webpack))
    __obj.asInstanceOf[OptionsWithRender[Props, Exports]]
  }
}

