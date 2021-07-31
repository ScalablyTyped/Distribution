package typings.stormReactDiagrams

import typings.react.mod.global.JSX.Element
import typings.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.nodeModelMod.NodeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractNodeFactoryMod {
  
  @JSImport("storm-react-diagrams/dist/src/factories/AbstractNodeFactory", "AbstractNodeFactory")
  @js.native
  abstract class AbstractNodeFactory[T /* <: NodeModel */] protected () extends AbstractFactory[T] {
    def this(name: String) = this()
    
    def generateReactWidget(diagramEngine: DiagramEngine, node: T): Element = js.native
  }
}
