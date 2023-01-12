package typings.redisBloom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait COUNT_ extends StObject {
  
  var ADD: FIRSTKEYINDEX
  
  var COUNT: ISREADONLYTransformArgumentsTransformReply
  
  var INCRBY: TransformArgumentsTransformReply
  
  var INFO: TransformArguments
  
  var LIST: TypeofimportedLIST
  
  var LIST_WITHCOUNT: TypeofimportedLISTWITHC
  
  var QUERY: FIRSTKEYINDEXISREADONLYTransformArguments
  
  var RESERVE: FIRSTKEYINDEXISREADONLY
  
  var add: FIRSTKEYINDEX
  
  var count: ISREADONLYTransformArgumentsTransformReply
  
  var incrBy: TransformArgumentsTransformReply
  
  var info: TransformArguments
  
  var list: TypeofimportedLIST
  
  var listWithCount: TypeofimportedLISTWITHC
  
  var query: FIRSTKEYINDEXISREADONLYTransformArguments
  
  var reserve: FIRSTKEYINDEXISREADONLY
}
object COUNT_ {
  
  inline def apply(
    ADD: FIRSTKEYINDEX,
    COUNT: ISREADONLYTransformArgumentsTransformReply,
    INCRBY: TransformArgumentsTransformReply,
    INFO: TransformArguments,
    LIST: TypeofimportedLIST,
    LIST_WITHCOUNT: TypeofimportedLISTWITHC,
    QUERY: FIRSTKEYINDEXISREADONLYTransformArguments,
    RESERVE: FIRSTKEYINDEXISREADONLY,
    add: FIRSTKEYINDEX,
    count: ISREADONLYTransformArgumentsTransformReply,
    incrBy: TransformArgumentsTransformReply,
    info: TransformArguments,
    list: TypeofimportedLIST,
    listWithCount: TypeofimportedLISTWITHC,
    query: FIRSTKEYINDEXISREADONLYTransformArguments,
    reserve: FIRSTKEYINDEXISREADONLY
  ): COUNT_ = {
    val __obj = js.Dynamic.literal(ADD = ADD.asInstanceOf[js.Any], COUNT = COUNT.asInstanceOf[js.Any], INCRBY = INCRBY.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], LIST = LIST.asInstanceOf[js.Any], LIST_WITHCOUNT = LIST_WITHCOUNT.asInstanceOf[js.Any], QUERY = QUERY.asInstanceOf[js.Any], RESERVE = RESERVE.asInstanceOf[js.Any], add = add.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], incrBy = incrBy.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listWithCount = listWithCount.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], reserve = reserve.asInstanceOf[js.Any])
    __obj.asInstanceOf[COUNT_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: COUNT_] (val x: Self) extends AnyVal {
    
    inline def setADD(value: FIRSTKEYINDEX): Self = StObject.set(x, "ADD", value.asInstanceOf[js.Any])
    
    inline def setCOUNT(value: ISREADONLYTransformArgumentsTransformReply): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
    
    inline def setINCRBY(value: TransformArgumentsTransformReply): Self = StObject.set(x, "INCRBY", value.asInstanceOf[js.Any])
    
    inline def setINFO(value: TransformArguments): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    
    inline def setLIST(value: TypeofimportedLIST): Self = StObject.set(x, "LIST", value.asInstanceOf[js.Any])
    
    inline def setLIST_WITHCOUNT(value: TypeofimportedLISTWITHC): Self = StObject.set(x, "LIST_WITHCOUNT", value.asInstanceOf[js.Any])
    
    inline def setListWithCount(value: TypeofimportedLISTWITHC): Self = StObject.set(x, "listWithCount", value.asInstanceOf[js.Any])
    
    inline def setQUERY(value: FIRSTKEYINDEXISREADONLYTransformArguments): Self = StObject.set(x, "QUERY", value.asInstanceOf[js.Any])
    
    inline def setRESERVE(value: FIRSTKEYINDEXISREADONLY): Self = StObject.set(x, "RESERVE", value.asInstanceOf[js.Any])
  }
}
