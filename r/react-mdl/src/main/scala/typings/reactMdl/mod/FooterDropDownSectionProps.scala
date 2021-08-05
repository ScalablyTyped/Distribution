package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FooterDropDownSectionProps
  extends StObject
     with MDLHTMLAttributes
     with DOMAttributes[FooterDropDownSection] {
  
  var size: js.UndefOr[String] = js.undefined
  
  var title: ReactNode
}
object FooterDropDownSectionProps {
  
  inline def apply(): FooterDropDownSectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterDropDownSectionProps]
  }
  
  extension [Self <: FooterDropDownSectionProps](x: Self) {
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
