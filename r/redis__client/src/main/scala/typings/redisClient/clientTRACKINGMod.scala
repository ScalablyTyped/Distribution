package typings.redisClient

import typings.node.bufferMod.global.Buffer
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientTRACKINGMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLIENT_TRACKING", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments[M /* <: Boolean */](mode: M): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(mode.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformArguments_true[M /* <: Boolean */](mode: M, options: js.UndefOr[ClientTrackingOptions]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(mode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK | Buffer]
  
  trait BroadcastOptions extends StObject {
    
    var BCAST: js.UndefOr[Boolean] = js.undefined
    
    var PREFIX: js.UndefOr[RedisCommandArgument | js.Array[RedisCommandArgument]] = js.undefined
  }
  object BroadcastOptions {
    
    inline def apply(): BroadcastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BroadcastOptions]
    }
    
    extension [Self <: BroadcastOptions](x: Self) {
      
      inline def setBCAST(value: Boolean): Self = StObject.set(x, "BCAST", value.asInstanceOf[js.Any])
      
      inline def setBCASTUndefined: Self = StObject.set(x, "BCAST", js.undefined)
      
      inline def setPREFIX(value: RedisCommandArgument | js.Array[RedisCommandArgument]): Self = StObject.set(x, "PREFIX", value.asInstanceOf[js.Any])
      
      inline def setPREFIXUndefined: Self = StObject.set(x, "PREFIX", js.undefined)
      
      inline def setPREFIXVarargs(value: RedisCommandArgument*): Self = StObject.set(x, "PREFIX", js.Array(value*))
    }
  }
  
  type ClientTrackingOptions = (BroadcastOptions & CommonOptions) | (OptInOptions & CommonOptions) | (OptOutOptions & CommonOptions)
  
  trait CommonOptions extends StObject {
    
    var NOLOOP: js.UndefOr[Boolean] = js.undefined
    
    var REDIRECT: js.UndefOr[Double] = js.undefined
  }
  object CommonOptions {
    
    inline def apply(): CommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions]
    }
    
    extension [Self <: CommonOptions](x: Self) {
      
      inline def setNOLOOP(value: Boolean): Self = StObject.set(x, "NOLOOP", value.asInstanceOf[js.Any])
      
      inline def setNOLOOPUndefined: Self = StObject.set(x, "NOLOOP", js.undefined)
      
      inline def setREDIRECT(value: Double): Self = StObject.set(x, "REDIRECT", value.asInstanceOf[js.Any])
      
      inline def setREDIRECTUndefined: Self = StObject.set(x, "REDIRECT", js.undefined)
    }
  }
  
  trait OptInOptions extends StObject {
    
    var OPTIN: js.UndefOr[Boolean] = js.undefined
  }
  object OptInOptions {
    
    inline def apply(): OptInOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptInOptions]
    }
    
    extension [Self <: OptInOptions](x: Self) {
      
      inline def setOPTIN(value: Boolean): Self = StObject.set(x, "OPTIN", value.asInstanceOf[js.Any])
      
      inline def setOPTINUndefined: Self = StObject.set(x, "OPTIN", js.undefined)
    }
  }
  
  trait OptOutOptions extends StObject {
    
    var OPTOUT: js.UndefOr[Boolean] = js.undefined
  }
  object OptOutOptions {
    
    inline def apply(): OptOutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptOutOptions]
    }
    
    extension [Self <: OptOutOptions](x: Self) {
      
      inline def setOPTOUT(value: Boolean): Self = StObject.set(x, "OPTOUT", value.asInstanceOf[js.Any])
      
      inline def setOPTOUTUndefined: Self = StObject.set(x, "OPTOUT", js.undefined)
    }
  }
}
