package typings.reactDashAutosuggest.reactDashAutosuggestMod

import typings.react.reactMod.ReactNode
import typings.reactDashAutosuggest.Anon_ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderSuggestionsContainerParams extends js.Object {
  var children: ReactNode
  var containerProps: Anon_ClassName
  var query: String
}

object RenderSuggestionsContainerParams {
  @scala.inline
  def apply(containerProps: Anon_ClassName, query: String, children: ReactNode = null): RenderSuggestionsContainerParams = {
    val __obj = js.Dynamic.literal(containerProps = containerProps.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSuggestionsContainerParams]
  }
}

