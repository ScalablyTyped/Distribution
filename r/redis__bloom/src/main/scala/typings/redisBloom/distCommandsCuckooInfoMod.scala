package typings.redisBloom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsCuckooInfoMod {
  
  @JSImport("@redis/bloom/dist/commands/cuckoo/INFO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/cuckoo/INFO", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/bloom/dist/commands/cuckoo/INFO", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: InfoRawReply): InfoReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[InfoReply]
  
  type InfoRawReply = js.Tuple16[
    /* _ */ String, 
    /* size */ Double, 
    /* _ */ String, 
    /* numberOfBuckets */ Double, 
    /* _ */ String, 
    /* numberOfFilters */ Double, 
    /* _ */ String, 
    /* numberOfInsertedItems */ Double, 
    /* _ */ String, 
    /* numberOfDeletedItems */ Double, 
    /* _ */ String, 
    /* bucketSize */ Double, 
    /* _ */ String, 
    /* expansionRate */ Double, 
    /* _ */ String, 
    /* maxIteration */ Double
  ]
  
  trait InfoReply extends StObject {
    
    var bucketSize: Double
    
    var expansionRate: Double
    
    var maxIteration: Double
    
    var numberOfBuckets: Double
    
    var numberOfDeletedItems: Double
    
    var numberOfFilters: Double
    
    var numberOfInsertedItems: Double
    
    var size: Double
  }
  object InfoReply {
    
    inline def apply(
      bucketSize: Double,
      expansionRate: Double,
      maxIteration: Double,
      numberOfBuckets: Double,
      numberOfDeletedItems: Double,
      numberOfFilters: Double,
      numberOfInsertedItems: Double,
      size: Double
    ): InfoReply = {
      val __obj = js.Dynamic.literal(bucketSize = bucketSize.asInstanceOf[js.Any], expansionRate = expansionRate.asInstanceOf[js.Any], maxIteration = maxIteration.asInstanceOf[js.Any], numberOfBuckets = numberOfBuckets.asInstanceOf[js.Any], numberOfDeletedItems = numberOfDeletedItems.asInstanceOf[js.Any], numberOfFilters = numberOfFilters.asInstanceOf[js.Any], numberOfInsertedItems = numberOfInsertedItems.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfoReply]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InfoReply] (val x: Self) extends AnyVal {
      
      inline def setBucketSize(value: Double): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
      
      inline def setExpansionRate(value: Double): Self = StObject.set(x, "expansionRate", value.asInstanceOf[js.Any])
      
      inline def setMaxIteration(value: Double): Self = StObject.set(x, "maxIteration", value.asInstanceOf[js.Any])
      
      inline def setNumberOfBuckets(value: Double): Self = StObject.set(x, "numberOfBuckets", value.asInstanceOf[js.Any])
      
      inline def setNumberOfDeletedItems(value: Double): Self = StObject.set(x, "numberOfDeletedItems", value.asInstanceOf[js.Any])
      
      inline def setNumberOfFilters(value: Double): Self = StObject.set(x, "numberOfFilters", value.asInstanceOf[js.Any])
      
      inline def setNumberOfInsertedItems(value: Double): Self = StObject.set(x, "numberOfInsertedItems", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
