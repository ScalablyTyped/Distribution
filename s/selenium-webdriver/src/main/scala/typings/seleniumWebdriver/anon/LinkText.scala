package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.byMod.ByHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkText extends ByHash {
  
  var linkText: String = js.native
}
object LinkText {
  
  @scala.inline
  def apply(linkText: String): LinkText = {
    val __obj = js.Dynamic.literal(linkText = linkText.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkText]
  }
  
  @scala.inline
  implicit class LinkTextMutableBuilder[Self <: LinkText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
  }
}
