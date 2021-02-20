package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.imageImageMod.ImageProps
import typings.semanticUiReact.imageImageMod.StrictImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemImageMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemImage", JSImport.Default)
  @js.native
  val default: StatelessComponent[ItemImageProps] = js.native
  
  type ItemImageProps = ImageProps
  
  type StrictItemImageProps = StrictImageProps
  
  type _To = StatelessComponent[ItemImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `itemImageMod.foo` */
  override def _to: StatelessComponent[ItemImageProps] = default
}
