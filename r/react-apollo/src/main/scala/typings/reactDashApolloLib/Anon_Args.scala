package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var awaitRefetchQueries: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var children: propDashTypesLib.propDashTypesMod.Validator[js.Function1[/* repeated */ _, _]]
  var fetchPolicy: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var mutation: propDashTypesLib.propDashTypesMod.Validator[js.Object]
  var onCompleted: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var onError: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var optimisticResponse: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var refetchQueries: propDashTypesLib.propDashTypesMod.Requireable[
    (js.Function1[/* repeated */ _, _]) | (js.Array[java.lang.String | js.Object | scala.Null])
  ]
  var update: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var variables: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
}

object Anon_Args {
  @scala.inline
  def apply(
    awaitRefetchQueries: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    children: propDashTypesLib.propDashTypesMod.Validator[js.Function1[/* repeated */ _, _]],
    fetchPolicy: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    mutation: propDashTypesLib.propDashTypesMod.Validator[js.Object],
    onCompleted: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    onError: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    optimisticResponse: propDashTypesLib.propDashTypesMod.Requireable[js.Object],
    refetchQueries: propDashTypesLib.propDashTypesMod.Requireable[
      (js.Function1[/* repeated */ _, _]) | (js.Array[java.lang.String | js.Object | scala.Null])
    ],
    update: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    variables: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(awaitRefetchQueries = awaitRefetchQueries, children = children, fetchPolicy = fetchPolicy, mutation = mutation, onCompleted = onCompleted, onError = onError, optimisticResponse = optimisticResponse, refetchQueries = refetchQueries, update = update, variables = variables)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

