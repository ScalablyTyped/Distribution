package typings
package reactDashApolloLib.apolloContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloContextValue extends js.Object {
  var client: js.UndefOr[apolloDashClientLib.apolloDashClientMod.default[js.Object]] = js.undefined
  var operations: js.UndefOr[stdLib.Map[java.lang.String, reactDashApolloLib.Anon_Query]] = js.undefined
}

object ApolloContextValue {
  @scala.inline
  def apply(
    client: apolloDashClientLib.apolloDashClientMod.default[js.Object] = null,
    operations: stdLib.Map[java.lang.String, reactDashApolloLib.Anon_Query] = null
  ): ApolloContextValue = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[ApolloContextValue]
  }
}

