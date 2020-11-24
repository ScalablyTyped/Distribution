package typings.stormReactDiagrams

import typings.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typings.stormReactDiagrams.portModelMod.PortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/factories/AbstractPortFactory", JSImport.Namespace)
@js.native
object abstractPortFactoryMod extends js.Object {
  
  @js.native
  abstract class AbstractPortFactory[T /* <: PortModel */] () extends AbstractFactory[T]
}
