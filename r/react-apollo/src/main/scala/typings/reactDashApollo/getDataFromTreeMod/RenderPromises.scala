package typings.reactDashApollo.getDataFromTreeMod

import typings.apolloDashClient.apolloDashClientMod.ObservableQuery
import typings.react.reactMod.ReactNode
import typings.reactDashApollo.queryMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/getDataFromTree", "RenderPromises")
@js.native
class RenderPromises () extends js.Object {
  var lookupQueryInfo: js.Any = js.native
  var queryInfoTrie: js.Any = js.native
  var queryPromises: js.Any = js.native
  def addQueryPromise[TData, TVariables](queryInstance: default[TData, TVariables], finish: js.Function0[ReactNode]): ReactNode = js.native
  def consumeAndAwaitPromises(): js.Promise[js.Array[_]] = js.native
  def getSSRObservable[TData, TVariables](queryInstance: default[TData, TVariables]): (ObservableQuery[_, _]) | Null = js.native
  def hasPromises(): Boolean = js.native
  def registerSSRObservable[TData, TVariables](queryInstance: default[TData, TVariables], observable: ObservableQuery[_, TVariables]): Unit = js.native
}

