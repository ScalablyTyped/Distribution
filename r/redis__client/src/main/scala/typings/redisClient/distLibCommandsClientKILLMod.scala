package typings.redisClient

import typings.redisClient.distLibCommandsClientKILLMod.ClientKillFilters.ADDRESS
import typings.redisClient.distLibCommandsClientKILLMod.ClientKillFilters.ID
import typings.redisClient.distLibCommandsClientKILLMod.ClientKillFilters.LOCAL_ADDRESS
import typings.redisClient.distLibCommandsClientKILLMod.ClientKillFilters.TYPE
import typings.redisClient.distLibCommandsClientKILLMod.ClientKillFilters.USER
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.master_
import typings.redisClient.redisClientStrings.normal_
import typings.redisClient.redisClientStrings.pubsub_
import typings.redisClient.redisClientStrings.replica_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClientKILLMod {
  
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
    /* "ADDR" */ val ADDRESS: typings.redisClient.distLibCommandsClientKILLMod.ClientKillFilters.ADDRESS & String = js.native
    
    @js.native
    sealed trait ID
      extends StObject
         with ClientKillFilters
    /* "ID" */ val ID: typings.redisClient.distLibCommandsClientKILLMod.ClientKillFilters.ID & String = js.native
    
    @js.native
    sealed trait LOCAL_ADDRESS
      extends StObject
         with ClientKillFilters
    /* "LADDR" */ val LOCAL_ADDRESS: typings.redisClient.distLibCommandsClientKILLMod.ClientKillFilters.LOCAL_ADDRESS & String = js.native
    
    @js.native
    sealed trait SKIP_ME
      extends StObject
         with ClientKillFilters
         with KillSkipMe
    /* "SKIPME" */ val SKIP_ME: typings.redisClient.distLibCommandsClientKILLMod.ClientKillFilters.SKIP_ME & String = js.native
    
    @js.native
    sealed trait TYPE
      extends StObject
         with ClientKillFilters
    /* "TYPE" */ val TYPE: typings.redisClient.distLibCommandsClientKILLMod.ClientKillFilters.TYPE & String = js.native
    
    @js.native
    sealed trait USER
      extends StObject
         with ClientKillFilters
    /* "USER" */ val USER: typings.redisClient.distLibCommandsClientKILLMod.ClientKillFilters.USER & String = js.native
  }
  
  inline def transformArguments(filters: js.Array[KillFilters]): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(filters.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(filters: KillFilters): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(filters.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
  
  trait KillAddress
    extends StObject
       with KillFilter[ADDRESS]
       with KillFilters {
    
    var address: /* template literal string: ${string}:${number} */ String
  }
  object KillAddress {
    
    inline def apply(address: /* template literal string: ${string}:${number} */ String, filter: ADDRESS): KillAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any])
      __obj.asInstanceOf[KillAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KillAddress] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: /* template literal string: ${string}:${number} */ String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KillFilter[?], T /* <: ClientKillFilters */] (val x: Self & KillFilter[T]) extends AnyVal {
      
      inline def setFilter(value: T): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.redisClient.distLibCommandsClientKILLMod.KillAddress
    - typings.redisClient.distLibCommandsClientKILLMod.KillLocalAddress
    - typings.redisClient.distLibCommandsClientKILLMod.KillId
    - typings.redisClient.distLibCommandsClientKILLMod.KillType
    - typings.redisClient.distLibCommandsClientKILLMod.KillUser
    - typings.redisClient.distLibCommandsClientKILLMod.KillSkipMe
  */
  trait KillFilters extends StObject
  
  trait KillId
    extends StObject
       with KillFilter[ID]
       with KillFilters {
    
    var id: Double | (/* template literal string: ${number} */ String)
  }
  object KillId {
    
    inline def apply(filter: ID, id: Double | (/* template literal string: ${number} */ String)): KillId = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[KillId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KillId] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double | (/* template literal string: ${number} */ String)): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait KillLocalAddress
    extends StObject
       with KillFilter[LOCAL_ADDRESS]
       with KillFilters {
    
    var localAddress: /* template literal string: ${string}:${number} */ String
  }
  object KillLocalAddress {
    
    inline def apply(filter: LOCAL_ADDRESS, localAddress: /* template literal string: ${string}:${number} */ String): KillLocalAddress = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[KillLocalAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KillLocalAddress] (val x: Self) extends AnyVal {
      
      inline def setLocalAddress(value: /* template literal string: ${string}:${number} */ String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.redisClient.distLibCommandsClientKILLMod.ClientKillFilters.SKIP_ME
    - typings.redisClient.anon.KillFilterSKIPMEskipMeboo
  */
  trait KillSkipMe
    extends StObject
       with KillFilters
  
  trait KillType
    extends StObject
       with KillFilter[TYPE]
       with KillFilters {
    
    var `type`: normal_ | master_ | replica_ | pubsub_
  }
  object KillType {
    
    inline def apply(filter: TYPE, `type`: normal_ | master_ | replica_ | pubsub_): KillType = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KillType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KillType] (val x: Self) extends AnyVal {
      
      inline def setType(value: normal_ | master_ | replica_ | pubsub_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KillUser] (val x: Self) extends AnyVal {
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
