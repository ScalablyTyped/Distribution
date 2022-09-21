package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.baseModelMod.BaseModel
import typings.stormReactDiagrams.baseModelMod.BaseModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractFactoryMod {
  
  @JSImport("storm-react-diagrams/dist/src/factories/AbstractFactory", "AbstractFactory")
  @js.native
  abstract class AbstractFactory[T /* <: BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener] */] protected () extends StObject {
    def this(name: String) = this()
    
    def getNewInstance(): T = js.native
    def getNewInstance(initialConfig: Any): T = js.native
    
    def getType(): String = js.native
    
    var `type`: String = js.native
  }
}
