package typings.reactDashApollo.apolloContextMod

import typings.apolloDashClient.apolloDashClientMod.default
import typings.reactDashApollo.Anon_Query
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloContextValue extends js.Object {
  var client: js.UndefOr[default[js.Object]] = js.undefined
  var operations: js.UndefOr[Map[String, Anon_Query]] = js.undefined
}

object ApolloContextValue {
  @scala.inline
  def apply(client: default[js.Object] = null, operations: Map[String, Anon_Query] = null): ApolloContextValue = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[ApolloContextValue]
  }
}

