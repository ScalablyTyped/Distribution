package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  type :string,   payload :object | undefined,   source :string | undefined,   target :string | undefined}> */
@js.native
trait Readonlytypestringpayload extends StObject {
  
  val payload: js.UndefOr[js.Object] = js.native
  
  val source: js.UndefOr[String] = js.native
  
  val target: js.UndefOr[String] = js.native
  
  val `type`: String = js.native
}
object Readonlytypestringpayload {
  
  @scala.inline
  def apply(`type`: String): Readonlytypestringpayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlytypestringpayload]
  }
  
  @scala.inline
  implicit class ReadonlytypestringpayloadMutableBuilder[Self <: Readonlytypestringpayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
