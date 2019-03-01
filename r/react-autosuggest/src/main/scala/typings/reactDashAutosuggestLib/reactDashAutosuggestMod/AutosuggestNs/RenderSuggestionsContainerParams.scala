package typings
package reactDashAutosuggestLib.reactDashAutosuggestMod.AutosuggestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderSuggestionsContainerParams extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var containerProps: reactDashAutosuggestLib.Anon_Id
  var query: java.lang.String
}

object RenderSuggestionsContainerParams {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    containerProps: reactDashAutosuggestLib.Anon_Id,
    query: java.lang.String
  ): RenderSuggestionsContainerParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("containerProps")(containerProps)
    __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[RenderSuggestionsContainerParams]
  }
}

