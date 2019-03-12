package typings
package reactDashLoadableLib.LoadableExportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithMap[Props, Exports /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */] extends CommonOptions {
  /**
    * An object containing functions which return promises, which resolve to an object to be passed to `render` on success.
    */
  var loader: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
    */ reactDashLoadableLib.reactDashLoadableLibStrings.OptionsWithMap with Exports
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
  def render(loaded: Exports, props: Props): reactLib.reactMod.ReactNs.ReactNode
}

object OptionsWithMap {
  @scala.inline
  def apply[Props, Exports /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    loader: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
    */ reactDashLoadableLib.reactDashLoadableLibStrings.OptionsWithMap with Exports,
    loading: reactLib.reactMod.ReactNs.ComponentType[LoadingComponentProps] | js.Function0[scala.Null],
    render: (Exports, Props) => reactLib.reactMod.ReactNs.ReactNode,
    delay: scala.Double | reactDashLoadableLib.reactDashLoadableLibNumbers.`false` = null,
    modules: js.Array[java.lang.String] = null,
    timeout: scala.Double | reactDashLoadableLib.reactDashLoadableLibNumbers.`false` = null,
    webpack: () => js.Array[scala.Double] = null
  ): OptionsWithMap[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = loader, loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (webpack != null) __obj.updateDynamic("webpack")(js.Any.fromFunction0(webpack))
    __obj.asInstanceOf[OptionsWithMap[Props, Exports]]
  }
}

