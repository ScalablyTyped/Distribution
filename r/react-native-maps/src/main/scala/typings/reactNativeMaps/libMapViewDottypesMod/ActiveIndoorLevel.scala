package typings.reactNativeMaps.libMapViewDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveIndoorLevel extends StObject {
  
  var activeLevelIndex: Double
  
  var name: String
  
  var shortName: String
}
object ActiveIndoorLevel {
  
  inline def apply(activeLevelIndex: Double, name: String, shortName: String): ActiveIndoorLevel = {
    val __obj = js.Dynamic.literal(activeLevelIndex = activeLevelIndex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIndoorLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveIndoorLevel] (val x: Self) extends AnyVal {
    
    inline def setActiveLevelIndex(value: Double): Self = StObject.set(x, "activeLevelIndex", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
  }
}
