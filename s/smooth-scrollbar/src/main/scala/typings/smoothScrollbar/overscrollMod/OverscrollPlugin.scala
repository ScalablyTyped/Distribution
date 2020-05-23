package typings.smoothScrollbar.overscrollMod

import typings.smoothScrollbar.mod.ScrollbarPlugin
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverscrollPlugin extends ScrollbarPlugin {
  var _absorbMomentum: js.Any = js.native
  var _addAmplitude: js.Any = js.native
  var _amplitude: js.Any = js.native
  var _bounce: js.Any = js.native
  val _enabled: js.Any = js.native
  var _glow: js.Any = js.native
  val _isWheelLocked: js.Any = js.native
  var _lastEventType: js.Any = js.native
  var _lockWheel: js.Any = js.native
  var _nextAmp: js.Any = js.native
  var _position: js.Any = js.native
  var _releaseWheel: js.Any = js.native
  var _render: js.Any = js.native
  var _touching: js.Any = js.native
  var _wheelScrollBack: js.Any = js.native
  var _willOverscroll: js.Any = js.native
  @JSName("options")
  var options_OverscrollPlugin: OverscrollOptions = js.native
  def onRender(remainMomentum: Data2d): Unit = js.native
  def transformDelta(delta: Data2d, fromEvent: Event): Data2d = js.native
}

