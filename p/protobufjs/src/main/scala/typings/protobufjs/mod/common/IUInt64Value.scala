package typings.protobufjs.mod.common

import typings.protobufjs.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.UInt64Value message. */
trait IUInt64Value extends StObject {
  
  var value: js.UndefOr[Double | Long] = js.undefined
}
object IUInt64Value {
  
  inline def apply(): IUInt64Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUInt64Value]
  }
  
  extension [Self <: IUInt64Value](x: Self) {
    
    inline def setValue(value: Double | Long): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
