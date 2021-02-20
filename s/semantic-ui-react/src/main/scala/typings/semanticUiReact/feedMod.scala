package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.semanticUiReact.feedFeedMod.FeedComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed", JSImport.Default)
  @js.native
  val default: FeedComponent = js.native
  
  type _To = FeedComponent
  
  /* This means you don't have to write `default`, but can instead just say `feedMod.foo` */
  override def _to: FeedComponent = default
}
