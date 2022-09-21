package typings.redisBloom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INCRBY extends StObject {
  
  var INCRBY: TransformArgumentsTransformReply
  
  var INFO: TransformArguments
  
  var INITBYDIM: TypeofimportedINITBYDIM
  
  var INITBYPROB: TypeofimportedINITBYPROB
  
  var MERGE: TypeofimportedMERGE
  
  var QUERY: FIRSTKEYINDEXISREADONLYTransformArguments
  
  var incrBy: TransformArgumentsTransformReply
  
  var info: TransformArguments
  
  var initByDim: TypeofimportedINITBYDIM
  
  var initByProb: TypeofimportedINITBYPROB
  
  var merge: TypeofimportedMERGE
  
  var query: FIRSTKEYINDEXISREADONLYTransformArguments
}
object INCRBY {
  
  inline def apply(
    INCRBY: TransformArgumentsTransformReply,
    INFO: TransformArguments,
    INITBYDIM: TypeofimportedINITBYDIM,
    INITBYPROB: TypeofimportedINITBYPROB,
    MERGE: TypeofimportedMERGE,
    QUERY: FIRSTKEYINDEXISREADONLYTransformArguments,
    incrBy: TransformArgumentsTransformReply,
    info: TransformArguments,
    initByDim: TypeofimportedINITBYDIM,
    initByProb: TypeofimportedINITBYPROB,
    merge: TypeofimportedMERGE,
    query: FIRSTKEYINDEXISREADONLYTransformArguments
  ): INCRBY = {
    val __obj = js.Dynamic.literal(INCRBY = INCRBY.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], INITBYDIM = INITBYDIM.asInstanceOf[js.Any], INITBYPROB = INITBYPROB.asInstanceOf[js.Any], MERGE = MERGE.asInstanceOf[js.Any], QUERY = QUERY.asInstanceOf[js.Any], incrBy = incrBy.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], initByDim = initByDim.asInstanceOf[js.Any], initByProb = initByProb.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[INCRBY]
  }
  
  extension [Self <: INCRBY](x: Self) {
    
    inline def setINCRBY(value: TransformArgumentsTransformReply): Self = StObject.set(x, "INCRBY", value.asInstanceOf[js.Any])
    
    inline def setINFO(value: TransformArguments): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    
    inline def setINITBYDIM(value: TypeofimportedINITBYDIM): Self = StObject.set(x, "INITBYDIM", value.asInstanceOf[js.Any])
    
    inline def setINITBYPROB(value: TypeofimportedINITBYPROB): Self = StObject.set(x, "INITBYPROB", value.asInstanceOf[js.Any])
    
    inline def setMERGE(value: TypeofimportedMERGE): Self = StObject.set(x, "MERGE", value.asInstanceOf[js.Any])
    
    inline def setQUERY(value: FIRSTKEYINDEXISREADONLYTransformArguments): Self = StObject.set(x, "QUERY", value.asInstanceOf[js.Any])
  }
}
