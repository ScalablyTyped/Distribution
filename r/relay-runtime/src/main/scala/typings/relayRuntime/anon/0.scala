package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.missing
import typings.relayRuntime.relayStoreTypesMod.OperationAvailability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends OperationAvailability {
  
  var status: missing = js.native
}
object `0` {
  
  @scala.inline
  def apply(status: missing): `0` = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: missing): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
