package typings.promiseFs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingFlag extends StObject {
  
  var encoding: js.UndefOr[String | Null] = js.undefined
  
  var flag: js.UndefOr[String] = js.undefined
}
object EncodingFlag {
  
  inline def apply(): EncodingFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingFlag]
  }
  
  extension [Self <: EncodingFlag](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
