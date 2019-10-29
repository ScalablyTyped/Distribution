package typings.stellarDashSdk.libServerUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ServerApi {
  import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BaseResponse

  type CallCollectionFunction[T /* <: BaseResponse[scala.Nothing] */] = js.Function1[
    /* options */ js.UndefOr[CallFunctionTemplateOptions], 
    js.Promise[CollectionPage[T]]
  ]
  type CallFunction[T /* <: BaseResponse[scala.Nothing] */] = js.Function0[js.Promise[T]]
}
