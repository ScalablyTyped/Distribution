package typings
package stormDashReactDashDiagramsLib.distSrcFactoriesAbstractLinkFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractLinkFactory", "AbstractLinkFactory")
@js.native
abstract class AbstractLinkFactory[T /* <: stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener] */] ()
  extends stormDashReactDashDiagramsLib.distSrcFactoriesAbstractFactoryMod.AbstractFactory[T] {
  def generateReactWidget(diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine, link: T): reactLib.reactMod.Global.JSXNs.Element = js.native
}

