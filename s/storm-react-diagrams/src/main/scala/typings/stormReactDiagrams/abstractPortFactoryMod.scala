package typings.stormReactDiagrams

import typings.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typings.stormReactDiagrams.portModelMod.PortModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractPortFactoryMod {
  
  @JSImport("storm-react-diagrams/dist/src/factories/AbstractPortFactory", "AbstractPortFactory")
  @js.native
  abstract class AbstractPortFactory[T /* <: PortModel */] protected () extends AbstractFactory[T] {
    def this(name: String) = this()
  }
}
