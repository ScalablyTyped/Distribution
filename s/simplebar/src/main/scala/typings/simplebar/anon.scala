package typings.simplebar

import typings.simplebar.mod.SimpleBar
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  /* Inlined std.Pick<std.WeakMap<std.HTMLElement, simplebar.simplebar.SimpleBar>, 'get' | 'has'> */
  @js.native
  trait PickWeakMapHTMLElementSim extends js.Object {
    @JSName("get")
    var get_Original: js.Function1[/* key */ HTMLElement, js.UndefOr[SimpleBar]] = js.native
    @JSName("has")
    var has_Original: js.Function1[/* key */ HTMLElement, Boolean] = js.native
    def get(key: HTMLElement): js.UndefOr[SimpleBar] = js.native
    def has(key: HTMLElement): Boolean = js.native
  }
  
}

