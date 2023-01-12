package typings.semanticUiReact.distCommonjsGenericMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrictHtmlIframeProps extends StObject {
  
  var src: js.UndefOr[String] = js.undefined
}
object StrictHtmlIframeProps {
  
  inline def apply(): StrictHtmlIframeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictHtmlIframeProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StrictHtmlIframeProps] (val x: Self) extends AnyVal {
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
