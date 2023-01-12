package typings.redisBloom

import typings.redisBloom.redisBloomStrings.Capacity
import typings.redisBloom.redisBloomStrings.Compression
import typings.redisBloom.redisBloomStrings.`Merged nodes`
import typings.redisBloom.redisBloomStrings.`Merged weight`
import typings.redisBloom.redisBloomStrings.`Total compressions`
import typings.redisBloom.redisBloomStrings.`Unmerged nodes`
import typings.redisBloom.redisBloomStrings.`Unmerged weight`
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsTDigestInfoMod {
  
  @JSImport("@redis/bloom/dist/commands/t-digest/INFO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/t-digest/INFO", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/bloom/dist/commands/t-digest/INFO", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: InfoRawReply): InfoReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[InfoReply]
  
  type InfoRawReply = js.Tuple14[
    Compression, 
    Double, 
    Capacity, 
    Double, 
    `Merged nodes`, 
    Double, 
    `Unmerged nodes`, 
    Double, 
    `Merged weight`, 
    String, 
    `Unmerged weight`, 
    String, 
    `Total compressions`, 
    Double
  ]
  
  trait InfoReply extends StObject {
    
    var capacity: Double
    
    var comperssion: Double
    
    var mergedNodes: Double
    
    var mergedWeight: Double
    
    var totalCompression: Double
    
    var unmergedNodes: Double
    
    var unmergedWeight: Double
  }
  object InfoReply {
    
    inline def apply(
      capacity: Double,
      comperssion: Double,
      mergedNodes: Double,
      mergedWeight: Double,
      totalCompression: Double,
      unmergedNodes: Double,
      unmergedWeight: Double
    ): InfoReply = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], comperssion = comperssion.asInstanceOf[js.Any], mergedNodes = mergedNodes.asInstanceOf[js.Any], mergedWeight = mergedWeight.asInstanceOf[js.Any], totalCompression = totalCompression.asInstanceOf[js.Any], unmergedNodes = unmergedNodes.asInstanceOf[js.Any], unmergedWeight = unmergedWeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfoReply]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InfoReply] (val x: Self) extends AnyVal {
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setComperssion(value: Double): Self = StObject.set(x, "comperssion", value.asInstanceOf[js.Any])
      
      inline def setMergedNodes(value: Double): Self = StObject.set(x, "mergedNodes", value.asInstanceOf[js.Any])
      
      inline def setMergedWeight(value: Double): Self = StObject.set(x, "mergedWeight", value.asInstanceOf[js.Any])
      
      inline def setTotalCompression(value: Double): Self = StObject.set(x, "totalCompression", value.asInstanceOf[js.Any])
      
      inline def setUnmergedNodes(value: Double): Self = StObject.set(x, "unmergedNodes", value.asInstanceOf[js.Any])
      
      inline def setUnmergedWeight(value: Double): Self = StObject.set(x, "unmergedWeight", value.asInstanceOf[js.Any])
    }
  }
}
