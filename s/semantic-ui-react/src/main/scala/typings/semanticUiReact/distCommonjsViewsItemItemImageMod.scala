package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.semanticUiReact.distCommonjsElementsImageImageMod.ImageProps
import typings.semanticUiReact.distCommonjsElementsImageImageMod.StrictImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsItemItemImageMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemImage", JSImport.Default)
  @js.native
  val default: FC[ItemImageProps] = js.native
  
  type ItemImageProps = ImageProps
  
  type StrictItemImageProps = StrictImageProps
  
  type _To = FC[ItemImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsItemItemImageMod.foo` */
  override def _to: FC[ItemImageProps] = default
}
