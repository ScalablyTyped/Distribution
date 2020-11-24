package typings.stormReactDiagrams

import typings.react.mod.global.JSX.Element
import typings.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.nodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/factories/AbstractNodeFactory", JSImport.Namespace)
@js.native
object abstractNodeFactoryMod extends js.Object {
  
  @js.native
  abstract class AbstractNodeFactory[T /* <: NodeModel */] () extends AbstractFactory[T] {
    
    def generateReactWidget(diagramEngine: DiagramEngine, node: T): Element = js.native
  }
}
