package typings.reactDnd

import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.reactDnd.optionsMod.DragPreviewOptions
import typings.reactDnd.typesConnectorsMod.ConnectDragPreview
import typings.reactDnd.typesConnectorsMod.ConnectableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragPreviewImageMod {
  
  @JSImport("react-dnd/dist/core/DragPreviewImage", "DragPreviewImage")
  @js.native
  val DragPreviewImage: FC[DragPreviewImageProps] = js.native
  
  trait DragPreviewImageProps extends StObject {
    
    var connect: ConnectDragPreview
    
    var src: String
  }
  object DragPreviewImageProps {
    
    inline def apply(
      connect: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
      src: String
    ): DragPreviewImageProps = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragPreviewImageProps]
    }
    
    extension [Self <: DragPreviewImageProps](x: Self) {
      
      inline def setConnect(
        value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null
      ): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
