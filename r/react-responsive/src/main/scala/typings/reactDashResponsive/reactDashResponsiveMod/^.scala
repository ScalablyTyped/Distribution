package typings.reactDashResponsive.reactDashResponsiveMod

import typings.reactDashResponsive.Anon_Query
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-responsive", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Context: typings.react.reactMod.Context[Partial[MediaQueryAllQueryable]] = js.native
  def toQuery(matchers: Partial[MediaQueryAllQueryable]): String = js.native
  def useMediaQuery(settings: Partial[MediaQueryAllQueryable with Anon_Query]): Boolean = js.native
  def useMediaQuery(settings: Partial[MediaQueryAllQueryable with Anon_Query], device: MediaQueryTypes): Boolean = js.native
  def useMediaQuery(
    settings: Partial[MediaQueryAllQueryable with Anon_Query],
    device: MediaQueryTypes,
    callback: js.Function1[/* matches */ Boolean, Unit]
  ): Boolean = js.native
}

