package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.byMod.ByHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagName
  extends StObject
     with ByHash {
  
  var tagName: String
}
object TagName {
  
  inline def apply(tagName: String): TagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagName]
  }
  
  extension [Self <: TagName](x: Self) {
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
