package typings.redisClient.genericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.redisClient.genericTransformersMod.GeoSearchByRadius
  - typings.redisClient.genericTransformersMod.GeoSearchByBox
*/
trait GeoSearchBy extends StObject
object GeoSearchBy {
  
  inline def GeoSearchByBox(height: Double, unit: GeoUnits, width: Double): typings.redisClient.genericTransformersMod.GeoSearchByBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisClient.genericTransformersMod.GeoSearchByBox]
  }
  
  inline def GeoSearchByRadius(radius: Double, unit: GeoUnits): typings.redisClient.genericTransformersMod.GeoSearchByRadius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisClient.genericTransformersMod.GeoSearchByRadius]
  }
}
