package typings
package soundmanager2Lib.soundmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("soundmanager.SMSound")
@js.native
class SMSound () extends js.Object {
  // Dynamic Properties
  var buffered: js.Array[js.Object] = js.native
  var bytesLoaded: scala.Double | scala.Null = js.native
  var bytesTotal: scala.Double | scala.Null = js.native
  var connected: scala.Boolean = js.native
  var duration: scala.Double | scala.Null = js.native
  var durationEstimate: scala.Double | scala.Null = js.native
  // Parameters, instance options.
  var id: java.lang.String = js.native
  var isBuffering: scala.Boolean = js.native
  var isHTML5: scala.Boolean = js.native
  var loaded: scala.Boolean = js.native
  var muted: scala.Boolean = js.native
  // Events
  var onbufferchange: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var onconnect: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var ondataerror: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var onerror: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var onfinish: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var onid3: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var onload: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var onpause: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var onplay: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var onresume: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var onstop: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var onsuspend: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var pan: scala.Double = js.native
  var paused: scala.Boolean = js.native
  var peekData: PeekData = js.native
  var playState: scala.Double = js.native
  var position: scala.Double = js.native
  var readyState: scala.Double = js.native
  var url: java.lang.String = js.native
  var volume: scala.Double = js.native
  var whileloading: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var whileplaying: js.UndefOr[js.Function0[scala.Unit]] = js.native
  // Methods
  def destruct(): scala.Unit = js.native
  def load(options: js.Object): SMSound = js.native
  def mute(): SMSound = js.native
  // clearOnPosition(): void;
  def onPosition(mescOffest: scala.Double, callback: js.Object, has: js.Any): SMSound = js.native
  def pause(): SMSound = js.native
  def play(): SMSound = js.native
  def play(id: java.lang.String): SMSound = js.native
  def play(id: java.lang.String, options: DefaultOptions): SMSound = js.native
  def resume(): SMSound = js.native
  def setPan(volume: scala.Double): SMSound = js.native
  def setPosition(msecOffset: scala.Double): SMSound = js.native
  def setVolume(volume: scala.Double): SMSound = js.native
  def stop(): SMSound = js.native
  def toggleMute(): SMSound = js.native
  def togglePause(): SMSound = js.native
  def unload(): SMSound = js.native
  def unmute(): SMSound = js.native
}

