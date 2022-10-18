package typings.reactDndTestBackend

import typings.dndCore.distInterfacesMod.BackendFactory
import typings.dndCore.distInterfacesMod.DragDropManager
import typings.reactDndTestBackend.distTypesMod.TestBackendContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd-test-backend", "TestBackend")
  @js.native
  val TestBackend: BackendFactory = js.native
  
  @JSImport("react-dnd-test-backend", "TestBackendImpl")
  @js.native
  open class TestBackendImpl protected ()
    extends typings.reactDndTestBackend.distTestBackendMod.TestBackendImpl {
    def this(manager: DragDropManager, context: TestBackendContext) = this()
  }
}
