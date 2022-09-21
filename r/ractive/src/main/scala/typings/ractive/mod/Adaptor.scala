package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adaptor extends StObject {
  
  /** Called when Ractive gets a new value to see if the adaptor should be applied.
  	 * @param value the value to evaluate
  	 * @param keypath the keypath of the value in the Ractive data
  	 * @param ractive the Ractive instance that is applying the value to the given keypath
  	 * @returns true if the adaptor should be applied, false otherwise
  	 */
  def filter(value: Any, keypath: String, ractive: Ractive[Ractive[Any]]): Boolean
  
  /** Called when Ractive is applying the adaptor to a value
  	 * @param ractive the Ractive instance that is applying the adaptor
  	 * @param value the value to which the value is being applied
  	 * @param keypath the keypath of the value to which the adaptor is being applied
  	 * @param prefixer a helper function to prefix a value map with the current keypath
  	 * @returns the adaptor
  	 */
  def wrap(ractive: Ractive[Ractive[Any]], value: Any, keypath: String, prefixer: AdaptorPrefixer): AdaptorHandle
}
object Adaptor {
  
  inline def apply(
    filter: (Any, String, Ractive[Ractive[Any]]) => Boolean,
    wrap: (Ractive[Ractive[Any]], Any, String, AdaptorPrefixer) => AdaptorHandle
  ): Adaptor = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction3(filter), wrap = js.Any.fromFunction4(wrap))
    __obj.asInstanceOf[Adaptor]
  }
  
  extension [Self <: Adaptor](x: Self) {
    
    inline def setFilter(value: (Any, String, Ractive[Ractive[Any]]) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
    
    inline def setWrap(value: (Ractive[Ractive[Any]], Any, String, AdaptorPrefixer) => AdaptorHandle): Self = StObject.set(x, "wrap", js.Any.fromFunction4(value))
  }
}
