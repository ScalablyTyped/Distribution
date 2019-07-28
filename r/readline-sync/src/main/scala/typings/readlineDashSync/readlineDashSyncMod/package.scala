package typings.readlineDashSync

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readlineDashSyncMod {
  type OptionType = String | Double | RegExp | (js.Function1[/* input */ String, Boolean])
}
