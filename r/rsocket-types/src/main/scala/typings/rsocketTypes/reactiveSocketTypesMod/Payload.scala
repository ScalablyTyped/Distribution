package typings.rsocketTypes.reactiveSocketTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload[D, M] extends StObject {
  
  var data: js.UndefOr[D] = js.undefined
  
  var metadata: js.UndefOr[M] = js.undefined
}
object Payload {
  
  inline def apply[D, M](): Payload[D, M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payload[D, M]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Payload[?, ?], D, M] (val x: Self & (Payload[D, M])) extends AnyVal {
    
    inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMetadata(value: M): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
