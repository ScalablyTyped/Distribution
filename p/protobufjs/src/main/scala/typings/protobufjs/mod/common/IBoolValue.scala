package typings.protobufjs.mod.common

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.BoolValue message. */
trait IBoolValue extends StObject {
  
  var value: js.UndefOr[Boolean] = js.undefined
}
object IBoolValue {
  
  inline def apply(): IBoolValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoolValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBoolValue] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
