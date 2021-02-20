package typings.semanticUiReact.genericMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictHtmlIframeProps extends StObject {
  
  var src: js.UndefOr[String] = js.native
}
object StrictHtmlIframeProps {
  
  @scala.inline
  def apply(): StrictHtmlIframeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictHtmlIframeProps]
  }
  
  @scala.inline
  implicit class StrictHtmlIframePropsMutableBuilder[Self <: StrictHtmlIframeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
