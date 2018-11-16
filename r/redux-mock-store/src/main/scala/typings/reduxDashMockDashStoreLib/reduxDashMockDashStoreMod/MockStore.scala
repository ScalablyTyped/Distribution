package typings
package reduxDashMockDashStoreLib.reduxDashMockDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockStore[S, A /* <: reduxLib.reduxMod.Action[_] */]
  extends reduxLib.reduxMod.Store[S, A] {
  def clearActions(): scala.Unit = js.native
  def getActions(): js.Array[_] = js.native
}

