package typings.promiseFs.anon

import typings.promiseFs.promiseFsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var encoding: js.UndefOr[String | Null] = js.undefined
  
  var withFileTypes: `true`
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(withFileTypes = true)
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setWithFileTypes(value: `true`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
  }
}
