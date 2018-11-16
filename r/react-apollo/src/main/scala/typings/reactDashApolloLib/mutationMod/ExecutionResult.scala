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

