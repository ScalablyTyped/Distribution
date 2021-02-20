package typings.stellarSdk.horizonApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Horizon {
  
  type BalanceLine[T /* <: typings.stellarBase.mod.AssetType */] = typings.stellarSdk.horizonApiMod.Horizon.BalanceLineNative | (typings.stellarSdk.horizonApiMod.Horizon.BalanceLineAsset[
    T | typings.stellarBase.mod.AssetType.credit12 | typings.stellarBase.mod.AssetType.credit4
  ])
  
  type InflationOperationResponse = typings.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse[
    typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.inflation, 
    typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.inflation
  ]
  
  type TransactionResponseCollection = typings.stellarSdk.horizonApiMod.Horizon.ResponseCollection[typings.stellarSdk.horizonApiMod.Horizon.TransactionResponse]
}
