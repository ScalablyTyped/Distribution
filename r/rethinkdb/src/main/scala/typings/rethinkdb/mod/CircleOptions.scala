package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleOptions
  extends StObject
     with DistanceOptions {
  
  /**
    * If `true` (the default) the circle is filled, creating a polygon; if `false` the circle is unfilled (creating a line).
    */
  var fill: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of vertices in the polygon or line. Defaults to 32.
    */
  var numVertices: js.UndefOr[Double] = js.undefined
}
object CircleOptions {
  
  @scala.inline
  def apply(): CircleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleOptions]
  }
  
  @scala.inline
  implicit class CircleOptionsMutableBuilder[Self <: CircleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setNumVertices(value: Double): Self = StObject.set(x, "numVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumVerticesUndefined: Self = StObject.set(x, "numVertices", js.undefined)
  }
}
