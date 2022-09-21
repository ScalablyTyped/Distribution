package typings.redisClient

import typings.redisClient.clientKILLMod.ClientKillFilters.ADDRESS
import typings.redisClient.clientKILLMod.ClientKillFilters.ID
import typings.redisClient.clientKILLMod.ClientKillFilters.LOCAL_ADDRESS
import typings.redisClient.clientKILLMod.ClientKillFilters.TYPE
import typings.redisClient.clientKILLMod.ClientKillFilters.USER
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.$LeftcurlybracketnumberRightcurlybracket
import typings.redisClient.redisClientStrings.DollarLeftcurlybracketstringRightcurlybracketColonDollarLeftcurlybracketnumberRightcurlybracket
import typings.redisClient.redisClientStrings.master
import typings.redisClient.redisClientStrings.normal
import typings.redisClient.redisClientStrings.pubsub
import typings.redisClient.redisClientStrings.replica
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientKILLMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLIENT_KILL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ClientKillFilters extends StObject
  @JSImport("@redis/client/dist/lib/commands/CLIENT_KILL", "ClientKillFilters")
  @js.native
  object ClientKillFilters extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ClientKillFilters & String] = js.native
    
    @js.native
    sealed trait ADDRESS
      extends StObject
         with ClientKillFilters
    /* "ADDR" */ val ADDRESS: typings.redisClient.clientKILLMod.ClientKillFilters.ADDRESS & String = js.native
    
    @js.native
    sealed trait ID
      extends StObject
         with ClientKillFilters
    /* "ID" */ val ID: typings.redisClient.clientKILLMod.ClientKillFilters.ID & String = js.native
    
    @js.native
    sealed trait LOCAL_ADDRESS
      extends StObject
         with ClientKillFilters
    /* "LADDR" */ val LOCAL_ADDRESS: typings.redisClient.clientKILLMod.ClientKillFilters.LOCAL_ADDRESS & String = js.native
    
    @js.native
    sealed trait SKIP_ME
      extends StObject
         with ClientKillFilters
         with KillSkipMe
    /* "SKIPME" */ val SKIP_ME: typings.redisClient.clientKILLMod.ClientKillFilters.SKIP_ME & String = js.native
    
    @js.native
    sealed trait TYPE
      extends StObject
         with ClientKillFilters
    /* "TYPE" */ val TYPE: typings.redisClient.clientKILLMod.ClientKillFilters.TYPE & String = js.native
    
    @js.native
    sealed trait USER
      extends StObject
         with ClientKillFilters
    /* "USER" */ val USER: typings.redisClient.clientKILLMod.ClientKillFilters.USER & String = js.native
  }
  
  inline def transformArguments(filters: js.Array[KillFilters]): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(filters.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(filters: KillFilters): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(filters.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
  
  trait KillAddress
    extends StObject
       with KillFilter[ADDRESS]
       with KillFilters {
    
    var address: DollarLeftcurlybracketstringRightcurlybracketColonDollarLeftcurlybracketnumberRightcurlybracket
  }
  object KillAddress {
    
    inline def apply(filter: ADDRESS): KillAddress = {
      val __obj = js.Dynamic.literal(address = "${string}:${number}", filter = filter.asInstanceOf[js.Any])
      __obj.asInstanceOf[KillAddress]
    }
    
    extension [Self <: KillAddress](x: Self) {
      
      inline def setAddress(
        value: DollarLeftcurlybracketstringRightcurlybracketColonDollarLeftcurlybracketnumberRightcurlybracket
      ): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    }
  }
  
  trait KillFilter[T /* <: ClientKillFilters */] extends StObject {
    
    var filter: T
  }
  object KillFilter {
    
    inline def apply[T /* <: ClientKillFilters */](filter: T): KillFilter[T] = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
      __obj.asInstanceOf[KillFilter[T]]
    }
    
    extension [Self <: KillFilter[?], T /* <: ClientKillFilters */](x: Self & KillFilter[T]) {
      
      inline def setFilter(value: T): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.redisClient.clientKILLMod.KillAddress
    - typings.redisClient.clientKILLMod.KillLocalAddress
    - typings.redisClient.clientKILLMod.KillId
    - typings.redisClient.clientKILLMod.KillType
    - typings.redisClient.clientKILLMod.KillUser
    - typings.redisClient.clientKILLMod.KillSkipMe
  */
  trait KillFilters extends StObject
  
  trait KillId
    extends StObject
       with KillFilter[ID]
       with KillFilters {
    
    var id: Double | $LeftcurlybracketnumberRightcurlybracket
  }
  object KillId {
    
    inline def apply(filter: ID, id: Double | $LeftcurlybracketnumberRightcurlybracket): KillId = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[KillId]
    }
    
    extension [Self <: KillId](x: Self) {
      
      inline def setId(value: Double | $LeftcurlybracketnumberRightcurlybracket): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait KillLocalAddress
    extends StObject
       with KillFilter[LOCAL_ADDRESS]
       with KillFilters {
    
    var localAddress: DollarLeftcurlybracketstringRightcurlybracketColonDollarLeftcurlybracketnumberRightcurlybracket
  }
  object KillLocalAddress {
    
    inline def apply(filter: LOCAL_ADDRESS): KillLocalAddress = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], localAddress = "${string}:${number}")
      __obj.asInstanceOf[KillLocalAddress]
    }
    
    extension [Self <: KillLocalAddress](x: Self) {
      
      inline def setLocalAddress(
        value: DollarLeftcurlybracketstringRightcurlybracketColonDollarLeftcurlybracketnumberRightcurlybracket
      ): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.redisClient.clientKILLMod.ClientKillFilters.SKIP_ME
    - typings.redisClient.anon.KillFilterSKIPMEskipMeboo
  */
  trait KillSkipMe
    extends StObject
       with KillFilters
  
  trait KillType
    extends StObject
       with KillFilter[TYPE]
       with KillFilters {
    
    var `type`: normal | master | replica | pubsub
  }
  object KillType {
    
    inline def apply(filter: TYPE, `type`: normal | master | replica | pubsub): KillType = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KillType]
    }
    
    extension [Self <: KillType](x: Self) {
      
      inline def setType(value: normal | master | replica | pubsub): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait KillUser
    extends StObject
       with KillFilter[USER]
       with KillFilters {
    
    var username: String
  }
  object KillUser {
    
    inline def apply(filter: USER, username: String): KillUser = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[KillUser]
    }
    
    extension [Self <: KillUser](x: Self) {
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
