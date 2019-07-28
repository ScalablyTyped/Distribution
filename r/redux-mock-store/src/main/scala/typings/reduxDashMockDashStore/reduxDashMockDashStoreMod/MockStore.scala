package typings.reduxDashMockDashStore.reduxDashMockDashStoreMod

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockStore[S, A /* <: Action[_] */] extends Store[S, A] {
  def clearActions(): Unit = js.native
  def getActions(): js.Array[_] = js.native
}

