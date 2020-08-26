package typings.smoothScrollbar

import typings.smoothScrollbar.anon.Get
import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/decorators", JSImport.Namespace)
@js.native
object decoratorsMod extends js.Object {
  def boolean(proto: js.Any, key: String): Unit = js.native
  def debounce(options: js.Any*): js.Function3[/* _proto */ js.Any, /* key */ String, /* descriptor */ PropertyDescriptor, Get] = js.native
  def range(): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def range(min: js.UndefOr[scala.Nothing], max: Double): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def range(min: Double): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def range(min: Double, max: Double): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
}

