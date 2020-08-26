package typings.seneca.mod

import org.scalablytyped.runtime.StringDictionary
import typings.seneca.anon.Act
import typings.seneca.anon.Actcaller
import typings.seneca.anon.Active
import typings.seneca.anon.Actrouter
import typings.seneca.anon.Add
import typings.seneca.anon.Basic
import typings.seneca.anon.Host
import typings.seneca.anon.Interval
import typings.seneca.anon.Level
import typings.seneca.anon.Local
import typings.seneca.anon.Running
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends /* plugin_name */ StringDictionary[js.Any] {
  // Action cache. Makes inbound messages idempotent.
  var actcache: js.UndefOr[Active] = js.native
  // Default seneca-admin settings.
  // TODO: move to seneca-admin!
  var admin: js.UndefOr[Local] = js.native
  // Wait time for plugins to close gracefully.
  var deathdelay: js.UndefOr[Double] = js.native
  // Debug settings.
  var debug: js.UndefOr[Actcaller] = js.native
     // milliseconds
  // Register (true) default plugins. Set false to not register when
  // using custom versions.
  var default_plugins: js.UndefOr[Basic] = js.native
  var errhandler: js.UndefOr[GlobalErrorHandler] = js.native
  // Standard length of identifiers for actions.
  var idlen: js.UndefOr[Double] = js.native
  // Internal settings.
  var internal: js.UndefOr[Actrouter] = js.native
  var log: js.UndefOr[LogSpec | Level] = js.native
  // Plugin settings
  var plugin: js.UndefOr[js.Any] = js.native
  // Settings for network REPL.
  var repl: js.UndefOr[Host] = js.native
  // Action statistics settings. See rolling-stats module.
  var stats: js.UndefOr[Interval] = js.native
  // Log status at periodic intervals.
  var status: js.UndefOr[Running] = js.native
  // Enforce strict behaviours. Relax when backwards compatibility needed.
  var strict: js.UndefOr[Add] = js.native
  var tag: js.UndefOr[String] = js.native
  // Standard timeout for actions.
  var timeout: js.UndefOr[Double] = js.native
  // Action executor tracing. See gate-executor module.
  var trace: js.UndefOr[Act] = js.native
  // zig module settings for seneca.start() chaining.
  var zig: js.UndefOr[js.Any] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setActcache(value: Active): Self = this.set("actcache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActcache: Self = this.set("actcache", js.undefined)
    @scala.inline
    def setAdmin(value: Local): Self = this.set("admin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdmin: Self = this.set("admin", js.undefined)
    @scala.inline
    def setDeathdelay(value: Double): Self = this.set("deathdelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeathdelay: Self = this.set("deathdelay", js.undefined)
    @scala.inline
    def setDebug(value: Actcaller): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDefault_plugins(value: Basic): Self = this.set("default_plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_plugins: Self = this.set("default_plugins", js.undefined)
    @scala.inline
    def setErrhandler(value: /* error */ Error => Unit): Self = this.set("errhandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteErrhandler: Self = this.set("errhandler", js.undefined)
    @scala.inline
    def setIdlen(value: Double): Self = this.set("idlen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdlen: Self = this.set("idlen", js.undefined)
    @scala.inline
    def setInternal(value: Actrouter): Self = this.set("internal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    @scala.inline
    def setLog(value: LogSpec | Level): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setPlugin(value: js.Any): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    @scala.inline
    def setRepl(value: Host): Self = this.set("repl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepl: Self = this.set("repl", js.undefined)
    @scala.inline
    def setStats(value: Interval): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setStatus(value: Running): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStrict(value: Add): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTrace(value: Act): Self = this.set("trace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
    @scala.inline
    def setZig(value: js.Any): Self = this.set("zig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZig: Self = this.set("zig", js.undefined)
  }
  
}

