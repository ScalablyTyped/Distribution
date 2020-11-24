package typings.stormReactDiagrams.mod

import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams", "AbstractFactory")
@js.native
abstract class AbstractFactory[T /* <: typings.stormReactDiagrams.baseModelMod.BaseModel[
typings.stormReactDiagrams.baseEntityMod.BaseEntity[BaseListener[_]], 
BaseModelListener] */] protected ()
  extends typings.stormReactDiagrams.abstractFactoryMod.AbstractFactory[T] {
  def this(name: String) = this()
}
