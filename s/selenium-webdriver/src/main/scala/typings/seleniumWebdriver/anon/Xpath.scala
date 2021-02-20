package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.byMod.ByHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xpath extends ByHash {
  
  var xpath: String = js.native
}
object Xpath {
  
  @scala.inline
  def apply(xpath: String): Xpath = {
    val __obj = js.Dynamic.literal(xpath = xpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xpath]
  }
  
  @scala.inline
  implicit class XpathMutableBuilder[Self <: Xpath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXpath(value: String): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
  }
}
