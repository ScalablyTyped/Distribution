package typings
package reactDashAutosuggestLib.reactDashAutosuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderSuggestionsContainerParams extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var containerProps: reactDashAutosuggestLib.Anon_Id
  var query: java.lang.String
}

object RenderSuggestionsContainerParams {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    containerProps: reactDashAutosuggestLib.Anon_Id,
    query: java.lang.String
  ): RenderSuggestionsContainerParams = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], containerProps = containerProps, query = query)
  
    __obj.asInstanceOf[RenderSuggestionsContainerParams]
  }
}

