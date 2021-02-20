package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to reflect the zoomAndPan attribute, and is mixed in to other interfaces for elements that support this attribute. */
@js.native
trait SVGZoomAndPan extends StObject {
  
  val zoomAndPan: Double = js.native
}
object SVGZoomAndPan {
  
  @scala.inline
  def apply(zoomAndPan: Double): SVGZoomAndPan = {
    val __obj = js.Dynamic.literal(zoomAndPan = zoomAndPan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGZoomAndPan]
  }
  
  @scala.inline
  implicit class SVGZoomAndPanMutableBuilder[Self <: SVGZoomAndPan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZoomAndPan(value: Double): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
  }
}
