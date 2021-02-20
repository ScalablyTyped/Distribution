package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FooterDropDownSectionProps
  extends MDLHTMLAttributes
     with DOMAttributes[FooterDropDownSection] {
  
  var size: js.UndefOr[String] = js.native
  
  var title: ReactNode = js.native
}
object FooterDropDownSectionProps {
  
  @scala.inline
  def apply(): FooterDropDownSectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterDropDownSectionProps]
  }
  
  @scala.inline
  implicit class FooterDropDownSectionPropsMutableBuilder[Self <: FooterDropDownSectionProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
