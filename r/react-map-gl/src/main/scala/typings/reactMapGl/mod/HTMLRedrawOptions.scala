package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLRedrawOptions extends StObject {
  
  var height: Double
  
  def project(lnglat: js.Array[Double]): js.Array[Double]
  
  def unproject(xy: js.Array[Double]): js.Array[Double]
  
  var width: Double
}
object HTMLRedrawOptions {
  
  @scala.inline
  def apply(
    height: Double,
    project: js.Array[Double] => js.Array[Double],
    unproject: js.Array[Double] => js.Array[Double],
    width: Double
  ): HTMLRedrawOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], project = js.Any.fromFunction1(project), unproject = js.Any.fromFunction1(unproject), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLRedrawOptions]
  }
  
  @scala.inline
  implicit class HTMLRedrawOptionsMutableBuilder[Self <: HTMLRedrawOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "project", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnproject(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "unproject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
