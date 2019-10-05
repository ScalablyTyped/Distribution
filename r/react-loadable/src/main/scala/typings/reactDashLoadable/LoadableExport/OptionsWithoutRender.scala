package typings.reactDashLoadable.LoadableExport

import typings.react.reactMod.ComponentType
import typings.reactDashLoadable.Anon_Default
import typings.reactDashLoadable.reactDashLoadableNumbers.`false`
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
  def loader(): js.Promise[ComponentType[Props] | Anon_Default[Props]]
}

object OptionsWithoutRender {
  @scala.inline
  def apply[Props](
    loader: () => js.Promise[ComponentType[Props] | Anon_Default[Props]],
    loading: ComponentType[LoadingComponentProps] | js.Function0[Null],
    delay: Double | `false` = null,
    modules: js.Array[String] = null,
    timeout: Double | `false` = null,
    webpack: () => js.Array[Double] = null
  ): OptionsWithoutRender[Props] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (webpack != null) __obj.updateDynamic("webpack")(js.Any.fromFunction0(webpack))
    __obj.asInstanceOf[OptionsWithoutRender[Props]]
  }
}

