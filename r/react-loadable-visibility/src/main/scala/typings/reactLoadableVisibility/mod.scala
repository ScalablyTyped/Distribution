package typings.reactLoadableVisibility

import typings.loadableComponent.anon.FnCall
import typings.loadableComponent.mod.DefaultComponent
import typings.loadableComponent.mod.LoadableComponent
import typings.loadableComponent.mod.OptionsWithResolver
import typings.loadableComponent.mod.OptionsWithoutResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-loadable-visibility", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object default extends js.Object {
    var lib: FnCall = js.native
    def apply[Props](loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]]): LoadableComponent[Props] = js.native
    def apply[Props](
      loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]],
      options: OptionsWithoutResolver[Props]
    ): LoadableComponent[Props] = js.native
    def apply[Props, Module](
      loadFn: js.Function1[/* props */ Props, js.Promise[Module]],
      options: OptionsWithResolver[Props, Module]
    ): LoadableComponent[Props] = js.native
  }
  
}

