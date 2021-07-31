package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaListItemMod {
  
  @JSImport("react-bootstrap/lib/MediaListItem", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[MediaListItemProps, js.Object, js.Any]
  
  @js.native
  trait MediaListItem
    extends Component[MediaListItemProps, js.Object, js.Any]
  
  trait MediaListItemProps
    extends StObject
       with HTMLProps[MediaListItem] {
    
    var componentClass: js.UndefOr[ReactType[js.Any]] = js.undefined
  }
  object MediaListItemProps {
    
    @scala.inline
    def apply(): MediaListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaListItemProps]
    }
    
    @scala.inline
    implicit class MediaListItemPropsMutableBuilder[Self <: MediaListItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClass(value: ReactType[js.Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
