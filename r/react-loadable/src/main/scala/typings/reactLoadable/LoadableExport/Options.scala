package typings.reactLoadable.LoadableExport

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactLoadable.anon.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactLoadable.LoadableExport.OptionsWithoutRender[Props]
  - typings.reactLoadable.LoadableExport.OptionsWithRender[Props, Exports]
*/
trait Options[Props, Exports /* <: js.Object */] extends js.Object
object Options {
  
  @scala.inline
  def OptionsWithoutRender[Props, Exports /* <: js.Object */](
    loader: () => js.Promise[ComponentType[Props] | Default[Props]],
    loading: ComponentType[LoadingComponentProps]
  ): Options[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[Props, Exports]]
  }
  
  @scala.inline
  def OptionsWithRender[Props, Exports /* <: js.Object */](
    loader: () => js.Promise[Exports],
    loading: ComponentType[LoadingComponentProps],
    render: (Exports, Props) => ReactNode
  ): Options[Props, Exports] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[Options[Props, Exports]]
  }
}
