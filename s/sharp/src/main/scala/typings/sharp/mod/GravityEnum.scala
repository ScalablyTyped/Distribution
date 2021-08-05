package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GravityEnum extends StObject {
  
  var center: Double
  
  var centre: Double
  
  var east: Double
  
  var north: Double
  
  var northeast: Double
  
  var northwest: Double
  
  var south: Double
  
  var southeast: Double
  
  var southwest: Double
  
  var west: Double
}
object GravityEnum {
  
  inline def apply(
    center: Double,
    centre: Double,
    east: Double,
    north: Double,
    northeast: Double,
    northwest: Double,
    south: Double,
    southeast: Double,
    southwest: Double,
    west: Double
  ): GravityEnum = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], centre = centre.asInstanceOf[js.Any], east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], northeast = northeast.asInstanceOf[js.Any], northwest = northwest.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], southeast = southeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
    __obj.asInstanceOf[GravityEnum]
  }
  
  extension [Self <: GravityEnum](x: Self) {
    
    inline def setCenter(value: Double): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCentre(value: Double): Self = StObject.set(x, "centre", value.asInstanceOf[js.Any])
    
    inline def setEast(value: Double): Self = StObject.set(x, "east", value.asInstanceOf[js.Any])
    
    inline def setNorth(value: Double): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
    
    inline def setNortheast(value: Double): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    inline def setNorthwest(value: Double): Self = StObject.set(x, "northwest", value.asInstanceOf[js.Any])
    
    inline def setSouth(value: Double): Self = StObject.set(x, "south", value.asInstanceOf[js.Any])
    
    inline def setSoutheast(value: Double): Self = StObject.set(x, "southeast", value.asInstanceOf[js.Any])
    
    inline def setSouthwest(value: Double): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
    
    inline def setWest(value: Double): Self = StObject.set(x, "west", value.asInstanceOf[js.Any])
  }
}
