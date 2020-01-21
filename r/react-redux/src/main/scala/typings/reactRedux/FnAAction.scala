package typings.reactRedux

import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnAAction extends js.Object {
  def apply[A /* <: Action[_] */](): Dispatch[A] = js.native
}

