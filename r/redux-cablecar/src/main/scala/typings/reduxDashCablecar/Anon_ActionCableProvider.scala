package typings.reduxDashCablecar

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import typings.reduxDashCablecar.reduxDashCablecarMod.CableCar
import typings.reduxDashCablecar.reduxDashCablecarMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ActionCableProvider extends js.Object {
  def connect(store: Store[_, AnyAction], channel: String): CableCar = js.native
  def connect(store: Store[_, AnyAction], channel: String, options: Options): CableCar = js.native
  def setProvider(actionCableProvider: String): Unit = js.native
}

