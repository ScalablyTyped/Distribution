package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaHeadingMod {
  
  @JSImport("react-bootstrap/lib/MediaHeading", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[MediaHeadingProps, js.Object, js.Any]
  
  @js.native
  trait MediaHeading
    extends Component[MediaHeadingProps, js.Object, js.Any]
  
  @js.native
  trait MediaHeadingProps extends HTMLProps[MediaHeading] {
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
  }
  object MediaHeadingProps {
    
    @scala.inline
    def apply(): MediaHeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaHeadingProps]
    }
    
    @scala.inline
    implicit class MediaHeadingPropsMutableBuilder[Self <: MediaHeadingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
