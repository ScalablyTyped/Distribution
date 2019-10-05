package typings.stormDashReactDashDiagrams

import typings.react.reactMod.Global.JSX.Element
import typings.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typings.stormDashReactDashDiagrams.distSrcFactoriesAbstractFactoryMod.AbstractFactory
import typings.stormDashReactDashDiagrams.distSrcModelsLabelModelMod.LabelModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractLabelFactory", JSImport.Namespace)
@js.native
object distSrcFactoriesAbstractLabelFactoryMod extends js.Object {
  @js.native
  abstract class AbstractLabelFactory[T /* <: LabelModel */] () extends AbstractFactory[T] {
    def generateReactWidget(diagramEngine: DiagramEngine, link: T): Element = js.native
  }
  
}

