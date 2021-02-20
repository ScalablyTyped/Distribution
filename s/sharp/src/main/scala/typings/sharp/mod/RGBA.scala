package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RGBA extends StObject {
  
  var alpha: js.UndefOr[Double] = js.native
  
  var b: js.UndefOr[Double] = js.native
  
  var g: js.UndefOr[Double] = js.native
  
  var r: js.UndefOr[Double] = js.native
}
object RGBA {
  
  @scala.inline
  def apply(): RGBA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RGBA]
  }
  
  @scala.inline
  implicit class RGBAMutableBuilder[Self <: RGBA] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBUndefined: Self = StObject.set(x, "b", js.undefined)
    
    @scala.inline
    def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGUndefined: Self = StObject.set(x, "g", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
