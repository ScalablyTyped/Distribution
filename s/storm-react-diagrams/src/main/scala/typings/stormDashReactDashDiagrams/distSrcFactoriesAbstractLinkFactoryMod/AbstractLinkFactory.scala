package typings.stormDashReactDashDiagrams.distSrcFactoriesAbstractLinkFactoryMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typings.stormDashReactDashDiagrams.distSrcFactoriesAbstractFactoryMod.AbstractFactory
import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModel
import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractLinkFactory", "AbstractLinkFactory")
@js.native
abstract class AbstractLinkFactory[T /* <: LinkModel[LinkModelListener] */] () extends AbstractFactory[T] {
  def generateReactWidget(diagramEngine: DiagramEngine, link: T): Element = js.native
}

