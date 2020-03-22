package typings.seneca.mod

import org.scalablytyped.runtime.StringDictionary
import typings.seneca.AnonAct
import typings.seneca.AnonActcaller
import typings.seneca.AnonActive
import typings.seneca.AnonActrouter
import typings.seneca.AnonAdd
import typings.seneca.AnonBasic
import typings.seneca.AnonHost
import typings.seneca.AnonInterval
import typings.seneca.AnonLevel
import typings.seneca.AnonLocal
import typings.seneca.AnonRunning
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* plugin_name */ StringDictionary[js.Any] {
  // Action cache. Makes inbound messages idempotent.
  var actcache: js.UndefOr[AnonActive] = js.undefined
  // Default seneca-admin settings.
  // TODO: move to seneca-admin!
  var admin: js.UndefOr[AnonLocal] = js.undefined
  // Wait time for plugins to close gracefully.
  var deathdelay: js.UndefOr[Double] = js.undefined
  // Debug settings.
  var debug: js.UndefOr[AnonActcaller] = js.undefined
     // milliseconds
  // Register (true) default plugins. Set false to not register when
  // using custom versions.
  var default_plugins: js.UndefOr[AnonBasic] = js.undefined
  var errhandler: js.UndefOr[GlobalErrorHandler] = js.undefined
  // Standard length of identifiers for actions.
  var idlen: js.UndefOr[Double] = js.undefined
  // Internal settings.
  var internal: js.UndefOr[AnonActrouter] = js.undefined
  var log: js.UndefOr[LogSpec | AnonLevel] = js.undefined
  // Plugin settings
  var plugin: js.UndefOr[js.Any] = js.undefined
  // Settings for network REPL.
  var repl: js.UndefOr[AnonHost] = js.undefined
  // Action statistics settings. See rolling-stats module.
  var stats: js.UndefOr[AnonInterval] = js.undefined
  // Log status at periodic intervals.
  var status: js.UndefOr[AnonRunning] = js.undefined
  // Enforce strict behaviours. Relax when backwards compatibility needed.
  var strict: js.UndefOr[AnonAdd] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  // Standard timeout for actions.
  var timeout: js.UndefOr[Double] = js.undefined
  // Action executor tracing. See gate-executor module.
  var trace: js.UndefOr[AnonAct] = js.undefined
  // zig module settings for seneca.start() chaining.
  var zig: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* plugin_name */ StringDictionary[js.Any] = null,
    actcache: AnonActive = null,
    admin: AnonLocal = null,
    deathdelay: Int | Double = null,
    debug: AnonActcaller = null,
    default_plugins: AnonBasic = null,
    errhandler: /* error */ Error => Unit = null,
    idlen: Int | Double = null,
    internal: AnonActrouter = null,
    log: LogSpec | AnonLevel = null,
    plugin: js.Any = null,
    repl: AnonHost = null,
    stats: AnonInterval = null,
    status: AnonRunning = null,
    strict: AnonAdd = null,
    tag: String = null,
    timeout: Int | Double = null,
    trace: AnonAct = null,
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

