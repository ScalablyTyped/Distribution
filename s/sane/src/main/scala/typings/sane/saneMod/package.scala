package typings.sane

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object saneMod {
  type AnymatchMatcher = String | RegExp | (js.Function1[/* repeated */ String, Boolean])
  type Watcher = SaneWatcher
}
