package typings.protobufjs.mod.common

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.Int32Value message. */
trait IInt32Value extends StObject {
  
  var value: js.UndefOr[Double] = js.undefined
}
object IInt32Value {
  
  inline def apply(): IInt32Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInt32Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInt32Value] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
