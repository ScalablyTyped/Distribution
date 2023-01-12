package typings.reactNativeMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndoorBuilding extends StObject {
  
  var IndoorBuilding: typings.reactNativeMaps.libMapViewDottypesMod.IndoorBuilding
}
object IndoorBuilding {
  
  inline def apply(IndoorBuilding: typings.reactNativeMaps.libMapViewDottypesMod.IndoorBuilding): IndoorBuilding = {
    val __obj = js.Dynamic.literal(IndoorBuilding = IndoorBuilding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndoorBuilding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndoorBuilding] (val x: Self) extends AnyVal {
    
    inline def setIndoorBuilding(value: typings.reactNativeMaps.libMapViewDottypesMod.IndoorBuilding): Self = StObject.set(x, "IndoorBuilding", value.asInstanceOf[js.Any])
  }
}
