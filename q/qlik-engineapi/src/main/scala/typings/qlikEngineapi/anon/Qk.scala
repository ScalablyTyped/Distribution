package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.ISourceKeyRecord
import typings.qlikEngineapi.EngineAPI.ITableRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Qk extends StObject {
  
  var qk: js.Array[ISourceKeyRecord]
  
  var qtr: js.Array[ITableRecord]
}
object Qk {
  
  inline def apply(qk: js.Array[ISourceKeyRecord], qtr: js.Array[ITableRecord]): Qk = {
    val __obj = js.Dynamic.literal(qk = qk.asInstanceOf[js.Any], qtr = qtr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Qk]
  }
  
  extension [Self <: Qk](x: Self) {
    
    inline def setQk(value: js.Array[ISourceKeyRecord]): Self = StObject.set(x, "qk", value.asInstanceOf[js.Any])
    
    inline def setQkVarargs(value: ISourceKeyRecord*): Self = StObject.set(x, "qk", js.Array(value*))
    
    inline def setQtr(value: js.Array[ITableRecord]): Self = StObject.set(x, "qtr", value.asInstanceOf[js.Any])
    
    inline def setQtrVarargs(value: ITableRecord*): Self = StObject.set(x, "qtr", js.Array(value*))
  }
}
