package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerResponseSuccess extends StObject {
  
  var a: js.UndefOr[RequestAction] = js.undefined
  
  var c: js.UndefOr[CollectionName] = js.undefined
  
  var d: js.UndefOr[DocumentID] = js.undefined
  
  var data: js.UndefOr[AnyDataObject | js.Array[AnyDataObject]] = js.undefined
  
  var extra: js.UndefOr[Any] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var protocol: js.UndefOr[Double] = js.undefined
  
  var protocolMinor: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var v: js.UndefOr[VersionNumber] = js.undefined
}
object ServerResponseSuccess {
  
  inline def apply(): ServerResponseSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerResponseSuccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerResponseSuccess] (val x: Self) extends AnyVal {
    
    inline def setA(value: RequestAction): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
    
    inline def setC(value: CollectionName): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
    
    inline def setD(value: DocumentID): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setData(value: AnyDataObject | js.Array[AnyDataObject]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: AnyDataObject*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setExtra(value: Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProtocol(value: Double): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolMinor(value: Double): Self = StObject.set(x, "protocolMinor", value.asInstanceOf[js.Any])
    
    inline def setProtocolMinorUndefined: Self = StObject.set(x, "protocolMinor", js.undefined)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setV(value: VersionNumber): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
