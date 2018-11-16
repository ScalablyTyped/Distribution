package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "CallBuilder")
@js.native
class CallBuilder[T /* <: Record */] protected () extends js.Object {
  def this(serverUrl: java.lang.String) = this()
  def call(): stdLib.Promise[CollectionPage[T]] = js.native
  def cursor(cursor: java.lang.String): this.type = js.native
  def limit(limit: scala.Double): this.type = js.native
  @JSName("order")
  def order_asc(direction: stellarDashSdkLib.stellarDashSdkLibStrings.asc): this.type = js.native
  @JSName("order")
  def order_desc(direction: stellarDashSdkLib.stellarDashSdkLibStrings.desc): this.type = js.native
  def stream(): js.Function0[scala.Unit] = js.native
  def stream(options: stellarDashSdkLib.Anon_Onerror[T]): js.Function0[scala.Unit] = js.native
}

