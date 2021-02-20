package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.byMod.ByHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialLinkText extends ByHash {
  
  var partialLinkText: String = js.native
}
object PartialLinkText {
  
  @scala.inline
  def apply(partialLinkText: String): PartialLinkText = {
    val __obj = js.Dynamic.literal(partialLinkText = partialLinkText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLinkText]
  }
  
  @scala.inline
  implicit class PartialLinkTextMutableBuilder[Self <: PartialLinkText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartialLinkText(value: String): Self = StObject.set(x, "partialLinkText", value.asInstanceOf[js.Any])
  }
}
