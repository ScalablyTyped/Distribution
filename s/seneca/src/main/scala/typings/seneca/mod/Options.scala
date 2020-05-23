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

trait Options
  extends /* plugin_name */ StringDictionary[js.Any] {
  // Action cache. Makes inbound messages idempotent.
  var actcache: js.UndefOr[Active] = js.undefined
  // Default seneca-admin settings.
  // TODO: move to seneca-admin!
  var admin: js.UndefOr[Local] = js.undefined
  // Wait time for plugins to close gracefully.
  var deathdelay: js.UndefOr[Double] = js.undefined
  // Debug settings.
  var debug: js.UndefOr[Actcaller] = js.undefined
     // milliseconds
  // Register (true) default plugins. Set false to not register when
  // using custom versions.
  var default_plugins: js.UndefOr[Basic] = js.undefined
  var errhandler: js.UndefOr[GlobalErrorHandler] = js.undefined
  // Standard length of identifiers for actions.
  var idlen: js.UndefOr[Double] = js.undefined
  // Internal settings.
  var internal: js.UndefOr[Actrouter] = js.undefined
  var log: js.UndefOr[LogSpec | Level] = js.undefined
  // Plugin settings
  var plugin: js.UndefOr[js.Any] = js.undefined
  // Settings for network REPL.
  var repl: js.UndefOr[Host] = js.undefined
  // Action statistics settings. See rolling-stats module.
  var stats: js.UndefOr[Interval] = js.undefined
  // Log status at periodic intervals.
  var status: js.UndefOr[Running] = js.undefined
  // Enforce strict behaviours. Relax when backwards compatibility needed.
  var strict: js.UndefOr[Add] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  // Standard timeout for actions.
  var timeout: js.UndefOr[Double] = js.undefined
  // Action executor tracing. See gate-executor module.
  var trace: js.UndefOr[Act] = js.undefined
  // zig module settings for seneca.start() chaining.
  var zig: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    actcache: Active = null,
    admin: Local = null,
    deathdelay: js.UndefOr[Double] = js.undefined,
    debug: Actcaller = null,
    default_plugins: Basic = null,
    errhandler: /* error */ Error => Unit = null,
    idlen: js.UndefOr[Double] = js.undefined,
    internal: Actrouter = null,
    log: LogSpec | Level = null,
    plugin: js.Any = null,
    repl: Host = null,
    stats: Interval = null,
    status: Running = null,
    strict: Add = null,
    tag: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    trace: Act = null,
    zig: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actcache != null) __obj.updateDynamic("actcache")(actcache.asInstanceOf[js.Any])
    if (admin != null) __obj.updateDynamic("admin")(admin.asInstanceOf[js.Any])
    if (!js.isUndefined(deathdelay)) __obj.updateDynamic("deathdelay")(deathdelay.get.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (default_plugins != null) __obj.updateDynamic("default_plugins")(default_plugins.asInstanceOf[js.Any])
    if (errhandler != null) __obj.updateDynamic("errhandler")(js.Any.fromFunction1(errhandler))
    if (!js.isUndefined(idlen)) __obj.updateDynamic("idlen")(idlen.get.asInstanceOf[js.Any])
    if (internal != null) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (repl != null) __obj.updateDynamic("repl")(repl.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (strict != null) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (trace != null) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    if (zig != null) __obj.updateDynamic("zig")(zig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

