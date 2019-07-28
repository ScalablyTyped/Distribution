package typings.reactDashApollo.mutationMod

import typings.reactDashApollo.Anon_Query
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationContext extends js.Object {
  var client: js.UndefOr[typings.apolloDashClient.apolloDashClientMod.default[js.Object]] = js.undefined
  var operations: Map[String, Anon_Query]
}

object MutationContext {
  @scala.inline
  def apply(
    operations: Map[String, Anon_Query],
    client: typings.apolloDashClient.apolloDashClientMod.default[js.Object] = null
  ): MutationContext = {
    val __obj = js.Dynamic.literal(operations = operations)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[MutationContext]
  }
}

