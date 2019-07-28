package typings.promptly

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promptlyMod {
  type Callback = js.Function2[/* err */ Error, /* value */ String, Unit]
}
