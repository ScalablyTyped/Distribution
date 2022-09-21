package typings.storybookComponents.mod

import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarLinkProps
  extends StObject
     with ClassAttributes[HTMLAnchorElement]
     with AnchorHTMLAttributes[HTMLAnchorElement] {
  
  @JSName("href")
  var href_BarLinkProps: String
}
object BarLinkProps {
  
  inline def apply(href: String): BarLinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarLinkProps]
  }
  
  extension [Self <: BarLinkProps](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
  }
}
