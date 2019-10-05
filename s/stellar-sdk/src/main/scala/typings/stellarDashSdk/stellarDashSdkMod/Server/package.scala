package typings.stellarDashSdk.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Server {
  import typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseResponse

  type CallCollectionFunction[T /* <: BaseResponse[scala.Nothing] */] = js.Function1[
    /* options */ js.UndefOr[CallFunctionTemplateOptions], 
    js.Promise[CollectionRecord[T]]
  ]
  type CallFunction[T /* <: BaseResponse[scala.Nothing] */] = js.Function0[js.Promise[T]]
}
