package typings.recharts.mod

import typings.recharts.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScatterPoint extends StObject {
  
  var cx: js.UndefOr[Double] = js.native
  
  var cy: js.UndefOr[Double] = js.native
  
  var node: js.UndefOr[X] = js.native
  
  var payload: js.UndefOr[js.Any] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object ScatterPoint {
  
  @scala.inline
  def apply(): ScatterPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterPoint]
  }
  
  @scala.inline
  implicit class ScatterPointMutableBuilder[Self <: ScatterPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setNode(value: X): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    @scala.inline
    def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
