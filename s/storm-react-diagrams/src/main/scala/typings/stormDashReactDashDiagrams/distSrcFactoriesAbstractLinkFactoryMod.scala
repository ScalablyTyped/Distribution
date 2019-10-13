package typings.stormDashReactDashDiagrams

import typings.react.reactMod._Global_.JSX.Element
import typings.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typings.stormDashReactDashDiagrams.distSrcFactoriesAbstractFactoryMod.AbstractFactory
import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModel
import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractLinkFactory", JSImport.Namespace)
@js.native
object distSrcFactoriesAbstractLinkFactoryMod extends js.Object {
  @js.native
  abstract class AbstractLinkFactory[T /* <: LinkModel[LinkModelListener] */] () extends AbstractFactory[T] {
    def generateReactWidget(diagramEngine: DiagramEngine, link: T): Element = js.native
  }
  
}

