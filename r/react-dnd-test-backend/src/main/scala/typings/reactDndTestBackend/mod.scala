package typings.reactDndTestBackend

import typings.dndCore.interfacesMod.BackendFactory
import typings.dndCore.interfacesMod.DragDropManager
import typings.reactDndTestBackend.testBackendMod.ITestBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd-test-backend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-dnd-test-backend", "TestBackend")
  @js.native
  val TestBackend: BackendFactory = js.native
  
  @JSImport("react-dnd-test-backend", "TestBackendImpl")
  @js.native
  class TestBackendImpl protected ()
    extends typings.reactDndTestBackend.testBackendMod.TestBackendImpl {
    def this(manager: DragDropManager) = this()
  }
  
  @scala.inline
  def clearInstance(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInstance")().asInstanceOf[Unit]
  
  @scala.inline
  def getInstance(): js.UndefOr[ITestBackend] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[js.UndefOr[ITestBackend]]
}
