package typings.reactNavigationDrawer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loaded extends StObject {
  
  var loaded: js.Array[Double]
}
object Loaded {
  
  inline def apply(loaded: js.Array[Double]): Loaded = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loaded]
  }
  
  extension [Self <: Loaded](x: Self) {
    
    inline def setLoaded(value: js.Array[Double]): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedVarargs(value: Double*): Self = StObject.set(x, "loaded", js.Array(value*))
  }
}
