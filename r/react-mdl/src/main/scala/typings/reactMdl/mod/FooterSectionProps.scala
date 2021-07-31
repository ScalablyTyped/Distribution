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
  
  @scala.inline
  def apply(): FooterSectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterSectionProps]
  }
  
  @scala.inline
  implicit class FooterSectionPropsMutableBuilder[Self <: FooterSectionProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogo(value: ReactNode): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
