package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.loaderLoaderMod.LoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Loader", JSImport.Default)
  @js.native
  val default: StatelessComponent[LoaderProps] = js.native
  
  type _To = StatelessComponent[LoaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `loaderMod.foo` */
  override def _to: StatelessComponent[LoaderProps] = default
}
