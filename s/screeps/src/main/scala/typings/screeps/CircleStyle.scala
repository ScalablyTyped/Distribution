package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleStyle extends PolyStyle {
  
  /**
    * Circle radius, default is 0.15.
    */
  var radius: js.UndefOr[Double] = js.native
}
object CircleStyle {
  
  @scala.inline
  def apply(): CircleStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleStyle]
  }
  
  @scala.inline
  implicit class CircleStyleMutableBuilder[Self <: CircleStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
