package typings.senchaTouch.Ext.draw.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEllipse extends IPath {
  
  /** [Config Option] (Number) */
  var axisRotation: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var cx: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var cy: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var rx: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var ry: js.UndefOr[Double] = js.native
  
  /** [Method] Update the path
    * @param path Object
    * @param attr Object
    */
  @JSName("updatePath")
  var updatePath_IEllipse: js.UndefOr[js.Function2[/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any], Unit]] = js.native
}
object IEllipse {
  
  @scala.inline
  def apply(): IEllipse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEllipse]
  }
  
  @scala.inline
  implicit class IEllipseOps[Self <: IEllipse] (val x: Self) extends AnyVal {
    
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
    def setAxisRotation(value: Double): Self = this.set("axisRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisRotation: Self = this.set("axisRotation", js.undefined)
    
    @scala.inline
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    
    @scala.inline
    def setRx(value: Double): Self = this.set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    
    @scala.inline
    def setRy(value: Double): Self = this.set("ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
    
    @scala.inline
    def setUpdatePath(value: (/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any]) => Unit): Self = this.set("updatePath", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdatePath: Self = this.set("updatePath", js.undefined)
  }
}
