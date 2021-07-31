package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.semanticUiReact.placeholderPlaceholderMod.PlaceholderComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder", JSImport.Default)
  @js.native
  val default: PlaceholderComponent = js.native
  
  type _To = PlaceholderComponent
  
  /* This means you don't have to write `default`, but can instead just say `placeholderMod.foo` */
  override def _to: PlaceholderComponent = default
}
