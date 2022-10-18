package typings.stormReactDiagrams

import typings.stormReactDiagrams.distSrcBaseEntityMod.BaseEntity
import typings.stormReactDiagrams.distSrcBaseEntityMod.BaseListener
import typings.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModel
import typings.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFactoriesAbstractFactoryMod {
  
  /* note: abstract class */ @JSImport("storm-react-diagrams/dist/src/factories/AbstractFactory", "AbstractFactory")
  @js.native
  open class AbstractFactory[T /* <: BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener] */] protected () extends StObject {
    def this(name: String) = this()
    
    def getNewInstance(): T = js.native
    def getNewInstance(initialConfig: Any): T = js.native
    
    def getType(): String = js.native
    
    var `type`: String = js.native
  }
}
