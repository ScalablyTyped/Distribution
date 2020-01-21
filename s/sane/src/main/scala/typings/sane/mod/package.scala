package typings.sane

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnymatchMatcher = java.lang.String | typings.std.RegExp | (js.Function1[/* repeated */ java.lang.String, scala.Boolean])
  type Watcher = typings.sane.mod.SaneWatcher
}
