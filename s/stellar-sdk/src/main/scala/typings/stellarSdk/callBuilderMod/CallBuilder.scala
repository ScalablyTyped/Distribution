package typings.stellarSdk.callBuilderMod

import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typings.stellarSdk.horizonApiMod.Horizon.FeeStatsResponse
import typings.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typings.stellarSdk.stellarSdkStrings.asc
import typings.stellarSdk.stellarSdkStrings.desc
import typings.stellarSdk.stellarSdkStrings.transactions
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/call_builder", "CallBuilder")
@js.native
class CallBuilder[T /* <: FeeStatsResponse | BaseResponse[scala.Nothing] | CollectionPage[BaseResponse[scala.Nothing]] */] protected () extends js.Object {
  def this(serverUrl: URI) = this()
  var _handleNetworkError: js.Any = js.native
  var _parseRecord: js.Any = js.native
  var _parseResponse: js.Any = js.native
  var _requestFnForLink: js.Any = js.native
  var _sendNormalRequest: js.Any = js.native
  var _toCollectionPage: js.Any = js.native
  var checkFilter: js.Any = js.native
  var filter: js.Array[js.Array[String]] = js.native
  var originalSegments: js.Array[String] = js.native
  var url: URI = js.native
  def call(): js.Promise[T] = js.native
  def cursor(cursor: String): this.type = js.native
  @JSName("join")
  def join_transactions(include: transactions): this.type = js.native
  def limit(recordsNumber: Double): this.type = js.native
  @JSName("order")
  def order_asc(direction: asc): this.type = js.native
  @JSName("order")
  def order_desc(direction: desc): this.type = js.native
  def stream(): js.Function0[Unit] = js.native
  def stream(options: EventSourceOptions[T]): js.Function0[Unit] = js.native
}

