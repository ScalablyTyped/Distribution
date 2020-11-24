package typings.reactLoadable.LoadableExport

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsWithMap[Props, Exports /* <: StringDictionary[js.Any] */] extends CommonOptions {
  
  /**
    * An object containing functions which return promises, which resolve to an object to be passed to `render` on success.
    */
  var loader: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
    */ typings.reactLoadable.reactLoadableStrings.OptionsWithMap with TopLevel[Exports] = js.native
  
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
  def render(loaded: Exports, props: Props): ReactNode = js.native
}
object OptionsWithMap {
  
  @scala.inline
  def apply[Props, Exports /* <: StringDictionary[js.Any] */](
    loader: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
    */ typings.reactLoadable.reactLoadableStrings.OptionsWithMap with TopLevel[Exports],
    loading: ComponentType[LoadingComponentProps],
    render: (Exports, Props) => ReactNode
  ): OptionsWithMap[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[OptionsWithMap[Props, Exports]]
  }
  
  @scala.inline
  implicit class OptionsWithMapOps[Self <: OptionsWithMap[_, _], Props, Exports /* <: StringDictionary[js.Any] */] (val x: Self with (OptionsWithMap[Props, Exports])) extends AnyVal {
    
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
    def setLoader(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof Exports ]: (): std.Promise<Exports[P]>}
      */ typings.reactLoadable.reactLoadableStrings.OptionsWithMap with TopLevel[Exports]
    ): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: (Exports, Props) => ReactNode): Self = this.set("render", js.Any.fromFunction2(value))
  }
}
