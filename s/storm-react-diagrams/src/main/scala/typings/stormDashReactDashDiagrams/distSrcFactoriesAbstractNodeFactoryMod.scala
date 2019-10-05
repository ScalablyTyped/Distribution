package typings.stormDashReactDashDiagrams

import typings.react.reactMod.Global.JSX.Element
import typings.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typings.stormDashReactDashDiagrams.distSrcFactoriesAbstractFactoryMod.AbstractFactory
import typings.stormDashReactDashDiagrams.distSrcModelsNodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractNodeFactory", JSImport.Namespace)
@js.native
object distSrcFactoriesAbstractNodeFactoryMod extends js.Object {
  @js.native
  abstract class AbstractNodeFactory[T /* <: NodeModel */] () extends AbstractFactory[T] {
    def generateReactWidget(diagramEngine: DiagramEngine, node: T): Element = js.native
  }
  
}

