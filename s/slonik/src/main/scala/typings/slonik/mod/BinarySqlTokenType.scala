package typings.slonik.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinarySqlTokenType
  extends StObject
     with _SqlTokenType {
  
  var data: Buffer
  
  var `type`: js.Symbol
}
object BinarySqlTokenType {
  
  inline def apply(data: Buffer, `type`: js.Symbol): BinarySqlTokenType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySqlTokenType]
  }
  
  extension [Self <: BinarySqlTokenType](x: Self) {
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
