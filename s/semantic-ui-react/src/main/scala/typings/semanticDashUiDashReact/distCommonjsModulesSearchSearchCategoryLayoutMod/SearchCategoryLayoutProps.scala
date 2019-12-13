package typings.semanticDashUiDashReact.distCommonjsModulesSearchSearchCategoryLayoutMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCategoryLayoutProps
  extends StrictSearchCategoryLayoutProps
     with /* key */ StringDictionary[js.Any]

object SearchCategoryLayoutProps {
  @scala.inline
  def apply(
    categoryContent: ReactElement,
    resultsContent: ReactElement,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): SearchCategoryLayoutProps = {
    val __obj = js.Dynamic.literal(categoryContent = categoryContent.asInstanceOf[js.Any], resultsContent = resultsContent.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SearchCategoryLayoutProps]
  }
}

