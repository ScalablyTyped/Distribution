package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderRowProps
  extends StObject
     with HTMLProps[Any] {
  
  // string | JSX.Element
  var hideSpacer: js.UndefOr[Boolean] = js.undefined
  
  @JSName("title")
  var title_HeaderRowProps: js.UndefOr[Any] = js.undefined
}
object HeaderRowProps {
  
  inline def apply(): HeaderRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderRowProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderRowProps] (val x: Self) extends AnyVal {
    
    inline def setHideSpacer(value: Boolean): Self = StObject.set(x, "hideSpacer", value.asInstanceOf[js.Any])
    
    inline def setHideSpacerUndefined: Self = StObject.set(x, "hideSpacer", js.undefined)
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
