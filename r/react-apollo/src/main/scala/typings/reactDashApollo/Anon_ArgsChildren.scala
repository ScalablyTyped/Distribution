package typings.reactDashApollo

import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsChildren extends js.Object {
  var children: Validator[js.Function1[/* repeated */ _, _]]
  var client: Requireable[js.Object]
  var fetchPolicy: Requireable[String]
  var notifyOnNetworkStatusChange: Requireable[Boolean]
  var onCompleted: Requireable[js.Function1[/* repeated */ _, _]]
  var onError: Requireable[js.Function1[/* repeated */ _, _]]
  var partialRefetch: Requireable[Boolean]
  var pollInterval: Requireable[Double]
  var query: Validator[js.Object]
  var returnPartialData: Requireable[Boolean]
  var ssr: Requireable[Boolean]
  var variables: Requireable[js.Object]
}

object Anon_ArgsChildren {
  @scala.inline
  def apply(
    children: Validator[js.Function1[/* repeated */ _, _]],
    client: Requireable[js.Object],
    fetchPolicy: Requireable[String],
    notifyOnNetworkStatusChange: Requireable[Boolean],
    onCompleted: Requireable[js.Function1[/* repeated */ _, _]],
    onError: Requireable[js.Function1[/* repeated */ _, _]],
    partialRefetch: Requireable[Boolean],
    pollInterval: Requireable[Double],
    query: Validator[js.Object],
    returnPartialData: Requireable[Boolean],
    ssr: Requireable[Boolean],
    variables: Requireable[js.Object]
  ): Anon_ArgsChildren = {
    val __obj = js.Dynamic.literal(children = children, client = client, fetchPolicy = fetchPolicy, notifyOnNetworkStatusChange = notifyOnNetworkStatusChange, onCompleted = onCompleted, onError = onError, partialRefetch = partialRefetch, pollInterval = pollInterval, query = query, returnPartialData = returnPartialData, ssr = ssr, variables = variables)
  
    __obj.asInstanceOf[Anon_ArgsChildren]
  }
}

