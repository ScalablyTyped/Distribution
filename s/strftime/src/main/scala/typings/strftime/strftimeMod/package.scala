package typings.strftime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object strftimeMod {
  import typings.std.Date

  type strftimeFunction = js.Function2[/* format */ String, /* date */ js.UndefOr[Date], String]
}
