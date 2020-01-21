package typings.reduxFirstRouting.mod

import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "replace")
@js.native
object replace extends js.Object {
  def apply(href: String): replaceAction[String] = js.native
  def apply(href: LocationDescriptorObject[LocationState]): replaceAction[LocationDescriptorObject[LocationState]] = js.native
}

