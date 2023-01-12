package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsCommandLISTMod {
  
  @JSImport("@redis/client/dist/lib/commands/COMMAND_LIST", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait FilterBy extends StObject
  @JSImport("@redis/client/dist/lib/commands/COMMAND_LIST", "FilterBy")
  @js.native
  object FilterBy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FilterBy & String] = js.native
    
    @js.native
    sealed trait ACLCAT
      extends StObject
         with FilterBy
    /* "ACLCAT" */ val ACLCAT: typings.redisClient.distLibCommandsCommandLISTMod.FilterBy.ACLCAT & String = js.native
    
    @js.native
    sealed trait MODULE
      extends StObject
         with FilterBy
    /* "MODULE" */ val MODULE: typings.redisClient.distLibCommandsCommandLISTMod.FilterBy.MODULE & String = js.native
    
    @js.native
    sealed trait PATTERN
      extends StObject
         with FilterBy
    /* "PATTERN" */ val PATTERN: typings.redisClient.distLibCommandsCommandLISTMod.FilterBy.PATTERN & String = js.native
  }
  
  @JSImport("@redis/client/dist/lib/commands/COMMAND_LIST", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  inline def transformArguments(filter: Filter): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(filter.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[String]]
  
  trait Filter extends StObject {
    
    var filterBy: FilterBy
    
    var value: String
  }
  object Filter {
    
    inline def apply(filterBy: FilterBy, value: String): Filter = {
      val __obj = js.Dynamic.literal(filterBy = filterBy.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      inline def setFilterBy(value: FilterBy): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
