package typings.reactResponsive.mod

import typings.reactResponsive.anon.PartialMediaQueryAllQueryAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-responsive", "useMediaQuery")
@js.native
object useMediaQuery extends js.Object {
  def apply(settings: PartialMediaQueryAllQueryAll): Boolean = js.native
  def apply(
    settings: PartialMediaQueryAllQueryAll,
    device: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* matches */ Boolean, Unit]
  ): Boolean = js.native
  def apply(settings: PartialMediaQueryAllQueryAll, device: MediaQueryMatchers): Boolean = js.native
  def apply(
    settings: PartialMediaQueryAllQueryAll,
    device: MediaQueryMatchers,
    callback: js.Function1[/* matches */ Boolean, Unit]
  ): Boolean = js.native
}

