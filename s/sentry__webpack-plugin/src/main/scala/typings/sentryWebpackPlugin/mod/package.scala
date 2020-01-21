package typings.sentryWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EntriesFunction = js.Function1[/* key */ java.lang.String, scala.Boolean]
  type ErrorHandlerFunction = js.Function2[/* err */ typings.std.Error, /* invokeErr */ js.Function0[scala.Unit], scala.Unit]
  type SentryPlugin = typings.webpack.mod.Plugin
}
