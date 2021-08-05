package typings.rsocketTypes.reactiveSocketTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameWithData extends StObject {
  
  var data: js.UndefOr[Encodable] = js.undefined
  
  var metadata: js.UndefOr[Encodable] = js.undefined
}
object FrameWithData {
  
  inline def apply(): FrameWithData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameWithData]
  }
  
  extension [Self <: FrameWithData](x: Self) {
    
    inline def setData(value: Encodable): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMetadata(value: Encodable): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
