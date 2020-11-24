package typings.senchaTouch.Ext.draw.sprite

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
  implicit class ISectorOps[Self <: ISector] (val x: Self) extends AnyVal {
    
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
    def setCenterX(value: Double): Self = this.set("centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterX: Self = this.set("centerX", js.undefined)
    
    @scala.inline
    def setCenterY(value: Double): Self = this.set("centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterY: Self = this.set("centerY", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setEndRho(value: Double): Self = this.set("endRho", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndRho: Self = this.set("endRho", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setStartRho(value: Double): Self = this.set("startRho", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRho: Self = this.set("startRho", js.undefined)
    
    @scala.inline
    def setUpdatePath(value: (/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any]) => Unit): Self = this.set("updatePath", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdatePath: Self = this.set("updatePath", js.undefined)
  }
}
