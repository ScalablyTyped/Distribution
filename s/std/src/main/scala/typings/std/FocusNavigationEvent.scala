package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusNavigationEvent extends Event {
  val navigationReason: NavigationReason = js.native
  val originHeight: Double = js.native
  val originLeft: Double = js.native
  val originTop: Double = js.native
  val originWidth: Double = js.native
  def requestFocus(): Unit = js.native
}

