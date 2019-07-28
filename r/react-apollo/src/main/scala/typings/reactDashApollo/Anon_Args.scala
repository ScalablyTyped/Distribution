package typings.reactDashApollo

import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var awaitRefetchQueries: Requireable[Boolean]
  var children: Validator[js.Function1[/* repeated */ _, _]]
  var fetchPolicy: Requireable[String]
  var mutation: Validator[js.Object]
  var onCompleted: Requireable[js.Function1[/* repeated */ _, _]]
  var onError: Requireable[js.Function1[/* repeated */ _, _]]
  var optimisticResponse: Requireable[js.Object]
  var refetchQueries: Requireable[(js.Function1[/* repeated */ _, _]) | (js.Array[String | js.Object | Null])]
  var update: Requireable[js.Function1[/* repeated */ _, _]]
  var variables: Requireable[js.Object]
}

object Anon_Args {
  @scala.inline
  def apply(
    awaitRefetchQueries: Requireable[Boolean],
    children: Validator[js.Function1[/* repeated */ _, _]],
    fetchPolicy: Requireable[String],
    mutation: Validator[js.Object],
    onCompleted: Requireable[js.Function1[/* repeated */ _, _]],
    onError: Requireable[js.Function1[/* repeated */ _, _]],
    optimisticResponse: Requireable[js.Object],
    refetchQueries: Requireable[(js.Function1[/* repeated */ _, _]) | (js.Array[String | js.Object | Null])],
    update: Requireable[js.Function1[/* repeated */ _, _]],
    variables: Requireable[js.Object]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(awaitRefetchQueries = awaitRefetchQueries, children = children, fetchPolicy = fetchPolicy, mutation = mutation, onCompleted = onCompleted, onError = onError, optimisticResponse = optimisticResponse, refetchQueries = refetchQueries, update = update, variables = variables)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

