package typings.reactAutosuggest.mod

import typings.react.mod.ReactNode
import typings.reactAutosuggest.AnonClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderSuggestionsContainerParams extends js.Object {
  var children: ReactNode
  var containerProps: AnonClassName
  var query: String
}

object RenderSuggestionsContainerParams {
  @scala.inline
  def apply(containerProps: AnonClassName, query: String, children: ReactNode = null): RenderSuggestionsContainerParams = {
    val __obj = js.Dynamic.literal(containerProps = containerProps.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSuggestionsContainerParams]
  }
}

