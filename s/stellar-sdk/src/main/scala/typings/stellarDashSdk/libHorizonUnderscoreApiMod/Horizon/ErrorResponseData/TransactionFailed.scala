package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ErrorResponseData

import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.TransactionFailedExtras
import typings.stellarDashSdk.stellarDashSdkNumbers.`400`
import typings.stellarDashSdk.stellarDashSdkStrings.`Transaction Failed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionFailed extends Base {
  var extras: TransactionFailedExtras
  @JSName("status")
  var status_TransactionFailed: `400`
  @JSName("title")
  var title_TransactionFailed: `Transaction Failed`
}

object TransactionFailed {
  @scala.inline
  def apply(
    details: String,
    extras: TransactionFailedExtras,
    instance: String,
    status: `400`,
    title: `Transaction Failed`,
    `type`: String
  ): TransactionFailed = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionFailed]
  }
}

