package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NESW extends js.Object {
  
  var northEast: Lat = js.native
  
  var southWest: Lat = js.native
}
object NESW {
  
  @scala.inline
  def apply(northEast: Lat, southWest: Lat): NESW = {
    val __obj = js.Dynamic.literal(northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any])
    __obj.asInstanceOf[NESW]
  }
  
  @scala.inline
  implicit class NESWOps[Self <: NESW] (val x: Self) extends AnyVal {
    
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
    def setNorthEast(value: Lat): Self = this.set("northEast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthWest(value: Lat): Self = this.set("southWest", value.asInstanceOf[js.Any])
  }
}
