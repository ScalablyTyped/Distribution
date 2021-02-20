package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FooterProps
  extends MDLHTMLAttributes
     with DOMAttributes[Footer] {
  
  var size: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object FooterProps {
  
  @scala.inline
  def apply(): FooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterProps]
  }
  
  @scala.inline
  implicit class FooterPropsMutableBuilder[Self <: FooterProps] (val x: Self) extends AnyVal {
    
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
