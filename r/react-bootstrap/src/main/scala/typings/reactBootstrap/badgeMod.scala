package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod {
  
  @JSImport("react-bootstrap/lib/Badge", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[BadgeProps, js.Object, js.Any]
  
  @js.native
  trait Badge
    extends Component[BadgeProps, js.Object, js.Any]
  
  trait BadgeProps
    extends StObject
       with HTMLProps[Badge] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var pullRight: js.UndefOr[Boolean] = js.undefined
  }
  object BadgeProps {
    
    @scala.inline
    def apply(): BadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeProps]
    }
    
    @scala.inline
    implicit class BadgePropsMutableBuilder[Self <: BadgeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
    }
  }
}
