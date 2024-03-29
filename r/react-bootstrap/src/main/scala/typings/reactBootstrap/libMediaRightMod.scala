package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaRightMod {
  
  @JSImport("react-bootstrap/lib/MediaRight", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaRightProps, js.Object, Any]
  
  type MediaRight = Component[MediaRightProps, js.Object, Any]
  
  trait MediaRightProps
    extends StObject
       with HTMLProps[MediaRight] {
    
    var align: js.UndefOr[String] = js.undefined
  }
  object MediaRightProps {
    
    inline def apply(): MediaRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaRightProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaRightProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}
