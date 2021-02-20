package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaLeftMod {
  
  @JSImport("react-bootstrap/lib/MediaLeft", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[MediaLeftProps, js.Object, js.Any]
  
  @js.native
  trait MediaLeft
    extends Component[MediaLeftProps, js.Object, js.Any]
  
  @js.native
  trait MediaLeftProps extends HTMLProps[MediaLeft] {
    
    var align: js.UndefOr[String] = js.native
  }
  object MediaLeftProps {
    
    @scala.inline
    def apply(): MediaLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaLeftProps]
    }
    
    @scala.inline
    implicit class MediaLeftPropsMutableBuilder[Self <: MediaLeftProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}
