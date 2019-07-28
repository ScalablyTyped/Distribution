package typings.stompit

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libClientMod {
  type MessageCallback = js.Function2[/* err */ Error | Null, /* message */ Message, Unit]
}
