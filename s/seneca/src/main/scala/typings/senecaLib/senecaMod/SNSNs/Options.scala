package typings
package senecaLib.senecaMod.SNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* plugin_name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  // Action cache. Makes inbound messages idempotent.
  var actcache: js.UndefOr[senecaLib.Anon_Active] = js.undefined
  // Default seneca-admin settings.
  // TODO: move to seneca-admin!
  var admin: js.UndefOr[senecaLib.Anon_Local] = js.undefined
  // Wait time for plugins to close gracefully.
  var deathdelay: js.UndefOr[scala.Double] = js.undefined
  // Debug settings.
  var debug: js.UndefOr[senecaLib.Anon_Actcaller] = js.undefined
     // milliseconds
  // Register (true) default plugins. Set false to not register when
  // using custom versions.
  var default_plugins: js.UndefOr[senecaLib.Anon_Basic] = js.undefined
  var errhandler: js.UndefOr[GlobalErrorHandler] = js.undefined
  // Standard length of identifiers for actions.
  var idlen: js.UndefOr[scala.Double] = js.undefined
  // Internal settings.
  var internal: js.UndefOr[senecaLib.Anon_Actrouter] = js.undefined
  var log: js.UndefOr[LogSpec | senecaLib.Anon_Level] = js.undefined
  // Plugin settings
  var plugin: js.UndefOr[js.Any] = js.undefined
  // Settings for network REPL.
  var repl: js.UndefOr[senecaLib.Anon_Host] = js.undefined
  // Action statistics settings. See rolling-stats module.
  var stats: js.UndefOr[senecaLib.Anon_Interval] = js.undefined
  // Log status at periodic intervals.
  var status: js.UndefOr[senecaLib.Anon_IntervalRunning] = js.undefined
  // Enforce strict behaviours. Relax when backwards compatibility needed.
  var strict: js.UndefOr[senecaLib.Anon_Add] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  // Standard timeout for actions.
  var timeout: js.UndefOr[scala.Double] = js.undefined
  // Action executor tracing. See gate-executor module.
  var trace: js.UndefOr[senecaLib.Anon_Act] = js.undefined
  // zig module settings for seneca.start() chaining.
  var zig: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* plugin_name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    actcache: senecaLib.Anon_Active = null,
    admin: senecaLib.Anon_Local = null,
    deathdelay: scala.Int | scala.Double = null,
    debug: senecaLib.Anon_Actcaller = null,
    default_plugins: senecaLib.Anon_Basic = null,
    errhandler: GlobalErrorHandler = null,
    idlen: scala.Int | scala.Double = null,
    internal: senecaLib.Anon_Actrouter = null,
    log: LogSpec | senecaLib.Anon_Level = null,
    plugin: js.Any = null,
    repl: senecaLib.Anon_Host = null,
    stats: senecaLib.Anon_Interval = null,
    status: senecaLib.Anon_IntervalRunning = null,
    strict: senecaLib.Anon_Add = null,
    tag: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    trace: senecaLib.Anon_Act = null,
    zig: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actcache != null) __obj.updateDynamic("actcache")(actcache)
    if (admin != null) __obj.updateDynamic("admin")(admin)
    if (deathdelay != null) __obj.updateDynamic("deathdelay")(deathdelay.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (default_plugins != null) __obj.updateDynamic("default_plugins")(default_plugins)
    if (errhandler != null) __obj.updateDynamic("errhandler")(errhandler)
    if (idlen != null) __obj.updateDynamic("idlen")(idlen.asInstanceOf[js.Any])
    if (internal != null) __obj.updateDynamic("internal")(internal)
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (repl != null) __obj.updateDynamic("repl")(repl)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    if (status != null) __obj.updateDynamic("status")(status)
    if (strict != null) __obj.updateDynamic("strict")(strict)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (trace != null) __obj.updateDynamic("trace")(trace)
    if (zig != null) __obj.updateDynamic("zig")(zig)
    __obj.asInstanceOf[Options]
  }
}

