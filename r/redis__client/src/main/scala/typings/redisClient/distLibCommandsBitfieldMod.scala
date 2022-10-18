package typings.redisClient

import typings.redisClient.redisClientStrings.GET
import typings.redisClient.redisClientStrings.INCRBY
import typings.redisClient.redisClientStrings.OVERFLOW
import typings.redisClient.redisClientStrings.SET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsBitfieldMod {
  
  @JSImport("@redis/client/dist/lib/commands/BITFIELD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/BITFIELD", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, operations: BitFieldOperations): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], operations.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): js.Array[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[Double | Null]]
  
  type BitFieldEncoding = /* template literal string: ${i|u}${number} */ String
  
  trait BitFieldGetOperation
    extends StObject
       with BitFieldOperation[GET] {
    
    var encoding: BitFieldEncoding
    
    var offset: Double | String
  }
  object BitFieldGetOperation {
    
    inline def apply(encoding: BitFieldEncoding, offset: Double | String): BitFieldGetOperation = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], operation = "GET")
      __obj.asInstanceOf[BitFieldGetOperation]
    }
    
    extension [Self <: BitFieldGetOperation](x: Self) {
      
      inline def setEncoding(value: BitFieldEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait BitFieldIncrByOperation
    extends StObject
       with BitFieldOperation[INCRBY] {
    
    var encoding: BitFieldEncoding
    
    var increment: Double
    
    var offset: Double | String
  }
  object BitFieldIncrByOperation {
    
    inline def apply(encoding: BitFieldEncoding, increment: Double, offset: Double | String): BitFieldIncrByOperation = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], operation = "INCRBY")
      __obj.asInstanceOf[BitFieldIncrByOperation]
    }
    
    extension [Self <: BitFieldIncrByOperation](x: Self) {
      
      inline def setEncoding(value: BitFieldEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait BitFieldOperation[S /* <: String */] extends StObject {
    
    var operation: S
  }
  object BitFieldOperation {
    
    inline def apply[S /* <: String */](operation: S): BitFieldOperation[S] = {
      val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitFieldOperation[S]]
    }
    
    extension [Self <: BitFieldOperation[?], S /* <: String */](x: Self & BitFieldOperation[S]) {
      
      inline def setOperation(value: S): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  type BitFieldOperations = js.Array[
    BitFieldGetOperation | BitFieldSetOperation | BitFieldIncrByOperation | BitFieldOverflowOperation
  ]
  
  trait BitFieldOverflowOperation
    extends StObject
       with BitFieldOperation[OVERFLOW] {
    
    var behavior: String
  }
  object BitFieldOverflowOperation {
    
    inline def apply(behavior: String): BitFieldOverflowOperation = {
      val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], operation = "OVERFLOW")
      __obj.asInstanceOf[BitFieldOverflowOperation]
    }
    
    extension [Self <: BitFieldOverflowOperation](x: Self) {
      
      inline def setBehavior(value: String): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    }
  }
  
  trait BitFieldSetOperation
    extends StObject
       with BitFieldOperation[SET] {
    
    var encoding: BitFieldEncoding
    
    var offset: Double | String
    
    var value: Double
  }
  object BitFieldSetOperation {
    
    inline def apply(encoding: BitFieldEncoding, offset: Double | String, value: Double): BitFieldSetOperation = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], operation = "SET", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitFieldSetOperation]
    }
    
    extension [Self <: BitFieldSetOperation](x: Self) {
      
      inline def setEncoding(value: BitFieldEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
