package typings.stellarDashSdk.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Horizon {
  import typings.stellarDashBase.stellarDashBaseMod.AssetType
  import typings.stellarDashBase.stellarDashBaseMod.AssetType.credit12
  import typings.stellarDashBase.stellarDashBaseMod.AssetType.credit4
  import typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.inflation

  type BalanceLine[T /* <: AssetType */] = BalanceLineNative | (BalanceLineAsset[T | credit12 | credit4])
  type InflationOperationResponse = BaseOperationResponse[
    inflation, 
    typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.inflation
  ]
  type TransactionResponseCollection = ResponseCollection[TransactionResponse]
}
