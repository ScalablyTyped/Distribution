package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOpts extends StObject {
  
  /**
  	 * Whether or not to include attached children when searching.j
  	 */
  var remote: js.UndefOr[Boolean] = js.undefined
}
object FindOpts {
  
  inline def apply(): FindOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOpts]
  }
  
  extension [Self <: FindOpts](x: Self) {
    
    inline def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
  }
}
