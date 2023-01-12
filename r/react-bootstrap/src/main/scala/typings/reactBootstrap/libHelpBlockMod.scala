package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpBlockMod {
  
  @JSImport("react-bootstrap/lib/HelpBlock", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[HelpBlockProps, js.Object, Any]
  
  type HelpBlock = Component[HelpBlockProps, js.Object, Any]
  
  trait HelpBlockProps
    extends StObject
       with HTMLProps[HelpBlock] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object HelpBlockProps {
    
    inline def apply(): HelpBlockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpBlockProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelpBlockProps] (val x: Self) extends AnyVal {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
