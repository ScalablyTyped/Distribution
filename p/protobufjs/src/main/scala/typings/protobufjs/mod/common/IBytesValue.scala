package typings.protobufjs.mod.common

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.BytesValue message. */
@js.native
trait IBytesValue extends StObject {
  
  var value: js.UndefOr[Uint8Array] = js.native
}
object IBytesValue {
  
  @scala.inline
  def apply(): IBytesValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBytesValue]
  }
  
  @scala.inline
  implicit class IBytesValueMutableBuilder[Self <: IBytesValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
