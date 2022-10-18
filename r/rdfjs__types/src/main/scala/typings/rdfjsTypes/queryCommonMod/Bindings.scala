package typings.rdfjsTypes.queryCommonMod

import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.dataModelMod.Variable
import typings.rdfjsTypes.rdfjsTypesStrings.bindings
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bindings
  extends StObject
     with Iterable[js.Tuple2[Variable, Term]] {
  
  def delete(key: String): Bindings = js.native
  /**
    * Create a new Bindings object by removing the given variable.
    *
    * If the variable does not exist in the binding, a copy of the Bindings object is returned.
    *
    * @param key The variable key term or string. If it is a string, no `?` prefix must be given.
    */
  def delete(key: Variable): Bindings = js.native
  
  /**
    * Check if all entries contained in this Bindings object are equal to all entries in the other Bindings object.
    * @param other A Bindings object.
    */
  def equals(): Boolean = js.native
  def equals(other: Bindings): Boolean = js.native
  
  /**
    * Create a new Bindings object by filtering entries using a callback.
    * @param fn A callback that is applied on each entry.
    *           Returning true indicates that this entry must be contained in the resulting Bindings object.
    */
  def filter(fn: js.Function2[/* value */ Term, /* key */ Variable, Boolean]): Bindings = js.native
  
  /**
    * Iterate over all variable-value pairs.
    * @param fn A callback that is called for each variable-value pair
    *           with value as first argument, and variable as second argument.
    */
  def forEach(fn: js.Function2[/* value */ Term, /* key */ Variable, Any]): Unit = js.native
  
  def get(key: String): js.UndefOr[Term] = js.native
  /**
    * Obtain the binding value for the given variable.
    * @param key A variable term or string. If it is a string, no `?` prefix must be given.
    */
  def get(key: Variable): js.UndefOr[Term] = js.native
  
  def has(key: String): Boolean = js.native
  /**
    * Check if a binding exist for the given variable.
    * @param key A variable term or string. If it is a string, no `?` prefix must be given.
    */
  def has(key: Variable): Boolean = js.native
  
  /**
    * Obtain all variables for which mappings exist.
    */
  def keys(): js.Iterable[Variable] = js.native
  
  /**
    * Create a new Bindings object by mapping entries using a callback.
    * @param fn A callback that is applied on each entry, in which the original value is replaced by the returned value.
    */
  def map(fn: js.Function2[/* value */ Term, /* key */ Variable, Term]): Bindings = js.native
  
  /**
    * Merge this bindings with another.
    *
    * If a merge conflict occurs (this and other have an equal variable with unequal value),
    * then undefined is returned.
    *
    * @param other A Bindings object.
    */
  def merge(other: Bindings): js.UndefOr[Bindings] = js.native
  
  /**
    * Merge this bindings with another, where merge conflicts can be resolved using a callback function.
    * @param merger A function that is invoked when a merge conflict occurs,
    *               for which the returned value is considered the merged value.
    * @param other A Bindings object.
    */
  def mergeWith(merger: js.Function3[/* self */ Term, /* other */ Term, /* key */ Variable, Term], other: Bindings): Bindings = js.native
  
  def set(key: String, value: Term): Bindings = js.native
  /**
    * Create a new Bindings object by adding the given variable and value mapping.
    *
    * If the variable already exists in the binding, then the existing mapping is overwritten.
    *
    * @param key The variable key term or string. If it is a string, no `?` prefix must be given.
    * @param value The value.
    */
  def set(key: Variable, value: Term): Bindings = js.native
  
  /**
    * The number of variable-value pairs.
    */
  var size: Double = js.native
  
  var `type`: bindings = js.native
  
  /**
    * Obtain all values that are mapped to.
    */
  def values(): js.Iterable[Term] = js.native
}
