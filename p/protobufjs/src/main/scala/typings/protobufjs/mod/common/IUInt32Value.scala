package typings.protobufjs.mod.common

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.UInt32Value message. */
trait IUInt32Value extends StObject {
  
  var value: js.UndefOr[Double] = js.undefined
}
object IUInt32Value {
  
  @scala.inline
  def apply(): IUInt32Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUInt32Value]
  }
  
  @scala.inline
  implicit class IUInt32ValueMutableBuilder[Self <: IUInt32Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
