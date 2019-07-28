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
  def apply(children: ReactNode, containerProps: Anon_ClassName, query: String): RenderSuggestionsContainerParams = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], containerProps = containerProps, query = query)
  
    __obj.asInstanceOf[RenderSuggestionsContainerParams]
  }
}

