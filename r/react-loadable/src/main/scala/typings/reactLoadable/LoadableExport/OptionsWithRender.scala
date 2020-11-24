package typings.reactLoadable.LoadableExport

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsWithRender[Props, Exports /* <: js.Object */]
  extends CommonOptions
     with Options[Props, Exports] {
  
  /**
    * Function returning a promise which returns an object to be passed to `render` on success.
    */
  def loader(): js.Promise[Exports] = js.native
  
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
object OptionsWithRender {
  
  @scala.inline
  def apply[Props, Exports /* <: js.Object */](
    loader: () => js.Promise[Exports],
    loading: ComponentType[LoadingComponentProps],
    render: (Exports, Props) => ReactNode
  ): OptionsWithRender[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[OptionsWithRender[Props, Exports]]
  }
  
  @scala.inline
  implicit class OptionsWithRenderOps[Self <: OptionsWithRender[_, _], Props, Exports /* <: js.Object */] (val x: Self with (OptionsWithRender[Props, Exports])) extends AnyVal {
    
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
    def setLoader(value: () => js.Promise[Exports]): Self = this.set("loader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: (Exports, Props) => ReactNode): Self = this.set("render", js.Any.fromFunction2(value))
  }
}
