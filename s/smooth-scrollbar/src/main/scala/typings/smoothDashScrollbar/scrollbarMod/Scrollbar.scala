package typings.smoothDashScrollbar.scrollbarMod

import typings.smoothDashScrollbar.Anon_Bottom
import typings.smoothDashScrollbar.Anon_X
import typings.smoothDashScrollbar.interfacesScrollbarMod.ScrollbarOptions
import typings.smoothDashScrollbar.optionsMod.Options
import typings.smoothDashScrollbar.trackMod.TrackController
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrollbar", "Scrollbar")
@js.native
class Scrollbar protected ()
  extends typings.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar {
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
  /**
    * Container bounding rect
    */
  @JSName("bounding")
  var bounding_Scrollbar: Anon_Bottom = js.native
  /**
    * Max-allowed scrolling offsets
    */
  @JSName("limit")
  var limit_Scrollbar: Anon_X = js.native
  /**
    * Current scrolling offsets
    */
  @JSName("offset")
  var offset_Scrollbar: Anon_X = js.native
  /**
    * Options for current scrollbar instancs
    */
  @JSName("options")
  val options_Scrollbar: Options = js.native
  /**
    * Parent scrollbar
    */
  @JSName("parent")
  val parent_Scrollbar: Scrollbar | Null = js.native
  @JSName("track")
  val track_Scrollbar: TrackController = js.native
}

