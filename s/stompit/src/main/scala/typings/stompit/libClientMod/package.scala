package typings.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libClientMod {
  import typings.std.Error

  type MessageCallback = js.Function2[/* err */ Error | Null, /* message */ Message, Unit]
}
