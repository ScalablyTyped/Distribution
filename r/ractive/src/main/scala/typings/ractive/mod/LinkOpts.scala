package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkOpts extends StObject {
  
  /**
  	 * The ractive instance in which to find the source keypath.
  	 */
  var instance: js.UndefOr[Ractive[Ractive[js.Any]]] = js.undefined
  
  /**
  	 * The keypath to use for the link when handling a shuffle. For instance foo.1.bar will not shuffle with foo, but .bar will.
  	 */
  var keypath: js.UndefOr[String] = js.undefined
  
  /**
  	 * The ractive instance in which to find the source keypath.
  	 */
  var ractive: js.UndefOr[Ractive[Ractive[js.Any]]] = js.undefined
}
object LinkOpts {
  
  inline def apply(): LinkOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkOpts]
  }
  
  extension [Self <: LinkOpts](x: Self) {
    
    inline def setInstance(value: Ractive[Ractive[js.Any]]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setKeypath(value: String): Self = StObject.set(x, "keypath", value.asInstanceOf[js.Any])
    
    inline def setKeypathUndefined: Self = StObject.set(x, "keypath", js.undefined)
    
    inline def setRactive(value: Ractive[Ractive[js.Any]]): Self = StObject.set(x, "ractive", value.asInstanceOf[js.Any])
    
    inline def setRactiveUndefined: Self = StObject.set(x, "ractive", js.undefined)
  }
}
