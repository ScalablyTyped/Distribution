package typings.stormReactDiagrams

import typings.react.mod.global.JSX.Element
import typings.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.distSrcFactoriesAbstractFactoryMod.AbstractFactory
import typings.stormReactDiagrams.distSrcModelsNodeModelMod.NodeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFactoriesAbstractNodeFactoryMod {
  
  /* note: abstract class */ @JSImport("storm-react-diagrams/dist/src/factories/AbstractNodeFactory", "AbstractNodeFactory")
  @js.native
  open class AbstractNodeFactory[T /* <: NodeModel */] protected () extends AbstractFactory[T] {
    def this(name: String) = this()
    
    def generateReactWidget(diagramEngine: DiagramEngine, node: T): Element = js.native
  }
}
