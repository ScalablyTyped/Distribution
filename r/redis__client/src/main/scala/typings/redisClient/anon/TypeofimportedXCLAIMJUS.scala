package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedXCLAIMJUS extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof transformXClaimArguments> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof transformXClaimArguments */ js.Any
    ]
  ): RedisCommandArguments
  
  def transformReply(): js.Array[RedisCommandArgument]
}
object TypeofimportedXCLAIMJUS {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof transformXClaimArguments */ js.Any
    ] => RedisCommandArguments,
    transformReply: () => js.Array[RedisCommandArgument]
  ): TypeofimportedXCLAIMJUS = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofimportedXCLAIMJUS]
  }
  
  extension [Self <: TypeofimportedXCLAIMJUS](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(
      value: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof transformXClaimArguments */ js.Any
        ] => RedisCommandArguments
    ): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => js.Array[RedisCommandArgument]): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
