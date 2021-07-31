package typings.reactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpyData extends StObject {
  
  var args: js.Array[js.Any]
  
  var method: String | Double
  
  var module: js.UndefOr[String] = js.undefined
  
  var `type`: Double
}
object SpyData {
  
  @scala.inline
  def apply(args: js.Array[js.Any], method: String | Double, `type`: Double): SpyData = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpyData]
  }
  
  @scala.inline
  implicit class SpyDataMutableBuilder[Self <: SpyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String | Double): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
