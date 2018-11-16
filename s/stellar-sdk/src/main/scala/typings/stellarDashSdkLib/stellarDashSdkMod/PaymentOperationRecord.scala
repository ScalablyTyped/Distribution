package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentOperationRecord extends BaseOperationRecord {
  var amount: java.lang.String = js.native
  var asset_code: js.UndefOr[java.lang.String] = js.native
  var asset_issuer: js.UndefOr[java.lang.String] = js.native
  var asset_type: java.lang.String = js.native
  var from: java.lang.String = js.native
  @JSName("receiver")
  var receiver_Original: CallFunction[AccountRecord] = js.native
  @JSName("sender")
  var sender_Original: CallFunction[AccountRecord] = js.native
  var to: java.lang.String = js.native
  @JSName("type")
  var type_PaymentOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.payment = js.native
  def receiver(): stdLib.Promise[AccountRecord] = js.native
  def sender(): stdLib.Promise[AccountRecord] = js.native
}

