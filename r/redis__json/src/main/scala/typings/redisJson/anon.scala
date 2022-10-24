package typings.redisJson

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisJson.distCommandsGetMod.GetOptions
import typings.redisJson.distCommandsMod.RedisJSON
import typings.redisJson.distCommandsRespMod.RESPReply
import typings.redisJson.distCommandsSetMod.NX
import typings.redisJson.distCommandsSetMod.XX
import typings.redisJson.distCommandsStrappendMod.AppendArguments
import typings.redisJson.distCommandsStrappendMod.AppendWithPathArguments
import typings.redisJson.redisJsonStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofARRAPPEND extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double
    
    def transformArguments(key: String, path: String, jsons: RedisJSON*): js.Array[String]
    
    def transformReply(): Double | js.Array[Double]
  }
  object TypeofARRAPPEND {
    
    inline def apply(
      FIRST_KEY_INDEX: /* 1 */ Double,
      transformArguments: (String, String, /* repeated */ RedisJSON) => js.Array[String],
      transformReply: () => Double | js.Array[Double]
    ): TypeofARRAPPEND = {
      val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction3(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
      __obj.asInstanceOf[TypeofARRAPPEND]
    }
    
    extension [Self <: TypeofARRAPPEND](x: Self) {
      
      inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
      
      inline def setTransformArguments(value: (String, String, /* repeated */ RedisJSON) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction3(value))
      
      inline def setTransformReply(value: () => Double | js.Array[Double]): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TypeofARRINDEX extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    val IS_READ_ONLY: /* true */ Boolean = js.native
    
    def transformArguments(key: String, path: String, json: RedisJSON): js.Array[String] = js.native
    def transformArguments(key: String, path: String, json: RedisJSON, start: Double): js.Array[String] = js.native
    def transformArguments(key: String, path: String, json: RedisJSON, start: Double, stop: Double): js.Array[String] = js.native
    def transformArguments(key: String, path: String, json: RedisJSON, start: Unit, stop: Double): js.Array[String] = js.native
    
    def transformReply(): Double | js.Array[Double] = js.native
  }
  
  trait TypeofARRINSERT extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double
    
    def transformArguments(key: String, path: String, index: Double, jsons: RedisJSON*): js.Array[String]
    
    def transformReply(): Double | js.Array[Double]
  }
  object TypeofARRINSERT {
    
    inline def apply(
      FIRST_KEY_INDEX: /* 1 */ Double,
      transformArguments: (String, String, Double, /* repeated */ RedisJSON) => js.Array[String],
      transformReply: () => Double | js.Array[Double]
    ): TypeofARRINSERT = {
      val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction4(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
      __obj.asInstanceOf[TypeofARRINSERT]
    }
    
    extension [Self <: TypeofARRINSERT](x: Self) {
      
      inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
      
      inline def setTransformArguments(value: (String, String, Double, /* repeated */ RedisJSON) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction4(value))
      
      inline def setTransformReply(value: () => Double | js.Array[Double]): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TypeofARRLEN extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    val IS_READ_ONLY: /* true */ Boolean = js.native
    
    def transformArguments(key: String): js.Array[String] = js.native
    def transformArguments(key: String, path: String): js.Array[String] = js.native
    
    def transformReply(): Double | js.Array[Double] = js.native
  }
  
  @js.native
  trait TypeofARRPOP extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    def transformArguments(key: String): js.Array[String] = js.native
    def transformArguments(key: String, path: String): js.Array[String] = js.native
    def transformArguments(key: String, path: String, index: Double): js.Array[String] = js.native
    def transformArguments(key: String, path: Unit, index: Double): js.Array[String] = js.native
    
    def transformReply(): Null | RedisJSON | js.Array[RedisJSON] = js.native
    def transformReply(reply: String): Null | RedisJSON | js.Array[RedisJSON] = js.native
    def transformReply(reply: js.Array[Null | String]): Null | RedisJSON | js.Array[RedisJSON] = js.native
  }
  
  trait TypeofARRTRIM extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double
    
    def transformArguments(key: String, path: String, start: Double, stop: Double): js.Array[String]
    
    def transformReply(): Double | js.Array[Double]
  }
  object TypeofARRTRIM {
    
    inline def apply(
      FIRST_KEY_INDEX: /* 1 */ Double,
      transformArguments: (String, String, Double, Double) => js.Array[String],
      transformReply: () => Double | js.Array[Double]
    ): TypeofARRTRIM = {
      val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction4(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
      __obj.asInstanceOf[TypeofARRTRIM]
    }
    
    extension [Self <: TypeofARRTRIM](x: Self) {
      
      inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
      
      inline def setTransformArguments(value: (String, String, Double, Double) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction4(value))
      
      inline def setTransformReply(value: () => Double | js.Array[Double]): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TypeofDEBUGMEMORY extends StObject {
    
    val FIRST_KEY_INDEX: /* 2 */ Double = js.native
    
    def transformArguments(key: String): js.Array[String] = js.native
    def transformArguments(key: String, path: String): js.Array[String] = js.native
    
    def transformReply(): Double = js.native
  }
  
  @js.native
  trait TypeofDEL extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    def transformArguments(key: String): js.Array[String] = js.native
    def transformArguments(key: String, path: String): js.Array[String] = js.native
    
    def transformReply(): Double = js.native
  }
  
  @js.native
  trait TypeofFORGET extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    def transformArguments(key: String): js.Array[String] = js.native
    def transformArguments(key: String, path: String): js.Array[String] = js.native
    
    def transformReply(): Double = js.native
  }
  
  @js.native
  trait TypeofGET extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    val IS_READ_ONLY: /* true */ Boolean = js.native
    
    def transformArguments(key: String): RedisCommandArguments = js.native
    def transformArguments(key: String, options: GetOptions): RedisCommandArguments = js.native
    
    def transformReply(): RedisJSON | Null = js.native
    def transformReply(json: String): RedisJSON | Null = js.native
  }
  
  trait TypeofMGET extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double
    
    def transformArguments(keys: js.Array[String], path: String): js.Array[String]
    
    def transformReply(reply: js.Array[String | Null]): js.Array[RedisJSON | Null]
  }
  object TypeofMGET {
    
    inline def apply(
      FIRST_KEY_INDEX: /* 1 */ Double,
      transformArguments: (js.Array[String], String) => js.Array[String],
      transformReply: js.Array[String | Null] => js.Array[RedisJSON | Null]
    ): TypeofMGET = {
      val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
      __obj.asInstanceOf[TypeofMGET]
    }
    
    extension [Self <: TypeofMGET](x: Self) {
      
      inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
      
      inline def setTransformArguments(value: (js.Array[String], String) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
      
      inline def setTransformReply(value: js.Array[String | Null] => js.Array[RedisJSON | Null]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
    }
  }
  
  trait TypeofNUMINCRBY extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double
    
    def transformArguments(key: String, path: String, by: Double): js.Array[String]
    
    def transformReply(reply: String): Double | js.Array[Double]
  }
  object TypeofNUMINCRBY {
    
    inline def apply(
      FIRST_KEY_INDEX: /* 1 */ Double,
      transformArguments: (String, String, Double) => js.Array[String],
      transformReply: String => Double | js.Array[Double]
    ): TypeofNUMINCRBY = {
      val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction3(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
      __obj.asInstanceOf[TypeofNUMINCRBY]
    }
    
    extension [Self <: TypeofNUMINCRBY](x: Self) {
      
      inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
      
      inline def setTransformArguments(value: (String, String, Double) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction3(value))
      
      inline def setTransformReply(value: String => Double | js.Array[Double]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
    }
  }
  
  trait TypeofNUMMULTBY extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double
    
    def transformArguments(key: String, path: String, by: Double): js.Array[String]
    
    def transformReply(reply: String): Double | js.Array[Double]
  }
  object TypeofNUMMULTBY {
    
    inline def apply(
      FIRST_KEY_INDEX: /* 1 */ Double,
      transformArguments: (String, String, Double) => js.Array[String],
      transformReply: String => Double | js.Array[Double]
    ): TypeofNUMMULTBY = {
      val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction3(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
      __obj.asInstanceOf[TypeofNUMMULTBY]
    }
    
    extension [Self <: TypeofNUMMULTBY](x: Self) {
      
      inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
      
      inline def setTransformArguments(value: (String, String, Double) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction3(value))
      
      inline def setTransformReply(value: String => Double | js.Array[Double]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofOBJKEYS extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    def transformArguments(key: String): js.Array[String] = js.native
    def transformArguments(key: String, path: String): js.Array[String] = js.native
    
    def transformReply(): (js.Array[js.Array[String] | Null | String]) | Null = js.native
  }
  
  @js.native
  trait TypeofOBJLEN extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    def transformArguments(key: String): js.Array[String] = js.native
    def transformArguments(key: String, path: String): js.Array[String] = js.native
    
    def transformReply(): Double | Null | (js.Array[Double | Null]) = js.native
  }
  
  @js.native
  trait TypeofRESP extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    def transformArguments(key: String): js.Array[String] = js.native
    def transformArguments(key: String, path: String): js.Array[String] = js.native
    
    def transformReply(): RESPReply = js.native
  }
  
  @js.native
  trait TypeofSET extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    def transformArguments(key: String, path: String, json: RedisJSON): js.Array[String] = js.native
    def transformArguments(key: String, path: String, json: RedisJSON, options: NX): js.Array[String] = js.native
    def transformArguments(key: String, path: String, json: RedisJSON, options: XX): js.Array[String] = js.native
    
    def transformReply(): OK | Null = js.native
  }
  
  @js.native
  trait TypeofSTRAPPEND extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    def transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type AppendArguments | AppendWithPathArguments is not an array type */ param0: AppendArguments
    ): js.Array[String] = js.native
    def transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type AppendArguments | AppendWithPathArguments is not an array type */ param0: AppendWithPathArguments
    ): js.Array[String] = js.native
    
    def transformReply(): Double | js.Array[Double] = js.native
  }
  
  @js.native
  trait TypeofSTRLEN extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    val IS_READ_ONLY: /* true */ Boolean = js.native
    
    def transformArguments(key: String): js.Array[String] = js.native
    def transformArguments(key: String, path: String): js.Array[String] = js.native
    
    def transformReply(): Double = js.native
  }
  
  @js.native
  trait TypeofTYPE extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    def transformArguments(key: String): js.Array[String] = js.native
    def transformArguments(key: String, path: String): js.Array[String] = js.native
    
    def transformReply(): String | Null | (js.Array[String | Null]) = js.native
  }
}
