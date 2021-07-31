package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpBlockMod {
  
  @JSImport("react-bootstrap/lib/HelpBlock", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[HelpBlockProps, js.Object, js.Any]
  
  @js.native
  trait HelpBlock
    extends Component[HelpBlockProps, js.Object, js.Any]
  
  trait HelpBlockProps
    extends StObject
       with HTMLProps[HelpBlock] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object HelpBlockProps {
    
    @scala.inline
    def apply(): HelpBlockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpBlockProps]
    }
    
    @scala.inline
    implicit class HelpBlockPropsMutableBuilder[Self <: HelpBlockProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
