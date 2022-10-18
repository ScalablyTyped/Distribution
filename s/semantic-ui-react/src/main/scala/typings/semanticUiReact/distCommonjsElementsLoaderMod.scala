package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.semanticUiReact.distCommonjsElementsLoaderLoaderMod.LoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsLoaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Loader", JSImport.Default)
  @js.native
  val default: FC[LoaderProps] = js.native
  
  type _To = FC[LoaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsLoaderMod.foo` */
  override def _to: FC[LoaderProps] = default
}
