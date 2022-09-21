package typings.reactMentions

import typings.reactMentions.anon.PartialConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMentionsMod {
  
  @JSImport("react-mentions/lib/utils/getMentions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMentions(value: String, config: PartialConfig): js.Array[Mention] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMentions")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[Mention]]
  
  trait Mention extends StObject {
    
    var childIndex: Double
    
    var display: String
    
    var id: String | Double
    
    var index: Double
    
    var plainTextIndex: Double
  }
  object Mention {
    
    inline def apply(childIndex: Double, display: String, id: String | Double, index: Double, plainTextIndex: Double): Mention = {
      val __obj = js.Dynamic.literal(childIndex = childIndex.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], plainTextIndex = plainTextIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mention]
    }
    
    extension [Self <: Mention](x: Self) {
      
      inline def setChildIndex(value: Double): Self = StObject.set(x, "childIndex", value.asInstanceOf[js.Any])
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setPlainTextIndex(value: Double): Self = StObject.set(x, "plainTextIndex", value.asInstanceOf[js.Any])
    }
  }
}
