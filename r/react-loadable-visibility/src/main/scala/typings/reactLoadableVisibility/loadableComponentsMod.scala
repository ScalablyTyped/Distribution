package typings.reactLoadableVisibility

import typings.loadableComponent.FnCall
import typings.loadableComponent.mod.DefaultComponent
import typings.loadableComponent.mod.LoadableComponent
import typings.loadableComponent.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-loadable-visibility/loadable-components", JSImport.Namespace)
@js.native
object loadableComponentsMod extends js.Object {
  @js.native
  object default extends js.Object {
    var lib: FnCall = js.native
    def apply[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]]): LoadableComponent[T] = js.native
    def apply[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]], options: Options[T]): LoadableComponent[T] = js.native
  }
  
}

