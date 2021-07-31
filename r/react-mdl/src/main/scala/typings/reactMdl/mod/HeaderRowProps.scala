package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderRowProps
  extends StObject
     with HTMLProps[js.Any] {
  
  // string | JSX.Element
  var hideSpacer: js.UndefOr[Boolean] = js.undefined
  
  @JSName("title")
  var title_HeaderRowProps: js.UndefOr[js.Any] = js.undefined
}
object HeaderRowProps {
  
  @scala.inline
  def apply(): HeaderRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderRowProps]
  }
  
  @scala.inline
  implicit class HeaderRowPropsMutableBuilder[Self <: HeaderRowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideSpacer(value: Boolean): Self = StObject.set(x, "hideSpacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSpacerUndefined: Self = StObject.set(x, "hideSpacer", js.undefined)
    
    @scala.inline
    def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
