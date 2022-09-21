package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.semanticUiReact.advertisementAdvertisementMod.AdvertisementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object advertisementMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Advertisement", JSImport.Default)
  @js.native
  val default: FC[AdvertisementProps] = js.native
  
  type _To = FC[AdvertisementProps]
  
  /* This means you don't have to write `default`, but can instead just say `advertisementMod.foo` */
  override def _to: FC[AdvertisementProps] = default
}
