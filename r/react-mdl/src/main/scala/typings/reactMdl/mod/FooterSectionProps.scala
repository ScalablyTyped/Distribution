package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FooterSectionProps
  extends StObject
     with MDLHTMLAttributes
     with DOMAttributes[FooterSection] {
  
  var logo: js.UndefOr[ReactNode] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object FooterSectionProps {
  
  inline def apply(): FooterSectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterSectionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FooterSectionProps] (val x: Self) extends AnyVal {
    
    inline def setLogo(value: ReactNode): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
