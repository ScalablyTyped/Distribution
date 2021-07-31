package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaRightMod {
  
  @JSImport("react-bootstrap/lib/MediaRight", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[MediaRightProps, js.Object, js.Any]
  
  @js.native
  trait MediaRight
    extends Component[MediaRightProps, js.Object, js.Any]
  
  trait MediaRightProps
    extends StObject
       with HTMLProps[MediaRight] {
    
    var align: js.UndefOr[String] = js.undefined
  }
  object MediaRightProps {
    
    @scala.inline
    def apply(): MediaRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaRightProps]
    }
    
    @scala.inline
    implicit class MediaRightPropsMutableBuilder[Self <: MediaRightProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}
