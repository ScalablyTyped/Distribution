package typings.recluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BalancerOptions extends js.Object {
  /** arguments to pass to the worker (default: []) */
  var args: js.UndefOr[js.Array[String]] = js.native
  /** max time between respawns when workers die */
  var backoff: js.UndefOr[Double] = js.native
  /** what to log to stdout (default: {respawns: true}) */
  var log: js.UndefOr[LogOptions] = js.native
  /** logger to use, needs `log` method (default: console) */
  var logger: js.UndefOr[Logger] = js.native
  /** when does the worker become ready? 'listening' or 'started' */
  var readyWhen: js.UndefOr[String] = js.native
  /** min time between respawns when workers die */
  var respawn: js.UndefOr[Double] = js.native
  /** kill timeout for old workers after reload (sec) */
  var timeout: js.UndefOr[Double] = js.native
  /** number of active workers */
  var workers: js.UndefOr[Double] = js.native
}

object BalancerOptions {
  @scala.inline
  def apply(): BalancerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BalancerOptions]
  }
  @scala.inline
  implicit class BalancerOptionsOps[Self <: BalancerOptions] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setBackoff(value: Double): Self = this.set("backoff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackoff: Self = this.set("backoff", js.undefined)
    @scala.inline
    def setLog(value: LogOptions): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setReadyWhen(value: String): Self = this.set("readyWhen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadyWhen: Self = this.set("readyWhen", js.undefined)
    @scala.inline
    def setRespawn(value: Double): Self = this.set("respawn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRespawn: Self = this.set("respawn", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setWorkers(value: Double): Self = this.set("workers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkers: Self = this.set("workers", js.undefined)
  }
  
}

