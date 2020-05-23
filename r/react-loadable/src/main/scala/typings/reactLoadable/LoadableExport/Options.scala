package typings.reactLoadable.LoadableExport

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactLoadable.anon.Default
import typings.reactLoadable.reactLoadableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactLoadable.LoadableExport.OptionsWithoutRender[Props]
  - typings.reactLoadable.LoadableExport.OptionsWithRender[Props, Exports]
*/
trait Options[Props, Exports /* <: js.Object */] extends js.Object

object Options {
  @scala.inline
  def OptionsWithoutRender[Props, Exports](
    loader: () => js.Promise[ComponentType[Props] | Default[Props]],
    loading: ComponentType[LoadingComponentProps],
    delay: js.UndefOr[Null | Double | `false`] = js.undefined,
    modules: js.Array[String] = null,
    timeout: js.UndefOr[Null | Double | `false`] = js.undefined,
    webpack: () => js.Array[String | Double] = null
  ): Options[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (webpack != null) __obj.updateDynamic("webpack")(js.Any.fromFunction0(webpack))
    __obj.asInstanceOf[Options[Props, Exports]]
  }
  @scala.inline
  def OptionsWithRender[Props, Exports](
    loader: () => js.Promise[Exports],
    loading: ComponentType[LoadingComponentProps],
    render: (Exports, Props) => ReactNode,
    delay: js.UndefOr[Null | Double | `false`] = js.undefined,
    modules: js.Array[String] = null,
    timeout: js.UndefOr[Null | Double | `false`] = js.undefined,
    webpack: () => js.Array[String | Double] = null
  ): Options[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (webpack != null) __obj.updateDynamic("webpack")(js.Any.fromFunction0(webpack))
    __obj.asInstanceOf[Options[Props, Exports]]
  }
}

