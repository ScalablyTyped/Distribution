package typings.redisBloom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ADD_ extends StObject {
  
  var ADD: FIRSTKEYINDEX
  
  var EXISTS: ISREADONLY
  
  var INFO: TransformArguments
  
  var INSERT: TransformReply
  
  var LOADCHUNK: FIRSTKEYINDEXTransformArguments
  
  var MADD: TypeofimportedMADD
  
  var MEXISTS: TypeofimportedMEXISTS
  
  var RESERVE: FIRSTKEYINDEXISREADONLY
  
  var SCANDUMP: ISREADONLYTransformArguments
  
  var add: FIRSTKEYINDEX
  
  var exists: ISREADONLY
  
  var info: TransformArguments
  
  var insert: TransformReply
  
  var loadChunk: FIRSTKEYINDEXTransformArguments
  
  var mAdd: TypeofimportedMADD
  
  var mExists: TypeofimportedMEXISTS
  
  var reserve: FIRSTKEYINDEXISREADONLY
  
  var scanDump: ISREADONLYTransformArguments
}
object ADD_ {
  
  inline def apply(
    ADD: FIRSTKEYINDEX,
    EXISTS: ISREADONLY,
    INFO: TransformArguments,
    INSERT: TransformReply,
    LOADCHUNK: FIRSTKEYINDEXTransformArguments,
    MADD: TypeofimportedMADD,
    MEXISTS: TypeofimportedMEXISTS,
    RESERVE: FIRSTKEYINDEXISREADONLY,
    SCANDUMP: ISREADONLYTransformArguments,
    add: FIRSTKEYINDEX,
    exists: ISREADONLY,
    info: TransformArguments,
    insert: TransformReply,
    loadChunk: FIRSTKEYINDEXTransformArguments,
    mAdd: TypeofimportedMADD,
    mExists: TypeofimportedMEXISTS,
    reserve: FIRSTKEYINDEXISREADONLY,
    scanDump: ISREADONLYTransformArguments
  ): ADD_ = {
    val __obj = js.Dynamic.literal(ADD = ADD.asInstanceOf[js.Any], EXISTS = EXISTS.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], INSERT = INSERT.asInstanceOf[js.Any], LOADCHUNK = LOADCHUNK.asInstanceOf[js.Any], MADD = MADD.asInstanceOf[js.Any], MEXISTS = MEXISTS.asInstanceOf[js.Any], RESERVE = RESERVE.asInstanceOf[js.Any], SCANDUMP = SCANDUMP.asInstanceOf[js.Any], add = add.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], insert = insert.asInstanceOf[js.Any], loadChunk = loadChunk.asInstanceOf[js.Any], mAdd = mAdd.asInstanceOf[js.Any], mExists = mExists.asInstanceOf[js.Any], reserve = reserve.asInstanceOf[js.Any], scanDump = scanDump.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADD_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ADD_] (val x: Self) extends AnyVal {
    
    inline def setADD(value: FIRSTKEYINDEX): Self = StObject.set(x, "ADD", value.asInstanceOf[js.Any])
    
    inline def setEXISTS(value: ISREADONLY): Self = StObject.set(x, "EXISTS", value.asInstanceOf[js.Any])
    
    inline def setINFO(value: TransformArguments): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    
    inline def setINSERT(value: TransformReply): Self = StObject.set(x, "INSERT", value.asInstanceOf[js.Any])
    
    inline def setLOADCHUNK(value: FIRSTKEYINDEXTransformArguments): Self = StObject.set(x, "LOADCHUNK", value.asInstanceOf[js.Any])
    
    inline def setMADD(value: TypeofimportedMADD): Self = StObject.set(x, "MADD", value.asInstanceOf[js.Any])
    
    inline def setMEXISTS(value: TypeofimportedMEXISTS): Self = StObject.set(x, "MEXISTS", value.asInstanceOf[js.Any])
    
    inline def setRESERVE(value: FIRSTKEYINDEXISREADONLY): Self = StObject.set(x, "RESERVE", value.asInstanceOf[js.Any])
    
    inline def setSCANDUMP(value: ISREADONLYTransformArguments): Self = StObject.set(x, "SCANDUMP", value.asInstanceOf[js.Any])
  }
}
