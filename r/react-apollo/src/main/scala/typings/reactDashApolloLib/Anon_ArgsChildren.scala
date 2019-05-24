package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsChildren extends js.Object {
  var children: propDashTypesLib.propDashTypesMod.Validator[js.Function1[/* repeated */ _, _]]
  var client: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var fetchPolicy: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var notifyOnNetworkStatusChange: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var onCompleted: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var onError: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var partialRefetch: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var pollInterval: propDashTypesLib.propDashTypesMod.Requireable[scala.Double]
  var query: propDashTypesLib.propDashTypesMod.Validator[js.Object]
  var returnPartialData: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var ssr: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var variables: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
}

object Anon_ArgsChildren {
  @scala.inline
  def apply(
    children: propDashTypesLib.propDashTypesMod.Validator[js.Function1[/* repeated */ _, _]],
    client: propDashTypesLib.propDashTypesMod.Requireable[js.Object],
    fetchPolicy: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    notifyOnNetworkStatusChange: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    onCompleted: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    onError: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    partialRefetch: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    pollInterval: propDashTypesLib.propDashTypesMod.Requireable[scala.Double],
    query: propDashTypesLib.propDashTypesMod.Validator[js.Object],
    returnPartialData: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    ssr: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    variables: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  ): Anon_ArgsChildren = {
    val __obj = js.Dynamic.literal(children = children, client = client, fetchPolicy = fetchPolicy, notifyOnNetworkStatusChange = notifyOnNetworkStatusChange, onCompleted = onCompleted, onError = onError, partialRefetch = partialRefetch, pollInterval = pollInterval, query = query, returnPartialData = returnPartialData, ssr = ssr, variables = variables)
  
    __obj.asInstanceOf[Anon_ArgsChildren]
  }
}

