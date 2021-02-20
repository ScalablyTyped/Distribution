package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldMaskMask extends StObject {
  
  // TypeScript Version: 2.2
  var args: js.UndefOr[js.Object] = js.native
  
  var name: String = js.native
}
object FieldMaskMask {
  
  @scala.inline
  def apply(name: String): FieldMaskMask = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMaskMask]
  }
  
  @scala.inline
  implicit class FieldMaskMaskMutableBuilder[Self <: FieldMaskMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Object): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
