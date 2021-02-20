package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Where Geometry Options
  */
@js.native
trait WhereGeometryOptions extends StObject {
  
  var coordinates: js.Array[js.Array[Double] | Double] = js.native
  
  var `type`: String = js.native
}
object WhereGeometryOptions {
  
  @scala.inline
  def apply(coordinates: js.Array[js.Array[Double] | Double], `type`: String): WhereGeometryOptions = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereGeometryOptions]
  }
  
  @scala.inline
  implicit class WhereGeometryOptionsMutableBuilder[Self <: WhereGeometryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[Double] | Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
