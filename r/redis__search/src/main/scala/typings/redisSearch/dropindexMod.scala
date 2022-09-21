package typings.redisSearch

import typings.redisSearch.redisSearchBooleans.`true`
import typings.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropindexMod {
  
  @JSImport("@redis/search/dist/commands/DROPINDEX", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(index: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(index: String, options: DropIndexOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
  
  trait DropIndexOptions extends StObject {
    
    var DD: js.UndefOr[`true`] = js.undefined
  }
  object DropIndexOptions {
    
    inline def apply(): DropIndexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropIndexOptions]
    }
    
    extension [Self <: DropIndexOptions](x: Self) {
      
      inline def setDD(value: `true`): Self = StObject.set(x, "DD", value.asInstanceOf[js.Any])
      
      inline def setDDUndefined: Self = StObject.set(x, "DD", js.undefined)
    }
  }
}
