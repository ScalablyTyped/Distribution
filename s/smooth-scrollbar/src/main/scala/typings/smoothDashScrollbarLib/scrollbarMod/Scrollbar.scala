package typings
package smoothDashScrollbarLib.scrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrollbar", "Scrollbar")
@js.native
class Scrollbar protected ()
  extends smoothDashScrollbarLib.interfacesScrollbarMod.Scrollbar {
  def this(containerEl: stdLib.HTMLElement) = this()
  def this(containerEl: stdLib.HTMLElement, options: stdLib.Partial[smoothDashScrollbarLib.interfacesScrollbarMod.ScrollbarOptions]) = this()
  var _listeners: js.Any = js.native
  var _momentum: js.Any = js.native
  var _observer: js.Any = js.native
  var _plugins: js.Any = js.native
  var _renderID: js.Any = js.native
  /**
       * Container bounding rect
       */
  @JSName("bounding")
  var bounding_Scrollbar: smoothDashScrollbarLib.Anon_Bottom = js.native
  /**
       * Max-allowed scrolling offsets
       */
  @JSName("limit")
  var limit_Scrollbar: smoothDashScrollbarLib.Anon_Y = js.native
  /**
       * Current scrolling offsets
       */
  @JSName("offset")
  var offset_Scrollbar: smoothDashScrollbarLib.Anon_Y = js.native
  /**
       * Options for current scrollbar instancs
       */
  @JSName("options")
  val options_Scrollbar: smoothDashScrollbarLib.optionsMod.Options = js.native
  /**
       * Parent scrollbar
       */
  @JSName("parent")
  val parent_Scrollbar: Scrollbar | scala.Null = js.native
  @JSName("track")
  val track_Scrollbar: smoothDashScrollbarLib.trackMod.TrackController = js.native
  /* private */ def _init(): js.Any = js.native
  /* private */ def _nextTick(direction: js.Any): js.Any = js.native
  /* private */ def _render(): js.Any = js.native
  /* private */ def _shouldPropagateMomentum(): js.Any = js.native
  /* private */ def _shouldPropagateMomentum(deltaX: js.Any): js.Any = js.native
  /* private */ def _shouldPropagateMomentum(deltaX: js.Any, deltaY: js.Any): js.Any = js.native
  /* private */ def _updateDebounced(): js.Any = js.native
}

