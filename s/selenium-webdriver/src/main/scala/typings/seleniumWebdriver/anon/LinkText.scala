package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.byMod.ByHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkText
  extends StObject
     with ByHash {
  
  var linkText: String
}
object LinkText {
  
  inline def apply(linkText: String): LinkText = {
    val __obj = js.Dynamic.literal(linkText = linkText.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkText]
  }
  
  extension [Self <: LinkText](x: Self) {
    
    inline def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
  }
}
