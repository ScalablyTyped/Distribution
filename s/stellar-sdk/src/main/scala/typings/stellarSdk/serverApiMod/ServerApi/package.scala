package typings.stellarSdk.serverApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ServerApi {
  
  type CallCollectionFunction[T /* <: typings.stellarSdk.horizonApiMod.Horizon.BaseResponse[scala.Nothing] */] = js.Function1[
    /* options */ js.UndefOr[typings.stellarSdk.serverApiMod.ServerApi.CallFunctionTemplateOptions], 
    js.Promise[typings.stellarSdk.serverApiMod.ServerApi.CollectionPage[T]]
  ]
  
  type CallFunction[T /* <: typings.stellarSdk.horizonApiMod.Horizon.BaseResponse[scala.Nothing] */] = js.Function0[js.Promise[T]]
}
