package typings.redisJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsStrappendMod {
  
  @JSImport("@redis/json/dist/commands/STRAPPEND", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/json/dist/commands/STRAPPEND", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type AppendArguments | AppendWithPathArguments is not an array type */ param0: AppendArguments
  ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type AppendArguments | AppendWithPathArguments is not an array type */ param0: AppendWithPathArguments
  ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): Double | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double | js.Array[Double]]
  
  type AppendArguments = js.Tuple2[/* key */ String, /* append */ String]
  
  type AppendWithPathArguments = js.Tuple3[/* key */ String, /* path */ String, /* append */ String]
}
