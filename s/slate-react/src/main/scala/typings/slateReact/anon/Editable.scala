package typings.slateReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Editable extends StObject {
  
  var editable: js.UndefOr[Boolean] = js.undefined
}
object Editable {
  
  inline def apply(): Editable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Editable]
  }
  
  extension [Self <: Editable](x: Self) {
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
  }
}
