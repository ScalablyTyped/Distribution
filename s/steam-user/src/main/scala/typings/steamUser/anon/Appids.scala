package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appids extends StObject {
  
  var appids: js.Array[Double]
  
  var numBans: Double
}
object Appids {
  
  inline def apply(appids: js.Array[Double], numBans: Double): Appids = {
    val __obj = js.Dynamic.literal(appids = appids.asInstanceOf[js.Any], numBans = numBans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appids]
  }
  
  extension [Self <: Appids](x: Self) {
    
    inline def setAppids(value: js.Array[Double]): Self = StObject.set(x, "appids", value.asInstanceOf[js.Any])
    
    inline def setAppidsVarargs(value: Double*): Self = StObject.set(x, "appids", js.Array(value*))
    
    inline def setNumBans(value: Double): Self = StObject.set(x, "numBans", value.asInstanceOf[js.Any])
  }
}
