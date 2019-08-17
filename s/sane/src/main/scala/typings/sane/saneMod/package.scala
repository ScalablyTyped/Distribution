package typings.sane

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object saneMod {
  import typings.std.RegExp

  type AnymatchMatcher = String | RegExp | (js.Function1[/* repeated */ String, Boolean])
  type Watcher = SaneWatcher
}
