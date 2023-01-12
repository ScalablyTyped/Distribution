package typings.reactAnchorLinkSmoothScroll

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-anchor-link-smooth-scroll", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AnchorLinkProps, js.Object, Any]
  
  type AnchorLink = Component[AnchorLinkProps, js.Object, Any]
  
  trait AnchorLinkProps
    extends StObject
       with HTMLProps[HTMLAnchorElement] {
    
    var offset: js.UndefOr[String | Double | js.Function0[Double]] = js.undefined
  }
  object AnchorLinkProps {
    
    inline def apply(): AnchorLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorLinkProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnchorLinkProps] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: String | Double | js.Function0[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction0(value: () => Double): Self = StObject.set(x, "offset", js.Any.fromFunction0(value))
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
}
