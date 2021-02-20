package typings.rsocketTypes.reactiveSocketTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payload[D, M] extends StObject {
  
  var data: js.UndefOr[D] = js.native
  
  var metadata: js.UndefOr[M] = js.native
}
object Payload {
  
  @scala.inline
  def apply[D, M](): Payload[D, M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payload[D, M]]
  }
  
  @scala.inline
  implicit class PayloadMutableBuilder[Self <: Payload[_, _], D, M] (val x: Self with (Payload[D, M])) extends AnyVal {
    
    @scala.inline
    def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setMetadata(value: M): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
