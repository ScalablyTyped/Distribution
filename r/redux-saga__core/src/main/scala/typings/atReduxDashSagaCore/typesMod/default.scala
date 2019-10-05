package typings.atReduxDashSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[C /* <: js.Object */](): SagaMiddleware[C] = js.native
  def apply[C /* <: js.Object */](options: SagaMiddlewareOptions[C]): SagaMiddleware[C] = js.native
}

