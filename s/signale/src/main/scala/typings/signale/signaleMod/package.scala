package typings.signale

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object signaleMod {
  type LoggerFunc = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  type Signale[TTypes /* <: String */] = SignaleBase[TTypes] with (Record[TTypes, LoggerFunc]) with (Record[DefaultMethods, LoggerFunc])
}
