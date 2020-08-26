package typings.properLockfile.mod

import typings.retry.mod.OperationOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockOptions extends js.Object {
   // default: true
  var fs: js.UndefOr[js.Any] = js.native
   // default: (err) => throw err
  var lockfilePath: js.UndefOr[String] = js.native
   // default: graceful-fs
  var onCompromised: js.UndefOr[js.Function1[/* err */ Error, _]] = js.native
   // default: 0
  var realpath: js.UndefOr[Boolean] = js.native
   // default: stale/2
  var retries: js.UndefOr[Double | OperationOptions] = js.native
  var stale: js.UndefOr[Double] = js.native
   // default: 10000
  var update: js.UndefOr[Double] = js.native
}

object LockOptions {
  @scala.inline
  def apply(): LockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockOptions]
  }
  @scala.inline
  implicit class LockOptionsOps[Self <: LockOptions] (val x: Self) extends AnyVal {
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
    def setFs(value: js.Any): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    @scala.inline
    def setLockfilePath(value: String): Self = this.set("lockfilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockfilePath: Self = this.set("lockfilePath", js.undefined)
    @scala.inline
    def setOnCompromised(value: /* err */ Error => _): Self = this.set("onCompromised", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompromised: Self = this.set("onCompromised", js.undefined)
    @scala.inline
    def setRealpath(value: Boolean): Self = this.set("realpath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealpath: Self = this.set("realpath", js.undefined)
    @scala.inline
    def setRetries(value: Double | OperationOptions): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    @scala.inline
    def setStale(value: Double): Self = this.set("stale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
    @scala.inline
    def setUpdate(value: Double): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

