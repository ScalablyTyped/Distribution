package typings.redisClient.anon

import typings.redisClient.distLibCommandsBitfieldMod.BitFieldEncoding
import typings.redisClient.redisClientStrings.GET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@redis/client.@redis/client/dist/lib/commands/BITFIELD.BitFieldGetOperation, 'operation'> & std.Partial<std.Pick<@redis/client.@redis/client/dist/lib/commands/BITFIELD.BitFieldGetOperation, 'operation'>> */
trait OmitBitFieldGetOperationo extends StObject {
  
  var encoding: BitFieldEncoding
  
  var offset: Double | String
  
  var operation: js.UndefOr[GET] = js.undefined
}
object OmitBitFieldGetOperationo {
  
  inline def apply(encoding: BitFieldEncoding, offset: Double | String): OmitBitFieldGetOperationo = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitBitFieldGetOperationo]
  }
  
  extension [Self <: OmitBitFieldGetOperationo](x: Self) {
    
    inline def setEncoding(value: BitFieldEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: GET): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
