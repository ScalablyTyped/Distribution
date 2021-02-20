package typings.qlik.mod

import typings.qlik.qlikStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyLink
  extends CustomPropertyCommon
     with CustomProperty {
  
  var component: link = js.native
  
  var url: js.UndefOr[String] = js.native
}
object CustomPropertyLink {
  
  @scala.inline
  def apply(component: link): CustomPropertyLink = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyLink]
  }
  
  @scala.inline
  implicit class CustomPropertyLinkMutableBuilder[Self <: CustomPropertyLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: link): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
