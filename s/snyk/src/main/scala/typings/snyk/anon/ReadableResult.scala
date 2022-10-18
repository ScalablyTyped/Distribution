package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableResult extends StObject {
  
  var readableResult: String
  
  var sarifResult: js.UndefOr[String] = js.undefined
}
object ReadableResult {
  
  inline def apply(readableResult: String): ReadableResult = {
    val __obj = js.Dynamic.literal(readableResult = readableResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableResult]
  }
  
  extension [Self <: ReadableResult](x: Self) {
    
    inline def setReadableResult(value: String): Self = StObject.set(x, "readableResult", value.asInstanceOf[js.Any])
    
    inline def setSarifResult(value: String): Self = StObject.set(x, "sarifResult", value.asInstanceOf[js.Any])
    
    inline def setSarifResultUndefined: Self = StObject.set(x, "sarifResult", js.undefined)
  }
}
