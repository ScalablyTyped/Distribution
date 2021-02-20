package typings.sharp.mod

import typings.sharp.sharpStrings.cubic
import typings.sharp.sharpStrings.lanczos2
import typings.sharp.sharpStrings.lanczos3
import typings.sharp.sharpStrings.mitchell
import typings.sharp.sharpStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelEnum extends StObject {
  
  var cubic: typings.sharp.sharpStrings.cubic = js.native
  
  var lanczos2: typings.sharp.sharpStrings.lanczos2 = js.native
  
  var lanczos3: typings.sharp.sharpStrings.lanczos3 = js.native
  
  var mitchell: typings.sharp.sharpStrings.mitchell = js.native
  
  var nearest: typings.sharp.sharpStrings.nearest = js.native
}
object KernelEnum {
  
  @scala.inline
  def apply(cubic: cubic, lanczos2: lanczos2, lanczos3: lanczos3, mitchell: mitchell, nearest: nearest): KernelEnum = {
    val __obj = js.Dynamic.literal(cubic = cubic.asInstanceOf[js.Any], lanczos2 = lanczos2.asInstanceOf[js.Any], lanczos3 = lanczos3.asInstanceOf[js.Any], mitchell = mitchell.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelEnum]
  }
  
  @scala.inline
  implicit class KernelEnumMutableBuilder[Self <: KernelEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCubic(value: cubic): Self = StObject.set(x, "cubic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanczos2(value: lanczos2): Self = StObject.set(x, "lanczos2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanczos3(value: lanczos3): Self = StObject.set(x, "lanczos3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMitchell(value: mitchell): Self = StObject.set(x, "mitchell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearest(value: nearest): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
  }
}
