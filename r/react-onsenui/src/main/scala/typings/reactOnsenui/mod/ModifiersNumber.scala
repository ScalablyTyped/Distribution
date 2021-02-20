package typings.reactOnsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifiersNumber extends StObject {
  
  var default: js.UndefOr[Double] = js.native
  
  var material: js.UndefOr[Double] = js.native
}
object ModifiersNumber {
  
  @scala.inline
  def apply(): ModifiersNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifiersNumber]
  }
  
  @scala.inline
  implicit class ModifiersNumberMutableBuilder[Self <: ModifiersNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setMaterial(value: Double): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
  }
}
