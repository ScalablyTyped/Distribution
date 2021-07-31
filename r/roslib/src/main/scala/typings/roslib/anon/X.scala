package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  var x: js.UndefOr[Double | Null] = js.undefined
  
  var y: js.UndefOr[Double | Null] = js.undefined
  
  var z: js.UndefOr[Double | Null] = js.undefined
}
object X {
  
  @scala.inline
  def apply(): X = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X]
  }
  
  @scala.inline
  implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXNull: Self = StObject.set(x, "x", null)
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYNull: Self = StObject.set(x, "y", null)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZNull: Self = StObject.set(x, "z", null)
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
