package typings.semanticUiReact.searchCategoryLayoutMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchCategoryLayoutProps
  extends StrictSearchCategoryLayoutProps
     with /* key */ StringDictionary[js.Any]

object SearchCategoryLayoutProps {
  @scala.inline
  def apply(categoryContent: ReactElement, resultsContent: ReactElement): SearchCategoryLayoutProps = {
    val __obj = js.Dynamic.literal(categoryContent = categoryContent.asInstanceOf[js.Any], resultsContent = resultsContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCategoryLayoutProps]
  }
}

