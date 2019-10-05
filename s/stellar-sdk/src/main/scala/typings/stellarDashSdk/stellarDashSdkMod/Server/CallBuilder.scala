package typings.stellarDashSdk.stellarDashSdkMod.Server

import typings.stellarDashSdk.Anon_Error
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseResponse
import typings.stellarDashSdk.stellarDashSdkStrings.asc
import typings.stellarDashSdk.stellarDashSdkStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server.CallBuilder")
@js.native
abstract class CallBuilder[T /* <: BaseResponse[scala.Nothing] */] protected () extends js.Object {
  def this(serverUrl: String) = this()
  def call(): js.Promise[CollectionPage[T]] = js.native
  def cursor(cursor: String): this.type = js.native
  def limit(limit: String): this.type = js.native
  def limit(limit: Double): this.type = js.native
  @JSName("order")
  def order_asc(direction: asc): this.type = js.native
  @JSName("order")
  def order_desc(direction: desc): this.type = js.native
  def stream(): js.Function0[Unit] = js.native
  def stream(options: Anon_Error[T]): js.Function0[Unit] = js.native
}

