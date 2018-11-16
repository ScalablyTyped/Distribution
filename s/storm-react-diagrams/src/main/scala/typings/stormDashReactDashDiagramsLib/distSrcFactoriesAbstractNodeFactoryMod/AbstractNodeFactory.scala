package typings
package stormDashReactDashDiagramsLib.distSrcFactoriesAbstractNodeFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractNodeFactory", "AbstractNodeFactory")
@js.native
abstract class AbstractNodeFactory[T /* <: stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel */] ()
  extends stormDashReactDashDiagramsLib.distSrcFactoriesAbstractFactoryMod.AbstractFactory[T] {
  def generateReactWidget(diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine, node: T): reactLib.reactMod.Global.JSXNs.Element = js.native
}

