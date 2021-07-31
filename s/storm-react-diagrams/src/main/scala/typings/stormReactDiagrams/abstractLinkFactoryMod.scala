package typings.stormReactDiagrams

import typings.react.mod.global.JSX.Element
import typings.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.linkModelMod.LinkModel
import typings.stormReactDiagrams.linkModelMod.LinkModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractLinkFactoryMod {
  
  @JSImport("storm-react-diagrams/dist/src/factories/AbstractLinkFactory", "AbstractLinkFactory")
  @js.native
  abstract class AbstractLinkFactory[T /* <: LinkModel[LinkModelListener] */] protected () extends AbstractFactory[T] {
    def this(name: String) = this()
    
    def generateReactWidget(diagramEngine: DiagramEngine, link: T): Element = js.native
  }
}
