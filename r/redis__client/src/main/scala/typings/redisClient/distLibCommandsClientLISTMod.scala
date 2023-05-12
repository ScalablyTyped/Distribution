package typings.redisClient

import typings.redisClient.distLibCommandsClientINFOMod.ClientInfoReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.MASTER
import typings.redisClient.redisClientStrings.NORMAL
import typings.redisClient.redisClientStrings.PUBSUB
import typings.redisClient.redisClientStrings.REPLICA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClientLISTMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLIENT_LIST", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/CLIENT_LIST", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  inline def transformArguments(filter: ListFilter): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(filter.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(rawReply: String): js.Array[ClientInfoReply] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[js.Array[ClientInfoReply]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.redisClient.distLibCommandsClientLISTMod.ListFilterType
    - typings.redisClient.distLibCommandsClientLISTMod.ListFilterId
  */
  trait ListFilter extends StObject
  object ListFilter {
    
    inline def ListFilterId(ID: js.Array[RedisCommandArgument]): typings.redisClient.distLibCommandsClientLISTMod.ListFilterId = {
      val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.redisClient.distLibCommandsClientLISTMod.ListFilterId]
    }
    
    inline def ListFilterType(TYPE: NORMAL | MASTER | REPLICA | PUBSUB): typings.redisClient.distLibCommandsClientLISTMod.ListFilterType = {
      val __obj = js.Dynamic.literal(TYPE = TYPE.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.redisClient.distLibCommandsClientLISTMod.ListFilterType]
    }
  }
  
  trait ListFilterId
    extends StObject
       with ListFilter {
    
    var ID: js.Array[RedisCommandArgument]
    
    var TYPE: js.UndefOr[scala.Nothing] = js.undefined
  }
  object ListFilterId {
    
    inline def apply(ID: js.Array[RedisCommandArgument]): ListFilterId = {
      val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListFilterId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListFilterId] (val x: Self) extends AnyVal {
      
      inline def setID(value: js.Array[RedisCommandArgument]): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setIDVarargs(value: RedisCommandArgument*): Self = StObject.set(x, "ID", js.Array(value*))
    }
  }
  
  trait ListFilterType
    extends StObject
       with ListFilter {
    
    var ID: js.UndefOr[scala.Nothing] = js.undefined
    
    var TYPE: NORMAL | MASTER | REPLICA | PUBSUB
  }
  object ListFilterType {
    
    inline def apply(TYPE: NORMAL | MASTER | REPLICA | PUBSUB): ListFilterType = {
      val __obj = js.Dynamic.literal(TYPE = TYPE.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListFilterType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListFilterType] (val x: Self) extends AnyVal {
      
      inline def setTYPE(value: NORMAL | MASTER | REPLICA | PUBSUB): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
    }
  }
}
