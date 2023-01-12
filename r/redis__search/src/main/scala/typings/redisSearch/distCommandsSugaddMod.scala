package typings.redisSearch

import typings.redisSearch.redisSearchBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsSugaddMod {
  
  @JSImport("@redis/search/dist/commands/SUGADD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(key: String, string: String, score: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], string.asInstanceOf[js.Any], score.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, string: String, score: Double, options: SugAddOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], string.asInstanceOf[js.Any], score.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
  
  trait SugAddOptions extends StObject {
    
    var INCR: js.UndefOr[`true`] = js.undefined
    
    var PAYLOAD: js.UndefOr[String] = js.undefined
  }
  object SugAddOptions {
    
    inline def apply(): SugAddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SugAddOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SugAddOptions] (val x: Self) extends AnyVal {
      
      inline def setINCR(value: `true`): Self = StObject.set(x, "INCR", value.asInstanceOf[js.Any])
      
      inline def setINCRUndefined: Self = StObject.set(x, "INCR", js.undefined)
      
      inline def setPAYLOAD(value: String): Self = StObject.set(x, "PAYLOAD", value.asInstanceOf[js.Any])
      
      inline def setPAYLOADUndefined: Self = StObject.set(x, "PAYLOAD", js.undefined)
    }
  }
}
