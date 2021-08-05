package typings.reactNavigationDrawer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lazy extends StObject {
  
  var `lazy`: Boolean
}
object Lazy {
  
  inline def apply(`lazy`: Boolean): Lazy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lazy]
  }
  
  extension [Self <: Lazy](x: Self) {
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
  }
}
