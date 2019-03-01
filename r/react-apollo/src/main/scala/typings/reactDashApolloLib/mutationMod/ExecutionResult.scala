package typings
package reactDashApolloLib.mutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionResult[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var errors: js.UndefOr[js.Array[graphqlLib.graphqlMod.GraphQLError]] = js.undefined
  var extensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object ExecutionResult {
  @scala.inline
  def apply[T](
    data: T = null,
    errors: js.Array[graphqlLib.graphqlMod.GraphQLError] = null,
    extensions: stdLib.Record[java.lang.String, _] = null
  ): ExecutionResult[T] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[ExecutionResult[T]]
  }
}

