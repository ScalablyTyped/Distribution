package typings.redisClient.distLibCommandsGenericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanOptions extends StObject {
  
  var COUNT: js.UndefOr[Double] = js.undefined
  
  var MATCH: js.UndefOr[String] = js.undefined
}
object ScanOptions {
  
  inline def apply(): ScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanOptions]
  }
  
  extension [Self <: ScanOptions](x: Self) {
    
    inline def setCOUNT(value: Double): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
    
    inline def setCOUNTUndefined: Self = StObject.set(x, "COUNT", js.undefined)
    
    inline def setMATCH(value: String): Self = StObject.set(x, "MATCH", value.asInstanceOf[js.Any])
    
    inline def setMATCHUndefined: Self = StObject.set(x, "MATCH", js.undefined)
  }
}
