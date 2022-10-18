package typings.promiseFs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flag extends StObject {
  
  var encoding: String
  
  var flag: js.UndefOr[String] = js.undefined
}
object Flag {
  
  inline def apply(encoding: String): Flag = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flag]
  }
  
  extension [Self <: Flag](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
