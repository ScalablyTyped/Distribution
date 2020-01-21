package typings.reactResponsive.mod

import typings.reactResponsive.AnonQuery
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-responsive", "useMediaQuery")
@js.native
object useMediaQuery extends js.Object {
  def apply(settings: Partial[MediaQueryAllQueryable with AnonQuery]): Boolean = js.native
  def apply(settings: Partial[MediaQueryAllQueryable with AnonQuery], device: MediaQueryMatchers): Boolean = js.native
  def apply(
    settings: Partial[MediaQueryAllQueryable with AnonQuery],
    device: MediaQueryMatchers,
    callback: js.Function1[/* matches */ Boolean, Unit]
  ): Boolean = js.native
}

