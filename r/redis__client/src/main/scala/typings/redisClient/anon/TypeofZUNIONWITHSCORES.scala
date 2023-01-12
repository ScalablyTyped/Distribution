package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.ZMember
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofZUNIONWITHSCORES extends StObject {
  
  val FIRST_KEY_INDEX: /* 2 */ Double
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof transformZUnionArguments> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof transformZUnionArguments */ js.Any
    ]
  ): RedisCommandArguments
  
  def transformReply(reply: js.Array[RedisCommandArgument]): js.Array[ZMember]
}
object TypeofZUNIONWITHSCORES {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 2 */ Double,
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof transformZUnionArguments */ js.Any
    ] => RedisCommandArguments,
    transformReply: js.Array[RedisCommandArgument] => js.Array[ZMember]
  ): TypeofZUNIONWITHSCORES = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofZUNIONWITHSCORES]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofZUNIONWITHSCORES] (val x: Self) extends AnyVal {
    
    inline def setFIRST_KEY_INDEX(value: /* 2 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(
      value: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof transformZUnionArguments */ js.Any
        ] => RedisCommandArguments
    ): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: js.Array[RedisCommandArgument] => js.Array[ZMember]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
