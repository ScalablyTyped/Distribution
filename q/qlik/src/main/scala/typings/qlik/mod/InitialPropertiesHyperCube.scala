package typings.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialPropertiesHyperCube
  extends StObject
     with /* key */ StringDictionary[Any]
     with InitialProperties {
  
  var qHyperCubeDef: HyperCubeDef
}
object InitialPropertiesHyperCube {
  
  inline def apply(qHyperCubeDef: HyperCubeDef): InitialPropertiesHyperCube = {
    val __obj = js.Dynamic.literal(qHyperCubeDef = qHyperCubeDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialPropertiesHyperCube]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitialPropertiesHyperCube] (val x: Self) extends AnyVal {
    
    inline def setQHyperCubeDef(value: HyperCubeDef): Self = StObject.set(x, "qHyperCubeDef", value.asInstanceOf[js.Any])
  }
}
