package typings.rdfjsTypes.queryCommonMod

import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.dataModelMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingsFactory extends StObject {
  
  /**
    * Create a new Bindings object from the given variable-value entries.
    * @param entries An array of entries, where each entry is a tuple containing a variable and a term.
    */
  def bindings(): Bindings = js.native
  def bindings(entries: js.Array[js.Tuple2[Variable, Term]]): Bindings = js.native
  
  /**
    * Create a copy of the given bindings object using this factory.
    * @param bindings A Bindings object.
    */
  def fromBindings(bindings: Bindings): Bindings = js.native
}
