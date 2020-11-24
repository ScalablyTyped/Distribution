package typings.reactDndTouchBackend

import typings.dndCore.interfacesMod.BackendFactory
import typings.dndCore.interfacesMod.DragDropManager
import typings.reactDndTouchBackend.interfacesMod.TouchBackendContext
import typings.reactDndTouchBackend.interfacesMod.TouchBackendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd-touch-backend", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val TouchBackend: BackendFactory = js.native
  
  @js.native
  class TouchBackendImpl protected ()
    extends typings.reactDndTouchBackend.touchBackendImplMod.TouchBackendImpl {
    def this(manager: DragDropManager, context: TouchBackendContext, options: TouchBackendOptions) = this()
  }
  /* static members */
  @js.native
  object TouchBackendImpl extends js.Object {
    
    var isSetUp: js.Any = js.native
  }
}
