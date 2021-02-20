package typings.reactBootstrap

import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaBodyMod {
  
  @JSImport("react-bootstrap/lib/MediaBody", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[MediaBodyProps, js.Object, js.Any]
  
  @js.native
  trait MediaBody
    extends Component[MediaBodyProps, js.Object, js.Any]
  
  @js.native
  trait MediaBodyProps extends ClassAttributes[MediaBody] {
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
  }
  object MediaBodyProps {
    
    @scala.inline
    def apply(): MediaBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaBodyProps]
    }
    
    @scala.inline
    implicit class MediaBodyPropsMutableBuilder[Self <: MediaBodyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
