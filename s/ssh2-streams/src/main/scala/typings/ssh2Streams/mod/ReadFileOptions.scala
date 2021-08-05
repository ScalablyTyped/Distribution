package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadFileOptions extends StObject {
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var flag: js.UndefOr[String] = js.undefined
}
object ReadFileOptions {
  
  inline def apply(): ReadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadFileOptions]
  }
  
  extension [Self <: ReadFileOptions](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
