package typings
package reactDashApolloLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryContext extends js.Object {
  var client: js.UndefOr[apolloDashClientLib.apolloDashClientMod.default[js.Object]] = js.undefined
  var operations: js.UndefOr[lodashLib.lodashMod.Global.Map[java.lang.String, reactDashApolloLib.Anon_Query]] = js.undefined
  var renderPromises: js.UndefOr[reactDashApolloLib.getDataFromTreeMod.RenderPromises] = js.undefined
}

object QueryContext {
  @scala.inline
  def apply(
    client: apolloDashClientLib.apolloDashClientMod.default[js.Object] = null,
    operations: lodashLib.lodashMod.Global.Map[java.lang.String, reactDashApolloLib.Anon_Query] = null,
    renderPromises: reactDashApolloLib.getDataFromTreeMod.RenderPromises = null
  ): QueryContext = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    if (renderPromises != null) __obj.updateDynamic("renderPromises")(renderPromises)
    __obj.asInstanceOf[QueryContext]
  }
}

