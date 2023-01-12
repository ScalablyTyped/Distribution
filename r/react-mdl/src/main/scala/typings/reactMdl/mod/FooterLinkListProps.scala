package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FooterLinkListProps
  extends StObject
     with MDLHTMLAttributes
     with DOMAttributes[FooterLinkList] {
  
  var size: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object FooterLinkListProps {
  
  inline def apply(): FooterLinkListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterLinkListProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FooterLinkListProps] (val x: Self) extends AnyVal {
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
