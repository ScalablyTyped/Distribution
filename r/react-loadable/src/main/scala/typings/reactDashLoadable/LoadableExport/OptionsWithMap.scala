package typings.reactDashLoadable.LoadableExport

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import typings.reactDashLoadable.reactDashLoadableNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithMap[Props, Exports /* <: StringDictionary[js.Any] */] extends CommonOptions {
  /**
    * An object containing functions which return promises, which resolve to an object to be passed to `render` on success.
    */
  var loader: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
    */ typings.reactDashLoadable.reactDashLoadableStrings.OptionsWithMap with Exports
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

object OptionsWithMap {
  @scala.inline
  def apply[Props, Exports /* <: StringDictionary[js.Any] */](
    loader: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
    */ typings.reactDashLoadable.reactDashLoadableStrings.OptionsWithMap with Exports,
    loading: ComponentType[LoadingComponentProps] | js.Function0[Null],
    render: (Exports, Props) => ReactNode,
    delay: Double | `false` = null,
    modules: js.Array[String] = null,
    timeout: Double | `false` = null,
    webpack: () => js.Array[String | Double] = null
  ): OptionsWithMap[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (webpack != null) __obj.updateDynamic("webpack")(js.Any.fromFunction0(webpack))
    __obj.asInstanceOf[OptionsWithMap[Props, Exports]]
  }
}

