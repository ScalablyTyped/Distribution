package typings.stormReactDiagrams

import typings.stormReactDiagrams.anon.BaseEventBaseModelBaseEnt
import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseEvent
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/models/BaseModel", "BaseModel")
  @js.native
  open class BaseModel[X /* <: BaseEntity[BaseListener[Any]] */, T /* <: BaseModelListener */] () extends BaseEntity[T] {
    def this(`type`: String) = this()
    def this(`type`: String, id: String) = this()
    def this(`type`: Unit, id: String) = this()
    
    def deSerialize(ob: Any, engine: DiagramEngine): Unit = js.native
    
    def getParent(): X = js.native
    
    def getSelectedEntities(): js.Array[BaseModel[Any, T]] = js.native
    
    def getType(): String = js.native
    
    def isSelected(): Boolean = js.native
    
    var parent: X = js.native
    
    def remove(): Unit = js.native
    
    var selected: Boolean = js.native
    
    def setParent(parent: X): Unit = js.native
    
    def setSelected(): Unit = js.native
    def setSelected(selected: Boolean): Unit = js.native
    
    var `type`: String = js.native
  }
  
  trait BaseModelListener
    extends StObject
       with BaseListener[Any] {
    
    var entityRemoved: js.UndefOr[
        js.Function1[/* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[Any]], this.type]], Unit]
      ] = js.undefined
    
    var selectionChanged: js.UndefOr[js.Function1[/* event */ BaseEventBaseModelBaseEnt, Unit]] = js.undefined
  }
  object BaseModelListener {
    
    inline def apply(): BaseModelListener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModelListener]
    }
    
    extension [Self <: BaseModelListener](x: Self) {
      
      inline def setEntityRemoved(value: /* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener]] => Unit): Self = StObject.set(x, "entityRemoved", js.Any.fromFunction1(value))
      
      inline def setEntityRemovedUndefined: Self = StObject.set(x, "entityRemoved", js.undefined)
      
      inline def setSelectionChanged(value: /* event */ BaseEventBaseModelBaseEnt => Unit): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction1(value))
      
      inline def setSelectionChangedUndefined: Self = StObject.set(x, "selectionChanged", js.undefined)
    }
  }
}
