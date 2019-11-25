package typings.seneca.senecaMod

import org.scalablytyped.runtime.StringDictionary
import typings.seneca.Anon_Act
import typings.seneca.Anon_Actcaller
import typings.seneca.Anon_Active
import typings.seneca.Anon_Actrouter
import typings.seneca.Anon_Add
import typings.seneca.Anon_Basic
import typings.seneca.Anon_Host
import typings.seneca.Anon_Interval
import typings.seneca.Anon_IntervalRunning
import typings.seneca.Anon_Level
import typings.seneca.Anon_Local
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* plugin_name */ StringDictionary[js.Any] {
  // Action cache. Makes inbound messages idempotent.
  var actcache: js.UndefOr[Anon_Active] = js.undefined
  // Default seneca-admin settings.
  // TODO: move to seneca-admin!
  var admin: js.UndefOr[Anon_Local] = js.undefined
  // Wait time for plugins to close gracefully.
  var deathdelay: js.UndefOr[Double] = js.undefined
  // Debug settings.
  var debug: js.UndefOr[Anon_Actcaller] = js.undefined
     // milliseconds
  // Register (true) default plugins. Set false to not register when
  // using custom versions.
  var default_plugins: js.UndefOr[Anon_Basic] = js.undefined
  var errhandler: js.UndefOr[GlobalErrorHandler] = js.undefined
  // Standard length of identifiers for actions.
  var idlen: js.UndefOr[Double] = js.undefined
  // Internal settings.
  var internal: js.UndefOr[Anon_Actrouter] = js.undefined
  var log: js.UndefOr[LogSpec | Anon_Level] = js.undefined
  // Plugin settings
  var plugin: js.UndefOr[js.Any] = js.undefined
  // Settings for network REPL.
  var repl: js.UndefOr[Anon_Host] = js.undefined
  // Action statistics settings. See rolling-stats module.
  var stats: js.UndefOr[Anon_Interval] = js.undefined
  // Log status at periodic intervals.
  var status: js.UndefOr[Anon_IntervalRunning] = js.undefined
  // Enforce strict behaviours. Relax when backwards compatibility needed.
  var strict: js.UndefOr[Anon_Add] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  // Standard timeout for actions.
  var timeout: js.UndefOr[Double] = js.undefined
  // Action executor tracing. See gate-executor module.
  var trace: js.UndefOr[Anon_Act] = js.undefined
  // zig module settings for seneca.start() chaining.
  var zig: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* plugin_name */ StringDictionary[js.Any] = null,
    actcache: Anon_Active = null,
    admin: Anon_Local = null,
    deathdelay: Int | Double = null,
    debug: Anon_Actcaller = null,
    default_plugins: Anon_Basic = null,
    errhandler: /* error */ Error => Unit = null,
    idlen: Int | Double = null,
    internal: Anon_Actrouter = null,
    log: LogSpec | Anon_Level = null,
    plugin: js.Any = null,
    repl: Anon_Host = null,
    stats: Anon_Interval = null,
    status: Anon_IntervalRunning = null,
    strict: Anon_Add = null,
    tag: String = null,
    timeout: Int | Double = null,
    trace: Anon_Act = null,
    zig: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actcache != null) __obj.updateDynamic("actcache")(actcache.asInstanceOf[js.Any])
    if (admin != null) __obj.updateDynamic("admin")(admin.asInstanceOf[js.Any])
    if (deathdelay != null) __obj.updateDynamic("deathdelay")(deathdelay.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (default_plugins != null) __obj.updateDynamic("default_plugins")(default_plugins.asInstanceOf[js.Any])
    if (errhandler != null) __obj.updateDynamic("errhandler")(js.Any.fromFunction1(errhandler))
    if (idlen != null) __obj.updateDynamic("idlen")(idlen.asInstanceOf[js.Any])
    if (internal != null) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (repl != null) __obj.updateDynamic("repl")(repl.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (strict != null) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (trace != null) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    if (zig != null) __obj.updateDynamic("zig")(zig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

