package typings.reactDnd.anon

import typings.dndCore.interfacesMod.BackendFactory
import typings.dndCore.interfacesMod.DragDropManager
import typings.reactDnd.dndProviderMod.DndProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backend[BackendContext, BackendOptions] extends DndProviderProps[BackendContext, BackendOptions] {
  var backend: BackendFactory = js.native
  var context: js.UndefOr[BackendContext] = js.native
  var debugMode: js.UndefOr[Boolean] = js.native
  var options: js.UndefOr[BackendOptions] = js.native
}

object Backend {
  @scala.inline
  def apply[BackendContext, BackendOptions](
    backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => typings.dndCore.interfacesMod.Backend
  ): Backend[BackendContext, BackendOptions] = {
    val __obj = js.Dynamic.literal(backend = js.Any.fromFunction3(backend))
    __obj.asInstanceOf[Backend[BackendContext, BackendOptions]]
  }
  @scala.inline
  implicit class BackendOps[Self <: Backend[_, _], BackendContext, BackendOptions] (val x: Self with (Backend[BackendContext, BackendOptions])) extends AnyVal {
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
    def setBackend(
      value: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => typings.dndCore.interfacesMod.Backend
    ): Self = this.set("backend", js.Any.fromFunction3(value))
    @scala.inline
    def setContext(value: BackendContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDebugMode(value: Boolean): Self = this.set("debugMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugMode: Self = this.set("debugMode", js.undefined)
    @scala.inline
    def setOptions(value: BackendOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

