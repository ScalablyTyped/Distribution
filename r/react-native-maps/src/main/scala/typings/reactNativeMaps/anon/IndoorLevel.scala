package typings.reactNativeMaps.anon

import typings.reactNativeMaps.libMapViewDottypesMod.ActiveIndoorLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndoorLevel extends StObject {
  
  var IndoorLevel: ActiveIndoorLevel
}
object IndoorLevel {
  
  inline def apply(IndoorLevel: ActiveIndoorLevel): IndoorLevel = {
    val __obj = js.Dynamic.literal(IndoorLevel = IndoorLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndoorLevel]
  }
  
  extension [Self <: IndoorLevel](x: Self) {
    
    inline def setIndoorLevel(value: ActiveIndoorLevel): Self = StObject.set(x, "IndoorLevel", value.asInstanceOf[js.Any])
  }
}
