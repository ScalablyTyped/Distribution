package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObserverArrayOpts
  extends StObject
     with ObserverBaseOpts {
  
  /**
  	 * Create an array observer, which fires array changes objects rather than the usual callback when array modification methods are used.
  	 */
  var array: Boolean
}
object ObserverArrayOpts {
  
  inline def apply(array: Boolean): ObserverArrayOpts = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverArrayOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObserverArrayOpts] (val x: Self) extends AnyVal {
    
    inline def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
  }
}
