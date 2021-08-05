package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.byMod.ByHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialLinkText
  extends StObject
     with ByHash {
  
  var partialLinkText: String
}
object PartialLinkText {
  
  inline def apply(partialLinkText: String): PartialLinkText = {
    val __obj = js.Dynamic.literal(partialLinkText = partialLinkText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLinkText]
  }
  
  extension [Self <: PartialLinkText](x: Self) {
    
    inline def setPartialLinkText(value: String): Self = StObject.set(x, "partialLinkText", value.asInstanceOf[js.Any])
  }
}
