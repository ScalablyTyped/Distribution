package typings.redisClient.distLibCommandsGenericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.redisClient.distLibCommandsGenericTransformersMod.GeoSearchByRadius
  - typings.redisClient.distLibCommandsGenericTransformersMod.GeoSearchByBox
*/
trait GeoSearchBy extends StObject
object GeoSearchBy {
  
  inline def GeoSearchByBox(height: Double, unit: GeoUnits, width: Double): typings.redisClient.distLibCommandsGenericTransformersMod.GeoSearchByBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisClient.distLibCommandsGenericTransformersMod.GeoSearchByBox]
  }
  
  inline def GeoSearchByRadius(radius: Double, unit: GeoUnits): typings.redisClient.distLibCommandsGenericTransformersMod.GeoSearchByRadius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisClient.distLibCommandsGenericTransformersMod.GeoSearchByRadius]
  }
}
