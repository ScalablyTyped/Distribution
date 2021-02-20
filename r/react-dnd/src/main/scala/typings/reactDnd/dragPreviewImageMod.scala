package typings.reactDnd

import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.reactDnd.connectorsMod.ConnectDragPreview
import typings.reactDnd.connectorsMod.ConnectableElement
import typings.reactDnd.optionsMod.DragPreviewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragPreviewImageMod {
  
  @JSImport("react-dnd/lib/common/DragPreviewImage", "DragPreviewImage")
  @js.native
  val DragPreviewImage: FC[DragPreviewImageProps] = js.native
  
  @js.native
  trait DragPreviewImageProps extends StObject {
    
    var connect: ConnectDragPreview = js.native
    
    var src: String = js.native
  }
  object DragPreviewImageProps {
    
    @scala.inline
    def apply(
      connect: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
      src: String
    ): DragPreviewImageProps = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragPreviewImageProps]
    }
    
    @scala.inline
    implicit class DragPreviewImagePropsMutableBuilder[Self <: DragPreviewImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(
        value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null
      ): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
