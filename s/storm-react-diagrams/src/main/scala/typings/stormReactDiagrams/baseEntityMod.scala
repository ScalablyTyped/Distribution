package typings.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import typings.stormReactDiagrams.anon.Id
import typings.stormReactDiagrams.anon.Locked
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseEntityMod {
  
  @JSImport("storm-react-diagrams/dist/src/BaseEntity", "BaseEntity")
  @js.native
  class BaseEntity[T /* <: BaseListener[js.Any] */] () extends StObject {
    def this(id: String) = this()
    
    def addListener(listener: T): String = js.native
    
    def clearListeners(): Unit = js.native
    
    def clone(lookupTable: StringDictionary[js.Any]): js.Any = js.native
    
    def deSerialize(data: StringDictionary[js.Any], engine: DiagramEngine): Unit = js.native
    
    def doClone(lookupTable: StringDictionary[js.Any], clone: js.Any): Unit = js.native
    
    def getID(): String = js.native
    
    var id: String = js.native
    
    def isLocked(): Boolean = js.native
    
    def iterateListeners(cb: js.Function2[/* t */ T, /* event */ BaseEvent[js.Any], js.Any]): Unit = js.native
    
    var listeners: StringDictionary[T] = js.native
    
    var locked: Boolean = js.native
    
    def removeListener(listener: String): Boolean = js.native
    
    def serialize(): Id = js.native
    
    def setLocked(): Unit = js.native
    def setLocked(locked: Boolean): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stormReactDiagrams.stormReactDiagramsStrings.node
    - typings.stormReactDiagrams.stormReactDiagramsStrings.link
    - typings.stormReactDiagrams.stormReactDiagramsStrings.port
    - typings.stormReactDiagrams.stormReactDiagramsStrings.point
  */
  trait BaseEntityType extends StObject
  object BaseEntityType {
    
    inline def link: typings.stormReactDiagrams.stormReactDiagramsStrings.link = "link".asInstanceOf[typings.stormReactDiagrams.stormReactDiagramsStrings.link]
    
    inline def node: typings.stormReactDiagrams.stormReactDiagramsStrings.node = "node".asInstanceOf[typings.stormReactDiagrams.stormReactDiagramsStrings.node]
    
    inline def point: typings.stormReactDiagrams.stormReactDiagramsStrings.point = "point".asInstanceOf[typings.stormReactDiagrams.stormReactDiagramsStrings.point]
    
    inline def port: typings.stormReactDiagrams.stormReactDiagramsStrings.port = "port".asInstanceOf[typings.stormReactDiagrams.stormReactDiagramsStrings.port]
  }
  
  trait BaseEvent[T /* <: BaseEntity[BaseListener[js.Any]] */] extends StObject {
    
    var entity: BaseEntity[BaseListener[js.Any]]
    
    var firing: Boolean
    
    var id: String
    
    def stopPropagation(): js.Any
  }
  object BaseEvent {
    
    inline def apply[T /* <: BaseEntity[BaseListener[js.Any]] */](
      entity: BaseEntity[BaseListener[js.Any]],
      firing: Boolean,
      id: String,
      stopPropagation: () => js.Any
    ): BaseEvent[T] = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
      __obj.asInstanceOf[BaseEvent[T]]
    }
    
    extension [Self <: BaseEvent[?], T /* <: BaseEntity[BaseListener[js.Any]] */](x: Self & BaseEvent[T]) {
      
      inline def setEntity(value: BaseEntity[BaseListener[js.Any]]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setFiring(value: Boolean): Self = StObject.set(x, "firing", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStopPropagation(value: () => js.Any): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    }
  }
  
  trait BaseListener[T /* <: BaseEntity[BaseListener[js.Any]] */] extends StObject {
    
    var lockChanged: js.UndefOr[js.Function1[/* event */ BaseEvent[T] & Locked, Unit]] = js.undefined
  }
  object BaseListener {
    
    inline def apply[T /* <: BaseEntity[BaseListener[js.Any]] */](): BaseListener[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseListener[T]]
    }
    
    extension [Self <: BaseListener[?], T /* <: BaseEntity[BaseListener[js.Any]] */](x: Self & BaseListener[T]) {
      
      inline def setLockChanged(value: /* event */ BaseEvent[T] & Locked => Unit): Self = StObject.set(x, "lockChanged", js.Any.fromFunction1(value))
      
      inline def setLockChangedUndefined: Self = StObject.set(x, "lockChanged", js.undefined)
    }
  }
}
