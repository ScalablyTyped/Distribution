package typings.redisSearch

import typings.redisSearch.distCommandsMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsExplainMod {
  
  @JSImport("@redis/search/dist/commands/EXPLAIN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/search/dist/commands/EXPLAIN", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(index: String, query: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(index: String, query: String, options: ExplainOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
  
  trait ExplainOptions extends StObject {
    
    var DIALECT: js.UndefOr[Double] = js.undefined
    
    var PARAMS: js.UndefOr[Params] = js.undefined
  }
  object ExplainOptions {
    
    inline def apply(): ExplainOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExplainOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExplainOptions] (val x: Self) extends AnyVal {
      
      inline def setDIALECT(value: Double): Self = StObject.set(x, "DIALECT", value.asInstanceOf[js.Any])
      
      inline def setDIALECTUndefined: Self = StObject.set(x, "DIALECT", js.undefined)
      
      inline def setPARAMS(value: Params): Self = StObject.set(x, "PARAMS", value.asInstanceOf[js.Any])
      
      inline def setPARAMSUndefined: Self = StObject.set(x, "PARAMS", js.undefined)
    }
  }
}
