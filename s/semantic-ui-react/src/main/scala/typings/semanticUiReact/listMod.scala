package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.semanticUiReact.listListMod.ListComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/List", JSImport.Default)
  @js.native
  val default: ListComponent = js.native
  
  type _To = ListComponent
  
  /* This means you don't have to write `default`, but can instead just say `listMod.foo` */
  override def _to: ListComponent = default
}
