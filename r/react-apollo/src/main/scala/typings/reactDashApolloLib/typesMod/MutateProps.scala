package typings
package reactDashApolloLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutateProps[TData, TGraphQLVariables] extends js.Object {
  @JSName("mutate")
  var mutate_Original: reactDashApolloLib.mutationMod.MutationFn[TData, TGraphQLVariables] = js.native
  def mutate(): js.Promise[
    scala.Unit | (reactDashApolloLib.mutationMod.FetchResult[TData, stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]])
  ] = js.native
  def mutate(options: reactDashApolloLib.mutationMod.MutationOptions[TData, TGraphQLVariables]): js.Promise[
    scala.Unit | (reactDashApolloLib.mutationMod.FetchResult[TData, stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]])
  ] = js.native
}

