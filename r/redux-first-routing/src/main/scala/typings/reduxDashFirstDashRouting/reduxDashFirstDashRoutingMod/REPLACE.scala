package typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingMod

import org.scalablytyped.runtime.TopLevel
import typings.history.historyMod.LocationDescriptorObject
import typings.history.historyMod.LocationState
import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.ROUTERSlashREPLACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "REPLACE")
@js.native
object REPLACE extends TopLevel[ROUTERSlashREPLACE]

@JSImport("redux-first-routing", "replace")
@js.native
object replace extends js.Object {
  def apply(href: String): replaceAction[String] = js.native
  def apply(href: LocationDescriptorObject[LocationState]): replaceAction[LocationDescriptorObject[LocationState]] = js.native
}

