package typings.redisBloom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsBloomInfoMod {
  
  @JSImport("@redis/bloom/dist/commands/bloom/INFO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/bloom/INFO", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/bloom/dist/commands/bloom/INFO", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: InfoRawReply): InfoReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[InfoReply]
  
  type InfoRawReply = js.Tuple10[
    /* _ */ String, 
    /* capacity */ Double, 
    /* _ */ String, 
    /* size */ Double, 
    /* _ */ String, 
    /* numberOfFilters */ Double, 
    /* _ */ String, 
    /* numberOfInsertedItems */ Double, 
    /* _ */ String, 
    /* expansionRate */ Double
  ]
  
  trait InfoReply extends StObject {
    
    var capacity: Double
    
    var expansionRate: Double
    
    var numberOfFilters: Double
    
    var numberOfInsertedItems: Double
    
    var size: Double
  }
  object InfoReply {
    
    inline def apply(
      capacity: Double,
      expansionRate: Double,
      numberOfFilters: Double,
      numberOfInsertedItems: Double,
      size: Double
    ): InfoReply = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], expansionRate = expansionRate.asInstanceOf[js.Any], numberOfFilters = numberOfFilters.asInstanceOf[js.Any], numberOfInsertedItems = numberOfInsertedItems.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfoReply]
    }
    
    extension [Self <: InfoReply](x: Self) {
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setExpansionRate(value: Double): Self = StObject.set(x, "expansionRate", value.asInstanceOf[js.Any])
      
      inline def setNumberOfFilters(value: Double): Self = StObject.set(x, "numberOfFilters", value.asInstanceOf[js.Any])
      
      inline def setNumberOfInsertedItems(value: Double): Self = StObject.set(x, "numberOfInsertedItems", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
