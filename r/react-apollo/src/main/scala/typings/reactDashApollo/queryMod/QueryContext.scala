package typings.reactDashApollo.queryMod

import typings.reactDashApollo.Anon_Query
import typings.reactDashApollo.getDataFromTreeMod.RenderPromises
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryContext extends js.Object {
  var client: js.UndefOr[typings.apolloDashClient.apolloDashClientMod.default[js.Object]] = js.undefined
  var operations: js.UndefOr[Map[String, Anon_Query]] = js.undefined
  var renderPromises: js.UndefOr[RenderPromises] = js.undefined
}

object QueryContext {
  @scala.inline
  def apply(
    client: typings.apolloDashClient.apolloDashClientMod.default[js.Object] = null,
    operations: Map[String, Anon_Query] = null,
    renderPromises: RenderPromises = null
  ): QueryContext = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    if (renderPromises != null) __obj.updateDynamic("renderPromises")(renderPromises)
    __obj.asInstanceOf[QueryContext]
  }
}

