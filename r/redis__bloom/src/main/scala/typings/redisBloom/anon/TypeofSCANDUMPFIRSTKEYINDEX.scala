package typings.redisBloom.anon

import typings.redisBloom.distCommandsCuckooScandumpMod.ScanDumpRawReply
import typings.redisBloom.distCommandsCuckooScandumpMod.ScanDumpReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSCANDUMPFIRSTKEYINDEX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(key: String, iterator: Double): js.Array[String]
  
  def transformReply(param0: ScanDumpRawReply): ScanDumpReply
}
object TypeofSCANDUMPFIRSTKEYINDEX {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (String, Double) => js.Array[String],
    transformReply: ScanDumpRawReply => ScanDumpReply
  ): TypeofSCANDUMPFIRSTKEYINDEX = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofSCANDUMPFIRSTKEYINDEX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSCANDUMPFIRSTKEYINDEX] (val x: Self) extends AnyVal {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (String, Double) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: ScanDumpRawReply => ScanDumpReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
