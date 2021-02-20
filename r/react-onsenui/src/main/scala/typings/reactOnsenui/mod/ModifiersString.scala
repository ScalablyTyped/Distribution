package typings.reactOnsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifiersString extends StObject {
  
  var default: js.UndefOr[String] = js.native
  
  var material: js.UndefOr[String] = js.native
}
object ModifiersString {
  
  @scala.inline
  def apply(): ModifiersString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifiersString]
  }
  
  @scala.inline
  implicit class ModifiersStringMutableBuilder[Self <: ModifiersString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setMaterial(value: String): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
  }
}
