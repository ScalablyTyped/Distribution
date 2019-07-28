package typings.reduxDashFirstDashRouterDashRestoreDashScroll

import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Key extends js.Object {
  def read(location: Location[LocationState]): Location[LocationState] = js.native
  def read(location: Location[LocationState], key: String): Location[LocationState] = js.native
  def save(location: Location[LocationState], key: String, value: js.Any): Unit = js.native
  def save(location: Location[LocationState], key: Null, value: js.Any): Unit = js.native
  def setPrevKey(): Unit = js.native
  def setPrevKey(key: String): Unit = js.native
}

