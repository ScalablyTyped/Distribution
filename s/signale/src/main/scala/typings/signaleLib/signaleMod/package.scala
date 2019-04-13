package typings
package signaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object signaleMod {
  type LoggerFunc = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  type Signale[TTypes /* <: java.lang.String */] = SignaleBase[TTypes] with (stdLib.Record[TTypes, LoggerFunc]) with (stdLib.Record[DefaultMethods, LoggerFunc])
}
