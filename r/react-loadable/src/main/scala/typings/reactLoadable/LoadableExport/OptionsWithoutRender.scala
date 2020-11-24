package typings.reactLoadable.LoadableExport

import typings.react.mod.ComponentType
import typings.reactLoadable.anon.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsWithoutRender[Props]
  extends CommonOptions
     with Options[Props, js.Any] {
  
  /**
    * Function returning a promise which returns a React component displayed on success.
    *
    * Resulting React component receives all the props passed to the generated component.
    */
  def loader(): js.Promise[ComponentType[Props] | Default[Props]] = js.native
}
object OptionsWithoutRender {
  
  @scala.inline
  def apply[Props](
    loader: () => js.Promise[ComponentType[Props] | Default[Props]],
    loading: ComponentType[LoadingComponentProps]
  ): OptionsWithoutRender[Props] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithoutRender[Props]]
  }
  
  @scala.inline
  implicit class OptionsWithoutRenderOps[Self <: OptionsWithoutRender[_], Props] (val x: Self with OptionsWithoutRender[Props]) extends AnyVal {
    
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
    def setLoader(value: () => js.Promise[ComponentType[Props] | Default[Props]]): Self = this.set("loader", js.Any.fromFunction0(value))
  }
}
