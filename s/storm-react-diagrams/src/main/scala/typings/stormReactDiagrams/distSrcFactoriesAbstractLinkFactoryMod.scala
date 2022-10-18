package typings.stormReactDiagrams

import typings.react.mod.global.JSX.Element
import typings.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.distSrcFactoriesAbstractFactoryMod.AbstractFactory
import typings.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModel
import typings.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFactoriesAbstractLinkFactoryMod {
  
  /* note: abstract class */ @JSImport("storm-react-diagrams/dist/src/factories/AbstractLinkFactory", "AbstractLinkFactory")
  @js.native
  open class AbstractLinkFactory[T /* <: LinkModel[LinkModelListener] */] protected () extends AbstractFactory[T] {
    def this(name: String) = this()
    
    def generateReactWidget(diagramEngine: DiagramEngine, link: T): Element = js.native
  }
}
