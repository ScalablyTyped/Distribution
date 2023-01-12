package typings.redisSearch

import typings.redisSearch.redisSearchBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsSuggetMod {
  
  @JSImport("@redis/search/dist/commands/SUGGET", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/search/dist/commands/SUGGET", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String, prefix: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, prefix: String, options: SugGetOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): Null | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Null | js.Array[String]]
  
  trait SugGetOptions extends StObject {
    
    var FUZZY: js.UndefOr[`true`] = js.undefined
    
    var MAX: js.UndefOr[Double] = js.undefined
  }
  object SugGetOptions {
    
    inline def apply(): SugGetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SugGetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SugGetOptions] (val x: Self) extends AnyVal {
      
      inline def setFUZZY(value: `true`): Self = StObject.set(x, "FUZZY", value.asInstanceOf[js.Any])
      
      inline def setFUZZYUndefined: Self = StObject.set(x, "FUZZY", js.undefined)
      
      inline def setMAX(value: Double): Self = StObject.set(x, "MAX", value.asInstanceOf[js.Any])
      
      inline def setMAXUndefined: Self = StObject.set(x, "MAX", js.undefined)
    }
  }
}
