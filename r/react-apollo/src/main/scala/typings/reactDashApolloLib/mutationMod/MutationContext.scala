package typings
package reactDashApolloLib.mutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationContext extends js.Object {
  var client: js.UndefOr[apolloDashClientLib.apolloDashClientMod.default[js.Object]] = js.undefined
  var operations: nodeLib.Map[java.lang.String, reactDashApolloLib.Anon_Query]
}

object MutationContext {
  @scala.inline
  def apply(
    operations: nodeLib.Map[java.lang.String, reactDashApolloLib.Anon_Query],
    client: apolloDashClientLib.apolloDashClientMod.default[js.Object] = null
  ): MutationContext = {
    val __obj = js.Dynamic.literal(operations = operations)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[MutationContext]
  }
}

