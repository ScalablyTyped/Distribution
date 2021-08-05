package typings.reactDndTouchBackend

import typings.dndCore.interfacesMod.BackendFactory
import typings.dndCore.interfacesMod.DragDropManager
import typings.reactDndTouchBackend.interfacesMod.TouchBackendContext
import typings.reactDndTouchBackend.interfacesMod.TouchBackendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd-touch-backend", "TouchBackend")
  @js.native
  val TouchBackend: BackendFactory = js.native
  
  @JSImport("react-dnd-touch-backend", "TouchBackendImpl")
  @js.native
  class TouchBackendImpl protected ()
    extends typings.reactDndTouchBackend.touchBackendImplMod.TouchBackendImpl {
    def this(manager: DragDropManager, context: TouchBackendContext, options: TouchBackendOptions) = this()
  }
  /* static members */
  object TouchBackendImpl {
    
    @JSImport("react-dnd-touch-backend", "TouchBackendImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dnd-touch-backend", "TouchBackendImpl.isSetUp")
    @js.native
    def isSetUp: js.Any = js.native
    inline def isSetUp_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSetUp")(x.asInstanceOf[js.Any])
  }
}
