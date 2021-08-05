package typings.slackNode

import typings.slackNode.slackNodeStrings.icon_emoji
import typings.slackNode.slackNodeStrings.icon_url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Key extends StObject {
    
    var key: icon_url | icon_emoji
    
    var `val`: String
  }
  object Key {
    
    inline def apply(key: icon_url | icon_emoji, `val`: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: icon_url | icon_emoji): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
}
