package typings.soundmanager2.soundmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMSound extends js.Object {
  
  // Dynamic Properties
  var buffered: js.Array[js.Object] = js.native
  
  var bytesLoaded: Double | Null = js.native
  
  var bytesTotal: Double | Null = js.native
  
  var connected: Boolean = js.native
  
  // Methods
  def destruct(): Unit = js.native
  
  var duration: Double | Null = js.native
  
  var durationEstimate: Double | Null = js.native
  
  // Parameters, instance options.
  var id: String = js.native
  
  var isBuffering: Boolean = js.native
  
  var isHTML5: Boolean = js.native
  
  def load(options: js.Object): SMSound = js.native
  
  var loaded: Boolean = js.native
  
  def mute(): SMSound = js.native
  
  var muted: Boolean = js.native
  
  // clearOnPosition(): void;
  def onPosition(mescOffest: Double, callback: js.Object, has: js.Any): SMSound = js.native
  
  // Events
  var onbufferchange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onconnect: js.UndefOr[js.Function0[Unit]] = js.native
  
  var ondataerror: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onerror: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onfinish: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onid3: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onload: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onpause: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onplay: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onresume: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onstop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onsuspend: js.UndefOr[js.Function0[Unit]] = js.native
  
  var pan: Double = js.native
  
  def pause(): SMSound = js.native
  
  var paused: Boolean = js.native
  
  var peekData: PeekData = js.native
  
  def play(): SMSound = js.native
  def play(id: js.UndefOr[scala.Nothing], options: DefaultOptions): SMSound = js.native
  def play(id: String): SMSound = js.native
  def play(id: String, options: DefaultOptions): SMSound = js.native
  
  var playState: Double = js.native
  
  var position: Double = js.native
  
  var readyState: Double = js.native
  
  def resume(): SMSound = js.native
  
  def setPan(volume: Double): SMSound = js.native
  
  def setPosition(msecOffset: Double): SMSound = js.native
  
  def setVolume(volume: Double): SMSound = js.native
  
  def stop(): SMSound = js.native
  
  def toggleMute(): SMSound = js.native
  
  def togglePause(): SMSound = js.native
  
  def unload(): SMSound = js.native
  
  def unmute(): SMSound = js.native
  
  var url: String = js.native
  
  var volume: Double = js.native
  
  var whileloading: js.UndefOr[js.Function0[Unit]] = js.native
  
  var whileplaying: js.UndefOr[js.Function0[Unit]] = js.native
}
