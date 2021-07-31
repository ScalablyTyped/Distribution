package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listGroupMod {
  
  @JSImport("react-bootstrap/lib/ListGroup", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ListGroupProps, js.Object, js.Any]
  
  @js.native
  trait ListGroup
    extends Component[ListGroupProps, js.Object, js.Any]
  
  trait ListGroupProps
    extends StObject
       with HTMLProps[ListGroup] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    // Added since v0.30.0
    // TODO: Add more specific type
    var fill: js.UndefOr[Boolean] = js.undefined
  }
  object ListGroupProps {
    
    @scala.inline
    def apply(): ListGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGroupProps]
    }
    
    @scala.inline
    implicit class ListGroupPropsMutableBuilder[Self <: ListGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setComponentClass(value: ReactType[js.Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    }
  }
}
