package typings.reduxCablecar

import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import typings.reduxCablecar.mod.CableCar
import typings.reduxCablecar.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActionCableProvider extends js.Object {
  def connect(store: Store[_, AnyAction], channel: String): CableCar = js.native
  def connect(store: Store[_, AnyAction], channel: String, options: Options): CableCar = js.native
  def setProvider(actionCableProvider: String): Unit = js.native
}

