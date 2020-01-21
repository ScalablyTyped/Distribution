package typings.semanticUiReact.searchCategoryLayoutMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSearchCategoryLayoutProps extends js.Object {
  /** The rendered category content */
  var categoryContent: ReactElement
  /** The rendered results content */
  var resultsContent: ReactElement
}

object StrictSearchCategoryLayoutProps {
  @scala.inline
  def apply(categoryContent: ReactElement, resultsContent: ReactElement): StrictSearchCategoryLayoutProps = {
    val __obj = js.Dynamic.literal(categoryContent = categoryContent.asInstanceOf[js.Any], resultsContent = resultsContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StrictSearchCategoryLayoutProps]
  }
}

