package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRLayer extends StObject {
  
  var leftBounds: js.UndefOr[js.Array[Double] | Float32Array | Null] = js.native
  
  var rightBounds: js.UndefOr[js.Array[Double] | Float32Array | Null] = js.native
  
  var source: js.UndefOr[HTMLCanvasElement | Null] = js.native
}
object VRLayer {
  
  @scala.inline
  def apply(): VRLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRLayer]
  }
  
  @scala.inline
  implicit class VRLayerMutableBuilder[Self <: VRLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftBounds(value: js.Array[Double] | Float32Array): Self = StObject.set(x, "leftBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftBoundsNull: Self = StObject.set(x, "leftBounds", null)
    
    @scala.inline
    def setLeftBoundsUndefined: Self = StObject.set(x, "leftBounds", js.undefined)
    
    @scala.inline
    def setLeftBoundsVarargs(value: Double*): Self = StObject.set(x, "leftBounds", js.Array(value :_*))
    
    @scala.inline
    def setRightBounds(value: js.Array[Double] | Float32Array): Self = StObject.set(x, "rightBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightBoundsNull: Self = StObject.set(x, "rightBounds", null)
    
    @scala.inline
    def setRightBoundsUndefined: Self = StObject.set(x, "rightBounds", js.undefined)
    
    @scala.inline
    def setRightBoundsVarargs(value: Double*): Self = StObject.set(x, "rightBounds", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: HTMLCanvasElement): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
