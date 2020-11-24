package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GravityEnum extends js.Object {
  
  var center: Double = js.native
  
  var centre: Double = js.native
  
  var east: Double = js.native
  
  var north: Double = js.native
  
  var northeast: Double = js.native
  
  var northwest: Double = js.native
  
  var south: Double = js.native
  
  var southeast: Double = js.native
  
  var southwest: Double = js.native
  
  var west: Double = js.native
}
object GravityEnum {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GravityEnumOps[Self <: GravityEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCenter(value: Double): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCentre(value: Double): Self = this.set("centre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEast(value: Double): Self = this.set("east", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorth(value: Double): Self = this.set("north", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNortheast(value: Double): Self = this.set("northeast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorthwest(value: Double): Self = this.set("northwest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouth(value: Double): Self = this.set("south", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoutheast(value: Double): Self = this.set("southeast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthwest(value: Double): Self = this.set("southwest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWest(value: Double): Self = this.set("west", value.asInstanceOf[js.Any])
  }
}
