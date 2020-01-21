package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.ScrollbarOptions
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrollbar", JSImport.Namespace)
@js.native
object smoothScrollbarScrollbarMod extends js.Object {
  @js.native
  class Scrollbar protected ()
    extends typings.smoothScrollbar.scrollbarMod.Scrollbar {
    def this(containerEl: HTMLElement) = this()
    def this(containerEl: HTMLElement, options: Partial[ScrollbarOptions]) = this()
    var _init: js.Any = js.native
    var _listeners: js.Any = js.native
    var _momentum: js.Any = js.native
    var _nextTick: js.Any = js.native
    var _observer: js.Any = js.native
    var _plugins: js.Any = js.native
    var _render: js.Any = js.native
    var _renderID: js.Any = js.native
    var _shouldPropagateMomentum: js.Any = js.native
    var _updateDebounced: js.Any = js.native
  }
  
  val scrollbarMap: Map[HTMLElement, Scrollbar] = js.native
}

