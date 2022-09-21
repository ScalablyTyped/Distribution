package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.xautoclaimJUSTIDMod.XAutoClaimJustIdRawReply
import typings.redisClient.xautoclaimJUSTIDMod.XAutoClaimJustIdReply
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedXAUTOCLAIM extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof transformXAutoClaimArguments> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof transformXAutoClaimArguments */ js.Any
    ]
  ): RedisCommandArguments
  
  def transformReply(reply: XAutoClaimJustIdRawReply): XAutoClaimJustIdReply
}
object TypeofimportedXAUTOCLAIM {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof transformXAutoClaimArguments */ js.Any
    ] => RedisCommandArguments,
    transformReply: XAutoClaimJustIdRawReply => XAutoClaimJustIdReply
  ): TypeofimportedXAUTOCLAIM = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofimportedXAUTOCLAIM]
  }
  
  extension [Self <: TypeofimportedXAUTOCLAIM](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(
      value: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof transformXAutoClaimArguments */ js.Any
        ] => RedisCommandArguments
    ): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: XAutoClaimJustIdRawReply => XAutoClaimJustIdReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
