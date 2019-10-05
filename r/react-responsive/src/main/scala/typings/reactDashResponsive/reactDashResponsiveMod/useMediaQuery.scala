package typings.reactDashResponsive.reactDashResponsiveMod

import typings.reactDashResponsive.Anon_Query
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-responsive", "useMediaQuery")
@js.native
object useMediaQuery extends js.Object {
  def apply(settings: Partial[MediaQueryAllQueryable with Anon_Query]): Boolean = js.native
  def apply(settings: Partial[MediaQueryAllQueryable with Anon_Query], device: MediaQueryTypes): Boolean = js.native
  def apply(
    settings: Partial[MediaQueryAllQueryable with Anon_Query],
    device: MediaQueryTypes,
    callback: js.Function1[/* matches */ Boolean, Unit]
  ): Boolean = js.native
}

