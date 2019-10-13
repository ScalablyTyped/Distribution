package typings.atSentryWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atSentryWebpackDashPluginMod {
  import typings.std.Error
  import typings.webpack.webpackMod.Plugin

  type EntriesFunction = js.Function1[/* key */ String, Boolean]
  type ErrorHandlerFunction = js.Function2[/* err */ Error, /* invokeErr */ js.Function0[Unit], Unit]
  type SentryPlugin = Plugin
}
