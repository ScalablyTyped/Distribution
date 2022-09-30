package typings.reactDndTestBackend

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.Identifier
import typings.std.Document
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ITestBackend
    extends StObject
       with Backend {
    
    var didCallSetup: Boolean = js.native
    
    var didCallTeardown: Boolean = js.native
    
    def simulateBeginDrag(sourceIds: js.Array[Identifier]): Unit = js.native
    def simulateBeginDrag(sourceIds: js.Array[Identifier], options: Any): Unit = js.native
    
    def simulateDrop(): Unit = js.native
    
    def simulateEndDrag(): Unit = js.native
    
    def simulateHover(targetIds: js.Array[Identifier]): Unit = js.native
    def simulateHover(targetIds: js.Array[Identifier], options: Any): Unit = js.native
    
    def simulatePublishDragSource(): Unit = js.native
  }
  
  trait TestBackendContext extends StObject {
    
    var document: js.UndefOr[Document] = js.undefined
    
    var window: js.UndefOr[Window] = js.undefined
  }
  object TestBackendContext {
    
    inline def apply(): TestBackendContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestBackendContext]
    }
    
    extension [Self <: TestBackendContext](x: Self) {
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  trait TestBackendOptions extends StObject {
    
    var onCreate: js.UndefOr[js.Function1[/* be */ ITestBackend, Unit]] = js.undefined
  }
  object TestBackendOptions {
    
    inline def apply(): TestBackendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestBackendOptions]
    }
    
    extension [Self <: TestBackendOptions](x: Self) {
      
      inline def setOnCreate(value: /* be */ ITestBackend => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
      
      inline def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
    }
  }
}
