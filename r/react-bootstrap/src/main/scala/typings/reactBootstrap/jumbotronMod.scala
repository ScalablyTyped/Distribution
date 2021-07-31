package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jumbotronMod {
  
  @JSImport("react-bootstrap/lib/Jumbotron", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[JumbotronProps, js.Object, js.Any]
  
  @js.native
  trait Jumbotron
    extends Component[JumbotronProps, js.Object, js.Any]
  
  trait JumbotronProps
    extends StObject
       with HTMLProps[Jumbotron] {
    
    var componentClass: js.UndefOr[ReactType[js.Any]] = js.undefined
  }
  object JumbotronProps {
    
    @scala.inline
    def apply(): JumbotronProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JumbotronProps]
    }
    
    @scala.inline
    implicit class JumbotronPropsMutableBuilder[Self <: JumbotronProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClass(value: ReactType[js.Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
