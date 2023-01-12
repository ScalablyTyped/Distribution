package typings.reactNativeMaps.libMapViewDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndoorBuilding extends StObject {
  
  var activeLevelIndex: Double
  
  var levels: js.Array[IndoorLevel]
  
  var underground: Boolean
}
object IndoorBuilding {
  
  inline def apply(activeLevelIndex: Double, levels: js.Array[IndoorLevel], underground: Boolean): IndoorBuilding = {
    val __obj = js.Dynamic.literal(activeLevelIndex = activeLevelIndex.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], underground = underground.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndoorBuilding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndoorBuilding] (val x: Self) extends AnyVal {
    
    inline def setActiveLevelIndex(value: Double): Self = StObject.set(x, "activeLevelIndex", value.asInstanceOf[js.Any])
    
    inline def setLevels(value: js.Array[IndoorLevel]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: IndoorLevel*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setUnderground(value: Boolean): Self = StObject.set(x, "underground", value.asInstanceOf[js.Any])
  }
}
