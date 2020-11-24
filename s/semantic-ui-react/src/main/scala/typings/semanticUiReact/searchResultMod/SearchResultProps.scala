package typings.semanticUiReact.searchResultMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResultProps
  extends StrictSearchResultProps
     with /* key */ StringDictionary[js.Any]
object SearchResultProps {
  
  @scala.inline
  def apply(title: String): SearchResultProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultProps]
  }
}
