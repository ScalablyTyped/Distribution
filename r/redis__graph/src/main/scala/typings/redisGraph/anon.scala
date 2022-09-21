package typings.redisGraph

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisGraph.configGETMod.ConfigItem
import typings.redisGraph.queryMod.QueryRawReply
import typings.redisGraph.queryMod.QueryReply
import typings.redisGraph.redisGraphStrings.OK
import typings.redisGraph.slowlogMod.SlowLogRawReply
import typings.redisGraph.slowlogMod.SlowLogReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Command extends StObject {
    
    var command: String
    
    var query: String
    
    var timestamp: js.Date
    
    var took: Double
  }
  object Command {
    
    inline def apply(command: String, query: String, timestamp: js.Date, took: Double): Command = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    extension [Self <: Command](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTook(value: Double): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofCONFIGGET extends StObject {
    
    val IS_READ_ONLY: /* true */ Boolean
    
    def transformArguments(configKey: String): js.Array[String]
    
    def transformReply(): ConfigItem | js.Array[ConfigItem]
  }
  object TypeofCONFIGGET {
    
    inline def apply(
      IS_READ_ONLY: /* true */ Boolean,
      transformArguments: String => js.Array[String],
      transformReply: () => ConfigItem | js.Array[ConfigItem]
    ): TypeofCONFIGGET = {
      val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
      __obj.asInstanceOf[TypeofCONFIGGET]
    }
    
    extension [Self <: TypeofCONFIGGET](x: Self) {
      
      inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
      
      inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
      
      inline def setTransformReply(value: () => ConfigItem | js.Array[ConfigItem]): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
    }
  }
  
  trait TypeofCONFIGSET extends StObject {
    
    def transformArguments(configKey: String, value: Double): js.Array[String]
    
    def transformReply(): OK
  }
  object TypeofCONFIGSET {
    
    inline def apply(transformArguments: (String, Double) => js.Array[String], transformReply: () => OK): TypeofCONFIGSET = {
      val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
      __obj.asInstanceOf[TypeofCONFIGSET]
    }
    
    extension [Self <: TypeofCONFIGSET](x: Self) {
      
      inline def setTransformArguments(value: (String, Double) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
      
      inline def setTransformReply(value: () => OK): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
    }
  }
  
  trait TypeofDELETE extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double
    
    def transformArguments(key: String): js.Array[String]
    
    def transformReply(): String
  }
  object TypeofDELETE {
    
    inline def apply(
      FIRST_KEY_INDEX: /* 1 */ Double,
      transformArguments: String => js.Array[String],
      transformReply: () => String
    ): TypeofDELETE = {
      val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
      __obj.asInstanceOf[TypeofDELETE]
    }
    
    extension [Self <: TypeofDELETE](x: Self) {
      
      inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
      
      inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
      
      inline def setTransformReply(value: () => String): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
    }
  }
  
  trait TypeofEXPLAIN extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double
    
    val IS_READ_ONLY: /* true */ Boolean
    
    def transformArguments(key: String, query: String): js.Array[String]
    
    def transfromReply(): js.Array[String]
  }
  object TypeofEXPLAIN {
    
    inline def apply(
      FIRST_KEY_INDEX: /* 1 */ Double,
      IS_READ_ONLY: /* true */ Boolean,
      transformArguments: (String, String) => js.Array[String],
      transfromReply: () => js.Array[String]
    ): TypeofEXPLAIN = {
      val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transfromReply = js.Any.fromFunction0(transfromReply))
      __obj.asInstanceOf[TypeofEXPLAIN]
    }
    
    extension [Self <: TypeofEXPLAIN](x: Self) {
      
      inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
      
      inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
      
      inline def setTransformArguments(value: (String, String) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
      
      inline def setTransfromReply(value: () => js.Array[String]): Self = StObject.set(x, "transfromReply", js.Any.fromFunction0(value))
    }
  }
  
  trait TypeofLIST extends StObject {
    
    val IS_READ_ONLY: /* true */ Boolean
    
    def transformArguments(): js.Array[String]
    
    def transformReply(): js.Array[String]
  }
  object TypeofLIST {
    
    inline def apply(
      IS_READ_ONLY: /* true */ Boolean,
      transformArguments: () => js.Array[String],
      transformReply: () => js.Array[String]
    ): TypeofLIST = {
      val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
      __obj.asInstanceOf[TypeofLIST]
    }
    
    extension [Self <: TypeofLIST](x: Self) {
      
      inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
      
      inline def setTransformArguments(value: () => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
      
      inline def setTransformReply(value: () => js.Array[String]): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
    }
  }
  
  trait TypeofPROFILE extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double
    
    val IS_READ_ONLY: /* true */ Boolean
    
    def transformArguments(key: String, query: String): js.Array[String]
    
    def transfromReply(): js.Array[String]
  }
  object TypeofPROFILE {
    
    inline def apply(
      FIRST_KEY_INDEX: /* 1 */ Double,
      IS_READ_ONLY: /* true */ Boolean,
      transformArguments: (String, String) => js.Array[String],
      transfromReply: () => js.Array[String]
    ): TypeofPROFILE = {
      val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transfromReply = js.Any.fromFunction0(transfromReply))
      __obj.asInstanceOf[TypeofPROFILE]
    }
    
    extension [Self <: TypeofPROFILE](x: Self) {
      
      inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
      
      inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
      
      inline def setTransformArguments(value: (String, String) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
      
      inline def setTransfromReply(value: () => js.Array[String]): Self = StObject.set(x, "transfromReply", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TypeofQUERY extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    def transformArguments(graph: RedisCommandArgument, query: RedisCommandArgument): RedisCommandArguments = js.native
    def transformArguments(graph: RedisCommandArgument, query: RedisCommandArgument, timeout: Double): RedisCommandArguments = js.native
    
    def transformReply(reply: QueryRawReply): QueryReply = js.native
  }
  
  @js.native
  trait TypeofQUERYRO extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double = js.native
    
    val IS_READ_ONLY: /* true */ Boolean = js.native
    
    def transformArguments(graph: RedisCommandArgument, query: RedisCommandArgument): RedisCommandArguments = js.native
    def transformArguments(graph: RedisCommandArgument, query: RedisCommandArgument, timeout: Double): RedisCommandArguments = js.native
    
    def transformReply(reply: QueryRawReply): QueryReply = js.native
  }
  
  trait TypeofSLOWLOG extends StObject {
    
    val FIRST_KEY_INDEX: /* 1 */ Double
    
    val IS_READ_ONLY: /* true */ Boolean
    
    def transformArguments(key: String): js.Array[String]
    
    def transformReply(logs: SlowLogRawReply): SlowLogReply
  }
  object TypeofSLOWLOG {
    
    inline def apply(
      FIRST_KEY_INDEX: /* 1 */ Double,
      IS_READ_ONLY: /* true */ Boolean,
      transformArguments: String => js.Array[String],
      transformReply: SlowLogRawReply => SlowLogReply
    ): TypeofSLOWLOG = {
      val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
      __obj.asInstanceOf[TypeofSLOWLOG]
    }
    
    extension [Self <: TypeofSLOWLOG](x: Self) {
      
      inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
      
      inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
      
      inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
      
      inline def setTransformReply(value: SlowLogRawReply => SlowLogReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
    }
  }
}
