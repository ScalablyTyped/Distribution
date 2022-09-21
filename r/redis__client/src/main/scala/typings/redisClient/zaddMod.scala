package typings.redisClient

import typings.redisClient.genericTransformersMod.ZMember
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zaddMod {
  
  @JSImport("@redis/client/dist/lib/commands/ZADD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZADD", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: RedisCommandArgument, members: js.Array[ZMember]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, members: js.Array[ZMember], options: ZAddOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], members.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, members: ZMember): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, members: ZMember, options: ZAddOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], members.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: RedisCommandArgument): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait CH extends StObject {
    
    var CH: js.UndefOr[`true`] = js.undefined
  }
  object CH {
    
    inline def apply(): CH = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CH]
    }
    
    extension [Self <: CH](x: Self) {
      
      inline def setCH(value: `true`): Self = StObject.set(x, "CH", value.asInstanceOf[js.Any])
      
      inline def setCHUndefined: Self = StObject.set(x, "CH", js.undefined)
    }
  }
  
  trait GT extends StObject {
    
    var GT: js.UndefOr[`true`] = js.undefined
  }
  object GT {
    
    inline def apply(): GT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GT]
    }
    
    extension [Self <: GT](x: Self) {
      
      inline def setGT(value: `true`): Self = StObject.set(x, "GT", value.asInstanceOf[js.Any])
      
      inline def setGTUndefined: Self = StObject.set(x, "GT", js.undefined)
    }
  }
  
  trait INCR extends StObject {
    
    var INCR: js.UndefOr[`true`] = js.undefined
  }
  object INCR {
    
    inline def apply(): INCR = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INCR]
    }
    
    extension [Self <: INCR](x: Self) {
      
      inline def setINCR(value: `true`): Self = StObject.set(x, "INCR", value.asInstanceOf[js.Any])
      
      inline def setINCRUndefined: Self = StObject.set(x, "INCR", js.undefined)
    }
  }
  
  trait LT extends StObject {
    
    var LT: js.UndefOr[`true`] = js.undefined
  }
  object LT {
    
    inline def apply(): LT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LT]
    }
    
    extension [Self <: LT](x: Self) {
      
      inline def setLT(value: `true`): Self = StObject.set(x, "LT", value.asInstanceOf[js.Any])
      
      inline def setLTUndefined: Self = StObject.set(x, "LT", js.undefined)
    }
  }
  
  trait NX extends StObject {
    
    var NX: js.UndefOr[`true`] = js.undefined
  }
  object NX {
    
    inline def apply(): NX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NX]
    }
    
    extension [Self <: NX](x: Self) {
      
      inline def setNX(value: `true`): Self = StObject.set(x, "NX", value.asInstanceOf[js.Any])
      
      inline def setNXUndefined: Self = StObject.set(x, "NX", js.undefined)
    }
  }
  
  trait XX extends StObject {
    
    var XX: js.UndefOr[`true`] = js.undefined
  }
  object XX {
    
    inline def apply(): XX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XX]
    }
    
    extension [Self <: XX](x: Self) {
      
      inline def setXX(value: `true`): Self = StObject.set(x, "XX", value.asInstanceOf[js.Any])
      
      inline def setXXUndefined: Self = StObject.set(x, "XX", js.undefined)
    }
  }
  
  type ZAddOptions = (NX & CH & INCR) | (XX & LT & GT & CH & INCR)
}
