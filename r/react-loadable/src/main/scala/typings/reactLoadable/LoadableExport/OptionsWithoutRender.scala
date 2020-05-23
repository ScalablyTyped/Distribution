package typings.reactLoadable.LoadableExport

import typings.react.mod.ComponentType
import typings.reactLoadable.anon.Default
import typings.reactLoadable.reactLoadableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithoutRender[Props]
  extends CommonOptions
     with Options[Props, js.Any] {
  /**
    * Function returning a promise which returns a React component displayed on success.
    *
    * Resulting React component receives all the props passed to the generated component.
    */
  def loader(): js.Promise[ComponentType[Props] | Default[Props]]
}

object OptionsWithoutRender {
  @scala.inline
  def apply[Props](
    loader: () => js.Promise[ComponentType[Props] | Default[Props]],
    loading: ComponentType[LoadingComponentProps],
    delay: js.UndefOr[Null | Double | `false`] = js.undefined,
    modules: js.Array[String] = null,
    timeout: js.UndefOr[Null | Double | `false`] = js.undefined,
    webpack: () => js.Array[String | Double] = null
  ): OptionsWithoutRender[Props] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (webpack != null) __obj.updateDynamic("webpack")(js.Any.fromFunction0(webpack))
    __obj.asInstanceOf[OptionsWithoutRender[Props]]
  }
}

