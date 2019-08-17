package typings.promptly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promptlyMod {
  import typings.std.Error

  type Callback = js.Function2[/* err */ Error, /* value */ String, Unit]
}
