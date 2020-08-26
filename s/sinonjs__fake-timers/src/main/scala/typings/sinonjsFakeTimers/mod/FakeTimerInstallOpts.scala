package typings.sinonjsFakeTimers.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakeTimerInstallOpts extends js.Object {
  /**
    * Relevant only when using with shouldAdvanceTime: true. increment mocked time by advanceTimeDelta ms every advanceTimeDelta ms change
    * in the real system time (default: 20)
    */
  var advanceTimeDelta: js.UndefOr[Double] = js.native
  /**
    * The maximum number of timers that will be run when calling runAll() (default: 1000)
    */
  var loopLimit: js.UndefOr[Double] = js.native
  /**
    * Installs fake timers with the specified unix epoch (default: 0)
    */
  var now: js.UndefOr[Double | Date] = js.native
  /**
    * Tells @sinonjs/fake-timers to increment mocked time automatically based on the real system time shift (e.g. the mocked time will be incremented by
    * 20ms for every 20ms change in the real system time) (default: false)
    */
  var shouldAdvanceTime: js.UndefOr[Boolean] = js.native
  /**
    * Installs fake timers onto the specified target context (default: global)
    */
  var target: js.UndefOr[js.Any] = js.native
  /**
    * An array with explicit function names to hijack. When not set, @sinonjs/fake-timers will automatically fake all methods except nextTick
    * e.g., FakeTimers.install({ toFake: ["setTimeout", "nextTick"]}) will fake only setTimeout and nextTick
    */
  var toFake: js.UndefOr[js.Array[FakeMethod]] = js.native
}

object FakeTimerInstallOpts {
  @scala.inline
  def apply(): FakeTimerInstallOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FakeTimerInstallOpts]
  }
  @scala.inline
  implicit class FakeTimerInstallOptsOps[Self <: FakeTimerInstallOpts] (val x: Self) extends AnyVal {
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
    def setAdvanceTimeDelta(value: Double): Self = this.set("advanceTimeDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvanceTimeDelta: Self = this.set("advanceTimeDelta", js.undefined)
    @scala.inline
    def setLoopLimit(value: Double): Self = this.set("loopLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopLimit: Self = this.set("loopLimit", js.undefined)
    @scala.inline
    def setNow(value: Double | Date): Self = this.set("now", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    @scala.inline
    def setShouldAdvanceTime(value: Boolean): Self = this.set("shouldAdvanceTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldAdvanceTime: Self = this.set("shouldAdvanceTime", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setToFakeVarargs(value: FakeMethod*): Self = this.set("toFake", js.Array(value :_*))
    @scala.inline
    def setToFake(value: js.Array[FakeMethod]): Self = this.set("toFake", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToFake: Self = this.set("toFake", js.undefined)
  }
  
}

