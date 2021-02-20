package typings.senchaTouch.Ext.draw.sprite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISector extends IPath {
  
  /** [Config Option] (Number) */
  var centerX: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var centerY: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var endAngle: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var endRho: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var margin: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var startAngle: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var startRho: js.UndefOr[Double] = js.native
  
  /** [Method] Update the path
    * @param path Object
    * @param attr Object
    */
  @JSName("updatePath")
  var updatePath_ISector: js.UndefOr[js.Function2[/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any], Unit]] = js.native
}
object ISector {
  
  @scala.inline
  def apply(): ISector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISector]
  }
  
  @scala.inline
  implicit class ISectorMutableBuilder[Self <: ISector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterXUndefined: Self = StObject.set(x, "centerX", js.undefined)
    
    @scala.inline
    def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterYUndefined: Self = StObject.set(x, "centerY", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setEndRho(value: Double): Self = StObject.set(x, "endRho", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRhoUndefined: Self = StObject.set(x, "endRho", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setStartRho(value: Double): Self = StObject.set(x, "startRho", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRhoUndefined: Self = StObject.set(x, "startRho", js.undefined)
    
    @scala.inline
    def setUpdatePath(value: (/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updatePath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdatePathUndefined: Self = StObject.set(x, "updatePath", js.undefined)
  }
}
