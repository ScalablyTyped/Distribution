package typings.soundmanager2.soundmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultOptions extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.native
  var autoPlay: js.UndefOr[Boolean] = js.native
  var from: js.UndefOr[Double | Null] = js.native
  var loops: js.UndefOr[Double] = js.native
  var multiShot: js.UndefOr[Boolean] = js.native
  var multiShotEvents: js.UndefOr[Boolean] = js.native
  var onerror: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onfinish: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onid3: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onload: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onpause: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onplay: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onposition: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onresume: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onstop: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var pan: js.UndefOr[Double] = js.native
  var playbackRate: js.UndefOr[Double] = js.native
  var position: js.UndefOr[Double | Null] = js.native
  var stream: js.UndefOr[Boolean] = js.native
  var to: js.UndefOr[Double | Null] = js.native
  var `type`: js.UndefOr[String | Null] = js.native
  var usePolicyFile: js.UndefOr[Boolean] = js.native
  var volume: js.UndefOr[Double] = js.native
  var whileloading: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var whileplaying: js.UndefOr[js.Function0[Unit] | Null] = js.native
}

object DefaultOptions {
  @scala.inline
  def apply(): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultOptions]
  }
  @scala.inline
  implicit class DefaultOptionsOps[Self <: DefaultOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoLoad(value: Boolean): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setFromNull: Self = this.set("from", null)
    @scala.inline
    def setLoops(value: Double): Self = this.set("loops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoops: Self = this.set("loops", js.undefined)
    @scala.inline
    def setMultiShot(value: Boolean): Self = this.set("multiShot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiShot: Self = this.set("multiShot", js.undefined)
    @scala.inline
    def setMultiShotEvents(value: Boolean): Self = this.set("multiShotEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiShotEvents: Self = this.set("multiShotEvents", js.undefined)
    @scala.inline
    def setOnerror(value: () => Unit): Self = this.set("onerror", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setOnerrorNull: Self = this.set("onerror", null)
    @scala.inline
    def setOnfinish(value: () => Unit): Self = this.set("onfinish", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnfinish: Self = this.set("onfinish", js.undefined)
    @scala.inline
    def setOnfinishNull: Self = this.set("onfinish", null)
    @scala.inline
    def setOnid3(value: () => Unit): Self = this.set("onid3", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnid3: Self = this.set("onid3", js.undefined)
    @scala.inline
    def setOnid3Null: Self = this.set("onid3", null)
    @scala.inline
    def setOnload(value: () => Unit): Self = this.set("onload", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    @scala.inline
    def setOnloadNull: Self = this.set("onload", null)
    @scala.inline
    def setOnpause(value: () => Unit): Self = this.set("onpause", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnpause: Self = this.set("onpause", js.undefined)
    @scala.inline
    def setOnpauseNull: Self = this.set("onpause", null)
    @scala.inline
    def setOnplay(value: () => Unit): Self = this.set("onplay", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnplay: Self = this.set("onplay", js.undefined)
    @scala.inline
    def setOnplayNull: Self = this.set("onplay", null)
    @scala.inline
    def setOnposition(value: () => Unit): Self = this.set("onposition", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnposition: Self = this.set("onposition", js.undefined)
    @scala.inline
    def setOnpositionNull: Self = this.set("onposition", null)
    @scala.inline
    def setOnresume(value: () => Unit): Self = this.set("onresume", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnresume: Self = this.set("onresume", js.undefined)
    @scala.inline
    def setOnresumeNull: Self = this.set("onresume", null)
    @scala.inline
    def setOnstop(value: () => Unit): Self = this.set("onstop", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnstop: Self = this.set("onstop", js.undefined)
    @scala.inline
    def setOnstopNull: Self = this.set("onstop", null)
    @scala.inline
    def setPan(value: Double): Self = this.set("pan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
    @scala.inline
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaybackRate: Self = this.set("playbackRate", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
    @scala.inline
    def setStream(value: Boolean): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setToNull: Self = this.set("to", null)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    @scala.inline
    def setUsePolicyFile(value: Boolean): Self = this.set("usePolicyFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePolicyFile: Self = this.set("usePolicyFile", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
    @scala.inline
    def setWhileloading(value: () => Unit): Self = this.set("whileloading", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWhileloading: Self = this.set("whileloading", js.undefined)
    @scala.inline
    def setWhileloadingNull: Self = this.set("whileloading", null)
    @scala.inline
    def setWhileplaying(value: () => Unit): Self = this.set("whileplaying", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWhileplaying: Self = this.set("whileplaying", js.undefined)
    @scala.inline
    def setWhileplayingNull: Self = this.set("whileplaying", null)
  }
  
}

