package typings
package reactDashApolloLib.getDataFromTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/getDataFromTree", "RenderPromises")
@js.native
class RenderPromises () extends js.Object {
  var lookupQueryInfo: js.Any = js.native
  var queryInfoTrie: js.Any = js.native
  var queryPromises: js.Any = js.native
  def addQueryPromise[TData, TVariables](
    queryInstance: reactDashApolloLib.queryMod.default[TData, TVariables],
    finish: js.Function0[reactLib.reactMod.ReactNs.ReactNode]
  ): reactLib.reactMod.ReactNs.ReactNode = js.native
  def consumeAndAwaitPromises(): js.Promise[js.Array[_]] = js.native
  def getSSRObservable[TData, TVariables](queryInstance: reactDashApolloLib.queryMod.default[TData, TVariables]): (apolloDashClientLib.apolloDashClientMod.ObservableQuery[_, _]) | scala.Null = js.native
  def hasPromises(): scala.Boolean = js.native
  def registerSSRObservable[TData, TVariables](
    queryInstance: reactDashApolloLib.queryMod.default[TData, TVariables],
    observable: apolloDashClientLib.apolloDashClientMod.ObservableQuery[_, TVariables]
  ): scala.Unit = js.native
}

