package typings.semanticUiReact.genericMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrictHtmlImageProps extends StObject {
  
  var src: js.UndefOr[String] = js.undefined
}
object StrictHtmlImageProps {
  
  @scala.inline
  def apply(): StrictHtmlImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictHtmlImageProps]
  }
  
  @scala.inline
  implicit class StrictHtmlImagePropsMutableBuilder[Self <: StrictHtmlImageProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
