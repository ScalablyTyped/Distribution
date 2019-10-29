package typings.stellarDashSdk.libHorizonUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Horizon {
  import typings.stellarDashBase.stellarDashBaseMod.AssetType
  import typings.stellarDashBase.stellarDashBaseMod.AssetType.credit12
  import typings.stellarDashBase.stellarDashBaseMod.AssetType.credit4
  import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ErrorResponseData.InternalServerError
  import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ErrorResponseData.RateLimitExceeded
  import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ErrorResponseData.TransactionFailed
  import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.inflation

  type BalanceLine[T /* <: AssetType */] = BalanceLineNative | (BalanceLineAsset[T | credit12 | credit4])
  type ErrorResponseData = RateLimitExceeded | InternalServerError | TransactionFailed
  type InflationOperationResponse = BaseOperationResponse[
    inflation, 
    typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.inflation
  ]
  type TransactionResponseCollection = ResponseCollection[TransactionResponse]
}
