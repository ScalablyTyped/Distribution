package typings.smallweiAvue.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledSize extends StObject {
  
  var disabled: Boolean
  
  var size: typings.smallweiAvue.Size
}
object DisabledSize {
  
  inline def apply(disabled: Boolean, size: typings.smallweiAvue.Size): DisabledSize = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisabledSize] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setSize(value: typings.smallweiAvue.Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
