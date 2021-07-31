package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMMatrixInit
  extends StObject
     with DOMMatrix2DInit {
  
  var is2D: js.UndefOr[scala.Boolean] = js.undefined
  
  var m13: js.UndefOr[Double] = js.undefined
  
  var m14: js.UndefOr[Double] = js.undefined
  
  var m23: js.UndefOr[Double] = js.undefined
  
  var m24: js.UndefOr[Double] = js.undefined
  
  var m31: js.UndefOr[Double] = js.undefined
  
  var m32: js.UndefOr[Double] = js.undefined
  
  var m33: js.UndefOr[Double] = js.undefined
  
  var m34: js.UndefOr[Double] = js.undefined
  
  var m43: js.UndefOr[Double] = js.undefined
  
  var m44: js.UndefOr[Double] = js.undefined
}
object DOMMatrixInit {
  
  @scala.inline
  def apply(): DOMMatrixInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMMatrixInit]
  }
  
  @scala.inline
  implicit class DOMMatrixInitMutableBuilder[Self <: DOMMatrixInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIs2D(value: scala.Boolean): Self = StObject.set(x, "is2D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs2DUndefined: Self = StObject.set(x, "is2D", js.undefined)
    
    @scala.inline
    def setM13(value: Double): Self = StObject.set(x, "m13", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM13Undefined: Self = StObject.set(x, "m13", js.undefined)
    
    @scala.inline
    def setM14(value: Double): Self = StObject.set(x, "m14", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM14Undefined: Self = StObject.set(x, "m14", js.undefined)
    
    @scala.inline
    def setM23(value: Double): Self = StObject.set(x, "m23", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM23Undefined: Self = StObject.set(x, "m23", js.undefined)
    
    @scala.inline
    def setM24(value: Double): Self = StObject.set(x, "m24", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM24Undefined: Self = StObject.set(x, "m24", js.undefined)
    
    @scala.inline
    def setM31(value: Double): Self = StObject.set(x, "m31", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM31Undefined: Self = StObject.set(x, "m31", js.undefined)
    
    @scala.inline
    def setM32(value: Double): Self = StObject.set(x, "m32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM32Undefined: Self = StObject.set(x, "m32", js.undefined)
    
    @scala.inline
    def setM33(value: Double): Self = StObject.set(x, "m33", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM33Undefined: Self = StObject.set(x, "m33", js.undefined)
    
    @scala.inline
    def setM34(value: Double): Self = StObject.set(x, "m34", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM34Undefined: Self = StObject.set(x, "m34", js.undefined)
    
    @scala.inline
    def setM43(value: Double): Self = StObject.set(x, "m43", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM43Undefined: Self = StObject.set(x, "m43", js.undefined)
    
    @scala.inline
    def setM44(value: Double): Self = StObject.set(x, "m44", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM44Undefined: Self = StObject.set(x, "m44", js.undefined)
  }
}
