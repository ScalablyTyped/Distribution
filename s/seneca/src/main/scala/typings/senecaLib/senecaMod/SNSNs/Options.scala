package typings
package senecaLib.senecaMod.SNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options
  extends /* plugin_name */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  // Action cache. Makes inbound messages idempotent.
  var actcache: js.UndefOr[senecaLib.Anon_Active] = js.undefined
  // Default seneca-admin settings.
  // TODO: move to seneca-admin!
  var admin: js.UndefOr[senecaLib.Anon_Prefix] = js.undefined
  // Wait time for plugins to close gracefully.
  var deathdelay: js.UndefOr[scala.Double] = js.undefined
  // Debug settings.
  var debug: js.UndefOr[senecaLib.Anon_Print] = js.undefined
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
  var stats: js.UndefOr[senecaLib.Anon_Running] = js.undefined
  // Log status at periodic intervals.
  var status: js.UndefOr[senecaLib.Anon_RunningInterval] = js.undefined
  // Enforce strict behaviours. Relax when backwards compatibility needed.
  var strict: js.UndefOr[senecaLib.Anon_Result] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  // Standard timeout for actions.
  var timeout: js.UndefOr[scala.Double] = js.undefined
  // Action executor tracing. See gate-executor module.
  var trace: js.UndefOr[senecaLib.Anon_Stack] = js.undefined
  // zig module settings for seneca.start() chaining.
  var zig: js.UndefOr[js.Any] = js.undefined
}

