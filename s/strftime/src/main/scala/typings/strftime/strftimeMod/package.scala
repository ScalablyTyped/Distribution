package typings.strftime

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object strftimeMod {
  type strftimeFunction = js.Function2[/* format */ String, /* date */ js.UndefOr[Date], String]
}
