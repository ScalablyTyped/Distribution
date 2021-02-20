package typings.senchaTouch.Ext.draw.sprite

import org.scalablytyped.runtime.StObject
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
  implicit class IEllipseMutableBuilder[Self <: IEllipse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisRotation(value: Double): Self = StObject.set(x, "axisRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisRotationUndefined: Self = StObject.set(x, "axisRotation", js.undefined)
    
    @scala.inline
    def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    @scala.inline
    def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    
    @scala.inline
    def setUpdatePath(value: (/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updatePath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdatePathUndefined: Self = StObject.set(x, "updatePath", js.undefined)
  }
}
